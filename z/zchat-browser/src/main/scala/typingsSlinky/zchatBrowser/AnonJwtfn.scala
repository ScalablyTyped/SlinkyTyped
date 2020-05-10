package typingsSlinky.zchatBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJwtfn extends js.Object {
  var jwt_fn: js.UndefOr[js.Function1[/* callback */ js.Function1[/* jwt */ String, Unit], Unit]] = js.native
}

object AnonJwtfn {
  @scala.inline
  def apply(): AnonJwtfn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonJwtfn]
  }
  @scala.inline
  implicit class AnonJwtfnOps[Self <: AnonJwtfn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJwt_fn(value: /* callback */ js.Function1[/* jwt */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt_fn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJwt_fn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt_fn")(js.undefined)
        ret
    }
  }
  
}

