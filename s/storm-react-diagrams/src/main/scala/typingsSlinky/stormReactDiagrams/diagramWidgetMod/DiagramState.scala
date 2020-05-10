package typingsSlinky.stormReactDiagrams.diagramWidgetMod

import typingsSlinky.stormReactDiagrams.baseActionMod.BaseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramState extends js.Object {
  var action: BaseAction | Null = js.native
  var diagramEngineListener: js.Any = js.native
  var document: js.Any = js.native
  var renderedNodes: Boolean = js.native
  var wasMoved: Boolean = js.native
  var windowListener: js.Any = js.native
}

object DiagramState {
  @scala.inline
  def apply(
    diagramEngineListener: js.Any,
    document: js.Any,
    renderedNodes: Boolean,
    wasMoved: Boolean,
    windowListener: js.Any
  ): DiagramState = {
    val __obj = js.Dynamic.literal(diagramEngineListener = diagramEngineListener.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], renderedNodes = renderedNodes.asInstanceOf[js.Any], wasMoved = wasMoved.asInstanceOf[js.Any], windowListener = windowListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramState]
  }
  @scala.inline
  implicit class DiagramStateOps[Self <: DiagramState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagramEngineListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramEngineListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasMoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasMoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: BaseAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(null)
        ret
    }
  }
  
}

