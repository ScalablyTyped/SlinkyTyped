package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderWidthProps[TLength] extends StObject {
  
  val borderWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _
    ]
  ] = js.native
}
object BorderWidthProps {
  
  @scala.inline
  def apply[TLength](): BorderWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidthProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderWidthPropsMutableBuilder[Self <: BorderWidthProps[_], TLength] (val x: Self with BorderWidthProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _
        ]
    ): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBorderWidthVarargs(value: js.Any*): Self = StObject.set(x, "borderWidth", js.Array(value :_*))
  }
}
