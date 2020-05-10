package typingsSlinky.sendcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonModifyat extends js.Object {
  var address: String = js.native
  var created_at: String = js.native
  var modify_at: String = js.native
  var name: String = js.native
  var subscribed: String = js.native
  var vars: js.Object = js.native
}

object AnonModifyat {
  @scala.inline
  def apply(
    address: String,
    created_at: String,
    modify_at: String,
    name: String,
    subscribed: String,
    vars: js.Object
  ): AnonModifyat = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], modify_at = modify_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModifyat]
  }
  @scala.inline
  implicit class AnonModifyatOps[Self <: AnonModifyat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModify_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVars(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

