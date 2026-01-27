const realApi = { data: "secret" };
const proxy = new Proxy(realApi, {
  get: (target, prop) => prop === 'data' ? "Access Denied" : target[prop]
});