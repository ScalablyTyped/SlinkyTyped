package typingsSlinky.storybookAddonKnobs

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
@js.native
trait WeakValidationMapOptionsT extends js.Object {
  var display: js.UndefOr[Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]] = js.native
  var knob: js.UndefOr[Validator[js.UndefOr[Null | OptionsTypeKnob[_]]]] = js.native
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]]] = js.native
}

object WeakValidationMapOptionsT {
  @scala.inline
  def apply(): WeakValidationMapOptionsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapOptionsT]
  }
  @scala.inline
  implicit class WeakValidationMapOptionsTOps[Self <: WeakValidationMapOptionsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]): Self = {
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
    def withKnob(value: Validator[js.UndefOr[Null | OptionsTypeKnob[_]]]): Self = {
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
    def withOnChange(value: Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
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

