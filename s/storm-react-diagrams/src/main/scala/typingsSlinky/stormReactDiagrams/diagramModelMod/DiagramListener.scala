package typingsSlinky.stormReactDiagrams.diagramModelMod

import typingsSlinky.stormReactDiagrams.BaseEventDiagramModeloffs
import typingsSlinky.stormReactDiagrams.BaseEventDiagramModelsize
import typingsSlinky.stormReactDiagrams.BaseEventDiagramModelzoom
import typingsSlinky.stormReactDiagrams.BaseEventanylinkLinkModel
import typingsSlinky.stormReactDiagrams.BaseEventanynodeNodeModel
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramListener
  extends BaseListener[js.Any] {
  var gridUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelsize, Unit]] = js.native
  var linksUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanylinkLinkModel, Unit]] = js.native
  var nodesUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanynodeNodeModel, Unit]] = js.native
  var offsetUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModeloffs, Unit]] = js.native
  var zoomUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelzoom, Unit]] = js.native
}

object DiagramListener {
  @scala.inline
  def apply(): DiagramListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramListener]
  }
  @scala.inline
  implicit class DiagramListenerOps[Self <: DiagramListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridUpdated(value: /* event */ BaseEventDiagramModelsize => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGridUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withLinksUpdated(value: /* event */ BaseEventanylinkLinkModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLinksUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withNodesUpdated(value: /* event */ BaseEventanynodeNodeModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetUpdated(value: /* event */ BaseEventDiagramModeloffs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOffsetUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomUpdated(value: /* event */ BaseEventDiagramModelzoom => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomUpdated")(js.undefined)
        ret
    }
  }
  
}

