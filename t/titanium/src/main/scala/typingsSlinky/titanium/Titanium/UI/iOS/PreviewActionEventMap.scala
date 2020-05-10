package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewActionEventMap extends ProxyEventMap {
  var click: PreviewActionClickEvent = js.native
}

object PreviewActionEventMap {
  @scala.inline
  def apply(click: PreviewActionClickEvent): PreviewActionEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionEventMap]
  }
  @scala.inline
  implicit class PreviewActionEventMapOps[Self <: PreviewActionEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: PreviewActionClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

