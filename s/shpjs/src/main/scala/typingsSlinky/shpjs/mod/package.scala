package typingsSlinky.shpjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // All toBuffer() compatible buffers.
  type ShpJSBuffer = typingsSlinky.node.Buffer | js.typedarray.ArrayBuffer | typingsSlinky.shpjs.AnonBuffer
}
