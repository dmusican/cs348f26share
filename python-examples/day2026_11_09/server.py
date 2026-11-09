from xmlrpc.server import SimpleXMLRPCServer

# Communicating across computers!

class MyCoordinator():
    def example(self, x):
        return x + 1

server = SimpleXMLRPCServer(("localhost", 8000))
coordinator = MyCoordinator()
server.register_instance(coordinator)
print('serving')
server.serve_forever()
