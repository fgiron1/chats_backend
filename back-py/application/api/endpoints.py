from utils.constant import HOST_PORT, HOST_URL
from app import app

@app.get("/")
async def root(scope, receive, send):
    assert scope['type'] == 'http'
    
    await send({
        'type' : 'http.response.start',
        'status' : 200,
        'headers' : [
            b'content-type', b'text/plain'
        ],
        'message' : "Que coño pasa aquí"
    })

@app.get("/msg/{room_id}")
async def get_messages(scope, receive, send):
    assert scope['type'] == 'http'
    await send({
        'type' : 'http.response.start',
        'status' : 200,
        'headers' : [
            b'content-type', b'application/json'
        ],
        'message' : [{
            'room_id' : 1,
            'messages' : [
                {'id' : 2, 'author_id' : 15, 'msg' : 'toma'},
                {'id' : 3, 'author_id' : 16, 'msg' : 'toma toma'}
            ]
        }]
    })
    