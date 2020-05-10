package typingsSlinky.semanticRelease

import typingsSlinky.semanticRelease.mod.Commit
import typingsSlinky.semanticRelease.mod.LastRelease
import typingsSlinky.semanticRelease.mod.NextRelease
import typingsSlinky.semanticRelease.mod.Release
import typingsSlinky.semanticRelease.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommits extends Result {
  /**
  		 * The list of commits included in the new release.
  		 */
  var commits: js.Array[Commit] = js.native
  /**
  		 * Information related to the last release found.
  		 */
  var lastRelease: LastRelease = js.native
  /**
  		 * Information related to the newly published release.
  		 */
  var nextRelease: NextRelease = js.native
  /**
  		 * The list of releases published, one release per publish plugin.
  		 */
  var releases: js.Array[Release] = js.native
}

object AnonCommits {
  @scala.inline
  def apply(
    commits: js.Array[Commit],
    lastRelease: LastRelease,
    nextRelease: NextRelease,
    releases: js.Array[Release]
  ): AnonCommits = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], nextRelease = nextRelease.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommits]
  }
  @scala.inline
  implicit class AnonCommitsOps[Self <: AnonCommits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommits(value: js.Array[Commit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRelease(value: LastRelease): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextRelease(value: NextRelease): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleases(value: js.Array[Release]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

