Convert chat to PDF
Convert chat to PDF
Open this chat in Acrobat
Conversation with Gemini
*Week-1 Assignment*

_Case Study focused on developing a bank customer page using JavaScript. In this, you will embark on a practical journey to build a dynamic and interactive webpage that caters specifically to the needs of a bank's customers.The course begins with an introduction to the JavaScript project, where you will explore the essential features of JavaScript and its significance in web development._ 

https://infyspringboard.onwingspan.com/web/en/app/toc/lex_auth_0138419804234465288873_shared/overview

do this assignment

Here is a complete HTML, CSS, and JavaScript solution designed to satisfy all three scenarios outlined in your case study for XYZ Bank:

Welcome Message: Automatically greets existing users upon loading.

Hide Instructions on Click: Hides the detailed instructions/steps when the user clicks the "Register" button.

Coupon Code Generation: Dynamically generates a personalized Diwali coupon code based on the entered customerId.

Complete Solution Code
You can place this code inside a single file named index.html and open it in any browser (Chrome, Firefox, Edge, etc.).

HTML
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>XYZ Bank - Festival Bonanza Offer</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f7f6;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
        }

        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }

        h1 {
            color: #003366;
            text-align: center;
            border-bottom: 2px solid #003366;
            padding-bottom: 10px;
        }

        #welcome-msg {
            background-color: #e6f2ff;
            color: #004085;
            padding: 12px;
            border-radius: 4px;
            margin-bottom: 20px;
            font-weight: bold;
            text-align: center;
        }

        .instructions {
            background-color: #fff3cd;
            color: #856404;
            padding: 15px;
            border-radius: 4px;
            margin-bottom: 20px;
        }

        .instructions h3 {
            margin-top: 0;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #333;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            background-color: #28a745;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            font-weight: bold;
        }

        button:hover {
            background-color: #218838;
        }

        #result {
            margin-top: 20px;
            padding: 15px;
            border-radius: 4px;
            display: none;
            text-align: center;
        }

        .success {
            background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
        }

        .error {
            background-color: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>XYZ Bank</h1>
        
        <!-- Scenario 1: Welcome Message -->
        <div id="welcome-msg"></div>

        <!-- Scenario 2: Detailed Steps to Hide -->
        <div id="instructions" class="instructions">
            <h3>How to Claim Your Diwali Coupon:</h3>
            <ol>
                <li>Enter your valid Customer ID in the box below.</li>
                <li>Click on the <strong>Register</strong> button.</li>
                <li>Your unique Diwali Coupon Code will be generated instantly!</li>
            </ol>
        </div>

        <!-- Registration Form -->
        <form id="couponForm" onsubmit="handleRegistration(event)">
            <div class="form-group">
                <label for="customerId">Customer ID:</label>
                <input type="text" id="customerId" placeholder="e.g. CUST1024" required>
            </div>
            
            <!-- Scenario 2 & 3 Trigger -->
            <button type="submit" id="registerBtn">Register</button>
        </form>

        <!-- Result Box for Generated Coupon -->
        <div id="result"></div>
    </div>

    <script>
        // Scenario 1: Display welcome message on page load using JavaScript
        window.onload = function() {
            var welcomeDiv = document.getElementById("welcome-msg");
            welcomeDiv.innerText = "Welcome back, valued customer! Claim your Festival Bonanza Offer below.";
        };

        // Function handling Scenario 2 and Scenario 3
        function handleRegistration(event) {
            // Prevent standard form submission reload
            event.preventDefault();

            // Fetch input value
            var customerId = document.getElementById("customerId").value.trim();

            if (customerId === "") {
                alert("Please enter a valid Customer ID.");
                return;
            }

            // Scenario 2: Hide detailed steps upon clicking Register
            var instructionsDiv = document.getElementById("instructions");
            instructionsDiv.style.display = "none";

            // Scenario 3: Generate Coupon Code based on customerId
            // Example Logic: DIWALI2026 + Uppercase CustomerID
            var couponCode = "DIWALI2026-" + customerId.toUpperCase();

            // Display the generated coupon code to the user
            var resultDiv = document.getElementById("result");
            resultDiv.className = "success";
            resultDiv.style.display = "block";
            resultDiv.innerHTML = "<strong>Registration Successful!</strong><br>Your Diwali Coupon Code is: <h3>" + couponCode + "</h3>";
        }
    </script>
</body>
</html>
Explanation of Implementation
Scenario 1: The window.onload event listener executes immediately when the page loads, placing a customized greeting inside #welcome-msg.

Scenario 2: When the user fills in the Customer ID and clicks Register, the JS function targets the step-by-step element (#instructions) and applies display: none to hide it from view.

Scenario 3: The function takes the input customerId, combines it with the festival prefix (DIWALI2026-), and renders the generated coupon code directly on the screen.

make code from pics

Here is the exact reconstructed code combined from all four screenshots of your Notepad assignment video.

Complete Reconstructed Code
HTML
<html>
    <head>
        <title>XYZ bank</title>

        <script type="text/javascript">
            function trigger()
            {
                document.getElementById("hover").addEventListener("mouseover", popup);

                function popup()
                {
                    alert("Welcome to XYZ bank !!!");
                }
            }
        </script>

        <script>
            function validateCustomer()
            {
                var custId=document.getElementById("custID").value;
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Customer ID is valid,you can proceed further to generate coupon");
                }
                else
                {
                    document.write("You are not a valid customer");
                }
            }
        </script>

        <script>
            function generateCoupon()
            {
                var custId=document.getElementById("custID").value;
                var x = custId +"789456";
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Your coupon is:"+x);
                }
                else
                {
                    document.write("Invalid customer ID so coupon can't be generated");
                }
            }
        </script>
    </head>

    <body onload="trigger();">

        <p id="hover">Welcome customer !!!</p>
        <p id="demo">Follow the below Steps to get Diwali coupon:-<br>
            1)Enter your customer ID in the textbox<br>
            2)Click on validate customer button<br>
            3)Click on Register button to hide all the above steps and can apply for coupons<br>
        </p>

        <button type="button" onclick="document.getElementById('demo').style.display='none'">Click here to Register</button><br><br><br>
        Enter Customer ID:
        <input id="custID" type="text" name="customerID"><br><br>

        <button type="button1" onclick="validateCustomer()">Validate customer</button>
        <button type="button" onclick="generateCoupon()">Click here to generate coupon</button>

    </body>
