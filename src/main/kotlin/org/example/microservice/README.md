val name: String - cannot be null anyway 
val name: String? - nullable


Operator: 
Safe call operator
user?.name - if user= null it return null

Elvis operator 
val name = user?.name ?: "Unknown" if null it will say Unknown

Non null assertion operator
val name = user!!.name
it will throw NullPointerException if user is null

Data class:
class User(val id: Long, val name: String)
data class User( val id: Long, val name: String )
compiler will generate equals()
hashCode()
toString()
copy()
componentN()
example: 
val user = User(1, "John")
val user2 = User(1, "John")
if usual class user == user2 will be false 
if data class user == user2 will be true 
used for DTO response request not for Entity 



Sealed class: 

sealed class Result()
data class Success(val data: String) : Result() 
data class Error(val message: String) : Result() 
object Loading: Result() 
when (result) { 
is Success -> println(result.data) 
is Error -> println(result.message)
is Loading -> println("Loading")
}

Extension function: 
fun String.isEmail(): Boolean { 
return contains("@")
}
val email = ""
if (email.isEmail()) { 
println("Email is valid")
}







