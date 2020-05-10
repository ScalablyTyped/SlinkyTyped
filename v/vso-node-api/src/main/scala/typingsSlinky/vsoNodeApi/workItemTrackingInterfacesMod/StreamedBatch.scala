package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamedBatch[T] extends js.Object {
  var continuationToken: String = js.native
  var isLastBatch: Boolean = js.native
  var nextLink: String = js.native
  var values: js.Array[T] = js.native
}

object StreamedBatch {
  @scala.inline
  def apply[T](continuationToken: String, isLastBatch: Boolean, nextLink: String, values: js.Array[T]): StreamedBatch[T] = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken.asInstanceOf[js.Any], isLastBatch = isLastBatch.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamedBatch[T]]
  }
  @scala.inline
  implicit class StreamedBatchOps[Self[t] <: StreamedBatch[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContinuationToken(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLastBatch(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLastBatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextLink(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

