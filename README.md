# 🎭 Collaborative Whiteboard Application

## 👨‍👩‍👦 Team Members
- **Aseem Nihal Dang**
- **Jayesh Solanki**
- **Titas Mandal**

## 🎉 Overview
The **Collaborative Whiteboard Application** is an interactive platform that enables multiple users to draw, chat, and collaborate in real-time on a shared canvas.

### 🎨 Key Features
✅ **Real-time Drawing** – Instant synchronization of drawings for all connected users  
✅ **Color Palette** – Select from multiple colors to customize your artwork  
✅ **Eraser Tool** – Easily remove unwanted parts of your drawing  
✅ **Live Chat** – Communicate with other users via integrated text chat  
✅ **User List** – View active participants in real-time  

---
## 📝 Technical Details
- **🛠️ Architecture:** Client-Server model with TCP socket communication
- **🌟 GUI:** Built using **Java Swing** for an intuitive interface
- **🛠️ Multi-threading:** Manages multiple client connections seamlessly
- **💡 Networking:** Ensures reliable transmission of data over a TCP connection

## 🌐 Prerequisites
- **Java 8 or higher**
- **Stable network connection**

---
## ⚙️ How to Run

### 💪 Server Setup
1. Compile the server code:
   ```sh
   javac server/WhiteboardServer.java
   ```
2. Run the server:
   ```sh
   java server.WhiteboardServer
   ```

### 👥 Client Setup
1. Compile the client code:
   ```sh
   javac client/WhiteboardClient.java
   ```
2. Launch a client:
   ```sh
   java client.WhiteboardClient
   ```
3. Enter your username when prompted to join the session.

---
## 🔧 Usage Guide
### 🌟 Drawing Features
- **Drawing**: Click and drag to draw on the canvas.
- **Change Color**: Click on any color button to switch colors.
- **Eraser Tool**: Click the "E" button to erase portions of your drawing.
- **Clear Canvas**: Implemented in future updates.

### 💬 Chat Features
- Type a message in the chat box and press **Enter** to send.
- Messages are visible to all connected users.

### 👤 User List
- View the list of online users on the right panel.

---
## 🔧 Known Limitations
❌ **No persistent storage** – Drawings disappear once the last client disconnects.  
❌ **No authentication** – Any user can join without verification.  
❌ **Basic error handling** – Limited handling of connection issues.  

---
## 🌐 Future Enhancements
✨ **Shape tools** – Add support for rectangles, circles, and straight lines.  
✨ **Undo functionality** – Implement drawing history with an undo/redo feature.  
✨ **Save & Load** – Allow users to save and reload previous drawings.  
✨ **Authentication** – Implement login/signup functionality.  

---
**📈 Stay tuned for more updates and improvements!**

