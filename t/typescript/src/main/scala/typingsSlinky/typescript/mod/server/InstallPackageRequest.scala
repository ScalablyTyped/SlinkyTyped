package typingsSlinky.typescript.mod.server

import typingsSlinky.typescript.mod.Path
import typingsSlinky.typescript.typescriptStrings.installPackage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallPackageRequest extends TypingInstallerRequestWithProjectName {
  val fileName: Path = js.native
  val kind: installPackage = js.native
  val packageName: String = js.native
  val projectRootPath: Path = js.native
}

object InstallPackageRequest {
  @scala.inline
  def apply(
    fileName: Path,
    kind: installPackage,
    packageName: String,
    projectName: String,
    projectRootPath: Path
  ): InstallPackageRequest = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPackageRequest]
  }
  @scala.inline
  implicit class InstallPackageRequestOps[Self <: InstallPackageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: installPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectRootPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectRootPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

