package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexboxProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends AlignItemsProps[ThemeType]
     with AlignContentProps[ThemeType]
     with JustifyItemsProps[ThemeType]
     with JustifyContentProps[ThemeType]
     with FlexWrapProps[ThemeType]
     with FlexDirectionProps[ThemeType]
     with FlexProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLengthStyledSystem> */ js.Any
    ]
     with FlexGrowProps[ThemeType]
     with FlexShrinkProps[ThemeType]
     with FlexBasisProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexBasisProperty<TLengthStyledSystem> */ js.Any
    ]
     with JustifySelfProps[ThemeType]
     with AlignSelfProps[ThemeType]
     with OrderProps[ThemeType]
object FlexboxProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexboxProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexboxProps[ThemeType]]
  }
}
