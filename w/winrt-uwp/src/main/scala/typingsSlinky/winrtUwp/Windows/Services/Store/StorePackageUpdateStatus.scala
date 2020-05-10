package typingsSlinky.winrtUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides status info for a package that is associated with a download or installation request. */
@js.native
trait StorePackageUpdateStatus extends js.Object {
  /** The number of bytes that have been downloaded. */
  var packageBytesDownloaded: Double = js.native
  /** The download (or download and install) progress of the current package, represented by a value from 0.0 to 1.0. When you use RequestDownloadStorePackageUpdatesAsync to download packages, this value increases from 0.0 to 1.0 during the download of each package. When you use RequestDownloadAndInstallStorePackageUpdatesAsync to download and install packages in a single operation, this value increases from 0.0 to 0.8 during the download of each package, and then it increases from 0.8 to 1.0 during the install phase. */
  var packageDownloadProgress: Double = js.native
  /** The size of the package that is being downloaded, in bytes. This is an estimate, and it might change during the download process. */
  var packageDownloadSizeInBytes: Double = js.native
  /** The family name of the package that is being downloaded or installed. */
  var packageFamilyName: String = js.native
  /** A StorePackageUpdateState value that indicates the state of the package that is being downloaded or installed. */
  var packageUpdateState: StorePackageUpdateState = js.native
  /** The current progress of all package downloads in the request, represented by a value from 0.0 to 1.0. */
  var totalDownloadProgress: Double = js.native
}

object StorePackageUpdateStatus {
  @scala.inline
  def apply(
    packageBytesDownloaded: Double,
    packageDownloadProgress: Double,
    packageDownloadSizeInBytes: Double,
    packageFamilyName: String,
    packageUpdateState: StorePackageUpdateState,
    totalDownloadProgress: Double
  ): StorePackageUpdateStatus = {
    val __obj = js.Dynamic.literal(packageBytesDownloaded = packageBytesDownloaded.asInstanceOf[js.Any], packageDownloadProgress = packageDownloadProgress.asInstanceOf[js.Any], packageDownloadSizeInBytes = packageDownloadSizeInBytes.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any], packageUpdateState = packageUpdateState.asInstanceOf[js.Any], totalDownloadProgress = totalDownloadProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdateStatus]
  }
  @scala.inline
  implicit class StorePackageUpdateStatusOps[Self <: StorePackageUpdateStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackageBytesDownloaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageBytesDownloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageDownloadProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageDownloadProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageDownloadSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageDownloadSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageUpdateState(value: StorePackageUpdateState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageUpdateState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalDownloadProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDownloadProgress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

