package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEndRenameColumn extends IEventArgs {
  var columnKey: String = js.native
  var newColumnTitle: String = js.native
  var originalColumnTitle: String = js.native
}

object OnEndRenameColumn {
  @scala.inline
  def apply(columnKey: String, newColumnTitle: String, originalColumnTitle: String): OnEndRenameColumn = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], newColumnTitle = newColumnTitle.asInstanceOf[js.Any], originalColumnTitle = originalColumnTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEndRenameColumn]
  }
  @scala.inline
  implicit class OnEndRenameColumnOps[Self <: OnEndRenameColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewColumnTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newColumnTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalColumnTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalColumnTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

