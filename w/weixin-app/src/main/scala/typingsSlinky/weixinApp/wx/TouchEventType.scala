package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weixinApp.weixinAppStrings.tap
  - typingsSlinky.weixinApp.weixinAppStrings.touchstart
  - typingsSlinky.weixinApp.weixinAppStrings.touchmove
  - typingsSlinky.weixinApp.weixinAppStrings.touchcancel
  - typingsSlinky.weixinApp.weixinAppStrings.touchend
  - typingsSlinky.weixinApp.weixinAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typingsSlinky.weixinApp.weixinAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typingsSlinky.weixinApp.weixinAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typingsSlinky.weixinApp.weixinAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typingsSlinky.weixinApp.weixinAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typingsSlinky.weixinApp.weixinAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsSlinky.weixinApp.weixinAppStrings.touchstart = this.cast("touchstart")
}

