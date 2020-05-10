package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorBeacon extends js.Object {
  def sendBeacon(url: java.lang.String): scala.Boolean = js.native
  def sendBeacon(
    url: java.lang.String,
    data: org.scalajs.dom.raw.Blob | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | org.scalajs.dom.raw.FormData | java.lang.String
  ): scala.Boolean = js.native
}

