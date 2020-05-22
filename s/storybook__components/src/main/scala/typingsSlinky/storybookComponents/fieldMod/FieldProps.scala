package typingsSlinky.storybookComponents.fieldMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps extends js.Object {
  var label: js.UndefOr[TagMod[Any]] = js.native
}

object FieldProps {
  @scala.inline
  def apply(label: TagMod[Any] = null): FieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps]
  }
}

