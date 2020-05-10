package typingsSlinky.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageInstalledResponse extends ProjectResponse {
  @JSName("kind")
  val kind_PackageInstalledResponse: ActionPackageInstalled = js.native
  val message: String = js.native
  val success: Boolean = js.native
}

object PackageInstalledResponse {
  @scala.inline
  def apply(kind: ActionPackageInstalled, message: String, projectName: String, success: Boolean): PackageInstalledResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInstalledResponse]
  }
  @scala.inline
  implicit class PackageInstalledResponseOps[Self <: PackageInstalledResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: ActionPackageInstalled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

