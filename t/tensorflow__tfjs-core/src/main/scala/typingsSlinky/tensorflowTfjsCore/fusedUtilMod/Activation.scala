package typingsSlinky.tensorflowTfjsCore.fusedUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu
  - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6
*/
trait Activation extends js.Object

object Activation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elu: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu = this.cast("elu")
  @scala.inline
  def linear: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear = this.cast("linear")
  @scala.inline
  def prelu: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu = this.cast("prelu")
  @scala.inline
  def relu: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu = this.cast("relu")
  @scala.inline
  def relu6: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6 = this.cast("relu6")
}

