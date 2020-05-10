package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedTypeReferenceDirective extends js.Object {
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.native
  var packageId: js.UndefOr[PackageId] = js.native
  var primary: Boolean = js.native
  var resolvedFileName: js.UndefOr[java.lang.String] = js.native
}

object ResolvedTypeReferenceDirective {
  @scala.inline
  def apply(primary: Boolean): ResolvedTypeReferenceDirective = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirective]
  }
  @scala.inline
  implicit class ResolvedTypeReferenceDirectiveOps[Self <: ResolvedTypeReferenceDirective] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withResolvedFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedFileName")(js.undefined)
        ret
    }
  }
  
}

