package typingsSlinky.stormReactDiagrams.nodeLayerWidgetMod

import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/widgets/layers/NodeLayerWidget", "NodeLayerWidget")
@js.native
class NodeLayerWidget protected () extends BaseWidget[NodeLayerProps, NodeLayerState] {
  def this(props: NodeLayerProps) = this()
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNodeLayerWidget(): Unit = js.native
  
  def updateNodeDimensions(): Unit = js.native
}
