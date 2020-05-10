package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GridTemplateAreasProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateAreasProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-template-areas CSS property specifies named grid areas.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas)
    */
  var gridTemplateAreas: js.UndefOr[ResponsiveValue[GridTemplateAreasProperty, ThemeType]] = js.native
}

object GridTemplateAreasProps {
  @scala.inline
  def apply[ThemeType](): GridTemplateAreasProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps[ThemeType]]
  }
  @scala.inline
  implicit class GridTemplateAreasPropsOps[Self[themetype] <: GridTemplateAreasProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withGridTemplateAreas(value: ResponsiveValue[GridTemplateAreasProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateAreas: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateAreasNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(null)
        ret
    }
  }
  
}

