package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopProps[TLength] extends StObject {
  
  val top: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
    ]
  ] = js.native
}
object TopProps {
  
  @scala.inline
  def apply[TLength](): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopProps[TLength]]
  }
  
  @scala.inline
  implicit class TopPropsMutableBuilder[Self <: TopProps[_], TLength] (val x: Self with TopProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
        ]
    ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTopVarargs(value: js.Any*): Self = StObject.set(x, "top", js.Array(value :_*))
  }
}
