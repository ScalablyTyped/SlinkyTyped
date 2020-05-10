package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.AlignItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS align-items property sets the align-self value on all direct children as a group. The align-self
    * property sets the alignment of an item within its containing block.
    *
    * In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment
    * of items on the Block Axis within their grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-items)
    */
  var alignItems: js.UndefOr[ResponsiveValue[AlignItemsProperty, ThemeType]] = js.native
}

object AlignItemsProps {
  @scala.inline
  def apply[ThemeType](): AlignItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemsProps[ThemeType]]
  }
  @scala.inline
  implicit class AlignItemsPropsOps[Self[themetype] <: AlignItemsProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withAlignItems(value: ResponsiveValue[AlignItemsProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItems: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignItemsNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(null)
        ret
    }
  }
  
}

