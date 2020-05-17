package typingsSlinky.web3Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dklen extends js.Object {
  var dklen: Double = js.native
  var n: Double = js.native
  var p: Double = js.native
  var r: Double = js.native
  var salt: String = js.native
}

object Dklen {
  @scala.inline
  def apply(dklen: Double, n: Double, p: Double, r: Double, salt: String): Dklen = {
    val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dklen]
  }
  @scala.inline
  implicit class DklenOps[Self <: Dklen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

