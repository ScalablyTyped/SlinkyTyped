package typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProps
  extends BaseProps
     with Props {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Callback function used to render the UI. If passed the component
    * does not render any UI and calls this function to render it. This
    * function receives an object with the property openFileDialog. The
    * property is a function that when called opens the browser window to
    * upload files.
    */
  def render(props: OpenFileDialog): ReactElement = js.native
}
object RenderProps {
  
  @scala.inline
  def apply(onChange: ChangeEvent[HTMLInputElement] => Unit, render: OpenFileDialog => ReactElement): RenderProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[RenderProps]
  }
  
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRender(value: OpenFileDialog => ReactElement): Self = this.set("render", js.Any.fromFunction1(value))
  }
}
