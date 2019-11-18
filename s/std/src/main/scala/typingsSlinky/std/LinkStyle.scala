package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkStyle extends js.Object {
  val sheet: org.scalajs.dom.raw.StyleSheet | Null
}

object LinkStyle {
  @scala.inline
  def apply(sheet: org.scalajs.dom.raw.StyleSheet = null): LinkStyle = {
    val __obj = js.Dynamic.literal()
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkStyle]
  }
}

