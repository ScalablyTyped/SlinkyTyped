package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
@js.native
trait WeakValidationMapBooleanT extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[BooleanTypeKnob | Null]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
    ]
  ] = js.native
}

object WeakValidationMapBooleanT {
  @scala.inline
  def apply(): WeakValidationMapBooleanT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapBooleanT]
  }
  @scala.inline
  implicit class WeakValidationMapBooleanTOps[Self <: WeakValidationMapBooleanT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: Validator[js.UndefOr[BooleanTypeKnob | Null]]): Self = {
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
          js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
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

