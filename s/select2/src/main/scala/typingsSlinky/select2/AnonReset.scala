package typingsSlinky.select2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReset extends js.Object {
  def reset(): Unit = js.native
  def set(key: String, value: js.Any): Unit = js.native
}

object AnonReset {
  @scala.inline
  def apply(reset: () => Unit, set: (String, js.Any) => Unit): AnonReset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[AnonReset]
  }
  @scala.inline
  implicit class AnonResetOps[Self <: AnonReset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

