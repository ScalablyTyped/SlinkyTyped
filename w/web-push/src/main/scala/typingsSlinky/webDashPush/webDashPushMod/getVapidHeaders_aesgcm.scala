package typingsSlinky.webDashPush.webDashPushMod

import typingsSlinky.webDashPush.Anon_AuthorizationCryptoKey
import typingsSlinky.webDashPush.webDashPushStrings.aesgcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "getVapidHeaders")
@js.native
object getVapidHeaders_aesgcm extends js.Object {
  def apply(audience: String, subject: String, publicKey: String, privateKey: String, contentEncoding: aesgcm): Anon_AuthorizationCryptoKey = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aesgcm,
    expiration: Double
  ): Anon_AuthorizationCryptoKey = js.native
}

