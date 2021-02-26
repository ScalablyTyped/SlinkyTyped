package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
@js.native
trait PartialArrayTypeProps extends StObject {
  
  var knob: js.UndefOr[ArrayTypeKnob] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]] = js.native
}
object PartialArrayTypeProps {
  
  @scala.inline
  def apply(): PartialArrayTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArrayTypeProps]
  }
  
  @scala.inline
  implicit class PartialArrayTypePropsMutableBuilder[Self <: PartialArrayTypeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: ArrayTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
