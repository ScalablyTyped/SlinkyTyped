package typingsSlinky.stormReactDiagrams.anon

import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/DiagramModel.DiagramModel> & {  offsetX :number,   offsetY :number} */
@js.native
trait BaseEventDiagramModeloffs extends StObject {
  
  var entity: BaseEntity[BaseListener[_]] = js.native
  
  var firing: Boolean = js.native
  
  var id: String = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  def stopPropagation(): js.Any = js.native
}
object BaseEventDiagramModeloffs {
  
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    offsetX: Double,
    offsetY: Double,
    stopPropagation: () => js.Any
  ): BaseEventDiagramModeloffs = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[BaseEventDiagramModeloffs]
  }
  
  @scala.inline
  implicit class BaseEventDiagramModeloffsMutableBuilder[Self <: BaseEventDiagramModeloffs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: BaseEntity[BaseListener[_]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => js.Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
