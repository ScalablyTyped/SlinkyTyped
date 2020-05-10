package typingsSlinky.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToSourceRequest extends js.Object {
  var deadline: js.Date = js.native
  def displayErrorString(errorString: String): Unit = js.native
  def getDeferral(): PlayToSourceDeferral = js.native
  def setSource(value: PlayToSource): Unit = js.native
}

object IPlayToSourceRequest {
  @scala.inline
  def apply(
    deadline: js.Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
  @scala.inline
  implicit class IPlayToSourceRequestOps[Self <: IPlayToSourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayErrorString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayErrorString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => PlayToSourceDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSource(value: PlayToSource => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

