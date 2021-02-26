package typingsSlinky.stormReactDiagrams

import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractNodeFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", "AbstractNodeFactory")
  @js.native
  abstract class AbstractNodeFactory[T /* <: NodeModel */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): ReactElement = js.native
  }
}
