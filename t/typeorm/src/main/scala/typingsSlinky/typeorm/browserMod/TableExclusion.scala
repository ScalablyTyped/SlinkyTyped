package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.exclusionMetadataMod.ExclusionMetadata
import typingsSlinky.typeorm.tableExclusionOptionsMod.TableExclusionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "TableExclusion")
@js.native
class TableExclusion protected ()
  extends typingsSlinky.typeorm.tableExclusionMod.TableExclusion {
  def this(options: TableExclusionOptions) = this()
}
/* static members */
@JSImport("typeorm/browser", "TableExclusion")
@js.native
object TableExclusion extends js.Object {
  
  /**
    * Creates exclusions from the exclusion metadata object.
    */
  def create(exclusionMetadata: ExclusionMetadata): typingsSlinky.typeorm.tableExclusionMod.TableExclusion = js.native
}
