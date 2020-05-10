package typingsSlinky.typedGithubApi.interfacesCommitMod

import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRef extends js.Object {
  val repository: RepositoryRef = js.native
  val sha: String = js.native
  def loadAsync(): js.Promise[Commit | Null] = js.native
  def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
}

object CommitRef {
  @scala.inline
  def apply(
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    repository: RepositoryRef,
    sha: String
  ): CommitRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitRef]
  }
  @scala.inline
  implicit class CommitRefOps[Self <: CommitRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadAsync(value: () => js.Promise[Commit | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadGitAsync(value: () => js.Promise[GitCommit | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadGitAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRepository(value: RepositoryRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

