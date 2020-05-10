package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkStyle extends js.Object {
  val sheet: org.scalajs.dom.raw.StyleSheet | Null = js.native
}

object LinkStyle {
  @scala.inline
  def apply(): LinkStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkStyle]
  }
  @scala.inline
  implicit class LinkStyleOps[Self <: org.scalajs.dom.raw.LinkStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSheet(value: org.scalajs.dom.raw.StyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(null)
        ret
    }
  }
  
}

