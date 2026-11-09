from xmlrpc.server import SimpleXMLRPCServer

# Communicating across computers!

class MyCoordinator():
    def example(self, x, lst):
        lst.append(9)
        print("Hello friend")
        print(lst)
        return x + 1

server = SimpleXMLRPCServer(("localhost", 8000))
coordinator = MyCoordinator()
server.register_instance(coordinator)
print('serving')
server.serve_forever()
