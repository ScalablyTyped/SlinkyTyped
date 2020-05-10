package typingsSlinky.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEdgeGesture extends js.Object {
  var oncanceled: js.Any = js.native
  var oncompleted: js.Any = js.native
  var onstarting: js.Any = js.native
}

object IEdgeGesture {
  @scala.inline
  def apply(oncanceled: js.Any, oncompleted: js.Any, onstarting: js.Any): IEdgeGesture = {
    val __obj = js.Dynamic.literal(oncanceled = oncanceled.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onstarting = onstarting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGesture]
  }
  @scala.inline
  implicit class IEdgeGestureOps[Self <: IEdgeGesture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOncanceled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstarting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstarting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

