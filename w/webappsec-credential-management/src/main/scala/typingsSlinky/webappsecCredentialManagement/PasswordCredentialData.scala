package typingsSlinky.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-passwordcredentialdata}
  */
@js.native
trait PasswordCredentialData
  extends SiteBoundCredentialData
     with PasswordCredentialInit {
  /**
    * The plain-text password.
    */
  var password: String = js.native
}

object PasswordCredentialData {
  @scala.inline
  def apply(id: String, password: String): PasswordCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredentialData]
  }
  @scala.inline
  implicit class PasswordCredentialDataOps[Self <: PasswordCredentialData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

