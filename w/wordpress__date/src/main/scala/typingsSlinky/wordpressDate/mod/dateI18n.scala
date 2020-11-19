package typingsSlinky.wordpressDate.mod

import typingsSlinky.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/date", "dateI18n")
@js.native
object dateI18n extends js.Object {
  
  def apply(dateFormat: String): String = js.native
  def apply(dateFormat: String, dateValue: js.UndefOr[MomentInput], gmt: Boolean): String = js.native
  def apply(dateFormat: String, dateValue: MomentInput): String = js.native
}
