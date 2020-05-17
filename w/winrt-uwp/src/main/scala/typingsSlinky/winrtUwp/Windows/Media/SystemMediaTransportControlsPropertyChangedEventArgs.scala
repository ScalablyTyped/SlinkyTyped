package typingsSlinky.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Occurs when a property is changed on the SystemMediaTransportControls . */
@js.native
trait SystemMediaTransportControlsPropertyChangedEventArgs extends js.Object {
  /** The property that was changed on the SystemMediaTransportControls . */
  var property: SystemMediaTransportControlsProperty = js.native
}

object SystemMediaTransportControlsPropertyChangedEventArgs {
  @scala.inline
  def apply(property: SystemMediaTransportControlsProperty): SystemMediaTransportControlsPropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsPropertyChangedEventArgs]
  }
  @scala.inline
  implicit class SystemMediaTransportControlsPropertyChangedEventArgsOps[Self <: SystemMediaTransportControlsPropertyChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperty(value: SystemMediaTransportControlsProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

