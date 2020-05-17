package typingsSlinky.winrtUwp.Windows.Management.Orchestration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleAppModeContext extends js.Object {
  var close: js.Any = js.native
}

object SingleAppModeContext {
  @scala.inline
  def apply(close: js.Any): SingleAppModeContext = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleAppModeContext]
  }
  @scala.inline
  implicit class SingleAppModeContextOps[Self <: SingleAppModeContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

