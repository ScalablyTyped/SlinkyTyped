package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowConsole extends js.Object {
  val console: Console_ = js.native
}

object WindowConsole {
  @scala.inline
  def apply(console: Console_): WindowConsole = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowConsole]
  }
  @scala.inline
  implicit class WindowConsoleOps[Self <: org.scalajs.dom.raw.WindowConsole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsole(value: Console_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

