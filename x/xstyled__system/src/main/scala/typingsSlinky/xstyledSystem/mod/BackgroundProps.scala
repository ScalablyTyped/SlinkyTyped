package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundProps extends StObject {
  
  val background: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<string> */ _
    ]
  ] = js.native
}
object BackgroundProps {
  
  @scala.inline
  def apply(): BackgroundProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps]
  }
  
  @scala.inline
  implicit class BackgroundPropsMutableBuilder[Self <: BackgroundProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<string> */ _
        ]
    ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBackgroundVarargs(value: js.Any*): Self = StObject.set(x, "background", js.Array(value :_*))
  }
}
