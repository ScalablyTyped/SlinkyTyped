package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Imag
import typingsSlinky.tensorflowTfjsCore.anon.Real
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "assignToTypedArray")
  @js.native
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "complexWithEvenIndex")
  @js.native
  def complexWithEvenIndex(complex: js.typedarray.Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "complexWithOddIndex")
  @js.native
  def complexWithOddIndex(complex: js.typedarray.Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "exponent")
  @js.native
  def exponent(k: Double, n: Double, inverse: Boolean): Real = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "exponents")
  @js.native
  def exponents(n: Double, inverse: Boolean): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "getComplexWithIndex")
  @js.native
  def getComplexWithIndex(complex: js.typedarray.Float32Array, index: Double): Real = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "mergeRealAndImagArrays")
  @js.native
  def mergeRealAndImagArrays(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "splitRealAndImagArrays")
  @js.native
  def splitRealAndImagArrays(complex: js.typedarray.Float32Array): Imag = js.native
}
