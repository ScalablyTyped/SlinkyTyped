package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wegameApi.wegameApiStrings.auto
  - typingsSlinky.wegameApi.wegameApiStrings.buildInMic
  - typingsSlinky.wegameApi.wegameApiStrings.headsetMic
  - typingsSlinky.wegameApi.wegameApiStrings.mic
  - typingsSlinky.wegameApi.wegameApiStrings.camcorder
*/
trait AudioSourceType extends js.Object

object AudioSourceType {
  @scala.inline
  def auto: typingsSlinky.wegameApi.wegameApiStrings.auto = this.cast("auto")
  @scala.inline
  def buildInMic: typingsSlinky.wegameApi.wegameApiStrings.buildInMic = this.cast("buildInMic")
  @scala.inline
  def camcorder: typingsSlinky.wegameApi.wegameApiStrings.camcorder = this.cast("camcorder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def headsetMic: typingsSlinky.wegameApi.wegameApiStrings.headsetMic = this.cast("headsetMic")
  @scala.inline
  def mic: typingsSlinky.wegameApi.wegameApiStrings.mic = this.cast("mic")
}

