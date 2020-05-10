package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCommitDiffs extends js.Object {
  var aheadCount: Double = js.native
  var allChangesIncluded: Boolean = js.native
  var baseCommit: String = js.native
  var behindCount: Double = js.native
  var changeCounts: NumberDictionary[Double] = js.native
  var changes: js.Array[GitChange] = js.native
  var commonCommit: String = js.native
  var targetCommit: String = js.native
}

object GitCommitDiffs {
  @scala.inline
  def apply(
    aheadCount: Double,
    allChangesIncluded: Boolean,
    baseCommit: String,
    behindCount: Double,
    changeCounts: NumberDictionary[Double],
    changes: js.Array[GitChange],
    commonCommit: String,
    targetCommit: String
  ): GitCommitDiffs = {
    val __obj = js.Dynamic.literal(aheadCount = aheadCount.asInstanceOf[js.Any], allChangesIncluded = allChangesIncluded.asInstanceOf[js.Any], baseCommit = baseCommit.asInstanceOf[js.Any], behindCount = behindCount.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], commonCommit = commonCommit.asInstanceOf[js.Any], targetCommit = targetCommit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitDiffs]
  }
  @scala.inline
  implicit class GitCommitDiffsOps[Self <: GitCommitDiffs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAheadCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aheadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllChangesIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allChangesIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBehindCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behindCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeCounts(value: NumberDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: js.Array[GitChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCommit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

