package typingsSlinky.titanium.Titanium.Network

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BonjourBrowserEventMap extends ProxyEventMap {
  var updatedservices: BonjourBrowserUpdatedservicesEvent = js.native
}

object BonjourBrowserEventMap {
  @scala.inline
  def apply(updatedservices: BonjourBrowserUpdatedservicesEvent): BonjourBrowserEventMap = {
    val __obj = js.Dynamic.literal(updatedservices = updatedservices.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowserEventMap]
  }
  @scala.inline
  implicit class BonjourBrowserEventMapOps[Self <: BonjourBrowserEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdatedservices(value: BonjourBrowserUpdatedservicesEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedservices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

