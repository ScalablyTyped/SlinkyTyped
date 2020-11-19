package typingsSlinky.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportStage extends js.Object
/** Specifies the stages of the photo import process. */
@JSGlobal("Windows.Media.Import.PhotoImportStage")
@js.native
object PhotoImportStage extends js.Object {
  
  /** Imported items are currently being deleted from the source. */
  @js.native
  sealed trait deletingImportedItemsFromSource extends PhotoImportStage
  
  /** Items are currently being found. */
  @js.native
  sealed trait findingItems extends PhotoImportStage
  
  /** Items are currently being imported */
  @js.native
  sealed trait importingItems extends PhotoImportStage
  
  /** The photo import process has not started. */
  @js.native
  sealed trait notStarted extends PhotoImportStage
}
