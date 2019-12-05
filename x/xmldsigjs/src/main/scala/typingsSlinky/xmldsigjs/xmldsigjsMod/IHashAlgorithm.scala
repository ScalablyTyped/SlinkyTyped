package typingsSlinky.xmldsigjs.xmldsigjsMod

import typingsSlinky.std.BufferSource
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashAlgorithm extends IAlgorithm {
  def Digest(xml: String): js.Thenable[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Thenable[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: Node): js.Thenable[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

