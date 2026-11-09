from xmlrpc.client import ServerProxy

with ServerProxy("http://localhost:8000") as proxy:
    result = proxy.example(99)
    print(result)
