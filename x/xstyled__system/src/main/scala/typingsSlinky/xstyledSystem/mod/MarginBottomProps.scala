package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginBottomProps[TLength] extends StObject {
  
  val marginBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
    ]
  ] = js.native
  
  val mb: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
    ]
  ] = js.native
}
object MarginBottomProps {
  
  @scala.inline
  def apply[TLength](): MarginBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginBottomPropsMutableBuilder[Self <: MarginBottomProps[_], TLength] (val x: Self with MarginBottomProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMarginBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
        ]
    ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginBottomVarargs(value: js.Any*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
    
    @scala.inline
    def setMb(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
        ]
    ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    @scala.inline
    def setMbVarargs(value: js.Any*): Self = StObject.set(x, "mb", js.Array(value :_*))
  }
}
