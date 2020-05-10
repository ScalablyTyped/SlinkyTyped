package typingsSlinky.storybookComponents.propsTableMod

import typingsSlinky.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookComponents.propsTableMod.PropsTableRowsProps
  - typingsSlinky.storybookComponents.propsTableMod.PropsTableSectionsProps
  - typingsSlinky.storybookComponents.propsTableMod.PropsTableErrorProps
*/
trait PropsTableProps extends js.Object

object PropsTableProps {
  @scala.inline
  def PropsTableRowsProps(rows: js.Array[PropDef]): PropsTableProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTableProps]
  }
  @scala.inline
  def PropsTableSectionsProps(): PropsTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsTableProps]
  }
  @scala.inline
  def PropsTableErrorProps(error: PropsTableError): PropsTableProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTableProps]
  }
}

