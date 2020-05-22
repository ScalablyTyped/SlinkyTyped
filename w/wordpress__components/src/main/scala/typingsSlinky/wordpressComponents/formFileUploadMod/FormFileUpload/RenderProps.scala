package typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps
  extends BaseProps
     with Props {
  /**
    * Callback function used to render the UI. If passed the component
    * does not render any UI and calls this function to render it. This
    * function receives an object with the property openFileDialog. The
    * property is a function that when called opens the browser window to
    * upload files.
    */
  def render(props: OpenFileDialog): ReactElement
}

object RenderProps {
  @scala.inline
  def apply(
    onChange: ChangeEvent[HTMLInputElement] => Unit,
    render: OpenFileDialog => ReactElement,
    accept: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): RenderProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

