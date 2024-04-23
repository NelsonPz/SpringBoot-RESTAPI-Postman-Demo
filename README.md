# SpringBoot-Postman-

This is a Spring Boot application that simulates a basic social media platform. Users can create profiles, make posts, and view posts made by other users.

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your_username/nelsonlab2.git
2. **Navigate to the project directory:**
   cd nelsonlab2
3. **Build the project using Maven:**
   mvn clean install
4. **Run the application:**
   mvn spring-boot:run
   
## Usage
Once the application is running, you can interact with it using any HTTP client such as POSTMAN or by sending requests directly from your browser. The following routes are available:

- GET /api/profiles: Get all profiles.
- GET /api/profiles/{profileId}: Get a profile by ID.
- GET /api/profiles/{profileId}/postings: Get all postings by a specific profile.
- GET /api/postings: Get all postings.
- GET /api/postings/{postId}: Get a posting by ID.
- POST /api/profiles: Create a new profile.
- POST /api/postings: Create a new posting.

## Testing
The routes can be tested using POSTMAN or any other HTTP client. Ensure that the application is running locally before sending requests. Here are the steps to test with POSTMAN:

1. Open POSTMAN.
2. Set the request type (GET, POST, etc.) and enter the appropriate URL.
3. Optionally, add request headers or body parameters as needed.
4. Click "Send" to send the request.
5. Review the response from the server.
