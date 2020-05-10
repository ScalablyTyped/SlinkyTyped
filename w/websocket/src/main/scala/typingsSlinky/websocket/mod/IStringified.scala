package typingsSlinky.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStringified extends js.Object {
  def toString(args: js.Any*): String = js.native
}

object IStringified {
  @scala.inline
  def apply(toString: /* repeated */ js.Any => String): IStringified = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[IStringified]
  }
  @scala.inline
  implicit class IStringifiedOps[Self <: IStringified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToString(value: /* repeated */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

