const coffee = (c) => ({ ...c, price: c.price + 5 });
let myCoffee = { price: 10 };
myCoffee = coffee(myCoffee);