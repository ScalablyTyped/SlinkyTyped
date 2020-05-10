package typingsSlinky.storybookApi.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UI extends js.Object {
  var docsMode: Boolean = js.native
  var enableShortcuts: Boolean = js.native
  var name: js.UndefOr[String] = js.native
  var sidebarAnimations: Boolean = js.native
  var url: js.UndefOr[String] = js.native
}

object UI {
  @scala.inline
  def apply(docsMode: Boolean, enableShortcuts: Boolean, sidebarAnimations: Boolean): UI = {
    val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], enableShortcuts = enableShortcuts.asInstanceOf[js.Any], sidebarAnimations = sidebarAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UI]
  }
  @scala.inline
  implicit class UIOps[Self <: UI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocsMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

