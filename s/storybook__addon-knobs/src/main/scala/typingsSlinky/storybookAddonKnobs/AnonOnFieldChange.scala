package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnFieldChange extends js.Object {
  var knobs: js.Array[KnobStoreKnob] = js.native
  def onFieldChange(): Unit = js.native
  def onFieldClick(): Unit = js.native
}

object AnonOnFieldChange {
  @scala.inline
  def apply(knobs: js.Array[KnobStoreKnob], onFieldChange: () => Unit, onFieldClick: () => Unit): AnonOnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction0(onFieldChange), onFieldClick = js.Any.fromFunction0(onFieldClick))
    __obj.asInstanceOf[AnonOnFieldChange]
  }
  @scala.inline
  implicit class AnonOnFieldChangeOps[Self <: AnonOnFieldChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnobs(value: js.Array[KnobStoreKnob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFieldChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFieldClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldClick")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

