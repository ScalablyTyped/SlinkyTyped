package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthentication extends StObject {
  
  def getAssertion(): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.ArrayBuffer): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.ArrayBuffer, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.DataView): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.DataView, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Float32Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Float32Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Float64Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Float64Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Int16Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Int16Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Int32Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Int32Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Int8Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Int8Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint16Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint16Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint32Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint32Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint8Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint8Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint8ClampedArray): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.typedarray.Uint8ClampedArray, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Null, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  
  def makeCredential(accountInformation: Account, cryptoParameters: js.Array[ScopedCredentialParameters]): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.ArrayBuffer
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.ArrayBuffer,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.DataView
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.DataView,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float64Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float64Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8ClampedArray
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8ClampedArray,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Null,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(accountInformation: Account, cryptoParameters: js.Iterable[ScopedCredentialParameters]): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.ArrayBuffer
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.ArrayBuffer,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.DataView
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.DataView,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float64Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Float64Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Int8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8ClampedArray
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: js.typedarray.Uint8ClampedArray,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Iterable[ScopedCredentialParameters],
    attestationChallenge: Null,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
}
