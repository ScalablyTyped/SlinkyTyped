package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GridAutoColumnsProperty
import typingsSlinky.csstype.mod.GridAutoRowsProperty
import typingsSlinky.csstype.mod.GridColumnGapProperty
import typingsSlinky.csstype.mod.GridGapProperty
import typingsSlinky.csstype.mod.GridRowGapProperty
import typingsSlinky.csstype.mod.GridTemplateColumnsProperty
import typingsSlinky.csstype.mod.GridTemplateRowsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends GridGapProps[ThemeType, GridGapProperty[TLengthStyledSystem]]
     with GridColumnGapProps[ThemeType, GridColumnGapProperty[TLengthStyledSystem]]
     with GridRowGapProps[ThemeType, GridRowGapProperty[TLengthStyledSystem]]
     with GridColumnProps[ThemeType]
     with GridRowProps[ThemeType]
     with GridAutoFlowProps[ThemeType]
     with GridAutoColumnsProps[ThemeType, GridAutoColumnsProperty[TLengthStyledSystem]]
     with GridAutoRowsProps[ThemeType, GridAutoRowsProperty[TLengthStyledSystem]]
     with GridTemplateColumnsProps[ThemeType, GridTemplateColumnsProperty[TLengthStyledSystem]]
     with GridTemplateRowsProps[ThemeType, GridTemplateRowsProperty[TLengthStyledSystem]]
     with GridTemplateAreasProps[ThemeType]
     with GridAreaProps[ThemeType]

object GridProps {
  @scala.inline
  def apply[ThemeType](): GridProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[ThemeType]]
  }
}

