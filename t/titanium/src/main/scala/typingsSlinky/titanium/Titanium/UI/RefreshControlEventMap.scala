package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshControlEventMap extends ProxyEventMap {
  var refreshend: RefreshControlRefreshendEvent = js.native
  var refreshstart: RefreshControlRefreshstartEvent = js.native
}

object RefreshControlEventMap {
  @scala.inline
  def apply(refreshend: RefreshControlRefreshendEvent, refreshstart: RefreshControlRefreshstartEvent): RefreshControlEventMap = {
    val __obj = js.Dynamic.literal(refreshend = refreshend.asInstanceOf[js.Any], refreshstart = refreshstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlEventMap]
  }
  @scala.inline
  implicit class RefreshControlEventMapOps[Self <: RefreshControlEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefreshend(value: RefreshControlRefreshendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshstart(value: RefreshControlRefreshstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshstart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

