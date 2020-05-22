package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGapProps[TLength] extends js.Object {
  val gridGap: js.UndefOr[ResponsiveValue[GridGapProperty[TLength]]] = js.undefined
}

object GridGapProps {
  @scala.inline
  def apply[TLength](gridGap: ResponsiveValue[GridGapProperty[TLength]] = null): GridGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridGapProps[TLength]]
  }
}

