package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.metadataUniqueMetadataMod.UniqueMetadata
import typingsSlinky.typeorm.optionsTableUniqueOptionsMod.TableUniqueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableUnique")
@js.native
class TableUnique protected ()
  extends typingsSlinky.typeorm.tableTableUniqueMod.TableUnique {
  def this(options: TableUniqueOptions) = this()
}
/* static members */
@JSImport("typeorm", "TableUnique")
@js.native
object TableUnique extends js.Object {
  
  /**
    * Creates unique from the unique metadata object.
    */
  def create(uniqueMetadata: UniqueMetadata): typingsSlinky.typeorm.tableTableUniqueMod.TableUnique = js.native
}
