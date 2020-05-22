package typingsSlinky.splashy

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("splashy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(source: ImageSource): js.Promise[js.Array[String]] = js.native
  type ImageSource = String | HTMLImageElement | Buffer
}

