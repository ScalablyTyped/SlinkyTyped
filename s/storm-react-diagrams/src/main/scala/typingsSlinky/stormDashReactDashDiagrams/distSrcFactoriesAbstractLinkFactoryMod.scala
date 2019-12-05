package typingsSlinky.stormDashReactDashDiagrams

import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsSlinky.stormDashReactDashDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", JSImport.Namespace)
@js.native
object distSrcFactoriesAbstractLinkFactoryMod extends js.Object {
  @js.native
  abstract class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
  
}

