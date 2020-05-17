package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Imag
import typingsSlinky.tensorflowTfjsCore.anon.Real
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", JSImport.Namespace)
@js.native
object complexUtilMod extends js.Object {
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  def complexWithEvenIndex(complex: js.typedarray.Float32Array): Imag = js.native
  def complexWithOddIndex(complex: js.typedarray.Float32Array): Imag = js.native
  def exponent(k: Double, n: Double, inverse: Boolean): Real = js.native
  def exponents(n: Double, inverse: Boolean): Imag = js.native
  def getComplexWithIndex(complex: js.typedarray.Float32Array, index: Double): Real = js.native
  def mergeRealAndImagArrays(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def splitRealAndImagArrays(complex: js.typedarray.Float32Array): Imag = js.native
}

