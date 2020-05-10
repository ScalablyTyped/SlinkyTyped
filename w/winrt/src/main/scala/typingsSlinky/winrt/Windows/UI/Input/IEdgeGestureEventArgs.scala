package typingsSlinky.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEdgeGestureEventArgs extends js.Object {
  var kind: EdgeGestureKind = js.native
}

object IEdgeGestureEventArgs {
  @scala.inline
  def apply(kind: EdgeGestureKind): IEdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGestureEventArgs]
  }
  @scala.inline
  implicit class IEdgeGestureEventArgsOps[Self <: IEdgeGestureEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: EdgeGestureKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

