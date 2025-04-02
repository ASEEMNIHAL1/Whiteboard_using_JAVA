# Collaborative Whiteboard Application

## Team Members
**ASEEM NIHAL DANG, JAYESH SOLANKI, TITAS MANDAL**

## Overview
This is a collaborative whiteboard application that allows multiple users to:

- Draw on a shared canvas in real-time
- Chat with other connected users
- See who else is online

## Features
- **Real-time drawing**: All drawings appear instantly for all connected clients
- **Color palette**: Choose from multiple colors for drawing
- **Eraser tool**: Remove parts of the drawing
- **Chat functionality**: Text chat with all connected users
- **User list**: See who's currently connected to the whiteboard

## Technical Details
- **Client-Server Architecture**: Uses a central server to relay messages between clients
- **Java Swing**: Graphical user interface built with Swing components
- **Network Communication**: Uses TCP sockets for reliable communication
- **Multi-threading**: Handles multiple clients simultaneously

## Prerequisites
- **Java 8 or higher**
- **Stable network connectivity between clients and server**

## How to Run
### Server
1. Compile the server code:
   ```sh
   javac server/WhiteboardServer.java
   ```
2. Run the server:
   ```sh
   java server.WhiteboardServer
   ```

### Client
1. Compile the client code:
   ```sh
   javac client/WhiteboardClient.java
   ```
2. Run a client:
   ```sh
   java client.WhiteboardClient
   ```
3. Enter your username when prompted

## Usage Instructions
- **Drawing**: Click and drag on the whiteboard to draw
- **Color Selection**: Click on any color button to change the drawing color
- **Eraser**: Click the "E" button to switch to eraser mode
- **Chat**: Type messages in the chat box at the bottom and press Enter to send
- **User List**: See all connected users in the right panel

## Known Limitations
- No persistent drawing storage (drawings are lost when the last client disconnects)
- No authentication or user management
- Basic error handling

## Future Enhancements
- Add shape tools (rectangles, circles)
- Implement drawing history/undo functionality
- Add file saving/loading capability
- Implement user authentication

