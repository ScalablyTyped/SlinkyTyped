package typingsSlinky.xmldsigjs.algorithmMod

import org.scalajs.dom.raw.Node
import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHashAlgorithm extends IAlgorithm {
  
  def Digest(xml: String): js.Promise[js.typedarray.Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Promise[js.typedarray.Uint8Array] = js.native
  def Digest(xml: Node): js.Promise[js.typedarray.Uint8Array] = js.native
}
