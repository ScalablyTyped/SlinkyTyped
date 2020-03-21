package typingsSlinky.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.theo.theoStrings.colorSlashrgb
  - typingsSlinky.theo.theoStrings.colorSlashhex
  - typingsSlinky.theo.theoStrings.colorSlashhex8rgba
  - typingsSlinky.theo.theoStrings.colorSlashhex8argb
  - typingsSlinky.theo.theoStrings.percentageSlashfloat
  - typingsSlinky.theo.theoStrings.relativeSlashpixel
  - typingsSlinky.theo.theoStrings.relativeSlashpixelValue
*/
trait ValueTransform extends js.Object

object ValueTransform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def colorSlashhex: typingsSlinky.theo.theoStrings.colorSlashhex = this.cast("color/hex")
  @scala.inline
  def colorSlashhex8argb: typingsSlinky.theo.theoStrings.colorSlashhex8argb = this.cast("color/hex8argb")
  @scala.inline
  def colorSlashhex8rgba: typingsSlinky.theo.theoStrings.colorSlashhex8rgba = this.cast("color/hex8rgba")
  @scala.inline
  def colorSlashrgb: typingsSlinky.theo.theoStrings.colorSlashrgb = this.cast("color/rgb")
  @scala.inline
  def percentageSlashfloat: typingsSlinky.theo.theoStrings.percentageSlashfloat = this.cast("percentage/float")
  @scala.inline
  def relativeSlashpixel: typingsSlinky.theo.theoStrings.relativeSlashpixel = this.cast("relative/pixel")
  @scala.inline
  def relativeSlashpixelValue: typingsSlinky.theo.theoStrings.relativeSlashpixelValue = this.cast("relative/pixelValue")
}

