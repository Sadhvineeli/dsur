


data("mtcars")


head(mtcars)


lm_model <- lm(mpg ~ hp, data = mtcars)


summary(lm_model)

predicted_mpg <- predict(lm_model, newdata = data.frame(hp = c(100, 150, 200)))

cat("\nPredicted MPG for HP = 100, 150, 200:\n")
print(predicted_mpg)

plot(mtcars$hp, mtcars$mpg, main = "Linear Regression: MPG vs HP",
     xlab = "Horsepower", ylab = "Miles per Gallon", pch = 19, col = "blue")
abline(lm_model, col = "red", lwd = 2)
