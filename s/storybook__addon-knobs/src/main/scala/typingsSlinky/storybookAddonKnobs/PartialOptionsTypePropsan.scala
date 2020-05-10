package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
@js.native
trait PartialOptionsTypePropsan extends js.Object {
  var display: js.UndefOr[OptionsKnobOptionsDisplay] = js.native
  var knob: js.UndefOr[OptionsTypeKnob[_]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
}

object PartialOptionsTypePropsan {
  @scala.inline
  def apply(): PartialOptionsTypePropsan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsTypePropsan]
  }
  @scala.inline
  implicit class PartialOptionsTypePropsanOps[Self <: PartialOptionsTypePropsan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: OptionsKnobOptionsDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withKnob(value: OptionsTypeKnob[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
  }
  
}

