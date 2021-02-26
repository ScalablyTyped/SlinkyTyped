package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.checkMetadataMod.CheckMetadata
import typingsSlinky.typeorm.tableCheckOptionsMod.TableCheckOptions
import org.scalablytyped.runtime.StObject
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
object TableCheck {
  
  /**
    * Creates checks from the check metadata object.
    */
  @JSImport("typeorm/browser", "TableCheck.create")
  @js.native
  def create(checkMetadata: CheckMetadata): typingsSlinky.typeorm.tableCheckMod.TableCheck = js.native
}
