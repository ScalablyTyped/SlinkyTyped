package typingsSlinky.stormReactDiagrams

import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", JSImport.Namespace)
@js.native
object abstractLinkFactoryMod extends js.Object {
  @js.native
  abstract class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): ReactElement = js.native
  }
  
}

