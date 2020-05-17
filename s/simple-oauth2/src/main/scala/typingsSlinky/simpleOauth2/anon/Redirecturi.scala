package typingsSlinky.simpleOauth2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirecturi extends js.Object {
  /** A string that represents the registered application URI where the user is redirected after authentication */
  var redirect_uri: js.UndefOr[String] = js.native
  /** A string or array of strings that represents the application privileges */
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  /** A string that represents an option opaque value used by the client to main the state between the request and the callback */
  var state: js.UndefOr[String] = js.native
}

object Redirecturi {
  @scala.inline
  def apply(): Redirecturi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirecturi]
  }
  @scala.inline
  implicit class RedirecturiOps[Self <: Redirecturi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

