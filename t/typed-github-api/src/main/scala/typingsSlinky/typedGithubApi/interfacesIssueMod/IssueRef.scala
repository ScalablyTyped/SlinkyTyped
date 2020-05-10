package typingsSlinky.typedGithubApi.interfacesIssueMod

import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueRef extends js.Object {
  val number: Double = js.native
  def loadAsync(): js.Promise[Issue | Null] = js.native
  def loadRepositoryAsync(): js.Promise[Repository] = js.native
}

object IssueRef {
  @scala.inline
  def apply(
    loadAsync: () => js.Promise[Issue | Null],
    loadRepositoryAsync: () => js.Promise[Repository],
    number: Double
  ): IssueRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueRef]
  }
  @scala.inline
  implicit class IssueRefOps[Self <: IssueRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadAsync(value: () => js.Promise[Issue | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadRepositoryAsync(value: () => js.Promise[Repository]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRepositoryAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

