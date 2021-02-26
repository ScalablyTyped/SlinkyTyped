package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class WorkItemTypeMutableBuilder[Self <: WorkItemType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldInstances(value: js.Array[WorkItemTypeFieldInstance]): Self = StObject.set(x, "fieldInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldInstancesVarargs(value: WorkItemTypeFieldInstance*): Self = StObject.set(x, "fieldInstances", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[WorkItemTypeFieldInstance]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: WorkItemTypeFieldInstance*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: WorkItemIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitions(value: StringDictionary[js.Array[WorkItemStateTransition]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlForm(value: String): Self = StObject.set(x, "xmlForm", value.asInstanceOf[js.Any])
  }
}
