package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectCollectionReference
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitRepositoryRef extends js.Object {
  /**
    * Team Project Collection where this Fork resides
    */
  var collection: TeamProjectCollectionReference = js.native
  var id: String = js.native
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean = js.native
  var name: String = js.native
  var project: TeamProjectReference = js.native
  var remoteUrl: String = js.native
  var sshUrl: String = js.native
  var url: String = js.native
}

object GitRepositoryRef {
  @scala.inline
  def apply(
    collection: TeamProjectCollectionReference,
    id: String,
    isFork: Boolean,
    name: String,
    project: TeamProjectReference,
    remoteUrl: String,
    sshUrl: String,
    url: String
  ): GitRepositoryRef = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFork = isFork.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], sshUrl = sshUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryRef]
  }
  @scala.inline
  implicit class GitRepositoryRefOps[Self <: GitRepositoryRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: TeamProjectCollectionReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSshUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

