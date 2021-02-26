package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInlineKnob extends StObject {
  
  var isInline: Validator[Boolean] = js.native
  
  var knob: Validator[RadiosTypeKnob] = js.native
  
  var onChange: Validator[
    js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
  ] = js.native
}
object IsInlineKnob {
  
  @scala.inline
  def apply(
    isInline: Validator[Boolean],
    knob: Validator[RadiosTypeKnob],
    onChange: Validator[
      js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
    ]
  ): IsInlineKnob = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInlineKnob]
  }
  
  @scala.inline
  implicit class IsInlineKnobMutableBuilder[Self <: IsInlineKnob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsInline(value: Validator[Boolean]): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnob(value: Validator[RadiosTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(
      value: Validator[
          js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
