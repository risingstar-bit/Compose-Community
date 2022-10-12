import 'package:flutter/material.dart';
import 'package:wallet_app/Screens/signup.dart';

import '../Constants/constant.dart';
import 'home.dart';

class LoginScreen extends StatefulWidget {
  const LoginScreen({Key? key}) : super(key: key);

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  bool isLoading = false;
  Color buttonColor = kInactiveColor;

  bool passwordVisible = true;
  @override
  void dispose() {
    super.dispose();
    _emailController.dispose();
    _passwordController.dispose();
  }

  final inputBorder = OutlineInputBorder(
      borderRadius: BorderRadius.circular(10),
      borderSide: const BorderSide(color: kActiveColor));

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: SafeArea(
      child: SingleChildScrollView(
        child: FocusScope(
          debugLabel: 'Scope',
          autofocus: true,
          child: Column(children: [
            const SizedBox(
              height: 100,
            ),
            const Padding(
              padding: EdgeInsets.symmetric(
                horizontal: 20.0,
              ),
              child: Text(
                'Login',
                style: TextStyle(
                    color: kInactiveColor,
                    fontSize: 45,
                    fontWeight: FontWeight.bold),
              ),
            ),
            const SizedBox(
              height: 24,
            ),
            Container(
              padding: const EdgeInsets.symmetric(horizontal: 20, vertical: 10),
              child: Column(
                children: [
                  Focus(
                    debugLabel: 'TextField1',
                    child: Builder(builder: (context) {
                      final FocusNode focusNode = Focus.of(context);
                      final bool hasFocus = focusNode.hasFocus;
                      return TextFormField(
                        controller: _emailController,
                        decoration: InputDecoration(
                            filled: true,
                            fillColor:
                                hasFocus ? LightBgColor : Colors.grey[100],
                            prefixIcon: Icon(
                              Icons.email,
                              color: hasFocus ? kActiveColor : Colors.grey,
                            ),
                            contentPadding: const EdgeInsets.all(8),
                            border: OutlineInputBorder(
                                borderRadius: BorderRadius.circular(10),
                                borderSide: BorderSide.none),
                            focusedBorder: inputBorder,
                            enabledBorder: OutlineInputBorder(
                                borderRadius: BorderRadius.circular(10),
                                borderSide: BorderSide.none),
                            hintText: "Email",
                            hintStyle: TextStyle(
                              color: hasFocus ? Colors.black : Colors.grey,
                            )),
                        keyboardType: TextInputType.emailAddress,
                      );
                    }),
                  ),
                  const SizedBox(
                    height: 24,
                  ),
                  Focus(
                    debugLabel: 'TextField2',
                    child: Builder(builder: (context) {
                      final FocusNode focusNode = Focus.of(context);
                      final bool hasFocus = focusNode.hasFocus;
                      return TextField(
                        controller: _passwordController,
                        decoration: InputDecoration(
                            prefixIcon: Icon(Icons.lock,
                                color: hasFocus ? kActiveColor : Colors.grey),
                            suffixIcon: IconButton(
                              onPressed: () {
                                setState(() {
                                  passwordVisible = !passwordVisible;
                                });
                              },
                              icon: Icon(
                                  passwordVisible
                                      ? Icons.visibility_off
                                      : Icons.visibility,
                                  color: hasFocus ? kActiveColor : Colors.grey),
                            ),
                            filled: true,
                            fillColor:
                                hasFocus ? LightBgColor : Colors.grey[100],
                            contentPadding: const EdgeInsets.all(8),
                            border: OutlineInputBorder(
                                borderRadius: BorderRadius.circular(10),
                                borderSide: BorderSide.none),
                            focusedBorder: inputBorder,
                            enabledBorder: OutlineInputBorder(
                                borderRadius: BorderRadius.circular(10),
                                borderSide: BorderSide.none),
                            hintText: "Password",
                            hintStyle: TextStyle(
                              color: hasFocus ? Colors.black : Colors.grey,
                            )),
                        obscureText: passwordVisible,
                        keyboardType: TextInputType.visiblePassword,
                      );
                    }),
                  ),
                ],
              ),
            ),
            const SizedBox(
              height: 24,
            ),
            InkWell(
              onTap: () {
                setState(() {
                  buttonColor = kActiveColor;
                });
                Navigator.pushReplacement(context,
                    MaterialPageRoute(builder: (context) => const HomePage()));
              },
              child: isLoading
                  ? const Center(
                      child: CircularProgressIndicator(
                        color: kActiveColor,
                      ),
                    )
                  : Container(
                      height: MediaQuery.of(context).size.height / 13,
                      width: MediaQuery.of(context).size.width - 18,
                      alignment: Alignment.center,
                      padding: const EdgeInsets.symmetric(vertical: 12),
                      decoration: BoxDecoration(
                        borderRadius: BorderRadius.circular(30),
                        color: buttonColor,
                        boxShadow: [
                          BoxShadow(
                            color: Colors.grey.withOpacity(0.5),
                            spreadRadius: 3,
                            blurRadius: 5,
                            offset: const Offset(
                                0, 2), // changes position of shadow
                          ),
                        ],
                      ),
                      child: const Text(
                        "LOGIN",
                        style: TextStyle(
                            fontSize: 16,
                            color: Colors.white,
                            fontWeight: FontWeight.w700,
                            letterSpacing: 1.0),
                      ),
                    ),
            ),
            const SizedBox(
              height: 8,
            ),
            TextButton(
                onPressed: () {},
                child: const Text(
                  'Forgot password?',
                  style: TextStyle(fontSize: 18, color: kActiveColor),
                )),
            const SizedBox(
              height: 70,
            ),
            Row(
              children: [
                Expanded(
                  child: Divider(
                    indent: 20,
                    endIndent: 20,
                    thickness: 1,
                    color: Colors.grey.shade300,
                  ),
                ),
                const Text(
                  'or continue with.',
                  style: TextStyle(fontSize: 18, color: Colors.black54),
                ),
                Expanded(
                  child: Divider(
                    indent: 20,
                    endIndent: 20,
                    thickness: 1,
                    color: Colors.grey.shade300,
                  ),
                ),
              ],
            ),
            const SizedBox(
              height: 28,
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                IconButton(
                    onPressed: () {},
                    icon: const Icon(
                      Icons.facebook,
                      size: 30,
                      color: Color(0xFF209BEF),
                    )),
                Image.network(
                  'http://pngimg.com/uploads/google/google_PNG19635.png',
                  height: 40,
                  width: 40,
                ),
                IconButton(
                    onPressed: () {},
                    icon: const Icon(
                      Icons.apple,
                      size: 30,
                      color: Colors.black,
                    )),
              ],
            ),
            const SizedBox(
              height: 30,
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Container(
                  padding: const EdgeInsets.symmetric(vertical: 8),
                  child: Text(
                    "Don't have an account?",
                    style:
                        TextStyle(letterSpacing: 0.5, color: Colors.grey[500]),
                  ),
                ),
                TextButton(
                    onPressed: () {
                      Navigator.pushReplacement(
                          context,
                          MaterialPageRoute(
                              builder: (context) => const SignupScreen()));
                    },
                    child: const Text(
                      'Sign up',
                      style: TextStyle(color: kActiveColor),
                    )),
              ],
            ),
          ]),
        ),
      ),
    ));
  }
}
