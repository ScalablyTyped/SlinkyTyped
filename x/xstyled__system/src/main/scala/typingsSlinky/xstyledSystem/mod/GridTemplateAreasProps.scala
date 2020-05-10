package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridTemplateAreasProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateAreasProps extends js.Object {
  val gridTemplateAreas: js.UndefOr[ResponsiveValue[GridTemplateAreasProperty]] = js.native
}

object GridTemplateAreasProps {
  @scala.inline
  def apply(): GridTemplateAreasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps]
  }
  @scala.inline
  implicit class GridTemplateAreasPropsOps[Self <: GridTemplateAreasProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridTemplateAreas(value: ResponsiveValue[GridTemplateAreasProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateAreas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(js.undefined)
        ret
    }
  }
  
}

