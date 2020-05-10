package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubaccount extends js.Object {
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.native
  /** list of grants to give the subaccount API key */
  var key_grants: js.Array[String] = js.native
  /** user-friendly identifier for subaccount API key */
  var key_label: String = js.native
  /** list of IPs the subaccount may be used from */
  var key_valid_ips: js.UndefOr[js.Array[String]] = js.native
  /** user-friendly name */
  var name: String = js.native
}

object CreateSubaccount {
  @scala.inline
  def apply(key_grants: js.Array[String], key_label: String, name: String): CreateSubaccount = {
    val __obj = js.Dynamic.literal(key_grants = key_grants.asInstanceOf[js.Any], key_label = key_label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubaccount]
  }
  @scala.inline
  implicit class CreateSubaccountOps[Self <: CreateSubaccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey_grants(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_grants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withKey_valid_ips(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_valid_ips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey_valid_ips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_valid_ips")(js.undefined)
        ret
    }
  }
  
}

