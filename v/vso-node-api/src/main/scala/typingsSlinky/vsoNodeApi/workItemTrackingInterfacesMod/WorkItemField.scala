package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemField extends WorkItemTrackingResource {
  /**
    * The description of the field.
    */
  var description: String = js.native
  /**
    * Indicates whether this field is an identity field.
    */
  var isIdentity: Boolean = js.native
  /**
    * Indicates whether this instance is picklist.
    */
  var isPicklist: Boolean = js.native
  /**
    * Indicates whether this instance is a suggested picklist .
    */
  var isPicklistSuggested: Boolean = js.native
  /**
    * The name of the field.
    */
  var name: String = js.native
  /**
    * Indicates whether the field is [read only].
    */
  var readOnly: Boolean = js.native
  /**
    * The reference name of the field.
    */
  var referenceName: String = js.native
  /**
    * The supported operations on this field.
    */
  var supportedOperations: js.Array[WorkItemFieldOperation] = js.native
  /**
    * The type of the field.
    */
  var `type`: FieldType = js.native
  /**
    * The usage of the field.
    */
  var usage: FieldUsage = js.native
}

object WorkItemField {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    isIdentity: Boolean,
    isPicklist: Boolean,
    isPicklistSuggested: Boolean,
    name: String,
    readOnly: Boolean,
    referenceName: String,
    supportedOperations: js.Array[WorkItemFieldOperation],
    `type`: FieldType,
    url: String,
    usage: FieldUsage
  ): WorkItemField = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isPicklist = isPicklist.asInstanceOf[js.Any], isPicklistSuggested = isPicklistSuggested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], supportedOperations = supportedOperations.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemField]
  }
  @scala.inline
  implicit class WorkItemFieldOps[Self <: WorkItemField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIdentity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPicklist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPicklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPicklistSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPicklistSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedOperations(value: js.Array[WorkItemFieldOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: FieldUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

