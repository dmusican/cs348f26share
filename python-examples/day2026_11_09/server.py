# Communicating across computers!

class MyCoordinator():
    def example(self, x):
        return x + 1

server = SimpleXMLRPCServer("localhost", 8000)

