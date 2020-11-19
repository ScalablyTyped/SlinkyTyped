package typingsSlinky.stormReactDiagrams

import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", JSImport.Namespace)
@js.native
object abstractNodeFactoryMod extends js.Object {
  
  @js.native
  abstract class AbstractNodeFactory[T /* <: NodeModel */] () extends AbstractFactory[T] {
    
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): ReactElement = js.native
  }
}
