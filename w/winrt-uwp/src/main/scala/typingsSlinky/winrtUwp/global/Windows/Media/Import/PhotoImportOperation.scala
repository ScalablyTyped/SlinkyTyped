package typingsSlinky.winrtUwp.global.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an in-progress photo import operation. */
@JSGlobal("Windows.Media.Import.PhotoImportOperation")
@js.native
abstract class PhotoImportOperation ()
  extends typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportOperation {
  /** Causes in-progress delete from source operations to continue. */
  /* CompleteClass */
  override var continueDeletingImportedItemsFromSourceAsync: IAsyncOperationWithProgress[
    typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult, 
    Double
  ] = js.native
  /** Causes in-progress find operations to continue. */
  /* CompleteClass */
  override var continueFindingItemsAsync: IAsyncOperationWithProgress[typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult, Double] = js.native
  /** Causes in-progress import items operations to continue. */
  /* CompleteClass */
  override var continueImportingItemsAsync: IAsyncOperationWithProgress[
    typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult, 
    PhotoImportProgress
  ] = js.native
  /** Gets the photo import session associated with the operation. */
  /* CompleteClass */
  override var session: typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
  /** Gets the current stage of the in-progress operation. */
  /* CompleteClass */
  override var stage: typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportStage = js.native
}

