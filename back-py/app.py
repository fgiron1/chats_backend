import uvicorn
from fastapi import FastAPI
from application.utils.constant import HOST_URL, HOST_PORT

app = FastAPI()
# EXECUTING PROGRAMMATICALLY THE SERVER DOES NOT ALLOW FOR THE ENDPOINTS TO BE DECLARED IN A DIFFERENT FILE
# BECAUSE THIS IS EXECUTED BEFORE THE ENDPOINT DECLARATIONS.
# CREATE A .sh FILE TO INITIALIZE THE SERVER.
if __name__ == "__main__":
    uvicorn.run("app:app", host=HOST_URL, port=HOST_PORT, log_level="debug")