</html>
EPAM Student Assignment

- Create a Github repo named "EPAM project - 26" and upload all the assignment.

- Complete assignment on their dedicated duration.

- On each assignment we will give you the submission form.

- Before 20-Aug upload all the assignment on your github repo.

- Students who will not submit all the assignment on time, they will be not eligible for the interview.

Assignment details find in the attached sheet



make repo name and read me file for this

Here is the requested repository structure and a formatted README.md file tailored specifically to your EPAM Student Assignment schedule extracted from your attached spreadsheet.

📌 Repository Name
Plaintext
EPAM project - 26
📄 README.md File Content
Copy and paste the markdown below into a README.md file in the root directory of your GitHub repository:

Markdown
# EPAM Student Assignment - 2026

This repository contains all solved assignments for the **EPAM Student Program**. All work is organized sequentially by task and duration, submitted prior to the deadline on **August 20, 2026**.

---

## 📅 Assignment Schedule & Details

| Assignment | Duration | Topic | Details / Links |
| :--- | :--- | :--- | :--- |
| **Assignment 1** | 31-Jul to 04-Aug | JavaScript Case Study | XYZ Bank Customer Coupon Page |
| **Assignment 2** | 05-Aug to 09-Aug | Array, Tree, Graph Problem Statement | [Problem Statement Link](https://docs.google.com/document/d/1nECpAu2ANmeZMCIg3d8qtS71NAjj1TKf/edit?usp=drive_link&ouid=115862418770418379601&rtpof=true&sd=true) |
| **Assignment 3** | 10-Aug to 13-Aug | Greedy, Dynamic Programming | [Problem Statement Link](https://docs.google.com/document/d/1Hmm224W1KH0OLvsWIk_wisyFbBrgWXsW/edit?usp=drive_link&ouid=115862418770418379601&rtpof=true&sd=true) |
| **Assignment 4** | 14-Aug to 20-Aug | GitHub | [Course Overview Link](https://infyspringboard.onwingspan.com/web/en/app/toc/lex_auth_01384266074125107220863_shared/overview) |

---

## 📂 Repository Structure

```text
EPAM project - 26/
│
├── Assignment-1_JavaScript/
│   ├── index.html
│   └── README.md
│
├── Assignment-2_DataStructures/
│   ├── Array/
│   ├── Tree/
│   └── Graph/
│
├── Assignment-3_Greedy_DP/
│   ├── Greedy/
│   └── DP/
│
├── Assignment-4_GitHub/
│   └── documentation/
│
└── README.md
📝 Important Submission Deadlines
Final Repository Submission Deadline: August 20, 2026

All submission forms will be submitted per completed assignment schedule.

remove the assignment 4

Here is the updated README.md content with Assignment 4 removed.

📄 Updated README.md File Content
Markdown
# EPAM Student Assignment - 2026

This repository contains all solved assignments for the **EPAM Student Program**. All work is organized sequentially by task and duration, submitted prior to the deadline on **August 20, 2026**.

---

## 📅 Assignment Schedule & Details

| Assignment | Duration | Topic | Details / Links |
| :--- | :--- | :--- | :--- |
| **Assignment 1** | 31-Jul to 04-Aug | JavaScript Case Study | XYZ Bank Customer Coupon Page |
| **Assignment 2** | 05-Aug to 09-Aug | Array, Tree, Graph Problem Statement | [Problem Statement Link](https://docs.google.com/document/d/1nECpAu2ANmeZMCIg3d8qtS71NAjj1TKf/edit?usp=drive_link&ouid=115862418770418379601&rtpof=true&sd=true) |
| **Assignment 3** | 10-Aug to 13-Aug | Greedy, Dynamic Programming | [Problem Statement Link](https://docs.google.com/document/d/1Hmm224W1KH0OLvsWIk_wisyFbBrgWXsW/edit?usp=drive_link&ouid=115862418770418379601&rtpof=true&sd=true) |

---

## 📂 Repository Structure

```text
EPAM project - 26/
│
├── Assignment-1_JavaScript/
│   ├── index.html
│   └── README.md
│
├── Assignment-2_DataStructures/
│   ├── Array/
│   ├── Tree/
│   └── Graph/
│
├── Assignment-3_Greedy_DP/
│   ├── Greedy/
│   └── DP/
│
└── README.md
📝 Important Submission Deadlines
Final Repository Submission Deadline: August 20, 2026

All submission forms will be submitted per completed assignment schedule.

<html>

    <head>

        <title>XYZ bank</title>



        <script type="text/javascript">

            function trigger()

            {

                document.getElementById("hover").addEventListener("mouseover", popup);



                function popup()

                {

                    alert("Welcome to XYZ bank !!!");

                }

            }

        </script>



        <script>

            function validateCustomer()

            {

                var custId=document.getElementById("custID").value;

                var validateCust=custId.includes("XYZ");

                if (validateCust)

                {

                    document.write("Customer ID is valid,you can proceed further to generate coupon");

                }

                else

                {

                    document.write("You are not a valid customer");

                }

            }

        </script>



        <script>

            function generateCoupon()

            {

                var custId=document.getElementById("custID").value;

                var x = custId +"789456";

                var validateCust=custId.includes("XYZ");

                if (validateCust)

                {

                    document.write("Your coupon is:"+x);

                }

                else

                {

                    document.write("Invalid customer ID so coupon can't be generated");

                }

            }

        </script>

    </head>



    <body onload="trigger();">



        <p id="hover">Welcome customer !!!</p>

        <p id="demo">Follow the below Steps to get Diwali coupon:-<br>

            1)Enter your customer ID in the textbox<br>

            2)Click on validate customer button<br>

            3)Click on Register button to hide all the above steps and can apply for coupons<br>

        </p>



        <button type="button" onclick="document.getElementById('demo').style.display='none'">Click here to Register</button><br><br><br>

        Enter Customer ID:

        <input id="custID" type="text" name="customerID"><br><br>



        <button type="button1" onclick="validateCustomer()">Validate customer</button>

        <button type="button" onclick="generateCoupon()">Click here to generate coupon</button>



    </body>

