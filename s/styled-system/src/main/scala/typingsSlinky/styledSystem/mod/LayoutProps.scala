package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.HeightProperty
import typingsSlinky.csstype.mod.MaxHeightProperty
import typingsSlinky.csstype.mod.MaxWidthProperty
import typingsSlinky.csstype.mod.MinHeightProperty
import typingsSlinky.csstype.mod.MinWidthProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.csstype.mod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends WidthProps[ThemeType, WidthProperty[TLengthStyledSystem]]
     with HeightProps[ThemeType, HeightProperty[TLengthStyledSystem]]
     with MinWidthProps[ThemeType, MinWidthProperty[TLengthStyledSystem]]
     with MinHeightProps[ThemeType, MinHeightProperty[TLengthStyledSystem]]
     with MaxWidthProps[ThemeType, MaxWidthProperty[TLengthStyledSystem]]
     with MaxHeightProps[ThemeType, MaxHeightProperty[TLengthStyledSystem]]
     with DisplayProps[ThemeType]
     with VerticalAlignProps[ThemeType, VerticalAlignProperty[TLengthStyledSystem]]
     with SizeProps[ThemeType, HeightProperty[TLengthStyledSystem]]
     with OverflowProps[ThemeType]

object LayoutProps {
  @scala.inline
  def apply[ThemeType](): LayoutProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps[ThemeType]]
  }
}

