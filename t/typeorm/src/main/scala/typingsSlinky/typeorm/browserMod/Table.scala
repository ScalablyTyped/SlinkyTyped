package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.tableOptionsMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Table")
@js.native
class Table ()
  extends typingsSlinky.typeorm.tableMod.Table {
  def this(options: TableOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "Table")
@js.native
object Table extends js.Object {
  
  /**
    * Creates table from a given entity metadata.
    */
  def create(entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata, driver: Driver): typingsSlinky.typeorm.tableMod.Table = js.native
}
