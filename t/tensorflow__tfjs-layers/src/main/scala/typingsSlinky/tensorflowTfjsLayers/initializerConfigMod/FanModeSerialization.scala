package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg
*/
trait FanModeSerialization extends js.Object

object FanModeSerialization {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fan_avg: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg = this.cast("fan_avg")
  @scala.inline
  def fan_in: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in = this.cast("fan_in")
  @scala.inline
  def fan_out: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out = this.cast("fan_out")
}

