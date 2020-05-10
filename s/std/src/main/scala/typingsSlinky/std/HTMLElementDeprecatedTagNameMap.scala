package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElementDeprecatedTagNameMap extends js.Object {
  var listing: org.scalajs.dom.raw.HTMLPreElement = js.native
  var xmp: org.scalajs.dom.raw.HTMLPreElement = js.native
}

object HTMLElementDeprecatedTagNameMap {
  @scala.inline
  def apply(listing: org.scalajs.dom.raw.HTMLPreElement, xmp: org.scalajs.dom.raw.HTMLPreElement): HTMLElementDeprecatedTagNameMap = {
    val __obj = js.Dynamic.literal(listing = listing.asInstanceOf[js.Any], xmp = xmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementDeprecatedTagNameMap]
  }
  @scala.inline
  implicit class HTMLElementDeprecatedTagNameMapOps[Self <: HTMLElementDeprecatedTagNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListing(value: org.scalajs.dom.raw.HTMLPreElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmp(value: org.scalajs.dom.raw.HTMLPreElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

