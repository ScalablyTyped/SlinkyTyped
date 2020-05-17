package typingsSlinky.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the type of user input that triggered the edge gesture event. */
@js.native
trait EdgeGestureEventArgs extends js.Object {
  /** Gets the type of user input that triggered the edge gesture event. */
  var kind: EdgeGestureKind = js.native
}

object EdgeGestureEventArgs {
  @scala.inline
  def apply(kind: EdgeGestureKind): EdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeGestureEventArgs]
  }
  @scala.inline
  implicit class EdgeGestureEventArgsOps[Self <: EdgeGestureEventArgs] (val x: Self) extends AnyVal {
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

