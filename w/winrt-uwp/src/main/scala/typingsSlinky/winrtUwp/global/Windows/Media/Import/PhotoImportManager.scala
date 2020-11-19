package typingsSlinky.winrtUwp.global.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for determining if photo import is supported on the current device, finding sources from which to import photos, and getting references to any pending photo import operations. */
@JSGlobal("Windows.Media.Import.PhotoImportManager")
@js.native
abstract class PhotoImportManager ()
  extends typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportManager
/* static members */
@JSGlobal("Windows.Media.Import.PhotoImportManager")
@js.native
object PhotoImportManager extends js.Object {
  
  /**
    * Finds all currently available sources from which photos can be imported.
    * @return An asynchronous operation that returns a list of available sources on successful completion.
    */
  def findAllSourcesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets the list of all pending photo import operations.
    * @return The list of all pending photo operations.
    */
  def getPendingOperations(): IVectorView[typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportOperation] = js.native
  
  /**
    * Gets a value indicating if photo import is supported on the current device.
    * @return An asynchronous operation that returns true if photo import is supported. Otherwise, returns false.
    */
  def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}
