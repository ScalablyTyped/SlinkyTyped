package typingsSlinky.stormDashReactDashDiagrams

import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsSlinky.stormDashReactDashDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsNodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", JSImport.Namespace)
@js.native
object distSrcFactoriesAbstractNodeFactoryMod extends js.Object {
  @js.native
  abstract class AbstractNodeFactory[T /* <: NodeModel */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): Element = js.native
  }
  
}

