package typingsSlinky.swaggerStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBucketcurrent extends js.Object {
  var bucket_current: Double = js.native
  var bucket_duration: Double = js.native
  var length: Double = js.native
}

object AnonBucketcurrent {
  @scala.inline
  def apply(bucket_current: Double, bucket_duration: Double, length: Double): AnonBucketcurrent = {
    val __obj = js.Dynamic.literal(bucket_current = bucket_current.asInstanceOf[js.Any], bucket_duration = bucket_duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucketcurrent]
  }
  @scala.inline
  implicit class AnonBucketcurrentOps[Self <: AnonBucketcurrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket_current(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket_current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucket_duration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

