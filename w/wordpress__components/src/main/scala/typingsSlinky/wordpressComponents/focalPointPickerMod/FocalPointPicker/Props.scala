package typingsSlinky.wordpressComponents.focalPointPickerMod.FocalPointPicker

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.baseControlMod.BaseControl.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends ControlProps {
  /**
    * URL of the image to be displayed.
    */
  var url: String
  /**
    * The focal point.
    */
  var value: FocalPoint
  /**
    * Callback which is called when the focal point changes.
    */
  def onChange(value: FocalPoint): Unit
}

object Props {
  @scala.inline
  def apply(
    onChange: FocalPoint => Unit,
    url: String,
    value: FocalPoint,
    className: String = null,
    help: TagMod[Any] = null,
    hideLabelFromVision: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null
  ): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabelFromVision)) __obj.updateDynamic("hideLabelFromVision")(hideLabelFromVision.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

