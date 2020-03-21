package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wegameApi.wegameApiStrings.wifi
  - typingsSlinky.wegameApi.wegameApiStrings.`2g`
  - typingsSlinky.wegameApi.wegameApiStrings.`3g`
  - typingsSlinky.wegameApi.wegameApiStrings.`4g`
  - typingsSlinky.wegameApi.wegameApiStrings.unknown
  - typingsSlinky.wegameApi.wegameApiStrings.none
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2g`: typingsSlinky.wegameApi.wegameApiStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsSlinky.wegameApi.wegameApiStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsSlinky.wegameApi.wegameApiStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.wegameApi.wegameApiStrings.none = this.cast("none")
  @scala.inline
  def unknown: typingsSlinky.wegameApi.wegameApiStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typingsSlinky.wegameApi.wegameApiStrings.wifi = this.cast("wifi")
}

