package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemStateColor extends StObject {
  
  /**
    * Category of state
    */
  var category: String = js.native
  
  /**
    * Color value
    */
  var color: String = js.native
  
  /**
    * Work item type state name
    */
  var name: String = js.native
}
object WorkItemStateColor {
  
  @scala.inline
  def apply(category: String, color: String, name: String): WorkItemStateColor = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateColor]
  }
  
  @scala.inline
  implicit class WorkItemStateColorMutableBuilder[Self <: WorkItemStateColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
