# XhuStore
### There is a server program of the website which provides services of all students in XHU university for secong-handing       
### transaction.
### The program is very simple that used SSM and MAVEN framework to build it.
### Redis is simply used for cache some data in order to improve the performance.
### What's more,we used some small framework like GSON、COMMON-FILEUPLOADS.

# Notice:
#### 1. 该项目的使用基于注解的声明式事物，所有事物控制全部使用注解实现.
#### 2. 由于spring的声明式事物默认只支持运行时异常的回滚，故业务逻辑层的所有异常都必须以运行时异常的形式抛出.
#### 3. 所有接口均设计为Restful格式.
#### 4. 阿里规范要求：数据订正时，删除和修改记录时，要先 select，避免出现误删除，确认无误才能执 行更新语句。 但是本程序为了提高效率，在更新前可不采用select操作，更新失                    
####    败直接返回明显已知异常，以开发者更加注意代码的走查与审查作为代价。
#### 5. 所有的分页查询必须从mysql层面进行效率优化，规避数据量过大带来的性能瓶颈。


