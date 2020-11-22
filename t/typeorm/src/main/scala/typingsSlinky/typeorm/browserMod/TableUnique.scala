package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.tableUniqueOptionsMod.TableUniqueOptions
import typingsSlinky.typeorm.uniqueMetadataMod.UniqueMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableUnique")
@js.native
class TableUnique protected ()
  extends typingsSlinky.typeorm.tableUniqueMod.TableUnique {
  def this(options: TableUniqueOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "TableUnique")
@js.native
object TableUnique extends js.Object {
  
  /**
    * Creates unique from the unique metadata object.
    */
  def create(uniqueMetadata: UniqueMetadata): typingsSlinky.typeorm.tableUniqueMod.TableUnique = js.native
}
