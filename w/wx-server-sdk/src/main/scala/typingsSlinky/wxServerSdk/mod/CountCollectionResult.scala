package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.anon.Total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountCollectionResult extends js.Object {
  var stats: Total = js.native
}

object CountCollectionResult {
  @scala.inline
  def apply(stats: Total): CountCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountCollectionResult]
  }
  @scala.inline
  implicit class CountCollectionResultOps[Self <: CountCollectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStats(value: Total): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

