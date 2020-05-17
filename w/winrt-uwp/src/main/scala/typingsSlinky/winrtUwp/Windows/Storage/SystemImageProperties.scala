package typingsSlinky.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows image file properties. */
@js.native
trait SystemImageProperties extends js.Object {
  /** Gets the name of the System.Image.HorizontalSize property (one of the Windows image file properties). */
  var horizontalSize: String = js.native
  /** Gets the name of the System.Image.VerticalSize property (one of the Windows image file properties). */
  var verticalSize: String = js.native
}

object SystemImageProperties {
  @scala.inline
  def apply(horizontalSize: String, verticalSize: String): SystemImageProperties = {
    val __obj = js.Dynamic.literal(horizontalSize = horizontalSize.asInstanceOf[js.Any], verticalSize = verticalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemImageProperties]
  }
  @scala.inline
  implicit class SystemImagePropertiesOps[Self <: SystemImageProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

