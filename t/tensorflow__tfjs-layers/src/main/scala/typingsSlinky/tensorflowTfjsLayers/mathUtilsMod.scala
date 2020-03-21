package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", JSImport.Namespace)
@js.native
object mathUtilsMod extends js.Object {
  def arrayProd(array: js.Array[Double]): Double = js.native
  def arrayProd(array: js.Array[Double], begin: Double): Double = js.native
  def arrayProd(array: js.Array[Double], begin: Double, end: Double): Double = js.native
  def arrayProd(array: ArrayTypes): Double = js.native
  def arrayProd(array: ArrayTypes, begin: Double): Double = js.native
  def arrayProd(array: ArrayTypes, begin: Double, end: Double): Double = js.native
  def isInteger(x: Double): Boolean = js.native
  def max(array: js.Array[Double]): Double = js.native
  def max(array: Float32Array): Double = js.native
  def mean(array: js.Array[Double]): Double = js.native
  def mean(array: Float32Array): Double = js.native
  def median(array: js.Array[Double]): Double = js.native
  def median(array: Float32Array): Double = js.native
  def min(array: js.Array[Double]): Double = js.native
  def min(array: Float32Array): Double = js.native
  def range(begin: Double, end: Double): js.Array[Double] = js.native
  def sum(array: js.Array[Double]): Double = js.native
  def sum(array: Float32Array): Double = js.native
  def variance(array: js.Array[Double]): Double = js.native
  def variance(array: Float32Array): Double = js.native
  type ArrayTypes = scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Float32Array
}

