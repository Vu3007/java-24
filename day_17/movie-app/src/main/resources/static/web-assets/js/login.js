document.getElementById('form-login').addEventListener('submit', function(event) {
    event.preventDefault();
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
const createLogin = () => {
    const loginData = {
        email:email,
        password:password
    };
     axios.post('/api/login', loginData)
            .then(function (response) {
                if (response.data.success) {
                    toastr.success("Đăng nhập thành công!");
                } else {
                    toastr.error("Sai email hoặc mật khẩu!");
                }
            })
            .catch(error => {
                console.error(error);
                toastr.error("Lỗi đăng nhập! ");
            });
    });
}