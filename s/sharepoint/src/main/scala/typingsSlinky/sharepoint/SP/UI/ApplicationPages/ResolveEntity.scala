package typingsSlinky.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveEntity extends js.Object {
  var accountName: String = js.native
  var displayName: String = js.native
  var email: String = js.native
  var entityType: String = js.native
  var id: String = js.native
  var isGroup: Boolean = js.native
  var members: js.Array[ResolveEntity] = js.native
  var needResolve: Boolean = js.native
  var tYPE_EVENT: String = js.native
  var tYPE_EXCHANGE: String = js.native
  var tYPE_RESOURCE: String = js.native
  var tYPE_USER: String = js.native
  def get_key(): String = js.native
}

object ResolveEntity {
  @scala.inline
  def apply(
    accountName: String,
    displayName: String,
    email: String,
    entityType: String,
    get_key: () => String,
    id: String,
    isGroup: Boolean,
    members: js.Array[ResolveEntity],
    needResolve: Boolean,
    tYPE_EVENT: String,
    tYPE_EXCHANGE: String,
    tYPE_RESOURCE: String,
    tYPE_USER: String
  ): ResolveEntity = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], get_key = js.Any.fromFunction0(get_key), id = id.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], needResolve = needResolve.asInstanceOf[js.Any], tYPE_EVENT = tYPE_EVENT.asInstanceOf[js.Any], tYPE_EXCHANGE = tYPE_EXCHANGE.asInstanceOf[js.Any], tYPE_RESOURCE = tYPE_RESOURCE.asInstanceOf[js.Any], tYPE_USER = tYPE_USER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveEntity]
  }
  @scala.inline
  implicit class ResolveEntityOps[Self <: ResolveEntity] (val x: Self) extends AnyVal {
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
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet_key(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_key")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[ResolveEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_EVENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tYPE_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_EXCHANGE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tYPE_EXCHANGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_RESOURCE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tYPE_RESOURCE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_USER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tYPE_USER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

