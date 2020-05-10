package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubaccount extends js.Object {
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.native
  /** user-friendly name */
  var name: String = js.native
  /** status of the subaccount */
  var status: String = js.native
}

object UpdateSubaccount {
  @scala.inline
  def apply(name: String, status: String): UpdateSubaccount = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubaccount]
  }
  @scala.inline
  implicit class UpdateSubaccountOps[Self <: UpdateSubaccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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

