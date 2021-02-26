package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreNumbers.`0.001`
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreNumbers.`0.1`
import typingsSlinky.tensorflowTfjsCore.testUtilMod.DoneFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtil {
  
  @JSImport("@tensorflow/tfjs-core", "test_util.TEST_EPSILON_FLOAT16")
  @js.native
  val TEST_EPSILON_FLOAT16: /* 0.1 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArrayBuffersEqual")
  @js.native
  def expectArrayBuffersEqual(actual: js.typedarray.ArrayBuffer, expected: js.typedarray.ArrayBuffer): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: Double, expected: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: Double, expected: Double, epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: Double, expected: RecursiveArray[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: Double, expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: Double, expected: TypedArray): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: Double, expected: TypedArray, epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: Double, epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray, epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: TypedArray, expected: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: TypedArray, expected: Double, epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: TypedArray, expected: TypedArray): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysClose")
  @js.native
  def expectArraysClose(actual: TypedArray, expected: TypedArray, epsilon: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "test_util.expectArraysEqual")
  @js.native
  def expectArraysEqual(actual: TensorLike, expected: TensorLike): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "test_util.expectNumbersClose")
  @js.native
  def expectNumbersClose(a: Double, e: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectNumbersClose")
  @js.native
  def expectNumbersClose(a: Double, e: Double, epsilon: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "test_util.expectPromiseToFail")
  @js.native
  def expectPromiseToFail(fn: js.Function0[js.Promise[js.Object]], done: DoneFn): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "test_util.expectValuesInRange")
  @js.native
  def expectValuesInRange(actual: js.Array[Double], low: Double, high: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core", "test_util.expectValuesInRange")
  @js.native
  def expectValuesInRange(actual: TypedArray, low: Double, high: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core", "test_util.testEpsilon")
  @js.native
  def testEpsilon(): `0.001` | `0.1` = js.native
}
