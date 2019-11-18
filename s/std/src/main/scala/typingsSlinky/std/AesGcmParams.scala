package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGcmParams extends Algorithm {
  var additionalData: js.UndefOr[
    scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer
  ] = js.undefined
  var iv: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer
  var tagLength: js.UndefOr[Double] = js.undefined
}

object AesGcmParams {
  @scala.inline
  def apply(
    iv: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer,
    name: java.lang.String,
    additionalData: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer = null,
    tagLength: Int | Double = null
  ): AesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (tagLength != null) __obj.updateDynamic("tagLength")(tagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmParams]
  }
}

