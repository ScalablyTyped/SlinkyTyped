package typingsSlinky.tensorflow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflow.mod.TensorData
  - js.Array[
(js.Array[
  (js.Array[
  js.Array[typingsSlinky.tensorflow.mod.TensorData] | typingsSlinky.tensorflow.mod.TensorData
  ]) | typingsSlinky.tensorflow.mod.TensorData
]) | typingsSlinky.tensorflow.mod.TensorData]
*/
trait TensorValue extends js.Object

object TensorValue {
  @scala.inline
  implicit def apply(
    value: js.Array[
      (js.Array[(js.Array[js.Array[TensorData] | TensorData]) | TensorData]) | TensorData
    ]
  ): TensorValue = value.asInstanceOf[TensorValue]
  @scala.inline
  implicit def apply(value: TensorData): TensorValue = value.asInstanceOf[TensorValue]
}

