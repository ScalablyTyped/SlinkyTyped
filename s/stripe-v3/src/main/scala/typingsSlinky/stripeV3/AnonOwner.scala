package typingsSlinky.stripeV3

import typingsSlinky.stripeV3.stripe.OwnerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOwner extends js.Object {
  var owner: js.UndefOr[OwnerInfo] = js.native
}

object AnonOwner {
  @scala.inline
  def apply(): AnonOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOwner]
  }
  @scala.inline
  implicit class AnonOwnerOps[Self <: AnonOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: OwnerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

