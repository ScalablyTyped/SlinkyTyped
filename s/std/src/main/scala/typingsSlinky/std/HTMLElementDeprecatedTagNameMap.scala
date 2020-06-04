package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElementDeprecatedTagNameMap extends js.Object {
  var listing: org.scalajs.dom.raw.HTMLPreElement
  var xmp: org.scalajs.dom.raw.HTMLPreElement
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListing(value: org.scalajs.dom.raw.HTMLPreElement): Self = this.set("listing", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmp(value: org.scalajs.dom.raw.HTMLPreElement): Self = this.set("xmp", value.asInstanceOf[js.Any])
  }
  
}

