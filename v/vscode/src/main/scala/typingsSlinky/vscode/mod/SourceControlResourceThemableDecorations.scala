package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControlResourceThemableDecorations extends js.Object {
  /**
  		 * The icon path for a specific
  		 * [source control resource state](#SourceControlResourceState).
  		 */
  val iconPath: js.UndefOr[String | Uri] = js.native
}

object SourceControlResourceThemableDecorations {
  @scala.inline
  def apply(): SourceControlResourceThemableDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlResourceThemableDecorations]
  }
  @scala.inline
  implicit class SourceControlResourceThemableDecorationsOps[Self <: SourceControlResourceThemableDecorations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconPath(value: String | Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(js.undefined)
        ret
    }
  }
  
}

