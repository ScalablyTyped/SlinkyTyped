package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
*/
trait Distribution extends js.Object

object Distribution {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = this.cast("normal")
  @scala.inline
  def truncatedNormal: truncatedNormal_ = this.cast("truncatedNormal")
  @scala.inline
  def uniform: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = this.cast("uniform")
}

