package typingsSlinky.titanium.Titanium.App

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidEventMap extends ProxyEventMap {
  var shortcutitemclick: AndroidShortcutitemclickEvent = js.native
}

object AndroidEventMap {
  @scala.inline
  def apply(shortcutitemclick: AndroidShortcutitemclickEvent): AndroidEventMap = {
    val __obj = js.Dynamic.literal(shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidEventMap]
  }
  @scala.inline
  implicit class AndroidEventMapOps[Self <: AndroidEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShortcutitemclick(value: AndroidShortcutitemclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutitemclick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

