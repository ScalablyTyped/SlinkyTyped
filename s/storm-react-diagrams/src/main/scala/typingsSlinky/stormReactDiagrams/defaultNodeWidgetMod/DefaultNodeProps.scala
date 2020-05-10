package typingsSlinky.stormReactDiagrams.defaultNodeWidgetMod

import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsSlinky.stormReactDiagrams.defaultNodeModelMod.DefaultNodeModel
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultNodeProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine = js.native
  var node: DefaultNodeModel = js.native
}

object DefaultNodeProps {
  @scala.inline
  def apply(diagramEngine: DiagramEngine, node: DefaultNodeModel): DefaultNodeProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNodeProps]
  }
  @scala.inline
  implicit class DefaultNodePropsOps[Self <: DefaultNodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagramEngine(value: DiagramEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: DefaultNodeModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

