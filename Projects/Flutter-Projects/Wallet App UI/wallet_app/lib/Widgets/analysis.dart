import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

import '../Constants/constant.dart';

class AnalysisTiles extends StatelessWidget {
  const AnalysisTiles(
      {Key? key,
      required this.image,
      required this.subTitle,
      required this.title})
      : super(key: key);
  final String image;
  final String title;
  final String subTitle;

  @override
  Widget build(BuildContext context) {
    return ListTile(
      leading: Container(
        height: 150,
        width: 60,
        padding: const EdgeInsets.all(13),
        decoration: BoxDecoration(
          color: Colors.grey[100],
          borderRadius: BorderRadius.circular(15),
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
      title: Padding(
        padding: const EdgeInsets.only(bottom: 8),
        child: Text(
          title,
          style: GoogleFonts.gemunuLibre(
              color: kActiveColor,
              fontSize: 25,
              fontWeight: FontWeight.w700,
              letterSpacing: 1),
        ),
      ),
      subtitle: Text(
        subTitle,
        style:
            TextStyle(color: Colors.grey[600], fontSize: 16, letterSpacing: 1),
      ),
      trailing: const Icon(
        Icons.arrow_forward_ios_rounded,
        color: kInactiveColor,
      ),
    );
  }
}
