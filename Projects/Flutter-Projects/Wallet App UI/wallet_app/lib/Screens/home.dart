import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:smooth_page_indicator/smooth_page_indicator.dart';
import 'package:wallet_app/Constants/constant.dart';

import '../Widgets/analysis.dart';
import '../Widgets/buttons.dart';
import '../Widgets/my_cards.dart';

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  PageController pageController = PageController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey[200],
      body: SafeArea(
        child: SingleChildScrollView(
          child: Column(children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Padding(
                  padding: const EdgeInsets.only(left: 20, top: 10),
                  child: Text(
                    'My Cards',
                    style: GoogleFonts.gemunuLibre(
                        color: kInactiveColor,
                        fontSize: 40,
                        fontWeight: FontWeight.w500),
                  ),
                ),
                Container(
                    margin: const EdgeInsets.only(right: 20, top: 10),
                    padding: const EdgeInsets.all(5),
                    decoration: BoxDecoration(
                      color: LightBgColor,
                      shape: BoxShape.circle,
                      boxShadow: [
                        BoxShadow(
                          color: Colors.grey.withOpacity(0.3),
                          spreadRadius: 3,
                          blurRadius: 5,
                          offset:
                              const Offset(1, 2), // changes position of shadow
                        ),
                      ],
                    ),
                    child: const Icon(
                      Icons.add,
                      color: kInactiveColor,
                    ))
              ],
            ),
            const SizedBox(
              height: 30,
            ),
            //Cards
            SizedBox(
              height: 200,
              child: PageView(
                controller: pageController,
                scrollDirection: Axis.horizontal,
                children: const [
                  MyCards(
                      colors: Colors.purple,
                      balance: "\$34,560.20",
                      cardnum: '**** 8907',
                      expiry: '10/22'),
                  MyCards(
                      colors: kInactiveColor,
                      balance: "\$4,830.50",
                      cardnum: '**** 6578',
                      expiry: '05/23'),
                  MyCards(
                      colors: Colors.green,
                      balance: "\$332,760.20",
                      cardnum: '**** 2453',
                      expiry: '08/23'),
                  MyCards(
                      colors: Colors.blueGrey,
                      balance: "\$56,578.30",
                      cardnum: '**** 3346',
                      expiry: '11/24'),
                ],
              ),
            ),
            const SizedBox(
              height: 20,
            )
            //Indicator
            ,
            SmoothPageIndicator(
                controller: pageController,
                count: 4,
                axisDirection: Axis.horizontal,
                effect: const ExpandingDotsEffect(
                    activeDotColor: kActiveColor,
                    dotColor: LightBgColor,
                    dotHeight: 12,
                    dotWidth: 12)),
            const SizedBox(
              height: 40,
            )
            //Buttons
            ,
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 25),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: const [
                  ButtonCards(
                    image: 'assets/icons/send.png',
                    title: 'Send',
                  ),
                  ButtonCards(
                      image: 'assets/icons/credit-card.png', title: 'Pay'),
                  ButtonCards(
                    image: 'assets/icons/bill.png',
                    title: 'Bills',
                  ),
                ],
              ),
            ),
            const SizedBox(
              height: 50,
            ),
            //Statistics and transactions
            const AnalysisTiles(
              image: 'assets/icons/analysis.png',
              title: 'Statistics',
              subTitle: 'Payments and Income',
            ),
            const SizedBox(
              height: 20,
            ),
            const AnalysisTiles(
                image: 'assets/icons/transaction.png',
                subTitle: 'Transaction History',
                title: 'Transactions'),
            const SizedBox(
              height: 100,
            )
          ]),
        ),
      ),
//Bottom Bar with Floating Button
      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        backgroundColor: kActiveColor,
        child: const Icon(
          Icons.monetization_on,
          size: 30,
        ),
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerDocked,
      bottomNavigationBar: BottomAppBar(
        color: Colors.grey[50],
        elevation: 10,
        child: Padding(
          padding: const EdgeInsets.only(top: 8.0),
          child:
              Row(mainAxisAlignment: MainAxisAlignment.spaceAround, children: [
            IconButton(
                onPressed: () {},
                icon: const Icon(
                  Icons.home_filled,
                  size: 30,
                  color: kActiveColor,
                )),
            IconButton(
                onPressed: () {},
                icon: const Icon(
                  Icons.settings,
                  size: 30,
                  color: Colors.grey,
                ))
          ]),
        ),
      ),
    );
  }
}
