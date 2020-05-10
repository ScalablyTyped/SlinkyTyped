package typingsSlinky.socketioJwt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JwtAuthOptions extends js.Object {
   // In milliseconds to handle the second round trip.
  var callback: js.UndefOr[Boolean] = js.native
   // To disconnect socket server-side without a client-side callback if no valid token.
  var decodedPropertyName: String = js.native
   // Property to store the docoded token to.
  var handshake: js.UndefOr[Boolean] = js.native
  var secret: String | JwtSecretFunc = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object JwtAuthOptions {
  @scala.inline
  def apply(decodedPropertyName: String, secret: String | JwtSecretFunc): JwtAuthOptions = {
    val __obj = js.Dynamic.literal(decodedPropertyName = decodedPropertyName.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthOptions]
  }
  @scala.inline
  implicit class JwtAuthOptionsOps[Self <: JwtAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodedPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodedPropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretFunction3(value: (/* request */ js.Any, /* payload */ js.Any, /* callback */ JwtSecretFuncCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSecret(value: String | JwtSecretFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withHandshake(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handshake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handshake")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

