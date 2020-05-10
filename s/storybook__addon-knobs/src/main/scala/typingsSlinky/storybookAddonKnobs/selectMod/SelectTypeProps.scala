package typingsSlinky.storybookAddonKnobs.selectMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectTypeProps[T /* <: SelectTypeKnobValue */] extends KnobControlProps[T] {
  @JSName("knob")
  var knob_SelectTypeProps: SelectTypeKnob[T] = js.native
}

object SelectTypeProps {
  @scala.inline
  def apply[T](knob: SelectTypeKnob[T], onChange: T => T): SelectTypeProps[T] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SelectTypeProps[T]]
  }
  @scala.inline
  implicit class SelectTypePropsOps[Self[t] <: SelectTypeProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKnob(value: SelectTypeKnob[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

