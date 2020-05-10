package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedModuleFull extends ResolvedModule {
  /**
    * Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
    * This is optional for backwards-compatibility, but will be added if not provided.
    */
  var extension: Extension = js.native
  var packageId: js.UndefOr[PackageId] = js.native
}

object ResolvedModuleFull {
  @scala.inline
  def apply(extension: Extension, resolvedFileName: java.lang.String): ResolvedModuleFull = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModuleFull]
  }
  @scala.inline
  implicit class ResolvedModuleFullOps[Self <: ResolvedModuleFull] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: Extension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageId(value: PackageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(js.undefined)
        ret
    }
  }
  
}

