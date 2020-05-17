package typingsSlinky.umzug.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Down extends js.Object {
  var down: js.UndefOr[js.Function0[js.Thenable[_]]] = js.native
  def up(): js.Thenable[_] = js.native
}

object Down {
  @scala.inline
  def apply(up: () => js.Thenable[_]): Down = {
    val __obj = js.Dynamic.literal(up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[Down]
  }
  @scala.inline
  implicit class DownOps[Self <: Down] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUp(value: () => js.Thenable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDown(value: () => js.Thenable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
  }
  
}