</html>



give readme for it

Here is a clean and professional README.md file specifically written for this JavaScript Case Study code.

Assignment 1: XYZ Bank Customer Coupon System
This project is a JavaScript-based web application developed for XYZ Bank as part of the EPAM Student Assignment program. It provides dynamic functionality for existing bank customers to validate their Customer ID and retrieve a personalized Diwali shopping coupon code.

📌 Features & Functional Scenarios
Interactive Welcome Alert:

Triggers a welcome message (Welcome to XYZ bank !!!) when the user hovers their mouse over the welcome text on the webpage.

Dynamic UI Controls:

Clicking the "Click here to Register" button dynamically hides the step-by-step instructions section from the page interface.

Customer ID Validation:

Checks whether the entered Customer ID contains the required prefix XYZ.

Diwali Coupon Code Generation:

Generates a unique coupon code by appending 789456 to a valid Customer ID (e.g., XYZ101789456).

📂 File Structure
Place this project inside your main repository under the Assignment-1_JavaScript folder:

Plaintext
EPAM project - 26/
│
├── Assignment-1_JavaScript/
│   ├── index.html
│   └── README.md
│
└── README.md
🛠️ How to Run
Open the file index.html in any web browser (Google Chrome, Mozilla Firefox, Microsoft Edge).

