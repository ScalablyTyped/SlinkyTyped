package typingsSlinky.simpleOauth2.mod

import typingsSlinky.simpleOauth2.AnonAuthorizationMethod
import typingsSlinky.simpleOauth2.AnonAuthorizeHost
import typingsSlinky.simpleOauth2.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOptions[ClientIdName /* <: String */] extends js.Object {
  var auth: AnonAuthorizeHost = js.native
  var client: AnonId[ClientIdName] = js.native
  /**
    * Used to set global options to the internal http library (wreck).
    * All options except baseUrl are allowed
    * Defaults to header.Accept = "application/json"
    */
  var http: js.UndefOr[js.Object] = js.native
  var options: js.UndefOr[AnonAuthorizationMethod] = js.native
}

object ModuleOptions {
  @scala.inline
  def apply[ClientIdName](auth: AnonAuthorizeHost, client: AnonId[ClientIdName]): ModuleOptions[ClientIdName] = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions[ClientIdName]]
  }
  @scala.inline
  implicit class ModuleOptionsOps[Self[clientidname] <: ModuleOptions[clientidname], ClientIdName] (val x: Self[ClientIdName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ClientIdName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ClientIdName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ClientIdName] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ClientIdName] with Other]
    @scala.inline
    def withAuth(value: AnonAuthorizeHost): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: AnonId[ClientIdName]): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: js.Object): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonAuthorizationMethod): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

