package typingsSlinky.seen.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Context")
@js.native
object Context extends js.Object {
  
  def apply(elementOrId: String): RenderContext = js.native
  def apply(elementOrId: String, scene: Scene): RenderContext = js.native
  def apply(elementOrId: HTMLElement): RenderContext = js.native
  def apply(elementOrId: HTMLElement, scene: Scene): RenderContext = js.native
}
