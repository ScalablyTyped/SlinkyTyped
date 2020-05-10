package typingsSlinky.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMore extends js.Object {
  var more: Double = js.native
}

object AnonMore {
  @scala.inline
  def apply(more: Double): AnonMore = {
    val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMore]
  }
  @scala.inline
  implicit class AnonMoreOps[Self <: AnonMore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

