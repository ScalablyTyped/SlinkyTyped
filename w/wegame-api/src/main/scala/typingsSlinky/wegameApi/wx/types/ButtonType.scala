package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wegameApi.wegameApiStrings.text
  - typingsSlinky.wegameApi.wegameApiStrings.image
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typingsSlinky.wegameApi.wegameApiStrings.image = this.cast("image")
  @scala.inline
  def text: typingsSlinky.wegameApi.wegameApiStrings.text = this.cast("text")
}

