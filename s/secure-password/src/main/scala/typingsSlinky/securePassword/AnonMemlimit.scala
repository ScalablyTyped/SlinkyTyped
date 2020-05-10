package typingsSlinky.securePassword

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMemlimit extends js.Object {
  var memlimit: js.UndefOr[Double] = js.native
  var opslimit: js.UndefOr[Double] = js.native
}

object AnonMemlimit {
  @scala.inline
  def apply(): AnonMemlimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMemlimit]
  }
  @scala.inline
  implicit class AnonMemlimitOps[Self <: AnonMemlimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemlimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemlimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withOpslimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opslimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpslimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opslimit")(js.undefined)
        ret
    }
  }
  
}

