# Guide for Docker

## Steps for creating a NGINX docker image that runs locally:

1) CD to your static web project's repository/folder.

2) Create a file named "Dockerfile"

3) Type this into your Dockerfile:

<code>
	
    FROM nginx
	COPY .  /usr/share/nginx/html
	
</code>
	

4) Open Terminal and type this command to build a docker image:

<code>

    docker build -t {image name} . 
    
</code>
	

- You can view your built images by running this command:

<code> 

    docker images 

</code>
	

5) Run your docker image using this command:

<code> 

    docker run --name {container name} -d -p 8080:80 {image name}

</code>
	

- You can check your current running containers by running this command:

<code> 

    docker ps

</code>
	

6) You can now go to your browser and view your Web project on the used port.

<code> 

    localhost:8080

</code>
	

<hr>

## Steps for Pushing an image to Dockerhub:

1) Login to your dockerhub in the CLI using this command:

<code> 

    docker -u {username}
	password:

</code>
	

- Make sure that your image and repository has the same name, you can rename your image by using this command:

<code> 

    docker tag {image-name} {new-image-name}

</code>
	

2) Use the push command to your existing dockerhub repository:

<code> 

    docker push {username}/{repositoryname}

</code>
	

- Now your image is accessible to be pulled into any Docker Engine

<hr>
