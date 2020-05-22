package typingsSlinky.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  def render(props: RenderProps): ReactElement
}

object Props {
  @scala.inline
  def apply(render: RenderProps => ReactElement): Props = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Props]
  }
}

