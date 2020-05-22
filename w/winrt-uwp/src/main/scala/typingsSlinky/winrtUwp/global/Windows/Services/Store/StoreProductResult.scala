package typingsSlinky.winrtUwp.global.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about the current app. */
@JSGlobal("Windows.Services.Store.StoreProductResult")
@js.native
abstract class StoreProductResult ()
  extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreProductResult {
  /** Gets the error code for the request, if the operation encountered an error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
  /** Gets info about the current app. */
  /* CompleteClass */
  override var product: typingsSlinky.winrtUwp.Windows.Services.Store.StoreProduct = js.native
}

