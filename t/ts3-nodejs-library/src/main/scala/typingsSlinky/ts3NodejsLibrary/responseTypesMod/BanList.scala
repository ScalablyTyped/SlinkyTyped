package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BanList extends js.Object {
  var banid: Double = js.native
  var created: Double = js.native
  var duration: Double = js.native
  var enforcements: Double = js.native
  var invokercldbid: Double = js.native
  var invokername: String = js.native
  var invokeruid: String = js.native
  var ip: String = js.native
  var lastnickname: String = js.native
  var mytsid: String = js.native
  var name: String = js.native
  var reason: String = js.native
  var uid: String = js.native
}

object BanList {
  @scala.inline
  def apply(
    banid: Double,
    created: Double,
    duration: Double,
    enforcements: Double,
    invokercldbid: Double,
    invokername: String,
    invokeruid: String,
    ip: String,
    lastnickname: String,
    mytsid: String,
    name: String,
    reason: String,
    uid: String
  ): BanList = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], enforcements = enforcements.asInstanceOf[js.Any], invokercldbid = invokercldbid.asInstanceOf[js.Any], invokername = invokername.asInstanceOf[js.Any], invokeruid = invokeruid.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lastnickname = lastnickname.asInstanceOf[js.Any], mytsid = mytsid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanList]
  }
  @scala.inline
  implicit class BanListOps[Self <: BanList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforcements(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokercldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokercldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokeruid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeruid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastnickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastnickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMytsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mytsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

