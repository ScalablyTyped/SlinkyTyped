package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedTypeReferenceDirectiveWithFailedLookupLocations extends js.Object {
  val failedLookupLocations: js.Array[java.lang.String]
  val resolvedTypeReferenceDirective: js.UndefOr[ResolvedTypeReferenceDirective] = js.undefined
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedLookupLocations(value: js.Array[java.lang.String]): Self = this.set("failedLookupLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedTypeReferenceDirective(value: ResolvedTypeReferenceDirective): Self = this.set("resolvedTypeReferenceDirective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedTypeReferenceDirective: Self = this.set("resolvedTypeReferenceDirective", js.undefined)
  }
  
}

