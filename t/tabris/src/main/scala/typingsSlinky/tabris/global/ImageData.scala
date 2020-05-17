package typingsSlinky.tabris.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents pixel data of a `Canvas` widget.
  */
@JSGlobal("ImageData")
@js.native
class ImageData protected ()
  extends typingsSlinky.tabris.ImageData {
  def this(data: js.typedarray.Uint8ClampedArray, width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(data: js.typedarray.Uint8ClampedArray, width: Double, height: Double) = this()
}

