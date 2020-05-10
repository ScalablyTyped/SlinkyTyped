package typingsSlinky.winrtUwp.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WinRTEvent[TSender] extends js.Object {
  var detail: js.Array[_] = js.native
  var target: TSender = js.native
  var `type`: String = js.native
}

object WinRTEvent {
  @scala.inline
  def apply[TSender](detail: js.Array[_], target: TSender, `type`: String): WinRTEvent[TSender] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTEvent[TSender]]
  }
  @scala.inline
  implicit class WinRTEventOps[Self[tsender] <: WinRTEvent[tsender], TSender] (val x: Self[TSender]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSender] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSender]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSender] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSender] with Other]
    @scala.inline
    def withDetail(value: js.Array[_]): Self[TSender] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: TSender): Self[TSender] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[TSender] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

