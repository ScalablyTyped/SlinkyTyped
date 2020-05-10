package typingsSlinky.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUsername extends js.Object {
  /**
    * Retrieves GitHub's username from the GitHub API
    * @return Resolved with the GitHub username or rejected if unable to
    *         get the information
    */
  def username(): js.Promise[String] = js.native
}

object AnonUsername {
  @scala.inline
  def apply(username: () => js.Promise[String]): AnonUsername = {
    val __obj = js.Dynamic.literal(username = js.Any.fromFunction0(username))
    __obj.asInstanceOf[AnonUsername]
  }
  @scala.inline
  implicit class AnonUsernameOps[Self <: AnonUsername] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsername(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

