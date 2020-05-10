package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.AnonRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveCollectionResult extends js.Object {
  var stats: AnonRemoved = js.native
}

object RemoveCollectionResult {
  @scala.inline
  def apply(stats: AnonRemoved): RemoveCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCollectionResult]
  }
  @scala.inline
  implicit class RemoveCollectionResultOps[Self <: RemoveCollectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStats(value: AnonRemoved): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

