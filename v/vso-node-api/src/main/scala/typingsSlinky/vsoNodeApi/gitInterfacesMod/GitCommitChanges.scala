package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCommitChanges extends js.Object {
  var changeCounts: ChangeCountDictionary = js.native
  var changes: js.Array[GitChange] = js.native
}

object GitCommitChanges {
  @scala.inline
  def apply(changeCounts: ChangeCountDictionary, changes: js.Array[GitChange]): GitCommitChanges = {
    val __obj = js.Dynamic.literal(changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitChanges]
  }
  @scala.inline
  implicit class GitCommitChangesOps[Self <: GitCommitChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeCounts(value: ChangeCountDictionary): Self = {
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
  }
  
}

