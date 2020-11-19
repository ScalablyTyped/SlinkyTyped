package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.tensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "scalar")
@js.native
object scalar extends js.Object {
  
  def apply(value: String): Scalar = js.native
  def apply(value: String, dtype: DataType): Scalar = js.native
  def apply(value: Boolean): Scalar = js.native
  def apply(value: Boolean, dtype: DataType): Scalar = js.native
  /**
    * Creates rank-0 `tf.Tensor` (scalar) with the provided value and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.scalar` as it makes the code more readable.
    *
    * ```js
    * tf.scalar(3.14).print();
    * ```
    *
    * @param value The value of the scalar.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply(value: Double): Scalar = js.native
  def apply(value: Double, dtype: DataType): Scalar = js.native
  def apply(value: js.typedarray.Uint8Array): Scalar = js.native
  def apply(value: js.typedarray.Uint8Array, dtype: DataType): Scalar = js.native
}
