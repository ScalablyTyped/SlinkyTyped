package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weixinApp.weixinAppStrings.fingerPrint
  - typingsSlinky.weixinApp.weixinAppStrings.facial
  - typingsSlinky.weixinApp.weixinAppStrings.speech
*/
trait AuthModes extends js.Object

object AuthModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facial: typingsSlinky.weixinApp.weixinAppStrings.facial = this.cast("facial")
  @scala.inline
  def fingerPrint: typingsSlinky.weixinApp.weixinAppStrings.fingerPrint = this.cast("fingerPrint")
  @scala.inline
  def speech: typingsSlinky.weixinApp.weixinAppStrings.speech = this.cast("speech")
}

