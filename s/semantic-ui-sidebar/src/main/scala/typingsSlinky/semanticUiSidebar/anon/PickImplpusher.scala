package typingsSlinky.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'pusher'> */
@js.native
trait PickImplpusher extends js.Object {
  var pusher: String = js.native
}

object PickImplpusher {
  @scala.inline
  def apply(pusher: String): PickImplpusher = {
    val __obj = js.Dynamic.literal(pusher = pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpusher]
  }
  @scala.inline
  implicit class PickImplpusherOps[Self <: PickImplpusher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPusher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pusher")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

