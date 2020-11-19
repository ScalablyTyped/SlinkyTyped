package typingsSlinky.tinymce.mod.util

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tinymce.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends js.Object {
  
  def clearInterval(interval: Double): Unit = js.native
  
  def clearTimeout(timeout: Double): Unit = js.native
  
  def debounce(callback: js.Function0[Unit], time: Double): js.Function0[Unit] = js.native
  
  def requestAnimationFrame(callback: js.Function0[Unit]): Unit = js.native
  def requestAnimationFrame(callback: js.Function0[Unit], element: HTMLElement): Unit = js.native
  
  def setEditorInterval(callback: js.Function0[Unit], time: Double): Double = js.native
  
  def setEditorTimeout(editor: Editor, callback: js.Function0[Unit], time: Double): Double = js.native
  
  def setInterval(callback: js.Function0[Unit], time: Double): Double = js.native
  
  def setTimeout(callback: js.Function0[Unit], time: Double): Double = js.native
}
