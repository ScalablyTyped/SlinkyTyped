package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TenantInfo extends js.Object {
  var homeTenant: Boolean = js.native
  var tenantId: String = js.native
  var tenantName: String = js.native
}

object TenantInfo {
  @scala.inline
  def apply(homeTenant: Boolean, tenantId: String, tenantName: String): TenantInfo = {
    val __obj = js.Dynamic.literal(homeTenant = homeTenant.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], tenantName = tenantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TenantInfo]
  }
  @scala.inline
  implicit class TenantInfoOps[Self <: TenantInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeTenant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeTenant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

