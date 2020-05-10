package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
@js.native
trait PartialButtonTypeProps extends js.Object {
  var knob: js.UndefOr[ButtonTypeKnob] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Nothing, scala.Nothing]] = js.native
  var onClick: js.UndefOr[ButtonTypeOnClickProp] = js.native
}

object PartialButtonTypeProps {
  @scala.inline
  def apply(): PartialButtonTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonTypeProps]
  }
  @scala.inline
  implicit class PartialButtonTypePropsOps[Self <: PartialButtonTypeProps] (val x: Self) extends AnyVal {
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
    def withoutKnob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* knob */ ButtonTypeKnob => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
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

