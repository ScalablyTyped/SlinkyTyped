package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentViewerEventMap extends ProxyEventMap {
  var load: DocumentViewerLoadEvent = js.native
  var menu: DocumentViewerMenuEvent = js.native
  var unload: DocumentViewerUnloadEvent = js.native
}

object DocumentViewerEventMap {
  @scala.inline
  def apply(load: DocumentViewerLoadEvent, menu: DocumentViewerMenuEvent, unload: DocumentViewerUnloadEvent): DocumentViewerEventMap = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewerEventMap]
  }
  @scala.inline
  implicit class DocumentViewerEventMapOps[Self <: DocumentViewerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(value: DocumentViewerLoadEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: DocumentViewerMenuEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnload(value: DocumentViewerUnloadEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

