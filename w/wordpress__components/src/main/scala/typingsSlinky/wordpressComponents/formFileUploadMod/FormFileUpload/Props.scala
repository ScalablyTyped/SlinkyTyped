package typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload.IconButtonProps
  - typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload.RenderProps
*/
trait Props extends js.Object
object Props {
  
  @scala.inline
  def IconButtonProps(onChange: ChangeEvent[HTMLInputElement] => Unit): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  def RenderProps(onChange: ChangeEvent[HTMLInputElement] => Unit, render: OpenFileDialog => ReactElement): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Props]
  }
}
