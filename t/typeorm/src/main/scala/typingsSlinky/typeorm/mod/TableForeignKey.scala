package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.metadataForeignKeyMetadataMod.ForeignKeyMetadata
import typingsSlinky.typeorm.optionsTableForeignKeyOptionsMod.TableForeignKeyOptions
import org.scalablytyped.runtime.StObject
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
object TableForeignKey {
  
  /**
    * Creates a new table foreign key from the given foreign key metadata.
    */
  @JSImport("typeorm", "TableForeignKey.create")
  @js.native
  def create(metadata: ForeignKeyMetadata): typingsSlinky.typeorm.tableTableForeignKeyMod.TableForeignKey = js.native
}
