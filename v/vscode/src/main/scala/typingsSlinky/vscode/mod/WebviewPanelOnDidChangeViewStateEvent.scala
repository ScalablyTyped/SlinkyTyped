package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebviewPanelOnDidChangeViewStateEvent extends js.Object {
  /**
  		 * Webview panel whose view state changed.
  		 */
  val webviewPanel: WebviewPanel = js.native
}

object WebviewPanelOnDidChangeViewStateEvent {
  @scala.inline
  def apply(webviewPanel: WebviewPanel): WebviewPanelOnDidChangeViewStateEvent = {
    val __obj = js.Dynamic.literal(webviewPanel = webviewPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPanelOnDidChangeViewStateEvent]
  }
  @scala.inline
  implicit class WebviewPanelOnDidChangeViewStateEventOps[Self <: WebviewPanelOnDidChangeViewStateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebviewPanel(value: WebviewPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewPanel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

