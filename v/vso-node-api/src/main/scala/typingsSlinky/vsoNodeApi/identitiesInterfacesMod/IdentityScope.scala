package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityScope extends js.Object {
  var administrators: IdentityDescriptor = js.native
  var id: String = js.native
  var isActive: Boolean = js.native
  var isGlobal: Boolean = js.native
  var localScopeId: String = js.native
  var name: String = js.native
  var parentId: String = js.native
  var scopeType: GroupScopeType = js.native
  var securingHostId: String = js.native
  var subjectDescriptor: String = js.native
}

object IdentityScope {
  @scala.inline
  def apply(
    administrators: IdentityDescriptor,
    id: String,
    isActive: Boolean,
    isGlobal: Boolean,
    localScopeId: String,
    name: String,
    parentId: String,
    scopeType: GroupScopeType,
    securingHostId: String,
    subjectDescriptor: String
  ): IdentityScope = {
    val __obj = js.Dynamic.literal(administrators = administrators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isGlobal = isGlobal.asInstanceOf[js.Any], localScopeId = localScopeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], securingHostId = securingHostId.asInstanceOf[js.Any], subjectDescriptor = subjectDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityScope]
  }
  @scala.inline
  implicit class IdentityScopeOps[Self <: IdentityScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrators(value: IdentityDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalScopeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localScopeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeType(value: GroupScopeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecuringHostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securingHostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectDescriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

