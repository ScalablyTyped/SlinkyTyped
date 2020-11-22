package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.metadataIndexMetadataMod.IndexMetadata
import typingsSlinky.typeorm.optionsTableIndexOptionsMod.TableIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableIndex")
@js.native
class TableIndex protected ()
  extends typingsSlinky.typeorm.tableTableIndexMod.TableIndex {
  def this(options: TableIndexOptions) = this()
}
/* static members */
@JSImport("typeorm", "TableIndex")
@js.native
object TableIndex extends js.Object {
  
  /**
    * Creates index from the index metadata object.
    */
  def create(indexMetadata: IndexMetadata): typingsSlinky.typeorm.tableTableIndexMod.TableIndex = js.native
}
