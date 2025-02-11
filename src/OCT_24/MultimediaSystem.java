package OCT_24;

class Media{
	private String title; private int duration;

	public Media(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Media getDetails() {
		System.out.print("Title: "+title+"\nDuration in seconds: "+duration);
		return this;
	}	
}

class Image extends Media{
	private String resolution;

	public Image(String title, int duration, String resolution) {
		super(title, duration);
		this.resolution = resolution;
	}
	@Override
	public Media getDetails(){
		super.getDetails();
		System.out.print("\nResolution: "+resolution);
		return this;
	}
	
}
class Video extends Media{
	private String format;

	public Video(String title, int duration, String format) {
		super(title, duration);
		this.format = format;
	}
	@Override
	public Media getDetails(){
		super.getDetails();
		System.out.print("\nFormat: "+format);
		return this;
	}
	
}


public class MultimediaSystem {

	public static void main(String[] args) {
		 Image image = new Image("Sample Image", 10, "1920x1080");
	     System.out.println("Details of the Image:");
	     image.getDetails();

	     System.out.println("\n");
	     Video video = new Video("Sample Video", 120, "mp4");
	     System.out.println("Details of the Video:");
	     video.getDetails();

	}

}
/*
Ques -1
-----------
Scenario: Multimedia Content Management System 

Base Class - Media:

Create a class named Media with the following attributes:
title (String): Represents the title of the media.
duration (int): Represents the duration of the media in seconds.
Implement a parameterized constructor to initialize these attributes.
Include getter methods for title and duration.
Implement a method getDetails() in the Media class, which prints general details of the media (title and duration),
take the return type as Mediaand return an object..

Subclass - Image:

Create a subclass named Image that extends the Media class.
Add an additional attribute:
resolution (String): Represents the resolution of the image.
Implement a parameterized constructor to initialize the attributes of both the Media class and the Image class.
Override the getDetails() method in the Image class to include specific details (resolution), take the return type as Image
and return an object. .

Subclass - Video:

Create a subclass named Video that extends the Media class.
Add an additional attribute:
format (String): Represents the format of the video.
Implement a parameterized constructor to initialize the attributes of both the Media class and the Video class.
Override the getDetails() method in the Video class to include specific details (format), take the return type as Video and
return an object.

ELC  -  MultimediaSystem:

Create an ELC MultimediaSystem that:
Instantiates an object of the Image class with sample data.
Invokes the getDetails() method on the Image object.
Instantiates an object of the Video class with sample data.
Invokes the getDetails() method on the Video object.
*/