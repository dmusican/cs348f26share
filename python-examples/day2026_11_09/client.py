from xmlrpc.client import ServerProxy

with ServerProxy("http://localhost:8000") as proxy:
    mylst = [12]
    result = proxy.example(99, mylst)
    print(result)
    print(mylst)
