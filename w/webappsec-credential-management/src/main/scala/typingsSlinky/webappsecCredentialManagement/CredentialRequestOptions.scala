package typingsSlinky.webappsecCredentialManagement

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.optional
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-credentialrequestoptions}
  */
@js.native
trait CredentialRequestOptions extends js.Object {
  /**
    * If set, the user agent will request {@link FederatedCredential} objects
    * for the providers and protocol types listed. Defaults to {@code null}.
    */
  var federated: js.UndefOr[FederatedCredentialRequestOptions] = js.native
  /**
    * This property specifies the mediation requirements for a given credential
    * request.
    */
  var mediation: js.UndefOr[silent | optional | required] = js.native
  /**
    * If set, the user agent will request {@link PasswordCredential} objects.
    * Defaults to {@code false}.
    */
  var password: js.UndefOr[Boolean] = js.native
  /**
    * This property specifies options for requesting a public-key signature.
    */
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.native
  /**
    * This property lets the developer abort an ongoing get() operation.
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * If {@code true}, the user agent will only attempt to provide a Credential
    * without user interaction. Defaults to {@code false}.
    *
    * @deprecated Use {@link mediation} instead.
    */
  var unmediated: js.UndefOr[Boolean] = js.native
}

object CredentialRequestOptions {
  @scala.inline
  def apply(): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptions]
  }
  @scala.inline
  implicit class CredentialRequestOptionsOps[Self <: CredentialRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFederated(value: FederatedCredentialRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFederated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federated")(js.undefined)
        ret
    }
    @scala.inline
    def withMediation(value: silent | optional | required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediation")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: PublicKeyCredentialRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmediated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmediated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmediated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmediated")(js.undefined)
        ret
    }
  }
  
}

