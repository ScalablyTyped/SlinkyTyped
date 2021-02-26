package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JustifySelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS justify-self property set the way a box is justified inside its alignment container along
    * the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self)
    */
  var justifySelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _, 
      ThemeType
    ]
  ] = js.native
}
object JustifySelfProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifySelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps[ThemeType]]
  }
  
  @scala.inline
  implicit class JustifySelfPropsMutableBuilder[Self <: JustifySelfProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with JustifySelfProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setJustifySelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifySelfNull: Self = StObject.set(x, "justifySelf", null)
    
    @scala.inline
    def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
    
    @scala.inline
    def setJustifySelfVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "justifySelf", js.Array(value :_*))
  }
}
