package typingsSlinky.webPush.mod

import typingsSlinky.webPush.anon.Authorization
import typingsSlinky.webPush.webPushStrings.aes128gcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "getVapidHeaders")
@js.native
object getVapidHeaders_aes128gcm extends js.Object {
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm
  ): Authorization = js.native
  def apply(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm,
    expiration: Double
  ): Authorization = js.native
}

