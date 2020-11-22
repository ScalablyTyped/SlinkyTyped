package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.metadataExclusionMetadataMod.ExclusionMetadata
import typingsSlinky.typeorm.optionsTableExclusionOptionsMod.TableExclusionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "TableExclusion")
@js.native
class TableExclusion protected ()
  extends typingsSlinky.typeorm.tableTableExclusionMod.TableExclusion {
  def this(options: TableExclusionOptions) = this()
}
/* static members */
@JSImport("typeorm", "TableExclusion")
@js.native
object TableExclusion extends js.Object {
  
  /**
    * Creates exclusions from the exclusion metadata object.
    */
  def create(exclusionMetadata: ExclusionMetadata): typingsSlinky.typeorm.tableTableExclusionMod.TableExclusion = js.native
}
