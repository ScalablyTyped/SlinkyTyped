package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportRepositoryValidation extends js.Object {
  var gitSource: GitImportGitSource = js.native
  var password: String = js.native
  var tfvcSource: GitImportTfvcSource = js.native
  var username: String = js.native
}

object ImportRepositoryValidation {
  @scala.inline
  def apply(gitSource: GitImportGitSource, password: String, tfvcSource: GitImportTfvcSource, username: String): ImportRepositoryValidation = {
    val __obj = js.Dynamic.literal(gitSource = gitSource.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], tfvcSource = tfvcSource.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportRepositoryValidation]
  }
  @scala.inline
  implicit class ImportRepositoryValidationOps[Self <: ImportRepositoryValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGitSource(value: GitImportGitSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfvcSource(value: GitImportTfvcSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvcSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

