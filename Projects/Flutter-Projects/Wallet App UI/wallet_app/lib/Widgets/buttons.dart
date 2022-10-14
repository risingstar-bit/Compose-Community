import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:wallet_app/Constants/constant.dart';

class ButtonCards extends StatelessWidget {
  const ButtonCards({Key? key, required this.image, required this.title})
      : super(key: key);
  final String image;
  final String title;

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {},
      child: Column(
        children: [
          Container(
            height: 90,
            width: 90,
            padding: const EdgeInsets.all(20),
            decoration: BoxDecoration(
              color: Colors.grey[100],
              borderRadius: BorderRadius.circular(20),
              boxShadow: [
                BoxShadow(
                  color: Colors.grey.shade400,
                  spreadRadius: 5,
                  blurRadius: 20,
                  offset: const Offset(0, 2), // changes position of shadow
                ),
              ],
            ),
            child: Center(child: Image.asset(image)),
          ),
          const SizedBox(
            height: 12,
          ),
          Text(
            title,
            style: GoogleFonts.gemunuLibre(
                color: kActiveColor,
                fontSize: 18,
                fontWeight: FontWeight.w700,
                letterSpacing: 1),
          )
        ],
      ),
    );
  }
}
