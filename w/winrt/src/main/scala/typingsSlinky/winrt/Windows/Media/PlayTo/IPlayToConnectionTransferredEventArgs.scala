package typingsSlinky.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToConnectionTransferredEventArgs extends js.Object {
  var currentSource: PlayToSource = js.native
  var previousSource: PlayToSource = js.native
}

object IPlayToConnectionTransferredEventArgs {
  @scala.inline
  def apply(currentSource: PlayToSource, previousSource: PlayToSource): IPlayToConnectionTransferredEventArgs = {
    val __obj = js.Dynamic.literal(currentSource = currentSource.asInstanceOf[js.Any], previousSource = previousSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionTransferredEventArgs]
  }
  @scala.inline
  implicit class IPlayToConnectionTransferredEventArgsOps[Self <: IPlayToConnectionTransferredEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSource(value: PlayToSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSource(value: PlayToSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

