package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", JSImport.Namespace)
@js.native
object abstractFactoryMod extends js.Object {
  
  @js.native
  abstract class AbstractFactory[T /* <: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] */] protected () extends js.Object {
    def this(name: String) = this()
    
    def getNewInstance(): T = js.native
    def getNewInstance(initialConfig: js.Any): T = js.native
    
    def getType(): String = js.native
    
    var `type`: String = js.native
  }
}
