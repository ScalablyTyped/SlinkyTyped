package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitBranchStats extends js.Object {
  /**
    * Number of commits ahead.
    */
  var aheadCount: Double = js.native
  /**
    * Number of commits behind.
    */
  var behindCount: Double = js.native
  /**
    * Current commit.
    */
  var commit: GitCommitRef = js.native
  /**
    * True if this is the result for the base version.
    */
  var isBaseVersion: Boolean = js.native
  /**
    * Name of the ref.
    */
  var name: String = js.native
}

object GitBranchStats {
  @scala.inline
  def apply(
    aheadCount: Double,
    behindCount: Double,
    commit: GitCommitRef,
    isBaseVersion: Boolean,
    name: String
  ): GitBranchStats = {
    val __obj = js.Dynamic.literal(aheadCount = aheadCount.asInstanceOf[js.Any], behindCount = behindCount.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isBaseVersion = isBaseVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitBranchStats]
  }
  @scala.inline
  implicit class GitBranchStatsOps[Self <: GitBranchStats] (val x: Self) extends AnyVal {
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
    def withBehindCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behindCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBaseVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

