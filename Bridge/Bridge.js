class Remote { constructor(device) { this.device = device; } }
class TV { on() { /*...*/ } }
const myRemote = new Remote(new TV());