package typingsSlinky.storybookAddonKnobs.selectMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectTypeKnob[T /* <: SelectTypeKnobValue */] extends KnobControlConfig[T] {
  var options: SelectTypeOptionsProp[T] = js.native
}

object SelectTypeKnob {
  @scala.inline
  def apply[T](name: String, options: SelectTypeOptionsProp[T], value: T): SelectTypeKnob[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectTypeKnob[T]]
  }
  @scala.inline
  implicit class SelectTypeKnobOps[Self[t] <: SelectTypeKnob[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOptions(value: SelectTypeOptionsProp[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

