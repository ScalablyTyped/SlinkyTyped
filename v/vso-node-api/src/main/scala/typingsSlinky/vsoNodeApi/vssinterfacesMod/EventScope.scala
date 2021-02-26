package typingsSlinky.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventScope extends StObject {
  
  /**
    * Required: This is the identity of the scope for the type.
    */
  var id: String = js.native
  
  /**
    * Optional: The display name of the scope
    */
  var name: String = js.native
  
  /**
    * Required: The event specific type of a scope.
    */
  var `type`: String = js.native
}
object EventScope {
  
  @scala.inline
  def apply(id: String, name: String, `type`: String): EventScope = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventScope]
  }
  
  @scala.inline
  implicit class EventScopeMutableBuilder[Self <: EventScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
