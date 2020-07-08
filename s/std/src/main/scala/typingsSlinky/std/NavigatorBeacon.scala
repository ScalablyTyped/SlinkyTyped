package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorBeacon extends js.Object {
  def sendBeacon(
    url: java.lang.String,
    data: js.UndefOr[
      org.scalajs.dom.raw.Blob | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | org.scalajs.dom.raw.FormData | java.lang.String | Null
    ]
  ): scala.Boolean
}

object NavigatorBeacon {
  @scala.inline
  def apply(
    sendBeacon: (java.lang.String, js.UndefOr[
      org.scalajs.dom.raw.Blob | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | org.scalajs.dom.raw.FormData | java.lang.String | Null
    ]) => scala.Boolean
  ): NavigatorBeacon = {
    val __obj = js.Dynamic.literal(sendBeacon = js.Any.fromFunction2(sendBeacon))
    __obj.asInstanceOf[NavigatorBeacon]
  }
  @scala.inline
  implicit class NavigatorBeaconOps[Self <: NavigatorBeacon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSendBeacon(
      value: (java.lang.String, js.UndefOr[
          org.scalajs.dom.raw.Blob | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | org.scalajs.dom.raw.FormData | java.lang.String | Null
        ]) => scala.Boolean
    ): Self = this.set("sendBeacon", js.Any.fromFunction2(value))
  }
  
}

