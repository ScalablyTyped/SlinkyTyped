package typingsSlinky.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketKey extends js.Object {
  var __bucketKey: js.Any = js.native
}

object BucketKey {
  @scala.inline
  def apply(__bucketKey: js.Any): BucketKey = {
    val __obj = js.Dynamic.literal(__bucketKey = __bucketKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketKey]
  }
  @scala.inline
  implicit class BucketKeyOps[Self <: BucketKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__bucketKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__bucketKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

