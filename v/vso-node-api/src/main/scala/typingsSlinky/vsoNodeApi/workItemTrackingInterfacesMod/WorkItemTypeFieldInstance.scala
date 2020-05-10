package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeFieldInstance extends WorkItemFieldReference {
  /**
    * The list of field allowed values.
    */
  var allowedValues: js.Array[String] = js.native
  /**
    * Indicates whether field value is always required.
    */
  var alwaysRequired: Boolean = js.native
  /**
    * The list of dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference] = js.native
  /**
    * Gets the help text for the field.
    */
  var helpText: String = js.native
}

object WorkItemTypeFieldInstance {
  @scala.inline
  def apply(
    allowedValues: js.Array[String],
    alwaysRequired: Boolean,
    dependentFields: js.Array[WorkItemFieldReference],
    helpText: String,
    name: String,
    referenceName: String,
    url: String
  ): WorkItemTypeFieldInstance = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], alwaysRequired = alwaysRequired.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], helpText = helpText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeFieldInstance]
  }
  @scala.inline
  implicit class WorkItemTypeFieldInstanceOps[Self <: WorkItemTypeFieldInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependentFields(value: js.Array[WorkItemFieldReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

