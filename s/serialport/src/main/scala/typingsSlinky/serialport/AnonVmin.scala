package typingsSlinky.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVmin extends js.Object {
  var vmin: js.UndefOr[Double] = js.native
  var vtime: js.UndefOr[Double] = js.native
}

object AnonVmin {
  @scala.inline
  def apply(): AnonVmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonVmin]
  }
  @scala.inline
  implicit class AnonVminOps[Self <: AnonVmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmin")(js.undefined)
        ret
    }
    @scala.inline
    def withVtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtime")(js.undefined)
        ret
    }
  }
  
}

