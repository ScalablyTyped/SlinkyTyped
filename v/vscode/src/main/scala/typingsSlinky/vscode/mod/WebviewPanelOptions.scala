package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebviewPanelOptions extends js.Object {
  /**
  		 * Controls if the find widget is enabled in the panel.
  		 *
  		 * Defaults to false.
  		 */
  val enableFindWidget: js.UndefOr[Boolean] = js.native
  /**
  		 * Controls if the webview panel's content (iframe) is kept around even when the panel
  		 * is no longer visible.
  		 *
  		 * Normally the webview panel's html context is created when the panel becomes visible
  		 * and destroyed when it is hidden. Extensions that have complex state
  		 * or UI can set the `retainContextWhenHidden` to make VS Code keep the webview
  		 * context around, even when the webview moves to a background tab. When a webview using
  		 * `retainContextWhenHidden` becomes hidden, its scripts and other dynamic content are suspended.
  		 * When the panel becomes visible again, the context is automatically restored
  		 * in the exact same state it was in originally. You cannot send messages to a
  		 * hidden webview, even with `retainContextWhenHidden` enabled.
  		 *
  		 * `retainContextWhenHidden` has a high memory overhead and should only be used if
  		 * your panel's context cannot be quickly saved and restored.
  		 */
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.native
}

object WebviewPanelOptions {
  @scala.inline
  def apply(): WebviewPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewPanelOptions]
  }
  @scala.inline
  implicit class WebviewPanelOptionsOps[Self <: WebviewPanelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableFindWidget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFindWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFindWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFindWidget")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainContextWhenHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainContextWhenHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainContextWhenHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainContextWhenHidden")(js.undefined)
        ret
    }
  }
  
}

