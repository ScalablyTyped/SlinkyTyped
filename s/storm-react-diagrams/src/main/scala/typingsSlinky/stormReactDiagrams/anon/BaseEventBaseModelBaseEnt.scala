package typingsSlinky.stormReactDiagrams.anon

import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModel<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEntity<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseListener<any>>, storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModelListener>> & {  isSelected :boolean} */
@js.native
trait BaseEventBaseModelBaseEnt extends StObject {
  
  var entity: BaseEntity[BaseListener[_]] = js.native
  
  var firing: Boolean = js.native
  
  var id: String = js.native
  
  var isSelected: Boolean = js.native
  
  def stopPropagation(): js.Any = js.native
}
object BaseEventBaseModelBaseEnt {
  
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    isSelected: Boolean,
    stopPropagation: () => js.Any
  ): BaseEventBaseModelBaseEnt = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[BaseEventBaseModelBaseEnt]
  }
  
  @scala.inline
  implicit class BaseEventBaseModelBaseEntMutableBuilder[Self <: BaseEventBaseModelBaseEnt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: BaseEntity[BaseListener[_]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => js.Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
