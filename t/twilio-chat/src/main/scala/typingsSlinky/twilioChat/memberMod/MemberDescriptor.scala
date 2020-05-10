package typingsSlinky.twilioChat.memberMod

import typingsSlinky.twilioChat.memberMod.Member.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberDescriptor extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.native
  var dateCreated: js.Any = js.native
  var dateUpdated: js.Any = js.native
  var identity: String = js.native
  var lastConsumedMessageIndex: Double = js.native
  var lastConsumptionTimestamp: Double = js.native
  var roleSid: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[Type] = js.native
  var userInfo: String = js.native
}

object MemberDescriptor {
  @scala.inline
  def apply(
    dateCreated: js.Any,
    dateUpdated: js.Any,
    identity: String,
    lastConsumedMessageIndex: Double,
    lastConsumptionTimestamp: Double,
    userInfo: String
  ): MemberDescriptor = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], lastConsumptionTimestamp = lastConsumptionTimestamp.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDescriptor]
  }
  @scala.inline
  implicit class MemberDescriptorOps[Self <: MemberDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateCreated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateUpdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastConsumedMessageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConsumedMessageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastConsumptionTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConsumptionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleSid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleSid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleSid")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

