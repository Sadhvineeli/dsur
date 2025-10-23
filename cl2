
data(iris)
head(iris)

iris_data <- iris[, -5]


set.seed(123)

kmeans_model <- kmeans(iris_data, centers = 3, nstart = 20)

cat("K-Means Cluster Centers:\n")
print(kmeans_model$centers)

cat("\nCluster sizes:\n")
print(kmeans_model$size)

iris_data$Cluster <- as.factor(kmeans_model$cluster)
install.packages("ggplot2")
library(ggplot2)


ggplot(iris_data, aes(x = Sepal.Length, y = Sepal.Width, color = Cluster)) +
  geom_point(size = 3) +
  labs(title = "K-Means Clustering (Iris Data)",
       x = "Sepal Length", y = "Sepal Width") +
  theme_minimal()
