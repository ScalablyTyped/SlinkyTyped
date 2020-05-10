package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorOnLine extends js.Object {
  val onLine: scala.Boolean = js.native
}

object NavigatorOnLine {
  @scala.inline
  def apply(onLine: scala.Boolean): NavigatorOnLine = {
    val __obj = js.Dynamic.literal(onLine = onLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorOnLine]
  }
  @scala.inline
  implicit class NavigatorOnLineOps[Self <: org.scalajs.dom.raw.NavigatorOnLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnLine(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

