package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.signalMod.SignalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValueSignalValue extends _Update {
  var value: SignalValue = js.native
}

object AnonValueSignalValue {
  @scala.inline
  def apply(value: SignalValue): AnonValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueSignalValue]
  }
  @scala.inline
  implicit class AnonValueSignalValueOps[Self <: AnonValueSignalValue] (val x: Self) extends AnyVal {
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

