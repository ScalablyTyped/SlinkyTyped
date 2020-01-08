package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsNumbers.`0.001`
import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsNumbers.`0.1`
import typingsSlinky.atTensorflowTfjsDashCore.distTestUnderscoreUtilMod.DoneFn
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.RecursiveArray
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "test_util")
@js.native
object test_util extends js.Object {
  val TEST_EPSILON_FLOAT16: `0.1` = js.native
  def expectArrayBuffersEqual(actual: scala.scalajs.js.typedarray.ArrayBuffer, expected: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  def expectArraysClose(actual: Double, expected: Double): Unit = js.native
  def expectArraysClose(actual: Double, expected: Double, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: Double, expected: RecursiveArray[Double]): Unit = js.native
  def expectArraysClose(actual: Double, expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  def expectArraysClose(actual: Double, expected: TypedArray): Unit = js.native
  def expectArraysClose(actual: Double, expected: TypedArray, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: Double, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double]): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray): Unit = js.native
  def expectArraysClose(actual: RecursiveArray[Double], expected: TypedArray, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: Double, epsilon: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double]): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: RecursiveArray[Double], epsilon: Double): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: TypedArray): Unit = js.native
  def expectArraysClose(actual: TypedArray, expected: TypedArray, epsilon: Double): Unit = js.native
  def expectArraysEqual(actual: TensorLike, expected: TensorLike): Unit = js.native
  def expectNumbersClose(a: Double, e: Double): Unit = js.native
  def expectNumbersClose(a: Double, e: Double, epsilon: Double): Unit = js.native
  def expectPromiseToFail(fn: js.Function0[js.Promise[js.Object]], done: DoneFn): Unit = js.native
  def expectValuesInRange(actual: js.Array[Double], low: Double, high: Double): Unit = js.native
  def expectValuesInRange(actual: TypedArray, low: Double, high: Double): Unit = js.native
  def testEpsilon(): `0.001` | `0.1` = js.native
}

