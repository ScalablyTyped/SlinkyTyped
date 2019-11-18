package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredential extends Credential {
  val rawId: scala.scalajs.js.typedarray.ArrayBuffer
  val response: AuthenticatorResponse
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs
}

@JSGlobal("PublicKeyCredential")
@js.native
object PublicKeyCredential extends Instantiable0[PublicKeyCredential] {
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = js.native
}

