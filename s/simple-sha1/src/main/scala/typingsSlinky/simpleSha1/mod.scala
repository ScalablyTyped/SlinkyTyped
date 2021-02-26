package typingsSlinky.simpleSha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-sha1", JSImport.Namespace)
  @js.native
  def apply(buf: String, cb: js.Function1[/* data */ String, Unit]): Unit = js.native
  @JSImport("simple-sha1", JSImport.Namespace)
  @js.native
  def apply(buf: ArrayBufferView, cb: js.Function1[/* data */ String, Unit]): Unit = js.native
  
  @JSImport("simple-sha1", "sync")
  @js.native
  def sync(buf: String): String = js.native
  @JSImport("simple-sha1", "sync")
  @js.native
  def sync(buf: ArrayBufferView): String = js.native
  
  type ArrayBufferView = TypedArray | js.typedarray.DataView
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
