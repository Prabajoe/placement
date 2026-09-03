package snippet;

public class Snippet {
	name = 'aaa'
	print(type(name))
	
	# string methods
	message = "Python programming"
	upperCaseMsg = message.upper()
	print(upperCaseMsg)
	
	lowercaseMsg = message.lower()
	print(lowercaseMsg)
	
	print(len(message))
	
	userName = "   Madhumitha   "
	
	print(userName)
	print(userName.lstrip())
	print(userName.rstrip())
	print(userName.strip())
	
	print(message.count("g"))
	
	print(message.casefold())
	print(message.endswith("l"))
	print(message.startswith("P"))
	
	print(message.index("m"))
	
	print(" ".isspace())
	print(message.center(50))
	print(message.isalnum())
	
	print(message.replace("Python","java"))
	print(message.split())
	
	coding = "python and java"
	print(coding.split("and"))
	
	print(coding.swapcase())
}

