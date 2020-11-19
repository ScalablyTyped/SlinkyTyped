package typingsSlinky.storybookAddonKnobs.selectMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectTypeProps[T /* <: SelectTypeKnobValue */] extends KnobControlProps[T] {
  
  @JSName("knob")
  var knob_SelectTypeProps: SelectTypeKnob[T] = js.native
}
object SelectTypeProps {
  
  @scala.inline
  def apply[T /* <: SelectTypeKnobValue */](knob: SelectTypeKnob[T], onChange: T => T): SelectTypeProps[T] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SelectTypeProps[T]]
  }
  
  @scala.inline
  implicit class SelectTypePropsOps[Self <: SelectTypeProps[_], T /* <: SelectTypeKnobValue */] (val x: Self with SelectTypeProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKnob(value: SelectTypeKnob[T]): Self = this.set("knob", value.asInstanceOf[js.Any])
  }
}
