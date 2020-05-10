package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedModuleWithFailedLookupLocations extends js.Object {
  val resolvedModule: js.UndefOr[ResolvedModuleFull] = js.native
}

object ResolvedModuleWithFailedLookupLocations {
  @scala.inline
  def apply(): ResolvedModuleWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedModuleWithFailedLookupLocations]
  }
  @scala.inline
  implicit class ResolvedModuleWithFailedLookupLocationsOps[Self <: ResolvedModuleWithFailedLookupLocations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolvedModule(value: ResolvedModuleFull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedModule")(js.undefined)
        ret
    }
  }
  
}

