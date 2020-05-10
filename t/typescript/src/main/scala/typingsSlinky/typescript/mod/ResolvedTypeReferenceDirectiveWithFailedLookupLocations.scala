package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedTypeReferenceDirectiveWithFailedLookupLocations extends js.Object {
  val failedLookupLocations: js.Array[java.lang.String] = js.native
  val resolvedTypeReferenceDirective: js.UndefOr[ResolvedTypeReferenceDirective] = js.native
}

object ResolvedTypeReferenceDirectiveWithFailedLookupLocations {
  @scala.inline
  def apply(failedLookupLocations: js.Array[java.lang.String]): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal(failedLookupLocations = failedLookupLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
  }
  @scala.inline
  implicit class ResolvedTypeReferenceDirectiveWithFailedLookupLocationsOps[Self <: ResolvedTypeReferenceDirectiveWithFailedLookupLocations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedLookupLocations(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedLookupLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedTypeReferenceDirective(value: ResolvedTypeReferenceDirective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedTypeReferenceDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedTypeReferenceDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedTypeReferenceDirective")(js.undefined)
        ret
    }
  }
  
}

