<div align="center">
    <img src="https://raw.githubusercontent.com/Talend/component-runtime/master/talend-component-kit-intellij-plugin/src/main/resources/tacokit_logo.png"/>
</div>
<h1 align="center">
Talend Staff Components
</h1>
> This repository will be used as a link to components built by internal Talend Staff outside Engineering

## [MemSQL](https://github.com/Talend/memsql-component)
The MemSQL component was built as part of the ISV Partnership and performs the following actions
* CRUD operations via JDBC. Note that the MemSQL component uses the MariaDB JDBC driver and URL style
* Bulk: This action will have the Output Component write all the data that is going to MemSQL to a temporary local file.
Then as part of the final step after all records have been processed it will issue a single load command.
* Dynamic Table Creation: If selected this component will utilize the fields mapped into the Output Component to create
a table in the target based on those field(s) names and data types.

## [ThoughtSpot](https://github.com/Talend/thoughtspot-component)
The ThoughtSpot component allows the user to bulk write data into the ThoughtSpot appliance. This is done via
ssh as JDBC connectivity into ThoughtSpot can be extremely slow. 
* Bulk Load
* Dynamically Create Target Table
* Truncate Target Table before Load 

## [Data Generator](https://github.com/Talend/datagenerator-component)
The Data Generator component allows the user to bgenerate random and mock data for tests or demo purposes. The java-faker library is used underneath.
