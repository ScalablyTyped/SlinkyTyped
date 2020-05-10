package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthentication extends js.Object {
  def getAssertion(): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(
    assertionChallenge: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(
    assertionChallenge: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    options: AssertionOptions
  ): js.Promise[WebAuthnAssertion] = js.native
  def makeCredential(accountInformation: Account, cryptoParameters: js.Array[ScopedCredentialParameters]): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(accountInformation: Account, cryptoParameters: js.Iterable[ScopedCredentialParameters]): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
}

@JSGlobal("WebAuthentication")
@js.native
object WebAuthentication extends Instantiable0[WebAuthentication]

