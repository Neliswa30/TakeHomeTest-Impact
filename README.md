# TakeHomeTest-Impact
source code for a job assesement awith Impact *Please Note that this code does not mean its according to the Impact requirements. Use as reference*

## Overview
This project is an assessment focused on producing a comma-delimited list of numbers and grouping them into ranges where they are sequential. The implementation follows Object-Oriented Design (OOD) principles to ensure modularity, maintainability, and scalability.

## Features
Comma-Delimited List Generation: Converts an array of numbers into a comma-separated string.
Sequential Range Grouping: Groups sequential numbers into ranges for a compact representation.
Object-Oriented Design: Utilizes classes and objects to encapsulate functionality and promote code reuse.

## Technologies Used
Programming Language: Java
OOD Principles: Encapsulation, Inheritance, Polymorphism

## Installation
Clone the repository:
git clone https://github.com/Neliswa30/TakeHomeTest-Impact.git

## Navigate to the project directory:
cd TakeHomeTest-Impact

## Usage
Prepare your list of numbers.
Use the provided functions to generate a comma-delimited list and group sequential numbers into ranges.
Example:
from number_processor import NumberProcessor
numbers = [1, 2, 3, 5, 6, 7, 9, 11, 12, 13, 14]
processor = NumberProcessor(numbers)
#Generate comma-delimited list
comma_list = processor.generate_comma_list()
print(comma_list)  # Output: "1,2,3,5,6,7,9,11,12,13,14"
#Group sequential numbers into ranges
ranges = processor.group_sequential_ranges()
print(ranges)  # Output: "1-3, 5-7, 9, 11-14"

## Contributing
Contributions are welcome! Please fork the repository, create a feature branch, and submit a pull request.

## License
This project is licensed under the MIT License.
