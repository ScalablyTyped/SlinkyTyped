package typingsSlinky.winrtUwp.global.Windows.Web

import typingsSlinky.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables HTTP CRUD access to Web resources using the AtomPub protocol. The AtomPub sample demonstrates this implementation. */
@JSGlobal("Windows.Web.AtomPub")
@js.native
object AtomPub extends js.Object {
  
  /** Encapsulates the methods needed to implement the AtomPub protocol which enables HTTP CRUD access to Web resources using the Atom 1.0 wire format. */
  @js.native
  /** Creates a new AtomPubClient object. */
  class AtomPubClient ()
    extends typingsSlinky.winrtUwp.Windows.Web.AtomPub.AtomPubClient {
    /**
      * Creates a new AtomPubClient object with the credential to use when making requests to the server. Initially, a 'username/password' tuple. However, for domain credentials, the username must be in 'domain\\user form'.
      * @param serverCredential The specified security credentials.
      */
    def this(serverCredential: PasswordCredential) = this()
  }
  
  /** Encapsulates one or more collections within a workspace. */
  @js.native
  abstract class ResourceCollection ()
    extends typingsSlinky.winrtUwp.Windows.Web.AtomPub.ResourceCollection
  
  /** Encapsulates a service document. */
  @js.native
  abstract class ServiceDocument ()
    extends typingsSlinky.winrtUwp.Windows.Web.AtomPub.ServiceDocument
  
  /** Encapsulates a workspace in a service document. */
  @js.native
  abstract class Workspace ()
    extends typingsSlinky.winrtUwp.Windows.Web.AtomPub.Workspace
}
