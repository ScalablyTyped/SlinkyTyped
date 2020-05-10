package typingsSlinky.storybookAddonKnobs.checkboxesMod

import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxesTypeKnob extends KnobControlConfig[CheckboxesTypeKnobValue] {
  var options: Record[String, String] = js.native
}

object CheckboxesTypeKnob {
  @scala.inline
  def apply(name: String, options: Record[String, String], value: CheckboxesTypeKnobValue): CheckboxesTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxesTypeKnob]
  }
  @scala.inline
  implicit class CheckboxesTypeKnobOps[Self <: CheckboxesTypeKnob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

