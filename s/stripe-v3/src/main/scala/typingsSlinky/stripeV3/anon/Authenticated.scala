package typingsSlinky.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticated extends js.Object {
  var authenticated: Boolean = js.native
}

object Authenticated {
  @scala.inline
  def apply(authenticated: Boolean): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
  @scala.inline
  implicit class AuthenticatedOps[Self <: Authenticated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

