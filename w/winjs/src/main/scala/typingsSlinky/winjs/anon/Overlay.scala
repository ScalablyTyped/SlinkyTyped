package typingsSlinky.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay extends js.Object {
  /**
    * When the pane is open, it occupies space leaving less room for the SplitView's content.
    **/
  var `inline`: String = js.native
  /**
    * When the pane is open, it doesn't take up any space and it is light dismissable.
    **/
  var overlay: String = js.native
}

object Overlay {
  @scala.inline
  def apply(`inline`: String, overlay: String): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

