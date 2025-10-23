
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

# Hierarchical Clustering


dist_matrix <- dist(iris_data[, 1:4])

hc_model <- hclust(dist_matrix, method = "ward.D2")

plot(hc_model, main = "Hierarchical Clustering Dendrogram", xlab = "", sub = "", cex = 0.7)

hc_clusters <- cutree(hc_model, k = 3)

iris_data$HC_Cluster <- as.factor(hc_clusters)

# Part (b): Visualization



install.packages("ggplot2")
library(ggplot2)


ggplot(iris_data, aes(x = Sepal.Length, y = Sepal.Width, color = Cluster)) +
  geom_point(size = 3) +
  labs(title = "K-Means Clustering (Iris Data)",
       x = "Sepal Length", y = "Sepal Width") +
  theme_minimal()


ggplot(iris_data, aes(x = Petal.Length, y = Petal.Width, color = HC_Cluster)) +
  geom_point(size = 3) +
  labs(title = "Hierarchical Clustering (Iris Data)",
       x = "Petal Length", y = "Petal Width") +
  theme_minimal()
