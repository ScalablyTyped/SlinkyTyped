package typingsSlinky.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the status of the package. */
@js.native
trait PackageStatus extends js.Object {
  /** Indicates whether the data for the package is offline. */
  var dataOffline: Boolean = js.native
  /** Indicates whether this package depends on a package that can't be used. */
  var dependencyIssue: Boolean = js.native
  /** Indicates whether the package is being serviced. */
  var deploymentInProgress: Boolean = js.native
  /** Indicates whether the package has been disabled. */
  var disabled: Boolean = js.native
  /** Indicates whether there is a problem with the license for this package. */
  var licenseIssue: Boolean = js.native
  /** Indicates whether the package is missing files, system information, etc. */
  var modified: Boolean = js.native
  /** Indicates whether the package is unusable. */
  var needsRemediation: Boolean = js.native
  /** Indicates whether the package is available. */
  var notAvailable: Boolean = js.native
  /** Indicates whether the package is offline and cannot be used. */
  var packageOffline: Boolean = js.native
  /** Indicates whether the package is being serviced. */
  var servicing: Boolean = js.native
  /** Indicates whether the package may have been tampered with. */
  var tampered: Boolean = js.native
  /**
    * Indicates whether the package is in good condition and may be used.
    * @return TRUE indicates that the package is in good condition; otherwise FALSE.
    */
  def verifyIsOK(): Boolean = js.native
}

object PackageStatus {
  @scala.inline
  def apply(
    dataOffline: Boolean,
    dependencyIssue: Boolean,
    deploymentInProgress: Boolean,
    disabled: Boolean,
    licenseIssue: Boolean,
    modified: Boolean,
    needsRemediation: Boolean,
    notAvailable: Boolean,
    packageOffline: Boolean,
    servicing: Boolean,
    tampered: Boolean,
    verifyIsOK: () => Boolean
  ): PackageStatus = {
    val __obj = js.Dynamic.literal(dataOffline = dataOffline.asInstanceOf[js.Any], dependencyIssue = dependencyIssue.asInstanceOf[js.Any], deploymentInProgress = deploymentInProgress.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], licenseIssue = licenseIssue.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], needsRemediation = needsRemediation.asInstanceOf[js.Any], notAvailable = notAvailable.asInstanceOf[js.Any], packageOffline = packageOffline.asInstanceOf[js.Any], servicing = servicing.asInstanceOf[js.Any], tampered = tampered.asInstanceOf[js.Any], verifyIsOK = js.Any.fromFunction0(verifyIsOK))
    __obj.asInstanceOf[PackageStatus]
  }
  @scala.inline
  implicit class PackageStatusOps[Self <: PackageStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyIssue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentInProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseIssue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsRemediation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsRemediation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServicing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTampered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tampered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifyIsOK(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyIsOK")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

