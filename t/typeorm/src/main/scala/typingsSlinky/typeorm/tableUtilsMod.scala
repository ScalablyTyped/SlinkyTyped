package typingsSlinky.typeorm

import typingsSlinky.typeorm.columnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.tableColumnOptionsMod.TableColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/schema-builder/util/TableUtils", JSImport.Namespace)
@js.native
object tableUtilsMod extends js.Object {
  
  @js.native
  class TableUtils () extends js.Object
  /* static members */
  @js.native
  object TableUtils extends js.Object {
    
    def createTableColumnOptions(columnMetadata: ColumnMetadata, driver: Driver): TableColumnOptions = js.native
  }
}
