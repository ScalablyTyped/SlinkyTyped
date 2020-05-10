package typingsSlinky.stormReactDiagrams.diagramEngineMod

import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramEngineListener
  extends BaseListener[js.Any] {
  var labelFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var linkFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var nodeFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var portFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var repaintCanvas: js.UndefOr[js.Function0[Unit]] = js.native
}

object DiagramEngineListener {
  @scala.inline
  def apply(): DiagramEngineListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEngineListener]
  }
  @scala.inline
  implicit class DiagramEngineListenerOps[Self <: DiagramEngineListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFactoriesUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFactoriesUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLabelFactoriesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFactoriesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkFactoriesUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFactoriesUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLinkFactoriesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFactoriesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeFactoriesUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFactoriesUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNodeFactoriesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFactoriesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withPortFactoriesUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portFactoriesUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPortFactoriesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portFactoriesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withRepaintCanvas(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintCanvas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRepaintCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintCanvas")(js.undefined)
        ret
    }
  }
  
}

