package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRadiosType extends StObject {
  
  /* static member */
  var defaultProps: RadiosTypeProps = js.native
  
  /* static member */
  var deserialize: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]] = js.native
  
  /* static member */
  var propTypes: IsInlineKnob = js.native
  
  /* static member */
  var serialize: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]] = js.native
}
object TypeofRadiosType {
  
  @scala.inline
  def apply(
    defaultProps: RadiosTypeProps,
    deserialize: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null],
    propTypes: IsInlineKnob,
    serialize: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null]
  ): TypeofRadiosType = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], deserialize = js.Any.fromFunction1(deserialize), propTypes = propTypes.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[TypeofRadiosType]
  }
  
  @scala.inline
  implicit class TypeofRadiosTypeMutableBuilder[Self <: TypeofRadiosType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: RadiosTypeProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserialize(value: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null]): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropTypes(value: IsInlineKnob): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialize(value: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null]): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
