package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestIterationChanges extends js.Object {
  /**
    * Changes made in the iteration.
    */
  var changeEntries: js.Array[GitPullRequestChange] = js.native
  /**
    * Value to specify as skip to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextSkip: Double = js.native
  /**
    * Value to specify as top to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextTop: Double = js.native
}

object GitPullRequestIterationChanges {
  @scala.inline
  def apply(changeEntries: js.Array[GitPullRequestChange], nextSkip: Double, nextTop: Double): GitPullRequestIterationChanges = {
    val __obj = js.Dynamic.literal(changeEntries = changeEntries.asInstanceOf[js.Any], nextSkip = nextSkip.asInstanceOf[js.Any], nextTop = nextTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestIterationChanges]
  }
  @scala.inline
  implicit class GitPullRequestIterationChangesOps[Self <: GitPullRequestIterationChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeEntries(value: js.Array[GitPullRequestChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

