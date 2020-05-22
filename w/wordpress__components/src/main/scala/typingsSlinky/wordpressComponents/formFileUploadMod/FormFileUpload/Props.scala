package typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload.IconButtonProps
  - typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload.RenderProps
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def RenderProps(
    onChange: ChangeEvent[HTMLInputElement] => Unit,
    render: OpenFileDialog => ReactElement,
    accept: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

