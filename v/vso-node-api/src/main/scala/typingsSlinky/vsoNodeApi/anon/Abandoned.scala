package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abandoned extends js.Object {
  var abandoned: scala.Double = js.native
  var canceled: scala.Double = js.native
  var failed: scala.Double = js.native
  var skipped: scala.Double = js.native
  var succeeded: scala.Double = js.native
  var succeededWithIssues: scala.Double = js.native
}

object Abandoned {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    canceled: scala.Double,
    failed: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    succeededWithIssues: scala.Double
  ): Abandoned = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededWithIssues = succeededWithIssues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abandoned]
  }
  @scala.inline
  implicit class AbandonedOps[Self <: Abandoned] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbandoned(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandoned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipped(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceededWithIssues(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeededWithIssues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

