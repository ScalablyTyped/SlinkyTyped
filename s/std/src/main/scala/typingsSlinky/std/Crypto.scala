package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives. */
@js.native
trait Crypto extends js.Object {
  
  def getRandomValues(array: Null): Null = js.native
  def getRandomValues(array: js.typedarray.DataView): js.typedarray.DataView = js.native
  def getRandomValues(array: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def getRandomValues(array: js.typedarray.Float64Array): js.typedarray.Float64Array = js.native
  def getRandomValues(array: js.typedarray.Int16Array): js.typedarray.Int16Array = js.native
  def getRandomValues(array: js.typedarray.Int32Array): js.typedarray.Int32Array = js.native
  def getRandomValues(array: js.typedarray.Int8Array): js.typedarray.Int8Array = js.native
  def getRandomValues(array: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
  def getRandomValues(array: js.typedarray.Uint32Array): js.typedarray.Uint32Array = js.native
  def getRandomValues(array: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def getRandomValues(array: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = js.native
  
  val subtle: org.scalajs.dom.crypto.SubtleCrypto = js.native
}
