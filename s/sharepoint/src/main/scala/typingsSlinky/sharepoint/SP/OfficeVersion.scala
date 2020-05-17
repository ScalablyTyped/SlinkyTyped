package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfficeVersion extends js.Object {
  var assemblyVersion: String = js.native
  var majorBuildVersion: Double = js.native
  var majorVersion: String = js.native
  var majorVersionDotZero: String = js.native
  var previousMajorBuildVersion: Double = js.native
  var previousVersion: String = js.native
  var previousVersionDotZero: String = js.native
  var wssMajorVersion: String = js.native
}

object OfficeVersion {
  @scala.inline
  def apply(
    assemblyVersion: String,
    majorBuildVersion: Double,
    majorVersion: String,
    majorVersionDotZero: String,
    previousMajorBuildVersion: Double,
    previousVersion: String,
    previousVersionDotZero: String,
    wssMajorVersion: String
  ): OfficeVersion = {
    val __obj = js.Dynamic.literal(assemblyVersion = assemblyVersion.asInstanceOf[js.Any], majorBuildVersion = majorBuildVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], majorVersionDotZero = majorVersionDotZero.asInstanceOf[js.Any], previousMajorBuildVersion = previousMajorBuildVersion.asInstanceOf[js.Any], previousVersion = previousVersion.asInstanceOf[js.Any], previousVersionDotZero = previousVersionDotZero.asInstanceOf[js.Any], wssMajorVersion = wssMajorVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeVersion]
  }
  @scala.inline
  implicit class OfficeVersionOps[Self <: OfficeVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssemblyVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assemblyVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorBuildVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorBuildVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorVersionDotZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorVersionDotZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousMajorBuildVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMajorBuildVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousVersionDotZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousVersionDotZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWssMajorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wssMajorVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

