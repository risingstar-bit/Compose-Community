import os
#creating file types:-
def createIFnotExists(folder):
    if not os.path.exists(folder):
        os.makedirs(folder)

createIFnotExists('Images')
createIFnotExists('Media')
createIFnotExists('Docs')
createIFnotExists('Other')

files = os.listdir()
print(files)
files.remove('filecleaner.py')
print(files)


#classifying files:-
imgExts = ['.jpg','.png','.ico']
images = [file for file in files if os.path.splitext(file)[1].lower() in imgExts]

docsExts =['.txt','.pdf','.doc','.docx','.py']
docs = [file for file in files if os.path.splitext(file)[1].lower() in docsExts]

mediaExts= ['.mp3','.mp4']
medias = [file for file in files if os.path.splitext(file)[1].lower() in mediaExts]
others = []
for file in files:
    ext = os.path.splitext(file)[1].lower()
    if (ext not in mediaExts) and (ext not in docsExts) and (ext not in imgExts) and os.path.isfile(file):
        others.append(file)
print(others)
for media in medias:
    os.replace(media,f"Media/{media}")
for image in images:
    os.replace(image,f"Images/{image}")
for doc in docs:
    os.replace(doc,f"Docs/{doc}")
for other in others:
    os.replace(other,f"Other/{other}")
