package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.signalMod.SignalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueSignalValue
  extends typingsSlinky.vegaTypings.onEventsMod.Update {
  var value: SignalValue = js.native
}

object ValueSignalValue {
  @scala.inline
  def apply(value: SignalValue): ValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSignalValue]
  }
  @scala.inline
  implicit class ValueSignalValueOps[Self <: ValueSignalValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: SignalValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

