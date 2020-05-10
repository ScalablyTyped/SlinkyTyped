package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAliasMemberGroupRole extends js.Object {
  var aliasMemberGroupRole: Double = js.native
  var directMember: Double = js.native
  var directMemberGroupRole: Double = js.native
  var follows: Double = js.native
  var groupAlias: Double = js.native
  var inDirectMemberGroupRole: Double = js.native
  var indirectMember: Double = js.native
  var personal: Double = js.native
  var personalAlias: Double = js.native
  var singleRole: Double = js.native
  var subscriptionAlias: Double = js.native
  var unknown: Double = js.native
}

object AnonAliasMemberGroupRole {
  @scala.inline
  def apply(
    aliasMemberGroupRole: Double,
    directMember: Double,
    directMemberGroupRole: Double,
    follows: Double,
    groupAlias: Double,
    inDirectMemberGroupRole: Double,
    indirectMember: Double,
    personal: Double,
    personalAlias: Double,
    singleRole: Double,
    subscriptionAlias: Double,
    unknown: Double
  ): AnonAliasMemberGroupRole = {
    val __obj = js.Dynamic.literal(aliasMemberGroupRole = aliasMemberGroupRole.asInstanceOf[js.Any], directMember = directMember.asInstanceOf[js.Any], directMemberGroupRole = directMemberGroupRole.asInstanceOf[js.Any], follows = follows.asInstanceOf[js.Any], groupAlias = groupAlias.asInstanceOf[js.Any], inDirectMemberGroupRole = inDirectMemberGroupRole.asInstanceOf[js.Any], indirectMember = indirectMember.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], personalAlias = personalAlias.asInstanceOf[js.Any], singleRole = singleRole.asInstanceOf[js.Any], subscriptionAlias = subscriptionAlias.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliasMemberGroupRole]
  }
  @scala.inline
  implicit class AnonAliasMemberGroupRoleOps[Self <: AnonAliasMemberGroupRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasMemberGroupRole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasMemberGroupRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectMember(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectMemberGroupRole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directMemberGroupRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupAlias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDirectMemberGroupRole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDirectMemberGroupRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndirectMember(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indirectMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonalAlias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleRole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionAlias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

