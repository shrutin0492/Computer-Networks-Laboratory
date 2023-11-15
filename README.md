# Computer Networks Lab

This repository contains programs completed as part of the Computer Networks Laboratory in the 3rd year of my undegrad.

## Table of Contents

- [Computer Networks Lab](#computer-networks-lab)
  - [Contents](#contents)
    - .[CRC_Error_Detection](#CRC-Error-Detection)
    - .[Bellman_Ford_Shortest_Path_Algorithm](#Bellman---Ford-Shortest-Path-Algorithm)
    - .[TCP_IP_Sockets_File_Transfer](#TCP/IP-Sockets---File-Transfer)
    - .[Datagram_Socket_Message_Display](#Datagram-Socket---Message-Display)
    - .[RSA_Algorithm_Encryption_Decryption](#RSA-Algorithm---Encryption-and-Decryption)
    - .[Leaky_Bucket_Algorithm_Congestion_Control](#Leaky-Bucket-Algorithm---Congestion-Control)
      
  - [Instructions to Run the Java Programs](#instructions-to-run-the-java-programs)
    - [Ubuntu](#ubuntu)
    - [Windows (WSL)](#windows-wsl)
    - [Visual Studio Code](#visual-studio-code)
    - [Windows with JDK installed](#windows-with-jdk-installed)

## Computer Networks Lab

This repository contains programs completed as part of the Computer Networks Laboratory in the 3rd year of my undergraduate studies.

### Contents

1. **CRC Error Detection**
   - **Description:** Implementing error detection using CRC-CCITT (16-bits).
   - **Code File:** [CRC.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/CRC.java)

2. **Bellman-Ford Shortest Path Algorithm**
   - **Description:** Finding the shortest path between vertices using the Bellman-Ford algorithm.
   - **Code File:** [BellmanFord.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/BellmanFord.java)

3. **TCP/IP Sockets - File Transfer**
   - **Description:** Client-server program for sending file names and receiving file contents using TCP/IP sockets.
   - **Server Code:** [tcps.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/tcps.java)
   - **Client Code:** [tcpc.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/tcpc.java)
   - **Text File:** [abc.txt](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/abc.txt)

4. **Datagram Socket - Message Display**
   - **Description:** Client-server program to display messages on the client side, typed at the server side using datagram sockets.
   - **Server Code:** [UDPS.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/UDPS.java)
   - **Client Code:** [UDPC.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/UDPC.java)

5. **RSA Algorithm - Encryption and Decryption**
   - **Description:** Implementation of the RSA algorithm for data encryption and decryption.
   - **Code File:** [RSA.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/RSA.java)

6. **Leaky Bucket Algorithm - Congestion Control**
   - **Description:** Implementing congestion control using the Leaky Bucket Algorithm.
   - **Code File:** [Bucket.java](https://github.com/shrutin567/Computer-Networks-Lab/blob/main/Bucket.java)

### Instructions to Run the Java Programs

#### Ubuntu:

1. **Install OpenJDK:**
   ```bash
   sudo apt update
   sudo apt install openjdk-11-jdk
   ```

2. **Compile and Run Java Programs:**
   - Open a terminal.
   - Navigate to the directory containing the Java files.
   - Compile: `javac FileName.java`
   - Run: `java FileName`

#### Windows (WSL):

1. **Install WSL:**
   - Follow the instructions to install WSL: [Windows Subsystem for Linux Installation Guide](https://docs.microsoft.com/en-us/windows/wsl/install)

2. **Install OpenJDK in WSL:**
   - Open WSL terminal.
   - Install OpenJDK using your package manager (e.g., `sudo apt install openjdk-11-jdk`).

3. **Compile and Run Java Programs:**
   - Open WSL terminal.
   - Navigate to the directory containing the Java files.
   - Compile: `javac FileName.java`
   - Run: `java FileName`

#### Visual Studio Code:

1. **Install Visual Studio Code:**
   - Download and install Visual Studio Code from [here](https://code.visualstudio.com/).

2. **Install Java Extension Pack:**
   - Open Visual Studio Code.
   - Go to Extensions (or use `Ctrl+Shift+X`).
   - Search for "Java Extension Pack" and install it.

3. **Open Project in VS Code:**
   - Open Visual Studio Code.
   - Open the folder containing your Java files.

4. **Compile and Run:**
   - Use the integrated terminal in VS Code.
   - Compile: `javac FileName.java`
   - Run: `java FileName`

#### Windows with JDK installed:

1. **Install JDK:**
   - Download and install the Java Development Kit (JDK) from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.java.net/).

2. **Set JAVA_HOME Environment Variable:**
   - Set the `JAVA_HOME` environment variable to the JDK installation path. [Instructions](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/)

3. **Compile and Run Java Programs:**
   - Open a command prompt.
   - Navigate to the directory containing the Java files.
   - Compile: `javac FileName.java`
   - Run: `java FileName`
