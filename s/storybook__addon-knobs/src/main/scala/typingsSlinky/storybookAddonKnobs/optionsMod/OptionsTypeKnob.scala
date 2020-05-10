package typingsSlinky.storybookAddonKnobs.optionsMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTypeKnob[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlConfig[T] {
  var options: OptionsTypeOptionsProp[T] = js.native
  var optionsObj: OptionsKnobOptions = js.native
}

object OptionsTypeKnob {
  @scala.inline
  def apply[T](name: String, options: OptionsTypeOptionsProp[T], optionsObj: OptionsKnobOptions, value: T): OptionsTypeKnob[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTypeKnob[T]]
  }
  @scala.inline
  implicit class OptionsTypeKnobOps[Self[t] <: OptionsTypeKnob[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOptions(value: OptionsTypeOptionsProp[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsObj(value: OptionsKnobOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsObj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

