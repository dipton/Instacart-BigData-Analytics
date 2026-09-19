# Instacart Market Basket Big Data Analytics

A Big Data Analytics project that analyzes the **Instacart Market Basket Analysis Dataset** using **Apache Hadoop**, **Java MapReduce**, and **Apache Pig**. This project was developed as part of a university Big Data Analytics Laboratory course and demonstrates distributed data processing on a Hadoop single-node cluster.

---

## Project Overview

The Instacart Market Basket Analysis dataset was uploaded to the Hadoop Distributed File System (HDFS) and analyzed using Java MapReduce programs and Apache Pig scripts. The project demonstrates how large-scale transaction data can be processed efficiently in a distributed environment.

The project performs the following analyses:

- Count orders by day of the week
- Count orders by hour of the day
- Identify the most purchased products
- Extract reordered products
- Find products added first to the cart
- Generate top purchased products using Apache Pig

---

## Hadoop Architecture

The following figure illustrates the Hadoop ecosystem used in this project.

![Hadoop Architecture](images/hadoop_architecture.png)

---

## Project Workflow

The following diagram shows how the Instacart dataset flows through HDFS, Java MapReduce, and Apache Pig before generating distributed outputs.

![Instacart Workflow](images/instacart_workflow.png)

---

## Technologies Used

- Apache Hadoop (HDFS)
- Java MapReduce
- Apache Pig
- Windows Single-Node Hadoop Cluster

---

## Repository Structure

```text
Instacart-BigData-Analytics/
│
├── Dataset/
│   ├── products.csv
│   └── README.txt
│
├── MapReduce/
│   ├── MR1_OrdersByDay/
│   ├── MR2_OrdersByHour/
│   └── MR3_TopPurchasedProducts/
│
├── Pig/
│   ├── Pig1_ReorderedProducts/
│   ├── Pig2_FirstCartProducts/
│   └── Pig3_TopPurchasedProducts/
│
├── Outputs/
│   ├── MR1_OrdersByDay/
│   ├── MR2_OrdersByHour/
│   ├── MR3_TopPurchasedProducts/
│   ├── Pig1_ReorderedProducts/
│   ├── Pig2_FirstCartProducts/
│   └── Pig3_TopPurchasedProducts/
│
├── Report/
│
├── images/
│   ├── hadoop_architecture.png
│   └── instacart_workflow.png
│
├── README.md
└── .gitignore