package typingsSlinky.scroller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageX extends js.Object {
  var pageX: Double = js.native
  var pageY: Double = js.native
}

object PageX {
  @scala.inline
  def apply(pageX: Double, pageY: Double): PageX = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageX]
  }
  @scala.inline
  implicit class PageXOps[Self <: PageX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

