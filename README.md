# DifferentWaysOfValidatingObjects
In this project I want to show just some thoughts which I recently had about how to respect SRP(Single Responsibility
Principle) when it comes to trivial validations on the object state, when its being used by some service.
And at the same time have a meaningful ObjectOriented solution.

Example A
In example A the EmailSender class has a method sendEmail() which appart from sending an email, also has the 
responsibility of validating the state of the email before sending it. I consider this first example a violation of 
the SRP principle. 

Example B
In this example we try to delegate the validation responsibility to a validator which is passed into the method sendEmail()
in the class EmailSender. This means that every time a client calls the method it will have to provide a validator. But this
is still not very good, since the client will still have think about how to provide a validator. I was thinking in using static validation
methods to get rid of the dependency, but this again would not be good enough, because we would be again violating the 
SRP.

Example C
This example its very similar to Example B, in order to release the client from passing every time a validator, I pass it in
the constructor so the client will have to pass it just once. But this is still not good enough, because, the violation of
the SRP remains.

Example D
In this example the Email sender its completely free from SRP violations, it just does what it whants to do.
An EmailBuilder class with embedded validation was created and if the client its expected to send an email, he will
have to build it. The builder itself will provide feedback to the client when creating each of the fields.
Please note that the with() methods of the builder perform an assignment and also validate, I don't consider this
a violation of SRP, since it is extremely trivial.

Example E
Another approach if we don't want to have the validation in the builder, could be to go throwards a non-anemic model
and let the objects that compose an email to self validate themselves. Note that in this example the email now is 
mandating to exist with all the values, as oppose than with the builder. Depending on what is our bussiness case
we can pick from this point what would be best for the client create the emails; maybe this constructor composition is
good enough, or maybe use again a builder(this out without validation), or a factory.

Example F
This example is identical to example E, the only difference is that I enhanced the tiny types to contain static
factory methods.




