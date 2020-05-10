package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.sparkpostStrings.active
import typingsSlinky.sparkpost.sparkpostStrings.suspended
import typingsSlinky.sparkpost.sparkpostStrings.terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubaccountInformation extends js.Object {
  var compliance_status: String = js.native
  /** ID of subaccount */
  var id: Double = js.native
  /** The ID of the default IP Pool assigned to this subaccount’s transmissions */
  var ip_pool: js.UndefOr[String] = js.native
  /** User friendly identifier for a specific subaccount */
  var name: String = js.native
  /** Status of the account */
  var status: active | suspended | terminated = js.native
}

object SubaccountInformation {
  @scala.inline
  def apply(compliance_status: String, id: Double, name: String, status: active | suspended | terminated): SubaccountInformation = {
    val __obj = js.Dynamic.literal(compliance_status = compliance_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountInformation]
  }
  @scala.inline
  implicit class SubaccountInformationOps[Self <: SubaccountInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompliance_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliance_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: active | suspended | terminated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp_pool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp_pool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_pool")(js.undefined)
        ret
    }
  }
  
}

