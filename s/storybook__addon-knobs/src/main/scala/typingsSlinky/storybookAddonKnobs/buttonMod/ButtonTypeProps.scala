package typingsSlinky.storybookAddonKnobs.buttonMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonTypeProps
  extends KnobControlProps[scala.Nothing] {
  @JSName("knob")
  var knob_ButtonTypeProps: ButtonTypeKnob = js.native
  var onClick: ButtonTypeOnClickProp = js.native
}

object ButtonTypeProps {
  @scala.inline
  def apply(knob: ButtonTypeKnob, onClick: /* knob */ ButtonTypeKnob => js.Any): ButtonTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ButtonTypeProps]
  }
  @scala.inline
  implicit class ButtonTypePropsOps[Self <: ButtonTypeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: ButtonTypeKnob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: /* knob */ ButtonTypeKnob => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

