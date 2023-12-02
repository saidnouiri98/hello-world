<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <script src="main.js"></script>
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
      }

      .container {
        background-color: #ffffff;
        padding: 16px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        max-width: 400px;
        margin: auto;
        margin-top: 50px;
      }

      h1 {
        text-align: center;
      }

      label {
        font-weight: bold;
      }

      input[type="text"],
      input[type="password"] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
      }

      button {
        background-color: #4caf50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        width: 100%;
      }

      button:hover {
        background-color: #45a049;
      }

      .container.signin {
        text-align: center;
      }

      .container.signin a {
        color: #4caf50;
      }

      .container.signin p {
        margin: 10px 0;
      }

      h1 {
        text-align: center;
        margin-top: 20px;
        color: #4caf50;
      }
    </style>
  </head>
  <body>
    <form action="action_page.php">
      <div class="container">
        <h1>New user Register for DevOps Learning</h1>
        <p>Please fill in this form to create an account.</p>
        <hr />

        <label for="Name"><b>Enter Name</b></label>
        <input
          type="text"
          placeholder="Enter Full Name"
          name="Name"
          id="Name"
          required
        />
        <br />

        <label for="mobile"><b>Enter mobile</b></label>
        <input
          type="text"
          placeholder="Enter moible number"
          name="mobile"
          id="mobile"
          required
        />
        <br />

        <label for="email"><b>Enter Email</b></label>
        <input
          type="text"
          placeholder="Enter Email"
          name="email"
          id="email"
          required
        />
        <br />

        <label for="psw"><b>Password</b></label>
        <input
          type="password"
          placeholder="Enter Password"
          name="psw"
          id="psw"
          required
        />
        <br />

        <label for="psw-repeat"><b>Repeat Password</b></label>
        <input
          type="password"
          placeholder="Repeat Password"
          name="psw-repeat"
          id="psw-repeat"
          required
        />
        <hr />
        <br />
        <p>
          By creating an account you agree to our
          <a href="#">Terms & Privacy</a>.
        </p>
        <button type="submit" class="registerbtn">Register</button>
      </div>
      <div class="container signin">
        <p>Already have an account? <a href="#">Sign in</a>.</p>
      </div>

      <h1>Thankyou, Happy Learning</h1>
    </form>
  </body>
</html>
