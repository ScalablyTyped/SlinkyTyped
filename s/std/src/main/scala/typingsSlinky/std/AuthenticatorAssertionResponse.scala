package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: js.typedarray.ArrayBuffer = js.native
  val signature: js.typedarray.ArrayBuffer = js.native
  val userHandle: js.typedarray.ArrayBuffer | Null = js.native
}

@JSGlobal("AuthenticatorAssertionResponse")
@js.native
object AuthenticatorAssertionResponse extends Instantiable0[AuthenticatorAssertionResponse]

