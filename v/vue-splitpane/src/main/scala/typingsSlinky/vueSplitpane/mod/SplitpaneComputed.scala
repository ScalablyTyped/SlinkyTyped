package typingsSlinky.vueSplitpane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitpaneComputed extends js.Object {
  def cursor(): String = js.native
  def userSelect(): String = js.native
}

object SplitpaneComputed {
  @scala.inline
  def apply(cursor: () => String, userSelect: () => String): SplitpaneComputed = {
    val __obj = js.Dynamic.literal(cursor = js.Any.fromFunction0(cursor), userSelect = js.Any.fromFunction0(userSelect))
    __obj.asInstanceOf[SplitpaneComputed]
  }
  @scala.inline
  implicit class SplitpaneComputedOps[Self <: SplitpaneComputed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserSelect(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSelect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

