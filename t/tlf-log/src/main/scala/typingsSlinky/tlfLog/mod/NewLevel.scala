package typingsSlinky.tlfLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewLevel extends js.Object {
  var afterLog: js.UndefOr[js.Function0[Unit]] = js.native
}

object NewLevel {
  @scala.inline
  def apply(): NewLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewLevel]
  }
  @scala.inline
  implicit class NewLevelOps[Self <: NewLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterLog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLog")(js.undefined)
        ret
    }
  }
  
}

