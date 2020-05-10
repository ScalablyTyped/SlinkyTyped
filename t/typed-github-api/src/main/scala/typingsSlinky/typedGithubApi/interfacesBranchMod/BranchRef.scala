package typingsSlinky.typedGithubApi.interfacesBranchMod

import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchRef extends js.Object {
  val name: String = js.native
  val repository: RepositoryRef = js.native
  def loadAsync(): js.Promise[Branch | Null] = js.native
}

object BranchRef {
  @scala.inline
  def apply(loadAsync: () => js.Promise[Branch | Null], name: String, repository: RepositoryRef): BranchRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchRef]
  }
  @scala.inline
  implicit class BranchRefOps[Self <: BranchRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadAsync(value: () => js.Promise[Branch | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: RepositoryRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

