package typingsSlinky.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToSourceRequestedEventArgs extends js.Object {
  var sourceRequest: PlayToSourceRequest = js.native
}

object IPlayToSourceRequestedEventArgs {
  @scala.inline
  def apply(sourceRequest: PlayToSourceRequest): IPlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToSourceRequestedEventArgs]
  }
  @scala.inline
  implicit class IPlayToSourceRequestedEventArgsOps[Self <: IPlayToSourceRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceRequest(value: PlayToSourceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

