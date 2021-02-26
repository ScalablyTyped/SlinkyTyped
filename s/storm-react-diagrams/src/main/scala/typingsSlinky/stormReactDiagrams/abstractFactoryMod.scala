package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", "AbstractFactory")
  @js.native
  abstract class AbstractFactory[T /* <: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] */] protected () extends StObject {
    def this(name: String) = this()
    
    def getNewInstance(): T = js.native
    def getNewInstance(initialConfig: js.Any): T = js.native
    
    def getType(): String = js.native
    
    var `type`: String = js.native
  }
}
