package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.columnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.columnTypesMod.ColumnType
import typingsSlinky.typeorm.databaseTypeMod.DatabaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/DataTypeNotSupportedError", JSImport.Namespace)
@js.native
object dataTypeNotSupportedErrorMod extends js.Object {
  
  @js.native
  class DataTypeNotSupportedError protected () extends Error {
    def this(column: ColumnMetadata, dataType: ColumnType) = this()
    def this(column: ColumnMetadata, dataType: ColumnType, database: DatabaseType) = this()
  }
}
