package typingsSlinky.storybookAddonKnobs.propFormMod

import typingsSlinky.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropFormProps extends js.Object {
  var knobs: js.Array[KnobStoreKnob] = js.native
  def onFieldChange(changedKnob: KnobStoreKnob): Unit = js.native
  def onFieldClick(knob: KnobStoreKnob): Unit = js.native
}

object PropFormProps {
  @scala.inline
  def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: KnobStoreKnob => Unit,
    onFieldClick: KnobStoreKnob => Unit
  ): PropFormProps = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction1(onFieldChange), onFieldClick = js.Any.fromFunction1(onFieldClick))
    __obj.asInstanceOf[PropFormProps]
  }
  @scala.inline
  implicit class PropFormPropsOps[Self <: PropFormProps] (val x: Self) extends AnyVal {
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
    def withOnFieldChange(value: KnobStoreKnob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnFieldClick(value: KnobStoreKnob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldClick")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

