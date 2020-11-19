package typingsSlinky.winrtUwp.global.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a web account authentication provider. */
@JSGlobal("Windows.Security.Credentials.WebAccountProvider")
@js.native
class WebAccountProvider protected ()
  extends typingsSlinky.winrtUwp.Windows.Security.Credentials.WebAccountProvider {
  /**
    * Creates an instance of the WebAccountProvider class.
    * @param id The web account provider id.
    * @param displayName The display name for the web account provider.
    * @param iconUri The Uri of the icon image to display for the web account provider.
    */
  def this(id: String, displayName: String, iconUri: Uri) = this()
}
