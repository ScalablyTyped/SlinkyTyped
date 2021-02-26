package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.tableOptionsMod.TableOptions
import org.scalablytyped.runtime.StObject
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
object Table {
  
  /**
    * Creates table from a given entity metadata.
    */
  @JSImport("typeorm/browser", "Table.create")
  @js.native
  def create(entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata, driver: Driver): typingsSlinky.typeorm.tableMod.Table = js.native
}
