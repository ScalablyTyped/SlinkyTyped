package typingsSlinky.vscode

import typingsSlinky.vscode.mod.WebviewPanelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWebviewOptions extends js.Object {
  val webviewOptions: js.UndefOr[WebviewPanelOptions] = js.native
}

object AnonWebviewOptions {
  @scala.inline
  def apply(): AnonWebviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonWebviewOptions]
  }
  @scala.inline
  implicit class AnonWebviewOptionsOps[Self <: AnonWebviewOptions] (val x: Self) extends AnyVal {
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

