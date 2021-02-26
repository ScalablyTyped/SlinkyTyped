package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignSelfProps extends StObject {
  
  val alignSelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _
    ]
  ] = js.native
}
object AlignSelfProps {
  
  @scala.inline
  def apply(): AlignSelfProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignSelfProps]
  }
  
  @scala.inline
  implicit class AlignSelfPropsMutableBuilder[Self <: AlignSelfProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignSelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _
        ]
    ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    @scala.inline
    def setAlignSelfVarargs(value: js.Any*): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
  }
}
