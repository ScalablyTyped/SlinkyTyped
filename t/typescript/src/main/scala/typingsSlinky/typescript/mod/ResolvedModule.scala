package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedModule extends js.Object {
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.native
  /** Path of the file the module was resolved to. */
  var resolvedFileName: java.lang.String = js.native
}

object ResolvedModule {
  @scala.inline
  def apply(resolvedFileName: java.lang.String): ResolvedModule = {
    val __obj = js.Dynamic.literal(resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
  @scala.inline
  implicit class ResolvedModuleOps[Self <: ResolvedModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolvedFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExternalLibraryImport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalLibraryImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExternalLibraryImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalLibraryImport")(js.undefined)
        ret
    }
  }
  
}

