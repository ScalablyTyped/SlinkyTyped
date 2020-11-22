package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.typesColumnTypesMod.ColumnType
import typingsSlinky.typeorm.typesDatabaseTypeMod.DatabaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/DataTypeNotSupportedError", JSImport.Namespace)
@js.native
object errorDataTypeNotSupportedErrorMod extends js.Object {
  
  @js.native
  class DataTypeNotSupportedError protected () extends Error {
    def this(column: ColumnMetadata, dataType: ColumnType) = this()
    def this(column: ColumnMetadata, dataType: ColumnType, database: DatabaseType) = this()
  }
}
