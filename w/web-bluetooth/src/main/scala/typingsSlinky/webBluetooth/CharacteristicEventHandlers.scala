package typingsSlinky.webBluetooth

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacteristicEventHandlers extends js.Object {
  def oncharacteristicvaluechanged(ev: Event): js.Any = js.native
}

object CharacteristicEventHandlers {
  @scala.inline
  def apply(oncharacteristicvaluechanged: Event => js.Any): CharacteristicEventHandlers = {
    val __obj = js.Dynamic.literal(oncharacteristicvaluechanged = js.Any.fromFunction1(oncharacteristicvaluechanged))
    __obj.asInstanceOf[CharacteristicEventHandlers]
  }
  @scala.inline
  implicit class CharacteristicEventHandlersOps[Self <: CharacteristicEventHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOncharacteristicvaluechanged(value: Event => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncharacteristicvaluechanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

