package typingsSlinky.thepiratebay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verified extends js.Object {
  var verified: js.UndefOr[Boolean] = js.native
}

object Verified {
  @scala.inline
  def apply(): Verified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Verified]
  }
  @scala.inline
  implicit class VerifiedOps[Self <: Verified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(js.undefined)
        ret
    }
  }
  
}

