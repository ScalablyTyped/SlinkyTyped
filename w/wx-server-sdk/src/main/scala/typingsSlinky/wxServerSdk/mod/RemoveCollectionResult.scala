package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.anon.Removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveCollectionResult extends js.Object {
  var stats: Removed = js.native
}

object RemoveCollectionResult {
  @scala.inline
  def apply(stats: Removed): RemoveCollectionResult = {
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
    def withStats(value: Removed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

