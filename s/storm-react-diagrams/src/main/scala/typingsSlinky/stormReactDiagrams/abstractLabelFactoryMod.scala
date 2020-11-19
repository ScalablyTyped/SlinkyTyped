package typingsSlinky.stormReactDiagrams

import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.labelModelMod.LabelModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLabelFactory", JSImport.Namespace)
@js.native
object abstractLabelFactoryMod extends js.Object {
  
  @js.native
  abstract class AbstractLabelFactory[T /* <: LabelModel */] () extends AbstractFactory[T] {
    
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): ReactElement = js.native
  }
}
