package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeWatchedFilesParams extends js.Object {
  /**
    * The actual file events.
    */
  var changes: js.Array[FileEvent] = js.native
}

object DidChangeWatchedFilesParams {
  @scala.inline
  def apply(changes: js.Array[FileEvent]): DidChangeWatchedFilesParams = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWatchedFilesParams]
  }
  @scala.inline
  implicit class DidChangeWatchedFilesParamsOps[Self <: DidChangeWatchedFilesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[FileEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

