package typingsSlinky.winrtUwp.global.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the password credential store. */
@JSGlobal("Windows.Security.Credentials.PasswordCredential")
@js.native
/** Creates and initializes a new, empty instance of the PasswordCredential object. */
class PasswordCredential ()
  extends typingsSlinky.winrtUwp.Windows.Security.Credentials.PasswordCredential {
  /**
    * Creates and initializes a new instance of the PasswordCredential object that contains the provided credential data.
    * @param resource The resource for which the credentials are used.
    * @param userName The user name that must be present in the credentials.
    * @param password The password for the created credentials.
    */
  def this(resource: String, userName: String, password: String) = this()
}
