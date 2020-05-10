package typingsSlinky.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmail extends js.Object {
  /**
    * Retrieves user's email from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git email or undefined
    */
  def email(): String = js.native
  /**
    * Retrieves user's name from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git name or undefined
    */
  def name(): String = js.native
}

object AnonEmail {
  @scala.inline
  def apply(email: () => String, name: () => String): AnonEmail = {
    val __obj = js.Dynamic.literal(email = js.Any.fromFunction0(email), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[AnonEmail]
  }
  @scala.inline
  implicit class AnonEmailOps[Self <: AnonEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

