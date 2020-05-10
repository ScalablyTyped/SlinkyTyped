package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitySnapshot extends js.Object {
  var groups: js.Array[Identity] = js.native
  var identityIds: js.Array[String] = js.native
  var memberships: js.Array[GroupMembership] = js.native
  var scopeId: String = js.native
  var scopes: js.Array[IdentityScope] = js.native
}

object IdentitySnapshot {
  @scala.inline
  def apply(
    groups: js.Array[Identity],
    identityIds: js.Array[String],
    memberships: js.Array[GroupMembership],
    scopeId: String,
    scopes: js.Array[IdentityScope]
  ): IdentitySnapshot = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], identityIds = identityIds.asInstanceOf[js.Any], memberships = memberships.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitySnapshot]
  }
  @scala.inline
  implicit class IdentitySnapshotOps[Self <: IdentitySnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[Identity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberships(value: js.Array[GroupMembership]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[IdentityScope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

