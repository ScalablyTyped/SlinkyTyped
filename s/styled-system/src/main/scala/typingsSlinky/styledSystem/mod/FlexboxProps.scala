package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.FlexBasisProperty
import typingsSlinky.csstype.mod.FlexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexboxProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends AlignItemsProps[ThemeType]
     with AlignContentProps[ThemeType]
     with JustifyItemsProps[ThemeType]
     with JustifyContentProps[ThemeType]
     with FlexWrapProps[ThemeType]
     with FlexDirectionProps[ThemeType]
     with FlexProps[ThemeType, FlexProperty[TLengthStyledSystem]]
     with FlexGrowProps[ThemeType]
     with FlexShrinkProps[ThemeType]
     with FlexBasisProps[ThemeType, FlexBasisProperty[TLengthStyledSystem]]
     with JustifySelfProps[ThemeType]
     with AlignSelfProps[ThemeType]
     with OrderProps[ThemeType]

object FlexboxProps {
  @scala.inline
  def apply[ThemeType](): FlexboxProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexboxProps[ThemeType]]
  }
}

