package typingsSlinky.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-federatedcredentialrequestoptions}
  */
@js.native
trait FederatedCredentialRequestOptions extends js.Object {
  /**
    * An array of protocol identifiers.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredentialrequestoptions-protocols}
    */
  var protocols: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of federation identifiers.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredentialrequestoptions-providers}
    */
  var providers: js.UndefOr[js.Array[String]] = js.native
}

object FederatedCredentialRequestOptions {
  @scala.inline
  def apply(): FederatedCredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedCredentialRequestOptions]
  }
  @scala.inline
  implicit class FederatedCredentialRequestOptionsOps[Self <: FederatedCredentialRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
  }
  
}

