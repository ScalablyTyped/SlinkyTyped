package typingsSlinky.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.native
  var size: js.UndefOr[scala.Nothing] = js.native
}

object Size {
  @scala.inline
  def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
  }
  
}

