package typingsSlinky.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReject extends js.Object {
  var reject: js.UndefOr[js.Function0[Unit]] = js.native
  var resolve: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
}

object AnonReject {
  @scala.inline
  def apply(): AnonReject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonReject]
  }
  @scala.inline
  implicit class AnonRejectOps[Self <: AnonReject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReject(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
  }
  
}

