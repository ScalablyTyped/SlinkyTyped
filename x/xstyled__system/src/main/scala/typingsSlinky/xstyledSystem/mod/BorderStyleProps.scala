package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderStyleProps extends StObject {
  
  val borderStyle: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _) | Double
    ]
  ] = js.native
}
object BorderStyleProps {
  
  @scala.inline
  def apply(): BorderStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyleProps]
  }
  
  @scala.inline
  implicit class BorderStylePropsMutableBuilder[Self <: BorderStyleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderStyle(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _) | Double
        ]
    ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setBorderStyleVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "borderStyle", js.Array(value :_*))
  }
}
