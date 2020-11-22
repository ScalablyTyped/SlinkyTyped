package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.driverDriverMod.Driver
import typingsSlinky.typeorm.optionsTableOptionsMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Table")
@js.native
class Table ()
  extends typingsSlinky.typeorm.tableTableMod.Table {
  def this(options: TableOptions) = this()
}
/* static members */
@JSImport("typeorm", "Table")
@js.native
object Table extends js.Object {
  
  /**
    * Creates table from a given entity metadata.
    */
  def create(entityMetadata: typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata, driver: Driver): typingsSlinky.typeorm.tableTableMod.Table = js.native
}
