package typingsSlinky.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSmoothBoolean extends js.Object {
  var smooth: js.UndefOr[Boolean] = js.native
}

object AnonSmoothBoolean {
  @scala.inline
  def apply(): AnonSmoothBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSmoothBoolean]
  }
  @scala.inline
  implicit class AnonSmoothBooleanOps[Self <: AnonSmoothBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
  }
  
}

