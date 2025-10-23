
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
