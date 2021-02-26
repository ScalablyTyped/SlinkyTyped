package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.exclusionMetadataMod.ExclusionMetadata
import typingsSlinky.typeorm.tableExclusionOptionsMod.TableExclusionOptions
import org.scalablytyped.runtime.StObject
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
object TableExclusion {
  
  /**
    * Creates exclusions from the exclusion metadata object.
    */
  @JSImport("typeorm/browser", "TableExclusion.create")
  @js.native
  def create(exclusionMetadata: ExclusionMetadata): typingsSlinky.typeorm.tableExclusionMod.TableExclusion = js.native
}
