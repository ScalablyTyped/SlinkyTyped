package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CredentialsList. */
@js.native
trait CredentialsList extends js.Object {
  /** An array of credential definitions that were created for this instance. */
  var credentials: js.UndefOr[js.Array[Credentials]] = js.native
}

object CredentialsList {
  @scala.inline
  def apply(): CredentialsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialsList]
  }
  @scala.inline
  implicit class CredentialsListOps[Self <: CredentialsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: js.Array[Credentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
  }
  
}

