package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaOaepParams extends Algorithm {
  var label: js.UndefOr[
    scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer
  ] = js.undefined
}

object RsaOaepParams {
  @scala.inline
  def apply(
    name: java.lang.String,
    label: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer = null
  ): RsaOaepParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOaepParams]
  }
}

