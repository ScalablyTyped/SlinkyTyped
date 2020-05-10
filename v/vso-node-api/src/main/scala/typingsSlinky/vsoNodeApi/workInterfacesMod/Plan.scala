package typingsSlinky.vsoNodeApi.workInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plan extends js.Object {
  /**
    * Identity that created this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var createdByIdentity: IdentityRef = js.native
  /**
    * Date when the plan was created
    */
  var createdDate: js.Date = js.native
  /**
    * Description of the plan
    */
  var description: String = js.native
  /**
    * Id of the plan
    */
  var id: String = js.native
  /**
    * Identity that last modified this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var modifiedByIdentity: IdentityRef = js.native
  /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
  var modifiedDate: js.Date = js.native
  /**
    * Name of the plan
    */
  var name: String = js.native
  /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewPropertyCollection.
    */
  var properties: js.Any = js.native
  /**
    * Revision of the plan. Used to safeguard users from overwriting each other's changes.
    */
  var revision: Double = js.native
  /**
    * Type of the plan
    */
  var `type`: PlanType = js.native
  /**
    * The resource url to locate the plan via rest api
    */
  var url: String = js.native
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions = js.native
}

object Plan {
  @scala.inline
  def apply(
    createdByIdentity: IdentityRef,
    createdDate: js.Date,
    description: String,
    id: String,
    modifiedByIdentity: IdentityRef,
    modifiedDate: js.Date,
    name: String,
    properties: js.Any,
    revision: Double,
    `type`: PlanType,
    url: String,
    userPermissions: PlanUserPermissions
  ): Plan = {
    val __obj = js.Dynamic.literal(createdByIdentity = createdByIdentity.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedByIdentity = modifiedByIdentity.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userPermissions = userPermissions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  @scala.inline
  implicit class PlanOps[Self <: Plan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedByIdentity(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedByIdentity(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PlanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPermissions(value: PlanUserPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPermissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

