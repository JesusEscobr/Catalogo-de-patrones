class TreeType {
  constructor(name, texture) { this.name = name; this.texture = texture; }
}

const treeFactory = {
  types: {},
  get(name, texture) {
    if (!this.types[name]) this.types[name] = new TreeType(name, texture);
    return this.types[name];
  }
};

const forest = [];
const addTree = (x, y, name, tex) => forest.push({ x, y, type: treeFactory.get(name, tex) });

// 10,000 árboles, pero solo 1 objeto
for(let i=0; i<10000; i++) addTree(i, i, "Pino", "pino.jpg");