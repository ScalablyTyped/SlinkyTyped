package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadHTML extends js.Object {
  /** By default the HTML output is a simple unstyled table. if you would like to match the current table styling you can set the style property to true  */
  var style: js.UndefOr[Boolean] = js.native
}

object DownloadHTML {
  @scala.inline
  def apply(): DownloadHTML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadHTML]
  }
  @scala.inline
  implicit class DownloadHTMLOps[Self <: DownloadHTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

