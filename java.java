// Alternar entre as telas de Login e Registro
document.getElementById("to-register").addEventListener("click", function() {
    document.querySelector(".login-container").style.display = "none";
    document.querySelector(".register-container").style.display = "block";
});

document.getElementById("to-login").addEventListener("click", function() {
    document.querySelector(".register-container").style.display = "none";
    document.querySelector(".login-container").style.display = "block";
});

// Ações do formulário (login e registro)
document.getElementById("login-form").addEventListener("submit", function(event) {
    event.preventDefault();
    alert("Você fez login com sucesso!");
    // Aqui você pode adicionar a lógica de validação do login
});

document.getElementById("register-form").addEventListener("submit", function(event) {
    event.preventDefault();
    let password = document.getElementById("register-password").value;
    let confirmPassword = document.getElementById("register-password-confirm").value;

    if (password !== confirmPassword) {
        alert("As senhas não coincidem. Tente novamente.");
    } else {
        alert("Registro bem-sucedido!");
        // Aqui você pode adicionar a lógica de validação do registro
    }
});
