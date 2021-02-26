package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.indexMetadataMod.IndexMetadata
import typingsSlinky.typeorm.tableIndexOptionsMod.TableIndexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableIndex")
@js.native
class TableIndex protected ()
  extends typingsSlinky.typeorm.tableIndexMod.TableIndex {
  def this(options: TableIndexOptions) = this()
}
/* static members */
object TableIndex {
  
  /**
    * Creates index from the index metadata object.
    */
  @JSImport("typeorm/browser", "TableIndex.create")
  @js.native
  def create(indexMetadata: IndexMetadata): typingsSlinky.typeorm.tableIndexMod.TableIndex = js.native
}
