package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentTimelineOptions extends js.Object {
  var originTime: js.UndefOr[Double] = js.native
}

object DocumentTimelineOptions {
  @scala.inline
  def apply(): DocumentTimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTimelineOptions]
  }
  @scala.inline
  implicit class DocumentTimelineOptionsOps[Self <: DocumentTimelineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTime")(js.undefined)
        ret
    }
  }
  
}

