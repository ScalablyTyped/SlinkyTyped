package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemType extends WorkItemTrackingResource {
  /**
    * The color.
    */
  var color: String = js.native
  /**
    * The description of the work item type.
    */
  var description: String = js.native
  /**
    * The fields that exist on the work item type.
    */
  var fieldInstances: js.Array[WorkItemTypeFieldInstance] = js.native
  /**
    * The fields that exist on the work item type.
    */
  var fields: js.Array[WorkItemTypeFieldInstance] = js.native
  /**
    * The icon of the work item type.
    */
  var icon: WorkItemIcon = js.native
  /**
    * True if work item type is disabled
    */
  var isDisabled: Boolean = js.native
  /**
    * Gets the name of the work item type.
    */
  var name: String = js.native
  /**
    * The reference name of the work item type.
    */
  var referenceName: String = js.native
  /**
    * Gets the various state transition mappings in the work item type.
    */
  var transitions: StringDictionary[js.Array[WorkItemStateTransition]] = js.native
  /**
    * The XML form.
    */
  var xmlForm: String = js.native
}

object WorkItemType {
  @scala.inline
  def apply(
    _links: js.Any,
    color: String,
    description: String,
    fieldInstances: js.Array[WorkItemTypeFieldInstance],
    fields: js.Array[WorkItemTypeFieldInstance],
    icon: WorkItemIcon,
    isDisabled: Boolean,
    name: String,
    referenceName: String,
    transitions: StringDictionary[js.Array[WorkItemStateTransition]],
    url: String,
    xmlForm: String
  ): WorkItemType = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fieldInstances = fieldInstances.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xmlForm = xmlForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemType]
  }
  @scala.inline
  implicit class WorkItemTypeOps[Self <: WorkItemType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldInstances(value: js.Array[WorkItemTypeFieldInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[WorkItemTypeFieldInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: WorkItemIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitions(value: StringDictionary[js.Array[WorkItemStateTransition]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlForm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

