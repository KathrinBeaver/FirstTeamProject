import spaces
import dots
if __name__ == "__main__":
	print("Param pam pam")
	stringForCleaning = input()
	stringForCleaning = spaces.strip(stringForCleaning)
	stringForCleaning = dots.dot(stringForCleaning)
	print(stringForCleaning)
