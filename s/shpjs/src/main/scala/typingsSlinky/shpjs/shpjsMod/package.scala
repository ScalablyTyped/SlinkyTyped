package typingsSlinky.shpjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shpjsMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.shpjs.Anon_Buffer

  // All toBuffer() compatible buffers.
  type ShpJSBuffer = Buffer | scala.scalajs.js.typedarray.ArrayBuffer | Anon_Buffer
}
