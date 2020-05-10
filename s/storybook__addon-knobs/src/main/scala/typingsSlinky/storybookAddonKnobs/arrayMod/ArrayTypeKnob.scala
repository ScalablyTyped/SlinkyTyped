package typingsSlinky.storybookAddonKnobs.arrayMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayTypeKnob extends KnobControlConfig[ArrayTypeKnobValue] {
  var separator: String = js.native
}

object ArrayTypeKnob {
  @scala.inline
  def apply(name: String, separator: String, value: ArrayTypeKnobValue): ArrayTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeKnob]
  }
  @scala.inline
  implicit class ArrayTypeKnobOps[Self <: ArrayTypeKnob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

