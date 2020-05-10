package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityBatchInfo extends js.Object {
  var descriptors: js.Array[IdentityDescriptor] = js.native
  var identityIds: js.Array[String] = js.native
  var includeRestrictedVisibility: Boolean = js.native
  var propertyNames: js.Array[String] = js.native
  var queryMembership: QueryMembership = js.native
}

object IdentityBatchInfo {
  @scala.inline
  def apply(
    descriptors: js.Array[IdentityDescriptor],
    identityIds: js.Array[String],
    includeRestrictedVisibility: Boolean,
    propertyNames: js.Array[String],
    queryMembership: QueryMembership
  ): IdentityBatchInfo = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], identityIds = identityIds.asInstanceOf[js.Any], includeRestrictedVisibility = includeRestrictedVisibility.asInstanceOf[js.Any], propertyNames = propertyNames.asInstanceOf[js.Any], queryMembership = queryMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityBatchInfo]
  }
  @scala.inline
  implicit class IdentityBatchInfoOps[Self <: IdentityBatchInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptors(value: js.Array[IdentityDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeRestrictedVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRestrictedVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryMembership(value: QueryMembership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMembership")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

