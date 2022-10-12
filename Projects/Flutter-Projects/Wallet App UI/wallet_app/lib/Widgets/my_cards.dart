import 'package:flutter/material.dart';

class MyCards extends StatelessWidget {
  const MyCards(
      {Key? key,
      required this.balance,
      required this.cardnum,
      required this.colors,
      required this.expiry})
      : super(key: key);
  final Color colors;
  final String balance;
  final String cardnum;
  final String expiry;

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.symmetric(horizontal: 25),
      width: 300,
      padding: const EdgeInsets.all(20),
      decoration: BoxDecoration(
        color: colors,
        borderRadius: BorderRadius.circular(20),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              const Text(
                'Balance',
                style: TextStyle(color: Colors.white, fontSize: 16),
              ),
              Image.asset(
                'assets/images/visa.png',
                height: 20,
              )
            ],
          ),
          Text(
            balance,
            style: TextStyle(color: Colors.yellow[600], fontSize: 28),
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Text(
                cardnum,
                style: const TextStyle(color: Colors.white, fontSize: 16),
              ),
              Text(
                expiry,
                style: const TextStyle(color: Colors.white, fontSize: 16),
              )
            ],
          )
        ],
      ),
    );
  }
}
