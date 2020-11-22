package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.metadataCheckMetadataMod.CheckMetadata
import typingsSlinky.typeorm.optionsTableCheckOptionsMod.TableCheckOptions
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
@JSImport("typeorm", "TableCheck")
@js.native
object TableCheck extends js.Object {
  
  /**
    * Creates checks from the check metadata object.
    */
  def create(checkMetadata: CheckMetadata): typingsSlinky.typeorm.tableTableCheckMod.TableCheck = js.native
}
