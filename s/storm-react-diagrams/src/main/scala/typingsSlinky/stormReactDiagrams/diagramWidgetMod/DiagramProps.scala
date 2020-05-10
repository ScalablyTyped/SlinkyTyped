package typingsSlinky.stormReactDiagrams.diagramWidgetMod

import typingsSlinky.stormReactDiagrams.baseActionMod.BaseAction
import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramProps extends BaseWidgetProps {
  var actionStartedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Boolean]] = js.native
  var actionStillFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.native
  var actionStoppedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.native
  var allowCanvasTranslation: js.UndefOr[Boolean] = js.native
  var allowCanvasZoom: js.UndefOr[Boolean] = js.native
  var allowLooseLinks: js.UndefOr[Boolean] = js.native
  var deleteKeys: js.UndefOr[js.Array[Double]] = js.native
  var diagramEngine: DiagramEngine = js.native
  var inverseZoom: js.UndefOr[Boolean] = js.native
  var maxNumberPointsPerLink: js.UndefOr[Double] = js.native
  var smartRouting: js.UndefOr[Boolean] = js.native
}

object DiagramProps {
  @scala.inline
  def apply(diagramEngine: DiagramEngine): DiagramProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramProps]
  }
  @scala.inline
  implicit class DiagramPropsOps[Self <: DiagramProps] (val x: Self) extends AnyVal {
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
    def withActionStartedFiring(value: /* action */ BaseAction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStartedFiring")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionStartedFiring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStartedFiring")(js.undefined)
        ret
    }
    @scala.inline
    def withActionStillFiring(value: /* action */ BaseAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStillFiring")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionStillFiring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStillFiring")(js.undefined)
        ret
    }
    @scala.inline
    def withActionStoppedFiring(value: /* action */ BaseAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStoppedFiring")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionStoppedFiring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStoppedFiring")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCanvasTranslation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCanvasTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCanvasTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCanvasTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCanvasZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCanvasZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCanvasZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCanvasZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowLooseLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLooseLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLooseLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLooseLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteKeys(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withInverseZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverseZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumberPointsPerLink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberPointsPerLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumberPointsPerLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberPointsPerLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartRouting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartRouting")(js.undefined)
        ret
    }
  }
  
}

