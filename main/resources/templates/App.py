from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('index.html') # render_template('html 파일명', '함께 보낼 데이터')

if __name__ == '__main__':
    app.run('0.0.0.0', port=5000, debug=True)