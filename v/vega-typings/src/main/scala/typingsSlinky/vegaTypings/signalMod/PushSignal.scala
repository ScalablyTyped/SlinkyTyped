package typingsSlinky.vegaTypings.signalMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSignal
  extends BaseSignal
     with Signal {
  var push: outer = js.native
}

object PushSignal {
  @scala.inline
  def apply(name: String, push: outer): PushSignal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSignal]
  }
  @scala.inline
  implicit class PushSignalOps[Self <: PushSignal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPush(value: outer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

