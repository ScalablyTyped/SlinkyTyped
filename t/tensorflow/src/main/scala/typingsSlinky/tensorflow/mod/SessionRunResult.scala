package typingsSlinky.tensorflow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflow.mod.Tensor_
  - typingsSlinky.tensorflow.mod.TensorMap
*/
trait SessionRunResult extends js.Object

object SessionRunResult {
  @scala.inline
  implicit def apply(value: TensorMap): SessionRunResult = value.asInstanceOf[SessionRunResult]
  @scala.inline
  implicit def apply(value: Tensor_): SessionRunResult = value.asInstanceOf[SessionRunResult]
}

