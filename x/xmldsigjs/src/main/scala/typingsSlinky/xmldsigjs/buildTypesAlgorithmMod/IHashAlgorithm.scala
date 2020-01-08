package typingsSlinky.xmldsigjs.buildTypesAlgorithmMod

import typingsSlinky.std.BufferSource
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashAlgorithm extends IAlgorithm {
  def Digest(xml: String): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: Node): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

