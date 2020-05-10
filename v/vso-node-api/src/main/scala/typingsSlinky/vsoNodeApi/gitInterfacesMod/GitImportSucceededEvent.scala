package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitImportSucceededEvent extends js.Object {
  var sourceRepositoryName: String = js.native
  var targetRepository: GitRepository = js.native
}

object GitImportSucceededEvent {
  @scala.inline
  def apply(sourceRepositoryName: String, targetRepository: GitRepository): GitImportSucceededEvent = {
    val __obj = js.Dynamic.literal(sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], targetRepository = targetRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportSucceededEvent]
  }
  @scala.inline
  implicit class GitImportSucceededEventOps[Self <: GitImportSucceededEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceRepositoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRepository(value: GitRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRepository")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

