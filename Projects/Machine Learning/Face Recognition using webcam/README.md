# Face_Recognition_using_webcam

<img src="Images/opencv.svg" width="100"> <img src="Images/python_logo.svg" width="100"> <img src="Images/git_logo.svg" width="100" height="30"> <img src="Images/github_logo.svg" width="100">

In this project we will recognize our own face using laptop webcam. This code is written in python which can be run using command prompt.

Face recognition is a technique for verifying or identifying a person's identity by analysing and connecting patterns based on the person's facial characteristics, however it is only useful in circumstances when the person's identity is at risk. Face detection is a technique for detecting a person's face in a photograph or video. It's all part of the Object detection process. Face detection might be considered the initial stage in the Face Recognition process. A Deep Face Recognition system with a face detector and alignment is being developed.

# Requirement
Please install following packages 
- numpy= 1.11.0
- opencv 
- psutil==3.4.2
- matplotlib

# How to RUN
1. Download the data files for the required model. Extract and place it in the data folder.
2. Create a new virtual environment

using conda:
```
>>> conda create -n <env-name>
```
using pip
```
>>> python -m pip install --user virtualenv
```
4. Install the required packages using the requirements.txt file with the following command
```
>>> pip install -r requirements.txt

# Results

<img src="Images/prateek1.jpg" width="100">  Image taken from right

<img src="Images/prateek2.jpg" width="100">  Image taken from front

<img src="Images/prateek3.jpg" width="100">  Image taken from up

<img src="Images/prateek4.jpg" width="100">  Image taken from down

# References

The baseline code taken from the [here](https://holypython.com/face-recognition-on-webcam-with-cv2/)

