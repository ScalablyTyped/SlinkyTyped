package typingsSlinky.seen.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.seen.anon.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasTextPainter")
@js.native
class CanvasTextPainter protected () extends StObject {
  def this(ctx: CanvasRenderingContext2D) = this()
  
  def fillText(m: Matrix, text: String): this.type = js.native
  def fillText(m: Matrix, text: String, style: Font): this.type = js.native
}
