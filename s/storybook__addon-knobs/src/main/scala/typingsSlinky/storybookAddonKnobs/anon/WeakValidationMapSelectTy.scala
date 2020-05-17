package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnob
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
@js.native
trait WeakValidationMapSelectTy extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
    ]
  ] = js.native
}

object WeakValidationMapSelectTy {
  @scala.inline
  def apply(): WeakValidationMapSelectTy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSelectTy]
  }
  @scala.inline
  implicit class WeakValidationMapSelectTyOps[Self <: WeakValidationMapSelectTy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]]): Self = {
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
    def withOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
        ]
    ): Self = {
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

