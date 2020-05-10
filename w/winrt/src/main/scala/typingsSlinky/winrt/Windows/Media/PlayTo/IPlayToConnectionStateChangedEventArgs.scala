package typingsSlinky.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToConnectionStateChangedEventArgs extends js.Object {
  var currentState: PlayToConnectionState = js.native
  var previousState: PlayToConnectionState = js.native
}

object IPlayToConnectionStateChangedEventArgs {
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): IPlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionStateChangedEventArgs]
  }
  @scala.inline
  implicit class IPlayToConnectionStateChangedEventArgsOps[Self <: IPlayToConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentState(value: PlayToConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousState(value: PlayToConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

