package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextTitle extends js.Object {
  var contextTitle: String = js.native
  var openDocumentsInClient: Boolean = js.native
}

object AnonContextTitle {
  @scala.inline
  def apply(contextTitle: String, openDocumentsInClient: Boolean): AnonContextTitle = {
    val __obj = js.Dynamic.literal(contextTitle = contextTitle.asInstanceOf[js.Any], openDocumentsInClient = openDocumentsInClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextTitle]
  }
  @scala.inline
  implicit class AnonContextTitleOps[Self <: AnonContextTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenDocumentsInClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDocumentsInClient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

