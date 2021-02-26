package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridAutoFlowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The grid-auto-flow CSS property controls how the auto-placement algorithm works, specifying exactly
    * how auto-placed items get flowed into the grid.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
    */
  var gridAutoFlow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _, 
      ThemeType
    ]
  ] = js.native
}
object GridAutoFlowProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridAutoFlowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps[ThemeType]]
  }
  
  @scala.inline
  implicit class GridAutoFlowPropsMutableBuilder[Self <: GridAutoFlowProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with GridAutoFlowProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setGridAutoFlow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoFlowNull: Self = StObject.set(x, "gridAutoFlow", null)
    
    @scala.inline
    def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
    
    @scala.inline
    def setGridAutoFlowVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "gridAutoFlow", js.Array(value :_*))
  }
}
