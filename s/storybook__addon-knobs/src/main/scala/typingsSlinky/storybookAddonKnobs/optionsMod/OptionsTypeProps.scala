package typingsSlinky.storybookAddonKnobs.optionsMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTypeProps[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlProps[T] {
  var display: OptionsKnobOptionsDisplay = js.native
  @JSName("knob")
  var knob_OptionsTypeProps: OptionsTypeKnob[T] = js.native
}

object OptionsTypeProps {
  @scala.inline
  def apply[T](display: OptionsKnobOptionsDisplay, knob: OptionsTypeKnob[T], onChange: T => T): OptionsTypeProps[T] = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OptionsTypeProps[T]]
  }
  @scala.inline
  implicit class OptionsTypePropsOps[Self[t] <: OptionsTypeProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDisplay(value: OptionsKnobOptionsDisplay): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnob(value: OptionsTypeKnob[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

