package com.design;

interface OnlineAccount {
	int basePrice = 120;
	int regularMoviePrice = 45;
	int exclusiveMoviePrice = 80;
}

class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Add a parameterized constructor that initializes the attributes noOfExclusiveMovies and noOfExclusiveMovies.


    public Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies) {
		super();
		this.noOfRegularMovies = noOfRegularMovies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.ownerName = ownerName;
	}

	// 2. This method returns the monthly cost for the account.
    public int monthlyCost() {
        return basePrice + (this.noOfRegularMovies * regularMoviePrice) + (this.noOfExclusiveMovies * exclusiveMoviePrice);
    }

    // 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
    
    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    public String toString() {
    	return new StringBuilder("Owner is ").append(ownerName)
    			.append(" and monthly cost is ").append(this.monthlyCost())
    			.append(" USD").toString();
    }

	@Override
	public int compareTo(Account o) {
		return this.monthlyCost() - o.monthlyCost();
	}
}
