package typingsSlinky.skiaCanvas.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skia-canvas", "loadImage")
@js.native
object loadImage extends js.Object {
  
  def apply(src: String): js.Promise[Image] = js.native
  def apply(src: Buffer): js.Promise[Image] = js.native
}
