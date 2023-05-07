import uvicorn

async def app():
    if __name__ == "__main__":
        uvicorn.run("main:app", port=8080, log_level="info")