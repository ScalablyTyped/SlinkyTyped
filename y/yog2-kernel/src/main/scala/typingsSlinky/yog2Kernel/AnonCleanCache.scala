package typingsSlinky.yog2Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCleanCache extends js.Object {
  // 清除viewcache
  def cleanCache(): Unit = js.native
}

object AnonCleanCache {
  @scala.inline
  def apply(cleanCache: () => Unit): AnonCleanCache = {
    val __obj = js.Dynamic.literal(cleanCache = js.Any.fromFunction0(cleanCache))
    __obj.asInstanceOf[AnonCleanCache]
  }
  @scala.inline
  implicit class AnonCleanCacheOps[Self <: AnonCleanCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanCache")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

