package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JustifyItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS justify-items property defines the default justify-self for all items of the box, giving them all
    * a default way of justifying each box along the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items)
    */
  var justifyItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _, 
      ThemeType
    ]
  ] = js.native
}
object JustifyItemsProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifyItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps[ThemeType]]
  }
  
  @scala.inline
  implicit class JustifyItemsPropsMutableBuilder[Self <: JustifyItemsProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with JustifyItemsProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setJustifyItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyItemsNull: Self = StObject.set(x, "justifyItems", null)
    
    @scala.inline
    def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    @scala.inline
    def setJustifyItemsVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "justifyItems", js.Array(value :_*))
  }
}
