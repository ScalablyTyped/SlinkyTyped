package typingsSlinky.vscodeJsonrpc.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterOptions extends js.Object {
  var onFirstListenerAdd: js.UndefOr[js.Function] = js.native
  var onLastListenerRemove: js.UndefOr[js.Function] = js.native
}

object EmitterOptions {
  @scala.inline
  def apply(): EmitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitterOptions]
  }
  @scala.inline
  implicit class EmitterOptionsOps[Self <: EmitterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFirstListenerAdd(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstListenerAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFirstListenerAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstListenerAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLastListenerRemove(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLastListenerRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLastListenerRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLastListenerRemove")(js.undefined)
        ret
    }
  }
  
}

