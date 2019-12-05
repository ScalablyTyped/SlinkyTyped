package typingsSlinky.atStorybookComponents.distFormFieldFieldMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps extends js.Object {
  var label: js.UndefOr[TagMod[Any]] = js.undefined
}

object FieldProps {
  @scala.inline
  def apply(label: TagMod[Any] = null): FieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps]
  }
}

