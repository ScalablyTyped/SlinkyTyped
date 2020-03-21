package typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal
*/
trait PaddingMode extends js.Object

object PaddingMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def causal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal = this.cast("causal")
  @scala.inline
  def same: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same = this.cast("same")
  @scala.inline
  def valid: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid = this.cast("valid")
}

