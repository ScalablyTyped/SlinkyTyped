package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg
*/
trait FanMode extends js.Object

object FanMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fanAvg: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg = this.cast("fanAvg")
  @scala.inline
  def fanIn: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn = this.cast("fanIn")
  @scala.inline
  def fanOut: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut = this.cast("fanOut")
}

