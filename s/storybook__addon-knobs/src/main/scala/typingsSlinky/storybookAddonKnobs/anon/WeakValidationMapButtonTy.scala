package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
@js.native
trait WeakValidationMapButtonTy extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[ButtonTypeKnob | Null]]] = js.native
  var onChange: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* value */ scala.Nothing, scala.Nothing]) | Null]]
  ] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[ButtonTypeOnClickProp | Null]]] = js.native
}

object WeakValidationMapButtonTy {
  @scala.inline
  def apply(): WeakValidationMapButtonTy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapButtonTy]
  }
  @scala.inline
  implicit class WeakValidationMapButtonTyOps[Self <: WeakValidationMapButtonTy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: Validator[js.UndefOr[ButtonTypeKnob | Null]]): Self = {
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
    def withOnChange(value: Validator[js.UndefOr[(js.Function1[/* value */ scala.Nothing, scala.Nothing]) | Null]]): Self = {
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
    @scala.inline
    def withOnClick(value: Validator[js.UndefOr[ButtonTypeOnClickProp | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

