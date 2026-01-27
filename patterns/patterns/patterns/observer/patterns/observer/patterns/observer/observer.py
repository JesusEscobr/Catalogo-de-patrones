class Observer:
    def update(self, message):
        pass

class User(Observer):
    def __init__(self, name):
        self.name = name

    def update(self, message):
        print(f"{self.name} recibió: {message}")

class Channel:
    def __init__(self):
        self.observers = []

    def subscribe(self, observer):
        self.observers.append(observer)

    def unsubscribe(self, observer):
        self.observers.remove(observer)

    def notify_observers(self, message):
        for observer in self.observers:
            observer.update(message)

if __name__ == "__main__":
    channel = Channel()

    user1 = User("Ana")
    user2 = User("Luis")

    channel.subscribe(user1)
    channel.subscribe(user2)

    channel.notify_observers("Nuevo video disponible")
