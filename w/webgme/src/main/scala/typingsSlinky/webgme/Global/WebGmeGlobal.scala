package typingsSlinky.webgme.Global

import typingsSlinky.webgme.GmeConfig.GmeConfig
import typingsSlinky.webgme.GmePanel.LayoutManager
import typingsSlinky.webgme.GmePanel.PanelManager
import typingsSlinky.webgme.Toolbar.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGmeGlobal extends js.Object {
  var GitHubVersion: js.UndefOr[String] = js.native
  var KeyboardManager: js.UndefOr[typingsSlinky.webgme.Global.KeyboardManager] = js.native
  var LayoutManager: js.UndefOr[typingsSlinky.webgme.GmePanel.LayoutManager] = js.native
  var NpmVersion: js.UndefOr[String] = js.native
  var PanelManager: js.UndefOr[typingsSlinky.webgme.GmePanel.PanelManager] = js.native
  var State: js.UndefOr[typingsSlinky.webgme.Global.State] = js.native
  var Toolbar: js.UndefOr[typingsSlinky.webgme.Toolbar.Toolbar] = js.native
  var gmeConfig: GmeConfig = js.native
  var history: js.UndefOr[History] = js.native
  var userInfo: js.UndefOr[UserInfo] = js.native
  var version: js.UndefOr[String] = js.native
  def getConfig(): GmeConfig = js.native
}

object WebGmeGlobal {
  @scala.inline
  def apply(getConfig: () => GmeConfig, gmeConfig: GmeConfig): WebGmeGlobal = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), gmeConfig = gmeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGmeGlobal]
  }
  @scala.inline
  implicit class WebGmeGlobalOps[Self <: WebGmeGlobal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConfig(value: () => GmeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmeConfig(value: GmeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitHubVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GitHubVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitHubVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GitHubVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardManager(value: KeyboardManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyboardManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyboardManager")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutManager(value: LayoutManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutManager")(js.undefined)
        ret
    }
    @scala.inline
    def withNpmVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NpmVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpmVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NpmVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelManager(value: PanelManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PanelManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PanelManager")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: Toolbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: History): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfo(value: UserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

