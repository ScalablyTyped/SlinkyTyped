package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitStatusContext extends js.Object {
  /**
    * Genre of the status. Typically name of the service/tool generating the status, can be empty.
    */
  var genre: String = js.native
  /**
    * Name identifier of the status, cannot be null or empty.
    */
  var name: String = js.native
}

object GitStatusContext {
  @scala.inline
  def apply(genre: String, name: String): GitStatusContext = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitStatusContext]
  }
  @scala.inline
  implicit class GitStatusContextOps[Self <: GitStatusContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

