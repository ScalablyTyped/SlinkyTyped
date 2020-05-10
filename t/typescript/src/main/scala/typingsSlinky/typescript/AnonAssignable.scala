package typingsSlinky.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssignable extends js.Object {
  var assignable: Double = js.native
  var identity: Double = js.native
  var strictSubtype: Double = js.native
  var subtype: Double = js.native
}

object AnonAssignable {
  @scala.inline
  def apply(assignable: Double, identity: Double, strictSubtype: Double, subtype: Double): AnonAssignable = {
    val __obj = js.Dynamic.literal(assignable = assignable.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], strictSubtype = strictSubtype.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssignable]
  }
  @scala.inline
  implicit class AnonAssignableOps[Self <: AnonAssignable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictSubtype(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSubtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtype(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

