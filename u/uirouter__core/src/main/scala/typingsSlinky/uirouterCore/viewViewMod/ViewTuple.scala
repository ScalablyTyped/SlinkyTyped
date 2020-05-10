package typingsSlinky.uirouterCore.viewViewMod

import typingsSlinky.uirouterCore.viewInterfaceMod.ActiveUIView
import typingsSlinky.uirouterCore.viewInterfaceMod.ViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewTuple extends js.Object {
  var uiView: ActiveUIView = js.native
  var viewConfig: ViewConfig = js.native
}

object ViewTuple {
  @scala.inline
  def apply(uiView: ActiveUIView, viewConfig: ViewConfig): ViewTuple = {
    val __obj = js.Dynamic.literal(uiView = uiView.asInstanceOf[js.Any], viewConfig = viewConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTuple]
  }
  @scala.inline
  implicit class ViewTupleOps[Self <: ViewTuple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUiView(value: ActiveUIView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewConfig(value: ViewConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

