package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexWrapProps extends StObject {
  
  val flexWrap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
    ]
  ] = js.native
}
object FlexWrapProps {
  
  @scala.inline
  def apply(): FlexWrapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps]
  }
  
  @scala.inline
  implicit class FlexWrapPropsMutableBuilder[Self <: FlexWrapProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexWrap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
        ]
    ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    @scala.inline
    def setFlexWrapVarargs(value: js.Any*): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
  }
}
