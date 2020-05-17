package typingsSlinky.superagent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deadline extends js.Object {
  var deadline: js.UndefOr[Double] = js.native
  var response: js.UndefOr[Double] = js.native
}

object Deadline {
  @scala.inline
  def apply(): Deadline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deadline]
  }
  @scala.inline
  implicit class DeadlineOps[Self <: Deadline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
  }
  
}

