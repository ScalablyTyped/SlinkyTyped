package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", JSImport.Namespace)
@js.native
object mathUtilsMod extends js.Object {
  
  def arrayProd(array: js.Array[Double]): Double = js.native
  def arrayProd(array: js.Array[Double], begin: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  def arrayProd(array: js.Array[Double], begin: Double): Double = js.native
  def arrayProd(array: js.Array[Double], begin: Double, end: Double): Double = js.native
  def arrayProd(array: ArrayTypes): Double = js.native
  def arrayProd(array: ArrayTypes, begin: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  def arrayProd(array: ArrayTypes, begin: Double): Double = js.native
  def arrayProd(array: ArrayTypes, begin: Double, end: Double): Double = js.native
  
  def isInteger(x: Double): Boolean = js.native
  
  def max(array: js.Array[Double]): Double = js.native
  def max(array: js.typedarray.Float32Array): Double = js.native
  
  def mean(array: js.Array[Double]): Double = js.native
  def mean(array: js.typedarray.Float32Array): Double = js.native
  
  def median(array: js.Array[Double]): Double = js.native
  def median(array: js.typedarray.Float32Array): Double = js.native
  
  def min(array: js.Array[Double]): Double = js.native
  def min(array: js.typedarray.Float32Array): Double = js.native
  
  def range(begin: Double, end: Double): js.Array[Double] = js.native
  
  def sum(array: js.Array[Double]): Double = js.native
  def sum(array: js.typedarray.Float32Array): Double = js.native
  
  def variance(array: js.Array[Double]): Double = js.native
  def variance(array: js.typedarray.Float32Array): Double = js.native
  
  type ArrayTypes = js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array
}
