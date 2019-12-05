package typingsSlinky.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.fingerPrint
  - typings.weixinDashApp.weixinDashAppStrings.facial
  - typings.weixinDashApp.weixinDashAppStrings.speech
*/
trait AuthModes extends js.Object

object AuthModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facial: typingsSlinky.weixinDashApp.weixinDashAppStrings.facial = this.cast("facial")
  @scala.inline
  def fingerPrint: typingsSlinky.weixinDashApp.weixinDashAppStrings.fingerPrint = this.cast("fingerPrint")
  @scala.inline
  def speech: typingsSlinky.weixinDashApp.weixinDashAppStrings.speech = this.cast("speech")
}

