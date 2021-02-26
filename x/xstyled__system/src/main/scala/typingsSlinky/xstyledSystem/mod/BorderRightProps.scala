package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRightProps[TLength] extends StObject {
  
  val borderRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ _
    ]
  ] = js.native
}
object BorderRightProps {
  
  @scala.inline
  def apply[TLength](): BorderRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderRightPropsMutableBuilder[Self <: BorderRightProps[_], TLength] (val x: Self with BorderRightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ _
        ]
    ): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    @scala.inline
    def setBorderRightVarargs(value: js.Any*): Self = StObject.set(x, "borderRight", js.Array(value :_*))
  }
}
