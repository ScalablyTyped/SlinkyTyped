package typingsSlinky.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationErrorStatics extends js.Object {
  def getStatus(hresult: Double): SyndicationErrorStatus = js.native
}

object ISyndicationErrorStatics {
  @scala.inline
  def apply(getStatus: Double => SyndicationErrorStatus): ISyndicationErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[ISyndicationErrorStatics]
  }
  @scala.inline
  implicit class ISyndicationErrorStaticsOps[Self <: ISyndicationErrorStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStatus(value: Double => SyndicationErrorStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

