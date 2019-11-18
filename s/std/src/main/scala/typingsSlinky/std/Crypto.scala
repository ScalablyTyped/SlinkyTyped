package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives. */
@js.native
trait Crypto extends js.Object {
  val subtle: org.scalajs.dom.crypto.SubtleCrypto = js.native
  def getRandomValues(): Null = js.native
  def getRandomValues(array: DataView): scala.scalajs.js.typedarray.DataView = js.native
  def getRandomValues(array: Float32Array): scala.scalajs.js.typedarray.Float32Array = js.native
  def getRandomValues(array: Float64Array): scala.scalajs.js.typedarray.Float64Array = js.native
  def getRandomValues(array: Int16Array): scala.scalajs.js.typedarray.Int16Array = js.native
  def getRandomValues(array: Int32Array): scala.scalajs.js.typedarray.Int32Array = js.native
  def getRandomValues(array: Int8Array): scala.scalajs.js.typedarray.Int8Array = js.native
  def getRandomValues(array: Uint16Array): scala.scalajs.js.typedarray.Uint16Array = js.native
  def getRandomValues(array: Uint32Array): scala.scalajs.js.typedarray.Uint32Array = js.native
  def getRandomValues(array: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getRandomValues(array: Uint8ClampedArray): scala.scalajs.js.typedarray.Uint8ClampedArray = js.native
}

@JSGlobal("Crypto")
@js.native
object Crypto extends Instantiable0[Crypto]

@JSGlobal("crypto")
@js.native
object crypto extends TopLevel[Crypto]

