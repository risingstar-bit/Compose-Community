import cv2
import  os
import numpy as np
dir = r"C:\\Users\\Bhoomeendra\\PycharmProjects\\RealtimeFacefornot\\Images\\"
vid = cv2.VideoCapture(0)
count = 15
pose = ["Right","Left","Front","Up","Down"]
name = "prateek"
while (count>0):

    ret, frame = vid.read()
    gray = cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY)
    img =  gray[250:450,250:450]

    new_image = cv2.putText(
        img=cv2.flip(img,1),
        text=pose[count%5],
        org=(0, 50),
        fontFace=cv2.FONT_HERSHEY_DUPLEX,
        fontScale=2.0,
        color=(255, 255, 255),
        thickness=1
    )
    cv2.imshow('frame', new_image )
    
    if cv2.waitKey(2) & 0xFF == ord('t'):

        '''
        print(img.shape)
        if(cv2.waitKey(0) & 0xFF == ord('q')):
            break
        continue
        '''
        cv2.imwrite(os.path.dirname(os.path.abspath(__file__))+"\\Images\\"+name+str(count)+".jpg",gray[250:450,250:450])
        count -= 1
        continue

vid.release()
cv2.destroyAllWindows()