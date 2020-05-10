package typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeWorkspaceFoldersParams extends js.Object {
  /**
    * The actual workspace folder change event.
    */
  var event: WorkspaceFoldersChangeEvent = js.native
}

object DidChangeWorkspaceFoldersParams {
  @scala.inline
  def apply(event: WorkspaceFoldersChangeEvent): DidChangeWorkspaceFoldersParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWorkspaceFoldersParams]
  }
  @scala.inline
  implicit class DidChangeWorkspaceFoldersParamsOps[Self <: DidChangeWorkspaceFoldersParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: WorkspaceFoldersChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

