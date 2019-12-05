package typingsSlinky.atXstyledSystem.atXstyledSystemMod

import typingsSlinky.csstype.csstypeMod.DisplayProperty
import typingsSlinky.csstype.csstypeMod.HeightProperty
import typingsSlinky.csstype.csstypeMod.MaxHeightProperty
import typingsSlinky.csstype.csstypeMod.MaxWidthProperty
import typingsSlinky.csstype.csstypeMod.MinHeightProperty
import typingsSlinky.csstype.csstypeMod.MinWidthProperty
import typingsSlinky.csstype.csstypeMod.VerticalAlignProperty
import typingsSlinky.csstype.csstypeMod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProps
  extends DisplayProps
     with WidthProps[StyledSystemLength]
     with HeightProps[StyledSystemLength]
     with MaxWidthProps[StyledSystemLength]
     with MaxHeightProps[StyledSystemLength]
     with MinWidthProps[StyledSystemLength]
     with MinHeightProps[StyledSystemLength]
     with SizeProps[StyledSystemLength]
     with VerticalAlignProps[StyledSystemLength]

object LayoutProps {
  @scala.inline
  def apply(
    display: ResponsiveValue[DisplayProperty] = null,
    height: ResponsiveValue[HeightProperty[StyledSystemLength]] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[StyledSystemLength]] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[StyledSystemLength]] = null,
    minHeight: ResponsiveValue[MinHeightProperty[StyledSystemLength]] = null,
    minWidth: ResponsiveValue[MinWidthProperty[StyledSystemLength]] = null,
    size: ResponsiveValue[HeightProperty[StyledSystemLength]] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[StyledSystemLength]] = null,
    width: ResponsiveValue[WidthProperty[StyledSystemLength]] = null
  ): LayoutProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutProps]
  }
}

