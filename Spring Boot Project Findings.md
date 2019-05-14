# Spring Boot Project Findings

### What is at Entity?
POJO (Plain Old Java Object) data that is stored in the database. Every instance of an entity represents a row in the table.

### What is @Data doing?
This is a convenient shortcut that bundles all the boilerplate with simple POJOs: getters, setters, toString, equals, and hashCode.

### What is @Id and @GeneratedValue?
@Id identifies the member field is a primary key and @GeneratedValue is used to specify how your primary key will be generated. **FYI** for simple apps without many users use increment, identitym or hilo. These are easily configurable. 

### What is @RestController?
This a combination of @Controller and @ResponseBody -> automatic conversion of the return object into the HttpResponse. Every method within an @RestController class automatically serializes return objects into HttpResponse. 

### What is the JpaRepository?
A simplified version of DAO(Data Access Object an object that provides an abstract interface to a database) boiler plate code. By extending we get the most revelevant CRUD(create, read, update, and delete are the four basic functions of persistent storage) methods for data access. DAO class is the class where you write methods to perform operations over db.

### What is @Service and @Repository?
@Service indicates that this bean holds the business logic(part of the program that determines how data can be created, stored, and changed). @Repository is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.

### What is Autowired?
A form of dependency injection(provides the objects that an object needs (its dependencies) instead of having it construct them itself) allows Spring to resolve and inject collaborating beans into your bean.

### What is an Optional?
This is a class that was introduced in Java 8 and the purpose of the class is to provide a type-level solution for representing optional values instead of null references