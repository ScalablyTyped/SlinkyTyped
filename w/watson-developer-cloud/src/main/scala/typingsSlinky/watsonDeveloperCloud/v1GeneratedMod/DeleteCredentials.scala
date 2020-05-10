package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object returned after credentials are deleted. */
@js.native
trait DeleteCredentials extends js.Object {
  /** The unique identifier of the credentials that have been deleted. */
  var credential_id: js.UndefOr[String] = js.native
  /** The status of the deletion request. */
  var status: js.UndefOr[String] = js.native
}

object DeleteCredentials {
  @scala.inline
  def apply(): DeleteCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCredentials]
  }
  @scala.inline
  implicit class DeleteCredentialsOps[Self <: DeleteCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredential_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential_id")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

