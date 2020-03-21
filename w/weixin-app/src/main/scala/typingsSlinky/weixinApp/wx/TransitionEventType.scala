package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weixinApp.weixinAppStrings.transitionend
  - typingsSlinky.weixinApp.weixinAppStrings.animationstart
  - typingsSlinky.weixinApp.weixinAppStrings.animationiteration
  - typingsSlinky.weixinApp.weixinAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typingsSlinky.weixinApp.weixinAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typingsSlinky.weixinApp.weixinAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typingsSlinky.weixinApp.weixinAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typingsSlinky.weixinApp.weixinAppStrings.transitionend = this.cast("transitionend")
}

