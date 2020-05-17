package typingsSlinky.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Numrcpterrors extends js.Object {
  var num_rcpt_errors: js.UndefOr[Double] = js.native
}

object Numrcpterrors {
  @scala.inline
  def apply(): Numrcpterrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Numrcpterrors]
  }
  @scala.inline
  implicit class NumrcpterrorsOps[Self <: Numrcpterrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNum_rcpt_errors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_rcpt_errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_rcpt_errors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_rcpt_errors")(js.undefined)
        ret
    }
  }
  
}

