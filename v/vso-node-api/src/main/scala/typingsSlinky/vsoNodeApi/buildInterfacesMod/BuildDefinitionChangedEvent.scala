package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionChangedEvent extends StObject {
  
  var changeType: AuditAction = js.native
  
  var definition: BuildDefinition = js.native
}
object BuildDefinitionChangedEvent {
  
  @scala.inline
  def apply(changeType: AuditAction, definition: BuildDefinition): BuildDefinitionChangedEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionChangedEvent]
  }
  
  @scala.inline
  implicit class BuildDefinitionChangedEventMutableBuilder[Self <: BuildDefinitionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: BuildDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
  }
}
