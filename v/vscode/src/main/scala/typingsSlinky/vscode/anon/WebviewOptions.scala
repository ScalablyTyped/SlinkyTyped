package typingsSlinky.vscode.anon

import typingsSlinky.vscode.mod.WebviewPanelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebviewOptions extends js.Object {
  val webviewOptions: js.UndefOr[WebviewPanelOptions] = js.native
}

object WebviewOptions {
  @scala.inline
  def apply(): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewOptions]
  }
  @scala.inline
  implicit class WebviewOptionsOps[Self <: WebviewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebviewOptions(value: WebviewPanelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebviewOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewOptions")(js.undefined)
        ret
    }
  }
  
}

