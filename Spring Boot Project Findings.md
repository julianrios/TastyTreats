# Spring Boot Project Findings

### What is at Entity?
POJO (Plain Old Java Object) data that is stored in the database. Every instance of an entity represents a row in the table.

### What is @Data doing?
This is a convenient shortcut that bundles all the boilerplate with simple POJOs: getters, setters, toString, equals, and hashCode.

### What is @Id and @GeneratedValue?
@Id identifies the member field is a primary key and @GeneratedValue is used to specify how your primary key will be generated. **FYI** for simple apps without many users use increment, identity or hilo. These are easily configurable. 

### What is @RestController?
This a combination of @Controller and @ResponseBody -> automatic conversion of the return object into the HttpResponse. Every method within an @RestController class automatically serializes return objects into HttpResponse. 

### What is a ResponseEntity?
ResponseEntity represents the whole HTTP response: status code, headers, and body. It can be used to fully configure the HTTP response. For it to be used we have to return it from the endpoint. ResponseEntity is a generic type. As a result, we can return any type as the response body. ResponseEntity provides two nested builder interfaces: we can access their capabilities through the static methods of ResponseEntity.

### What is @RequestBody?
This annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.

### What is a HttpResponse?
HTTP response: status code, headers, and body.

### What is the JpaRepository?
A simplified version of DAO(Data Access Object an object that provides an abstract interface to a database) boiler plate code. By extending we get the most revelevant CRUD(create, read, update, and delete are the four basic functions of persistent storage) methods for data access. DAO class is the class where you write methods to perform operations over db.

### What is @Service and @Repository?
@Service indicates that this bean holds the business logic(part of the program that determines how data can be created, stored, and changed). @Repository is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.

### What is Autowired?
A form of dependency injection(provides the objects that an object needs (its dependencies) instead of having it construct them itself) allows Spring to resolve and inject collaborating beans into your bean.

### What is an Optional?
This is a class that was introduced in Java 8 and the purpose of the class is to provide a type-level solution for representing optional values instead of null references.

### What is @PostMapping, @GetMapping, @PutMapping, @DeleteMapping?, @PatchMapping?
All of the above annotations are already internally annotated with @RequestMapping and the respective value in the method element.

### What is @RequestMapping?
This annotation can be used with the class to create a base URI (Uniform Resource Identifier) a sequence of characters that allows the complete identification of any abstract or physical resource.

### What is @PathVariable?
This annotation can map the URI variable to one of the method arguments.

### How do I handle incoming HTTP requests?
Spring currently supports five types of inbuilt annotations for handling different types of incoming HTTP request methods which are GET, POST, PUT, DELETE and PATCH.












### Common application properties
Spring properties [https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html]