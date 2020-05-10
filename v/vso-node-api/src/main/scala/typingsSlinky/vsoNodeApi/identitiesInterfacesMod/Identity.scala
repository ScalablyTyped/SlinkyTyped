package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
  var customDisplayName: String = js.native
  var descriptor: IdentityDescriptor = js.native
  var id: String = js.native
  var isActive: Boolean = js.native
  var isContainer: Boolean = js.native
  var masterId: String = js.native
  var memberIds: js.Array[String] = js.native
  var memberOf: js.Array[IdentityDescriptor] = js.native
  var members: js.Array[IdentityDescriptor] = js.native
  var metaTypeId: Double = js.native
  var properties: js.Any = js.native
  /**
    * The display name for the identity as specified by the source identity provider.
    */
  var providerDisplayName: String = js.native
  var resourceVersion: Double = js.native
  var subjectDescriptor: String = js.native
  var uniqueUserId: Double = js.native
}

object Identity {
  @scala.inline
  def apply(
    customDisplayName: String,
    descriptor: IdentityDescriptor,
    id: String,
    isActive: Boolean,
    isContainer: Boolean,
    masterId: String,
    memberIds: js.Array[String],
    memberOf: js.Array[IdentityDescriptor],
    members: js.Array[IdentityDescriptor],
    metaTypeId: Double,
    properties: js.Any,
    providerDisplayName: String,
    resourceVersion: Double,
    subjectDescriptor: String,
    uniqueUserId: Double
  ): Identity = {
    val __obj = js.Dynamic.literal(customDisplayName = customDisplayName.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], masterId = masterId.asInstanceOf[js.Any], memberIds = memberIds.asInstanceOf[js.Any], memberOf = memberOf.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], metaTypeId = metaTypeId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], providerDisplayName = providerDisplayName.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], subjectDescriptor = subjectDescriptor.asInstanceOf[js.Any], uniqueUserId = uniqueUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptor(value: IdentityDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
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
    def withIsContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberOf(value: js.Array[IdentityDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[IdentityDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaTypeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectDescriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueUserId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueUserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

