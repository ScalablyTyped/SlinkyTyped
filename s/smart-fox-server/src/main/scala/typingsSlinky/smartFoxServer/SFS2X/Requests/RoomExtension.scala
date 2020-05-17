package typingsSlinky.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomExtension extends js.Object {
  /** @type {string} Returns the fully qualified name of the main class of the Extension. */
  var className: String = js.native
  /** @type {string} Returns the name of the Extension to be attached to the Room. */
  var id: String = js.native
  /** @type {string} Sets the name of an optional properties file that should be loaded on the server-side during the Extension initialization. */
  var propertiesFile: String = js.native
}

object RoomExtension {
  @scala.inline
  def apply(className: String, id: String, propertiesFile: String): RoomExtension = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], propertiesFile = propertiesFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomExtension]
  }
  @scala.inline
  implicit class RoomExtensionOps[Self <: RoomExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertiesFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesFile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

