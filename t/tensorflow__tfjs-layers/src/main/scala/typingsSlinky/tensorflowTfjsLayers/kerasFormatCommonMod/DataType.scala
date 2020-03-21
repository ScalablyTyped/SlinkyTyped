package typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64
  - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def bool: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool = this.cast("bool")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complex64: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64 = this.cast("complex64")
  @scala.inline
  def float32: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32 = this.cast("float32")
  @scala.inline
  def int32: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32 = this.cast("int32")
  @scala.inline
  def string: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string = this.cast("string")
}