Trigger Welcome Alert: Hover your mouse over "Welcome customer !!!".

Hide Instructions: Click "Click here to Register" to hide the setup steps.

Validate ID: Enter a Customer ID containing XYZ (e.g., XYZ1234) into the input box and click "Validate customer".

Generate Coupon: Click "Click here to generate coupon" to create your coupon code.

give readme Assignment 1: XYZ Bank Customer Coupon System

code above i share

Here is a structured, detailed README.md file tailored specifically for your Assignment 1: XYZ Bank Customer Coupon System.

Assignment 1: XYZ Bank Customer Coupon System
📌 Overview
This project is a JavaScript-based interactive webpage developed for XYZ Bank as part of the EPAM Student Assignment Program. The web page provides bank customers with an easy-to-use interface to validate their Customer ID and claim a unique Diwali festival shopping coupon code.

🎯 Objectives & Implemented Scenarios
Scenario 1: Interactive Welcome Greeting

Dynamically attaches an event listener to display a popup alert (Welcome to XYZ bank !!!) when a customer hovers over the welcome text on the webpage.

Scenario 2: Dynamic Element Display Control

Provides a "Click here to Register" button that hides the detailed step-by-step instructions from the screen upon being clicked.

Scenario 3: Customer Validation & Coupon Generation

Validates whether the provided Customer ID contains the string prefix "XYZ".

Generates a unique coupon code by appending the suffix "789456" to a valid Customer ID.

💻 Source Code
HTML
<html>
    <head>
        <title>XYZ bank</title>

        <script type="text/javascript">
            function trigger()
            {
                document.getElementById("hover").addEventListener("mouseover", popup);

                function popup()
                {
                    alert("Welcome to XYZ bank !!!");
                }
            }
        </script>

        <script>
            function validateCustomer()
            {
                var custId=document.getElementById("custID").value;
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Customer ID is valid,you can proceed further to generate coupon");
                }
                else
                {
                    document.write("You are not a valid customer");
                }
            }
        </script>

        <script>
            function generateCoupon()
            {
                var custId=document.getElementById("custID").value;
                var x = custId +"789456";
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Your coupon is:"+x);
                }
                else
                {
                    document.write("Invalid customer ID so coupon can't be generated");
                }
            }
        </script>
    </head>

    <body onload="trigger();">

        <p id="hover">Welcome customer !!!</p>
        <p id="demo">Follow the below Steps to get Diwali coupon:-<br>
            1)Enter your customer ID in the textbox<br>
            2)Click on validate customer button<br>
            3)Click on Register button to hide all the above steps and can apply for coupons<br>
        </p>

        <button type="button" onclick="document.getElementById('demo').style.display='none'">Click here to Register</button><br><br><br>
        Enter Customer ID:
        <input id="custID" type="text" name="customerID"><br><br>

        <button type="button1" onclick="validateCustomer()">Validate customer</button>
        <button type="button" onclick="generateCoupon()">Click here to generate coupon</button>

    </body>
</html>
📂 Project Structure
Place this assignment within your GitHub repository under the following folder structure:

Plaintext
EPAM project - 26/
│
├── Assignment-1_JavaScript/
│   ├── index.html
│   └── README.md
│
├── Assignment-2_DataStructures/
├── Assignment-3_Greedy_DP/
└── README.md
🚀 How to Run & Test
Clone or download the repository.

Open index.html in any web browser (Chrome, Edge, Firefox).

