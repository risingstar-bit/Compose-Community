# Aspect Based Sentiment Analysis

![Python](https://img.shields.io/badge/Python%20-Python%203.9.1-yellowgreen?style=for-the-badge&logo=python)

The project predicts sentiments from reviews given by various customer from aspects of various words i.e. importance of words.

## Overview

- Train Size: `3x4000` (`Text`,`Aspect`,`Level`)
- Test Size: `2x1000` (`Text`,`Aspect`)

## Dependencies

- pandas
- numpy
- seaborn
- re
- string
- nltk
- sklearn.feature_extraction.text import TfidfVectorizer
- sklearn.linear_model import LogisticRegression
- joblib
- pickle
