package typingsSlinky.storybookComponents.argsTableArgsTableMod

import typingsSlinky.storybookComponents.typesMod.ArgTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps
  - typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps
*/
trait ArgsTableProps extends js.Object
object ArgsTableProps {
  
  @scala.inline
  def ArgsTableRowProps(rows: ArgTypes): ArgsTableProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsTableProps]
  }
  
  @scala.inline
  def ArgsTableErrorProps(error: ArgsTableError): ArgsTableProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsTableProps]
  }
}
