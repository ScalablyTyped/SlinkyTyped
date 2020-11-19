package typingsSlinky.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/polyfills", JSImport.Namespace)
@js.native
object polyfillsMod extends js.Object {
  
  def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
