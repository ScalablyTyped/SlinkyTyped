package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.metadataForeignKeyMetadataMod.ForeignKeyMetadata
import typingsSlinky.typeorm.optionsTableForeignKeyOptionsMod.TableForeignKeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableForeignKey")
@js.native
class TableForeignKey protected ()
  extends typingsSlinky.typeorm.tableTableForeignKeyMod.TableForeignKey {
  def this(options: TableForeignKeyOptions) = this()
}
/* static members */
@JSImport("typeorm", "TableForeignKey")
@js.native
object TableForeignKey extends js.Object {
  
  /**
    * Creates a new table foreign key from the given foreign key metadata.
    */
  def create(metadata: ForeignKeyMetadata): typingsSlinky.typeorm.tableTableForeignKeyMod.TableForeignKey = js.native
}
