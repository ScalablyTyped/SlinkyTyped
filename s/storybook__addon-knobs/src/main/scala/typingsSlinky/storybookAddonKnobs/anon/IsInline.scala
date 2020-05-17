package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnob
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInline extends js.Object {
  var isInline: Validator[Boolean] = js.native
  var knob: Validator[CheckboxesTypeKnob] = js.native
  var onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]] = js.native
}

object IsInline {
  @scala.inline
  def apply(
    isInline: Validator[Boolean],
    knob: Validator[CheckboxesTypeKnob],
    onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]
  ): IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInline]
  }
  @scala.inline
  implicit class IsInlineOps[Self <: IsInline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInline(value: Validator[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnob(value: Validator[CheckboxesTypeKnob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

