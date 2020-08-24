package typingsSlinky.webidlConversions.mod

import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.webidlConversions.anon.BufferSourceOptionsallowS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webidl-conversions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ArrayBuffer(V: js.Any): js.typedarray.ArrayBuffer = js.native
  def ArrayBuffer(V: js.Any, opts: BufferSourceOptionsallowS): js.typedarray.ArrayBuffer = js.native
  def ArrayBuffer(V: js.Any, opts: BufferSourceOptions): ArrayBufferLike = js.native
  def ArrayBufferView(V: js.Any): js.typedarray.ArrayBufferView = js.native
  def ArrayBufferView(V: js.Any, opts: BufferSourceOptions): js.typedarray.ArrayBufferView = js.native
  @JSName("ArrayBuffer")
  def ArrayBuffer_ArrayBufferLike(V: js.Any): ArrayBufferLike = js.native
  def BufferSource(V: js.Any): js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView = js.native
  def BufferSource(V: js.Any, opts: BufferSourceOptionsallowS): js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView = js.native
  def BufferSource(V: js.Any, opts: BufferSourceOptions): ArrayBufferLike | js.typedarray.ArrayBufferView = js.native
  def ByteString(V: js.Any): String = js.native
  def ByteString(V: js.Any, opts: StringOptions): String = js.native
  def DOMString(V: js.Any): String = js.native
  def DOMString(V: js.Any, opts: StringOptions): String = js.native
  def DOMTimeStamp(V: js.Any): Double = js.native
  def DOMTimeStamp(V: js.Any, opts: Options): Double = js.native
  def DataView(V: js.Any): js.typedarray.DataView = js.native
  def DataView(V: js.Any, opts: BufferSourceOptions): js.typedarray.DataView = js.native
  def Float32Array(V: js.Any): js.typedarray.Float32Array = js.native
  def Float32Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Float32Array = js.native
  def Float64Array(V: js.Any): js.typedarray.Float64Array = js.native
  def Float64Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Float64Array = js.native
  // tslint:disable:ban-types
  /** @deprecated Will be removed in v7.0 */
  def Function[V](V: V): js.Function | V = js.native
  def Function[V](V: V, opts: Options): js.Function | V = js.native
  def Int16Array(V: js.Any): js.typedarray.Int16Array = js.native
  def Int16Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Int16Array = js.native
  def Int32Array(V: js.Any): js.typedarray.Int32Array = js.native
  def Int32Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Int32Array = js.native
  def Int8Array(V: js.Any): js.typedarray.Int8Array = js.native
  def Int8Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Int8Array = js.native
  def USVString(V: js.Any): String = js.native
  def USVString(V: js.Any, opts: StringOptions): String = js.native
  def Uint16Array(V: js.Any): js.typedarray.Uint16Array = js.native
  def Uint16Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Uint16Array = js.native
  def Uint32Array(V: js.Any): js.typedarray.Uint32Array = js.native
  def Uint32Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Uint32Array = js.native
  def Uint8Array(V: js.Any): js.typedarray.Uint8Array = js.native
  def Uint8Array(V: js.Any, opts: BufferSourceOptions): js.typedarray.Uint8Array = js.native
  def Uint8ClampedArray(V: js.Any): js.typedarray.Uint8ClampedArray = js.native
  def Uint8ClampedArray(V: js.Any, opts: BufferSourceOptions): js.typedarray.Uint8ClampedArray = js.native
  /** @deprecated Will be removed in v7.0 */
  def VoidFunction[V](V: V): js.Function | (js.Function1[/* args */ Parameters[V], Unit]) = js.native
  def VoidFunction[V](V: V, opts: Options): js.Function | (js.Function1[/* args */ Parameters[V], Unit]) = js.native
  def any[V](V: V): V = js.native
  def any[V](V: V, opts: Options): V = js.native
  def boolean(V: js.Any): Boolean = js.native
  def boolean(V: js.Any, opts: Options): Boolean = js.native
  def byte(V: js.Any): Double = js.native
  def byte(V: js.Any, opts: IntegerOptions): Double = js.native
  def double(V: js.Any): Double = js.native
  def double(V: js.Any, opts: Options): Double = js.native
  def float(V: js.Any): Double = js.native
  def float(V: js.Any, opts: Options): Double = js.native
  def long(V: js.Any): Double = js.native
  def long(V: js.Any, opts: IntegerOptions): Double = js.native
  def `long long`(V: js.Any): Double = js.native
  def `long long`(V: js.Any, opts: IntegerOptions): Double = js.native
  def `object`[V](V: V): (V with js.Object) | V = js.native
  def `object`[V](V: V, opts: Options): (V with js.Object) | V = js.native
  def octet(V: js.Any): Double = js.native
  def octet(V: js.Any, opts: IntegerOptions): Double = js.native
  def short(V: js.Any): Double = js.native
  def short(V: js.Any, opts: IntegerOptions): Double = js.native
  def `unrestricted double`(V: js.Any): Double = js.native
  def `unrestricted double`(V: js.Any, opts: Options): Double = js.native
  def `unrestricted float`(V: js.Any): Double = js.native
  def `unrestricted float`(V: js.Any, opts: Options): Double = js.native
  def `unsigned long`(V: js.Any): Double = js.native
  def `unsigned long`(V: js.Any, opts: IntegerOptions): Double = js.native
  def `unsigned long long`(V: js.Any): Double = js.native
  def `unsigned long long`(V: js.Any, opts: IntegerOptions): Double = js.native
  def `unsigned short`(V: js.Any): Double = js.native
  def `unsigned short`(V: js.Any, opts: IntegerOptions): Double = js.native
  def void(): Unit = js.native
  def void(V: js.UndefOr[scala.Nothing], opts: Options): Unit = js.native
  def void(V: js.Any): Unit = js.native
  def void(V: js.Any, opts: Options): Unit = js.native
}