Hover Test: Move your mouse pointer over "Welcome customer !!!" to trigger the welcome alert.

Register/Hide Test: Click "Click here to Register" to hide the instructional text.

Validation Test: Enter a Customer ID containing XYZ (e.g., XYZ101) and click "Validate customer".

Coupon Generation Test: Click "Click here to generate coupon" to get your generated code (e.g., XYZ101789456).

give me direct md file for assignment 1

📂 Project Structure
Place this assignment within your GitHub repository under the following folder structure:

Plaintext
EPAM project - 26/
│
├── Assignment-1_JavaScript/
│   ├── index.html
│   └── README.md
│
├── Assignment-2_DataStructures/
├── Assignment-3_Greedy_DP/
└── README.md
🚀 How to Run & Test
Clone or download the repository.

Open index.html in any web browser (Chrome, Edge, Firefox).

Hover Test: Move your mouse pointer over "Welcome customer !!!" to trigger the welcome alert.

Register/Hide Test: Click "Click here to Register" to hide the instructional text.

Validation Test: Enter a Customer ID containing XYZ (e.g., XYZ101) and click "Validate customer".

Coupon Generation Test: Click "Click here to generate coupon" to get your generated code (e.g., XYZ101789456).
"""

with open("README.md", "w", encoding="utf-8") as f:
f.write(readme_content)

print("README.md file created successfully.")


```text?code_stdout&code_event_index=1
README.md file created successfully.

Your Markdown file is ready
MD icon
README
 MD 
Open

Here is the raw Markdown content for your Assignment-1_JavaScript/README.md file:

Markdown
# Assignment 1: XYZ Bank Customer Coupon System

## 📌 Overview
This project is a JavaScript-based interactive webpage developed for **XYZ Bank** as part of the EPAM Student Assignment Program. The web page provides bank customers with an easy-to-use interface to validate their Customer ID and claim a unique Diwali festival shopping coupon code.

---

## 🎯 Objectives & Implemented Scenarios

1. **Scenario 1: Interactive Welcome Greeting**
   * Dynamically attaches an event listener to display a popup alert (`Welcome to XYZ bank !!!`) when a customer hovers over the welcome text on the webpage.
2. **Scenario 2: Dynamic Element Display Control**
   * Provides a **"Click here to Register"** button that hides the detailed step-by-step instructions from the screen upon being clicked.
3. **Scenario 3: Customer Validation & Coupon Generation**
   * Validates whether the provided `Customer ID` contains the string prefix `"XYZ"`.
   * Generates a unique coupon code by appending the suffix `"789456"` to a valid Customer ID.

---

## 💻 Source Code

```html
<html>
    <head>
        <title>XYZ bank</title>

        <script type="text/javascript">
            function trigger()
            {
                document.getElementById("hover").addEventListener("mouseover", popup);

                function popup()
                {
                    alert("Welcome to XYZ bank !!!");
                }
            }
        </script>

        <script>
            function validateCustomer()
            {
                var custId=document.getElementById("custID").value;
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Customer ID is valid,you can proceed further to generate coupon");
                }
                else
                {
                    document.write("You are not a valid customer");
                }
            }
        </script>

        <script>
            function generateCoupon()
            {
                var custId=document.getElementById("custID").value;
                var x = custId +"789456";
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Your coupon is:"+x);
                }
                else
                {
                    document.write("Invalid customer ID so coupon can't be generated");
                }
            }
        </script>
    </head>

    <body onload="trigger();">

        <p id="hover">Welcome customer !!!</p>
        <p id="demo">Follow the below Steps to get Diwali coupon:-<br>
            1)Enter your customer ID in the textbox<br>
            2)Click on validate customer button<br>
            3)Click on Register button to hide all the above steps and can apply for coupons<br>
        </p>

        <button type="button" onclick="document.getElementById('demo').style.display='none'">Click here to Register</button><br><br><br>
        Enter Customer ID:
        <input id="custID" type="text" name="customerID"><br><br>

        <button type="button1" onclick="validateCustomer()">Validate customer</button>
        <button type="button" onclick="generateCoupon()">Click here to generate coupon</button>

    </body>
</html>
📂 Project Structure
Place this assignment within your GitHub repository under the following folder structure:

Plaintext
EPAM project - 26/
│
├── Assignment-1_JavaScript/
│   ├── index.html
│   └── README.md
│
├── Assignment-2_DataStructures/
├── Assignment-3_Greedy_DP/
└── README.md
🚀 How to Run & Test
Clone or download the repository.

Open index.html in any web browser (Chrome, Edge, Firefox).

Hover Test: Move your mouse pointer over "Welcome customer !!!" to trigger the welcome alert.

Register/Hide Test: Click "Click here to Register" to hide the instructional text.

Validation Test: Enter a Customer ID containing XYZ (e.g., XYZ101) and click "Validate customer".

Coupon Generation Test: Click "Click here to generate coupon" to get your generated code (e.g., XYZ101789456).




Gemini is AI and can make mistakes.

# Assignment 1: XYZ Bank Customer Coupon System

## 📌 Overview
This project is a JavaScript-based interactive webpage developed for **XYZ Bank** as part of the EPAM Student Assignment Program. The web page provides bank customers with an easy-to-use interface to validate their Customer ID and claim a unique Diwali festival shopping coupon code.

---

## 🎯 Objectives & Implemented Scenarios

1. **Scenario 1: Interactive Welcome Greeting**
   * Dynamically attaches an event listener to display a popup alert (`Welcome to XYZ bank !!!`) when a customer hovers over the welcome text on the webpage.
2. **Scenario 2: Dynamic Element Display Control**
   * Provides a **"Click here to Register"** button that hides the detailed step-by-step instructions from the screen upon being clicked.
3. **Scenario 3: Customer Validation & Coupon Generation**
   * Validates whether the provided `Customer ID` contains the string prefix `"XYZ"`.
   * Generates a unique coupon code by appending the suffix `"789456"` to a valid Customer ID.

---

## 💻 Source Code

```html
<html>
    <head>
        <title>XYZ bank</title>

        <script type="text/javascript">
            function trigger()
            {
                document.getElementById("hover").addEventListener("mouseover", popup);

                function popup()
                {
                    alert("Welcome to XYZ bank !!!");
                }
            }
        </script>

        <script>
            function validateCustomer()
            {
                var custId=document.getElementById("custID").value;
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Customer ID is valid,you can proceed further to generate coupon");
                }
                else
                {
                    document.write("You are not a valid customer");
                }
            }
        </script>

        <script>
            function generateCoupon()
            {
                var custId=document.getElementById("custID").value;
                var x = custId +"789456";
                var validateCust=custId.includes("XYZ");
                if (validateCust)
                {
                    document.write("Your coupon is:"+x);
                }
                else
                {
                    document.write("Invalid customer ID so coupon can't be generated");
                }
            }
        </script>
    </head>

    <body onload="trigger();">

        <p id="hover">Welcome customer !!!</p>
        <p id="demo">Follow the below Steps to get Diwali coupon:-<br>
            1)Enter your customer ID in the textbox<br>
            2)Click on validate customer button<br>
            3)Click on Register button to hide all the above steps and can apply for coupons<br>
        </p>

        <button type="button" onclick="document.getElementById('demo').style.display='none'">Click here to Register</button><br><br><br>
        Enter Customer ID:
        <input id="custID" type="text" name="customerID"><br><br>

        <button type="button1" onclick="validateCustomer()">Validate customer</button>
        <button type="button" onclick="generateCoupon()">Click here to generate coupon</button>

    </body>
</html>
```

---

## 📂 Project Structure

Place this assignment within your GitHub repository under the following folder structure:

```text
EPAM project - 26/
│
├── Assignment-1_JavaScript/
│   ├── index.html
│   └── README.md
│
├── Assignment-2_DataStructures/
├── Assignment-3_Greedy_DP/
└── README.md
```

---

## 🚀 How to Run & Test

1. Clone or download the repository.
2. Open `index.html` in any web browser (Chrome, Edge, Firefox).
3. **Hover Test:** Move your mouse pointer over **"Welcome customer !!!"** to trigger the welcome alert.
4. **Register/Hide Test:** Click **"Click here to Register"** to hide the instructional text.
5. **Validation Test:** Enter a Customer ID containing `XYZ` (e.g., `XYZ101`) and click **"Validate customer"**.
6. **Coupon Generation Test:** Click **"Click here to generate coupon"** to get your generated code (e.g., `XYZ101789456`).
README.md
Displaying README.md.
