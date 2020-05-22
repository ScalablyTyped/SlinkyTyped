package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkStyle extends js.Object {
  val sheet: org.scalajs.dom.raw.CSSStyleSheet | Null
}

object LinkStyle {
  @scala.inline
  def apply(sheet: org.scalajs.dom.raw.CSSStyleSheet = null): LinkStyle = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkStyle]
  }
}

