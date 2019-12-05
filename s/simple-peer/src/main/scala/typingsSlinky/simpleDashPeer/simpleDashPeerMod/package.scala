package typingsSlinky.simpleDashPeer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simpleDashPeerMod {
  import org.scalajs.dom.raw.Blob
  import typingsSlinky.node.Buffer

  type SimplePeerData = String | Buffer | TypedArray | scala.scalajs.js.typedarray.ArrayBuffer | Blob
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
}
