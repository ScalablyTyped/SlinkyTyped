package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.AuthenticationExtensionsClientOutputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PublicKeyCredential")
@js.native
class PublicKeyCredential ()
  extends typingsSlinky.std.PublicKeyCredential {
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val rawId: js.typedarray.ArrayBuffer = js.native
  /* CompleteClass */
  override val response: typingsSlinky.std.AuthenticatorResponse = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
}

@JSGlobal("PublicKeyCredential")
@js.native
object PublicKeyCredential
  extends Instantiable0[typingsSlinky.std.PublicKeyCredential] {
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = js.native
}

