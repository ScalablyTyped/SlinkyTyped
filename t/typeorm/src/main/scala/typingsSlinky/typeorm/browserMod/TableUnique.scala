package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.tableUniqueOptionsMod.TableUniqueOptions
import typingsSlinky.typeorm.uniqueMetadataMod.UniqueMetadata
import org.scalablytyped.runtime.StObject
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
object TableUnique {
  
  /**
    * Creates unique from the unique metadata object.
    */
  @JSImport("typeorm/browser", "TableUnique.create")
  @js.native
  def create(uniqueMetadata: UniqueMetadata): typingsSlinky.typeorm.tableUniqueMod.TableUnique = js.native
}
