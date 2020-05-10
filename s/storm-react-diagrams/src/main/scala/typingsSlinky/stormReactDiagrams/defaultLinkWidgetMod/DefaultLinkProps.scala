package typingsSlinky.stormReactDiagrams.defaultLinkWidgetMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsSlinky.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultLinkProps extends BaseWidgetProps {
  var color: js.UndefOr[String] = js.native
  var diagramEngine: DiagramEngine = js.native
  var link: DefaultLinkModel = js.native
  var pointAdded: js.UndefOr[js.Function2[/* point */ PointModel, /* event */ MouseEvent, _]] = js.native
  var smooth: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object DefaultLinkProps {
  @scala.inline
  def apply(diagramEngine: DiagramEngine, link: DefaultLinkModel): DefaultLinkProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLinkProps]
  }
  @scala.inline
  implicit class DefaultLinkPropsOps[Self <: DefaultLinkProps] (val x: Self) extends AnyVal {
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
    def withLink(value: DefaultLinkModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withPointAdded(value: (/* point */ PointModel, /* event */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPointAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

