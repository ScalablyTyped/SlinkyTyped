package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyCredential extends Credential {
  val rawId: js.typedarray.ArrayBuffer = js.native
  val response: AuthenticatorResponse = js.native
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
}

@JSGlobal("PublicKeyCredential")
@js.native
object PublicKeyCredential extends Instantiable0[PublicKeyCredential] {
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = js.native
}

