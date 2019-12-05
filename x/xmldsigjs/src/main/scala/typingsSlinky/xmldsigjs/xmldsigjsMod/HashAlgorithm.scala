package typingsSlinky.xmldsigjs.xmldsigjsMod

import typingsSlinky.std.BufferSource
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.xmldsigjs.xmldsigjsMod.IAlgorithm because Already inherited
- typings.xmldsigjs.xmldsigjsMod.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @JSImport("xmldsigjs", "HashAlgorithm")
@js.native
abstract class HashAlgorithm () extends XmlAlgorithm {
  def Digest(xml: String): js.Thenable[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Thenable[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: Node): js.Thenable[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

