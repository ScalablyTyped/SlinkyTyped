package typingsSlinky.winrt.global.Windows.Web

import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub")
@js.native
object AtomPub extends js.Object {
  @js.native
  class AtomPubClient ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.AtomPubClient {
    def this(serverCredential: PasswordCredential) = this()
  }
  
  @js.native
  class ResourceCollection ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.ResourceCollection
  
  @js.native
  class ServiceDocument ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.ServiceDocument
  
  @js.native
  class Workspace ()
    extends typingsSlinky.winrt.Windows.Web.AtomPub.Workspace
  
}

