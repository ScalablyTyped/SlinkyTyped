package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.checkMetadataMod.CheckMetadata
import typingsSlinky.typeorm.tableCheckOptionsMod.TableCheckOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableCheck")
@js.native
class TableCheck protected ()
  extends typingsSlinky.typeorm.tableCheckMod.TableCheck {
  def this(options: TableCheckOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "TableCheck")
@js.native
object TableCheck extends js.Object {
  
  /**
    * Creates checks from the check metadata object.
    */
  def create(checkMetadata: CheckMetadata): typingsSlinky.typeorm.tableCheckMod.TableCheck = js.native
}
