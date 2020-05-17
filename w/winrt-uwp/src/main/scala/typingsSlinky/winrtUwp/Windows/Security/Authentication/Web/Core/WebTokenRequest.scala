package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request to an online identity provider for an authentication token. */
@js.native
trait WebTokenRequest extends js.Object {
  var appProperties: js.Any = js.native
   /* unmapped type */ /** Gets the Id of the client making the request. */
  var clientId: String = js.native
  /** Gets the prompt type of the request. */
  var promptType: WebTokenRequestPromptType = js.native
  /** Gets the properties of the request. */
  var properties: IMap[String, String] = js.native
  /** Gets the scope of the request. */
  var scope: String = js.native
  /** Gets the web account provider for the request. */
  var webAccountProvider: WebAccountProvider = js.native
}

object WebTokenRequest {
  @scala.inline
  def apply(
    appProperties: js.Any,
    clientId: String,
    promptType: WebTokenRequestPromptType,
    properties: IMap[String, String],
    scope: String,
    webAccountProvider: WebAccountProvider
  ): WebTokenRequest = {
    val __obj = js.Dynamic.literal(appProperties = appProperties.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], promptType = promptType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], webAccountProvider = webAccountProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenRequest]
  }
  @scala.inline
  implicit class WebTokenRequestOps[Self <: WebTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromptType(value: WebTokenRequestPromptType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebAccountProvider(value: WebAccountProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAccountProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

