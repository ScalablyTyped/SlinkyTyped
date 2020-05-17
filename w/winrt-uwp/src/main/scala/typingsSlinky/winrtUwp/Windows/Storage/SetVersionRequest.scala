package typingsSlinky.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app sets the version of the application data in its app data store. */
@js.native
trait SetVersionRequest extends js.Object {
  /** Gets the current version. */
  var currentVersion: Double = js.native
  /** Gets the requested version. */
  var desiredVersion: Double = js.native
  /**
    * Requests that the set version request be delayed.
    * @return The set version deferral.
    */
  def getDeferral(): SetVersionDeferral = js.native
}

object SetVersionRequest {
  @scala.inline
  def apply(currentVersion: Double, desiredVersion: Double, getDeferral: () => SetVersionDeferral): SetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SetVersionRequest]
  }
  @scala.inline
  implicit class SetVersionRequestOps[Self <: SetVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => SetVersionDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

