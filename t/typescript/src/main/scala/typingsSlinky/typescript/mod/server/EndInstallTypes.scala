package typingsSlinky.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndInstallTypes extends InstallTypes {
  val installSuccess: Boolean = js.native
  @JSName("kind")
  val kind_EndInstallTypes: EventEndInstallTypes = js.native
}

object EndInstallTypes {
  @scala.inline
  def apply(
    eventId: Double,
    installSuccess: Boolean,
    kind: EventEndInstallTypes,
    packagesToInstall: js.Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): EndInstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], installSuccess = installSuccess.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndInstallTypes]
  }
  @scala.inline
  implicit class EndInstallTypesOps[Self <: EndInstallTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: EventEndInstallTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

