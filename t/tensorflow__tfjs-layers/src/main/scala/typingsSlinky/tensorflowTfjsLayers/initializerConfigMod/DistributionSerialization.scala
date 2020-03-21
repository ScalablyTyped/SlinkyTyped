package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal
*/
trait DistributionSerialization extends js.Object

object DistributionSerialization {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = this.cast("normal")
  @scala.inline
  def truncated_normal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal = this.cast("truncated_normal")
  @scala.inline
  def uniform: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = this.cast("uniform")
}

