package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a completed package update request for the current app. */
@js.native
trait StorePackageUpdateResult extends js.Object {
  /** Gets the state of the completed package update request. */
  var overallState: StorePackageUpdateState = js.native
  /** Gets info about the status of each of the package updates that are associated with the completed request. */
  var storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus] = js.native
}

object StorePackageUpdateResult {
  @scala.inline
  def apply(
    overallState: StorePackageUpdateState,
    storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus]
  ): StorePackageUpdateResult = {
    val __obj = js.Dynamic.literal(overallState = overallState.asInstanceOf[js.Any], storePackageUpdateStatuses = storePackageUpdateStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdateResult]
  }
  @scala.inline
  implicit class StorePackageUpdateResultOps[Self <: StorePackageUpdateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverallState(value: StorePackageUpdateState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorePackageUpdateStatuses(value: IVectorView[StorePackageUpdateStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storePackageUpdateStatuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

