package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialDescriptor extends js.Object {
  var id: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer | Null
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  var `type`: ScopedCredentialType
}

object ScopedCredentialDescriptor {
  @scala.inline
  def apply(
    `type`: ScopedCredentialType,
    id: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer = null,
    transports: js.Array[Transport] = null
  ): ScopedCredentialDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialDescriptor]
  }
}

