package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weixinApp.weixinAppStrings.front
  - typingsSlinky.weixinApp.weixinAppStrings.back
*/
trait CameraDevice extends js.Object

object CameraDevice {
  @scala.inline
  def back: typingsSlinky.weixinApp.weixinAppStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def front: typingsSlinky.weixinApp.weixinAppStrings.front = this.cast("front")
}

