package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitRepositoryCreateOptions extends js.Object {
  var name: String = js.native
  var parentRepository: GitRepositoryRef = js.native
  var project: TeamProjectReference = js.native
}

object GitRepositoryCreateOptions {
  @scala.inline
  def apply(name: String, parentRepository: GitRepositoryRef, project: TeamProjectReference): GitRepositoryCreateOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentRepository = parentRepository.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryCreateOptions]
  }
  @scala.inline
  implicit class GitRepositoryCreateOptionsOps[Self <: GitRepositoryCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentRepository(value: GitRepositoryRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

