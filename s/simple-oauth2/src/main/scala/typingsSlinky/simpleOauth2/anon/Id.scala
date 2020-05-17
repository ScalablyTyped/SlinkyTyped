package typingsSlinky.simpleOauth2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id[ClientIdName /* <: String */] extends js.Object {
  /** Service registered client id. Required. */
  var id: String = js.native
  /** Parameter name used to send the client id. Default to client_id. */
  var idParamName: js.UndefOr[ClientIdName] = js.native
  /** Service registered client secret. Required. */
  var secret: String = js.native
  /** Parameter name used to send the client secret. Default to client_secret. */
  var secretParamName: js.UndefOr[String] = js.native
}

object Id {
  @scala.inline
  def apply[ClientIdName](id: String, secret: String): Id[ClientIdName] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[ClientIdName]]
  }
  @scala.inline
  implicit class IdOps[Self[clientidname] <: Id[clientidname], ClientIdName] (val x: Self[ClientIdName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ClientIdName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ClientIdName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ClientIdName] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ClientIdName] with Other]
    @scala.inline
    def withId(value: String): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: String): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdParamName(value: ClientIdName): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idParamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdParamName: Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idParamName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretParamName(value: String): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretParamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretParamName: Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretParamName")(js.undefined)
        ret
    }
  }
  
}

