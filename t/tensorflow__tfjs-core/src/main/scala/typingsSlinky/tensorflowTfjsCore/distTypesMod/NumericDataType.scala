package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
*/
trait NumericDataType extends js.Object

object NumericDataType {
  @scala.inline
  def bool: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool = this.cast("bool")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complex64: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64 = this.cast("complex64")
  @scala.inline
  def float32: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32 = this.cast("float32")
  @scala.inline
  def int32: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32 = this.cast("int32")
}

