package typingsSlinky.select2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait More extends js.Object {
  var more: Boolean = js.native
}

object More {
  @scala.inline
  def apply(more: Boolean): More = {
    val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
    __obj.asInstanceOf[More]
  }
  @scala.inline
  implicit class MoreOps[Self <: More] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

