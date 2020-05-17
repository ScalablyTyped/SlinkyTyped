package typingsSlinky.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buckets extends js.Object {
  var buckets: Double = js.native
  var granularity: js.UndefOr[js.Any] = js.native
  var groupBy: js.Any = js.native
  var output: js.UndefOr[js.Object] = js.native
}

object Buckets {
  @scala.inline
  def apply(buckets: Double, groupBy: js.Any): Buckets = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buckets]
  }
  @scala.inline
  implicit class BucketsOps[Self <: Buckets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGranularity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

