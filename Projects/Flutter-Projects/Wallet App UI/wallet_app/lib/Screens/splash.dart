import 'dart:async';

import 'package:animated_text_kit/animated_text_kit.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:lottie/lottie.dart';
import 'package:wallet_app/Screens/login.dart';

class SplashScreen extends StatefulWidget {
  const SplashScreen({Key? key}) : super(key: key);

  @override
  State<SplashScreen> createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  @override
  void initState() {
    super.initState();
    Timer(
        const Duration(seconds: 10),
        () => Navigator.pushReplacement(context,
            MaterialPageRoute(builder: (context) => const LoginScreen())));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 70.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Lottie.asset("assets/jsonfiles/logo.json"),
            const SizedBox(
              height: 20,
            ),
            AnimatedTextKit(animatedTexts: [
              TyperAnimatedText(
                'MONEY POUCH',
                speed: const Duration(milliseconds: 200),
                textStyle: GoogleFonts.gemunuLibre(
                    fontSize: 40.0,
                    color: const Color(0xFF056695),
                    fontWeight: FontWeight.bold,
                    letterSpacing: 1.0),
              )
            ]),
            const SizedBox(
              height: 40.0,
            ),
          ],
        ),
      ),
    );
  }
}
