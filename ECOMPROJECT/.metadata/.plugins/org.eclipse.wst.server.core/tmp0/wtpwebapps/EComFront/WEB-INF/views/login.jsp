<style>
body
.form-heading { color:#fff; font-size:23px;}
.panel h2{ color:#444444; font-size:18px; margin:0 0 8px 0;text-align:center;}
.login-form .form-control {
  background: #f7f7f7 none repeat scroll 0 0;
  border: 1px solid #d4d4d4;
  border-radius: 4px;
  font-size: 14px;
  height: 50px;
  line-height: 50px;
}
.main-div {
  background: #ffffff none repeat scroll 0 0;
  border-radius: 2px;
  margin: 10px auto 30px;
  max-width: 38%;
  padding: 50px 70px 70px 71px;
}

.login-form .form-group {
  margin-bottom:10px;
}
.login-form{ text-align:left;  font-size: 13px;
}
.forgot a {
  color: #777777;
  font-size: 14px;
  text-decoration: underline;
}
.login-form  .btn.btn-primary {
  background: #fcc99b none repeat scroll 0 0;
  border-color: #f0ad4e;
  color: black;
  font-size: 14px;
  width: 100%;
  height: 50px;
  line-height: 50px;
  padding: 0;
}
.forgot {
  text-align: left; margin-bottom:30px;
}
.botto-text {
  color: #ffffff;
  font-size: 14px;
  margin: auto;
}
.login-form .btn.btn-primary.reset {
  background: #fcc99b none repeat scroll 0 0;
}
.back { text-align: left; margin-top:10px;}
.back a {color: #444444; font-size: 13px;text-decoration: none;}

</style>
 
<body id="LoginForm">
<div class="container">
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2><b>User Login</b></h2>
   </div>
    <form id="Login">

        <div class="form-group">

			<label for="email"><b>Email</b></label>

            <input type="email" class="form-control" id="inputEmail" placeholder="Email Address" required>

        </div>

        <div class="form-group">
			<label for="email"><b>Password</b></label>

            <input type="password" class="form-control" id="inputPassword" placeholder="Password" required>

        </div>
        <div class="forgot">
        <a href="reset.html">Forgot password?</a></div>
        <button type="submit" class="btn btn-primary">Login</button>

    </form>
    </div>
</div></div>

