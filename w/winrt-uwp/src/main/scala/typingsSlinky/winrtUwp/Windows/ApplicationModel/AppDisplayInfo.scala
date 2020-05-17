package typingsSlinky.winrtUwp.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.Foundation.Size
import typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an application's name, description, and logo. */
@js.native
trait AppDisplayInfo extends js.Object {
  /** Gets the application's description. */
  var description: String = js.native
  /** Gets the application's display name. */
  var displayName: String = js.native
  /**
    * Get the application's logo.
    * @param size The size of the rectangle in which the logo must fit.
    * @return The largest logo in your Package.appxmanifest file that will fit in the specified Size.
    */
  def getLogo(size: Size): RandomAccessStreamReference = js.native
}

object AppDisplayInfo {
  @scala.inline
  def apply(description: String, displayName: String, getLogo: Size => RandomAccessStreamReference): AppDisplayInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getLogo = js.Any.fromFunction1(getLogo))
    __obj.asInstanceOf[AppDisplayInfo]
  }
  @scala.inline
  implicit class AppDisplayInfoOps[Self <: AppDisplayInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLogo(value: Size => RandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLogo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

