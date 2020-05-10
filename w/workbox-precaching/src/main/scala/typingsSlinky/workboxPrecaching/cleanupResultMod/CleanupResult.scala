package typingsSlinky.workboxPrecaching.cleanupResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CleanupResult extends js.Object {
  var deletedCacheRequests: js.Array[String] = js.native
}

object CleanupResult {
  @scala.inline
  def apply(deletedCacheRequests: js.Array[String]): CleanupResult = {
    val __obj = js.Dynamic.literal(deletedCacheRequests = deletedCacheRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanupResult]
  }
  @scala.inline
  implicit class CleanupResultOps[Self <: CleanupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedCacheRequests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedCacheRequests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

