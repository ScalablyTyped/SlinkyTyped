package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeEmailAddress extends js.Object {
  var includeEmailAddress: Double = js.native
  var includeExtensions: Double = js.native
  var none: Double = js.native
}

object AnonIncludeEmailAddress {
  @scala.inline
  def apply(includeEmailAddress: Double, includeExtensions: Double, none: Double): AnonIncludeEmailAddress = {
    val __obj = js.Dynamic.literal(includeEmailAddress = includeEmailAddress.asInstanceOf[js.Any], includeExtensions = includeExtensions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeEmailAddress]
  }
  @scala.inline
  implicit class AnonIncludeEmailAddressOps[Self <: AnonIncludeEmailAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeEmailAddress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeExtensions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

