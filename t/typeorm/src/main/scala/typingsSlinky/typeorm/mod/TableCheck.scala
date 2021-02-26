package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.metadataCheckMetadataMod.CheckMetadata
import typingsSlinky.typeorm.optionsTableCheckOptionsMod.TableCheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableCheck")
@js.native
class TableCheck protected ()
  extends typingsSlinky.typeorm.tableTableCheckMod.TableCheck {
  def this(options: TableCheckOptions) = this()
}
/* static members */
object TableCheck {
  
  /**
    * Creates checks from the check metadata object.
    */
  @JSImport("typeorm", "TableCheck.create")
  @js.native
  def create(checkMetadata: CheckMetadata): typingsSlinky.typeorm.tableTableCheckMod.TableCheck = js.native
}
