package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.AlignContentProperty
import typingsSlinky.csstype.mod.AlignItemsProperty
import typingsSlinky.csstype.mod.AlignSelfProperty
import typingsSlinky.csstype.mod.FlexBasisProperty
import typingsSlinky.csstype.mod.FlexDirectionProperty
import typingsSlinky.csstype.mod.FlexProperty
import typingsSlinky.csstype.mod.FlexWrapProperty
import typingsSlinky.csstype.mod.GlobalsNumber
import typingsSlinky.csstype.mod.JustifyContentProperty
import typingsSlinky.csstype.mod.JustifyItemsProperty
import typingsSlinky.csstype.mod.JustifySelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    alignContent: ResponsiveValue[AlignContentProperty, ThemeType] = null,
    alignItems: ResponsiveValue[AlignItemsProperty, ThemeType] = null,
    alignSelf: ResponsiveValue[AlignSelfProperty, ThemeType] = null,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem], ThemeType] = null,
    flexBasis: ResponsiveValue[FlexBasisProperty[TLengthStyledSystem], ThemeType] = null,
    flexDirection: ResponsiveValue[FlexDirectionProperty, ThemeType] = null,
    flexGrow: ResponsiveValue[GlobalsNumber, ThemeType] = null,
    flexShrink: ResponsiveValue[GlobalsNumber, ThemeType] = null,
    flexWrap: ResponsiveValue[FlexWrapProperty, ThemeType] = null,
    justifyContent: ResponsiveValue[JustifyContentProperty, ThemeType] = null,
    justifyItems: ResponsiveValue[JustifyItemsProperty, ThemeType] = null,
    justifySelf: ResponsiveValue[JustifySelfProperty, ThemeType] = null,
    order: ResponsiveValue[GlobalsNumber, ThemeType] = null
  ): FlexboxProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexboxProps[ThemeType]]
  }
}

