package typingsSlinky.skmeans.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skmeans", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Calculates unidimiensional and multidimensional k-means clustering on data.
    *
    * @param data Unidimiensional or multidimensional array of values to be clustered.
    * @param k Number of clusters.
    * @param centroids Initial centroid values.
    * @param iterations Maximum number of iterations. If not provided, it will be set to 10000.
    * @param distance Custom distance function. Takes two points as arguments and returns a scalar number.
    */
  def apply(data: js.Array[js.Array[Double] | Double], k: Double): Data = js.native
  def apply(data: js.Array[js.Array[Double] | Double], k: Double, centroids: CentroidValues): Data = js.native
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: CentroidValues,
    iterations: Double
  ): Data = js.native
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: CentroidValues,
    iterations: Double,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = js.native
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: CentroidValues,
    iterations: Null,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = js.native
}

