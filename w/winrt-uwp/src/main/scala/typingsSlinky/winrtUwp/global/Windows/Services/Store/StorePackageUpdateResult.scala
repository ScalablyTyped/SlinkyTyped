package typingsSlinky.winrtUwp.global.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a completed package update request for the current app. */
@JSGlobal("Windows.Services.Store.StorePackageUpdateResult")
@js.native
abstract class StorePackageUpdateResult ()
  extends typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateResult {
  /** Gets the state of the completed package update request. */
  /* CompleteClass */
  override var overallState: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState = js.native
  /** Gets info about the status of each of the package updates that are associated with the completed request. */
  /* CompleteClass */
  override var storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus] = js.native
}

