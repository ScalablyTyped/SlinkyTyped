package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait PBKDF2Params extends js.Object {
  var iter: js.UndefOr[Double] = js.native
  var salt: js.UndefOr[BitArray_] = js.native
}

object PBKDF2Params {
  @scala.inline
  def apply(): PBKDF2Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PBKDF2Params]
  }
  @scala.inline
  implicit class PBKDF2ParamsOps[Self <: PBKDF2Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iter")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: BitArray_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
  }
  
}

