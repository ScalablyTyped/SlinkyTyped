package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitySelf extends js.Object {
  var accountName: String = js.native
  var displayName: String = js.native
  var id: String = js.native
  var tenants: js.Array[TenantInfo] = js.native
}

object IdentitySelf {
  @scala.inline
  def apply(accountName: String, displayName: String, id: String, tenants: js.Array[TenantInfo]): IdentitySelf = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitySelf]
  }
  @scala.inline
  implicit class IdentitySelfOps[Self <: IdentitySelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenants(value: js.Array[TenantInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

