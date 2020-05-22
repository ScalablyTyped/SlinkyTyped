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
  def apply[ThemeType](
    alignContent: js.UndefOr[Null | (ResponsiveValue[AlignContentProperty, ThemeType])] = js.undefined,
    alignItems: js.UndefOr[Null | (ResponsiveValue[AlignItemsProperty, ThemeType])] = js.undefined,
    alignSelf: js.UndefOr[Null | (ResponsiveValue[AlignSelfProperty, ThemeType])] = js.undefined,
    flex: js.UndefOr[Null | (ResponsiveValue[FlexProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    flexBasis: js.UndefOr[Null | (ResponsiveValue[FlexBasisProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    flexDirection: js.UndefOr[Null | (ResponsiveValue[FlexDirectionProperty, ThemeType])] = js.undefined,
    flexGrow: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, ThemeType])] = js.undefined,
    flexShrink: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, ThemeType])] = js.undefined,
    flexWrap: js.UndefOr[Null | (ResponsiveValue[FlexWrapProperty, ThemeType])] = js.undefined,
    justifyContent: js.UndefOr[Null | (ResponsiveValue[JustifyContentProperty, ThemeType])] = js.undefined,
    justifyItems: js.UndefOr[Null | (ResponsiveValue[JustifyItemsProperty, ThemeType])] = js.undefined,
    justifySelf: js.UndefOr[Null | (ResponsiveValue[JustifySelfProperty, ThemeType])] = js.undefined,
    order: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, ThemeType])] = js.undefined
  ): FlexboxProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignContent)) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (!js.isUndefined(alignItems)) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (!js.isUndefined(alignSelf)) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(flexBasis)) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (!js.isUndefined(flexDirection)) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(flexGrow)) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (!js.isUndefined(flexShrink)) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (!js.isUndefined(flexWrap)) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(justifyContent)) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(justifyItems)) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (!js.isUndefined(justifySelf)) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexboxProps[ThemeType]]
  }
}

