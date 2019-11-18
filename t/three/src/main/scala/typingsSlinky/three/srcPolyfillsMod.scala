package typingsSlinky.three

import typingsSlinky.std.Float32Array
import typingsSlinky.std.Float64Array
import typingsSlinky.std.Int16Array
import typingsSlinky.std.Int32Array
import typingsSlinky.std.Int8Array
import typingsSlinky.std.Uint16Array
import typingsSlinky.std.Uint32Array
import typingsSlinky.std.Uint8Array
import typingsSlinky.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/polyfills", JSImport.Namespace)
@js.native
object srcPolyfillsMod extends js.Object {
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}

