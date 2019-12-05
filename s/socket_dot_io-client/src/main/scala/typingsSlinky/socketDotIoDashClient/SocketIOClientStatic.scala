package typingsSlinky.socketDotIoDashClient

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.socketDotIoDashClient.SocketIOClient.ConnectOpts
import typingsSlinky.socketDotIoDashClient.SocketIOClient.Manager
import typingsSlinky.socketDotIoDashClient.SocketIOClient.ManagerStatic
import typingsSlinky.socketDotIoDashClient.SocketIOClient.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketIOClientStatic extends js.Object {
  /**
  	 * Manager constructor - exposed for the standalone build
  	 */
  @JSName("Manager")
  var Manager_Original: ManagerStatic = js.native
  /**
  	 * Socket constructor - exposed for the standalone build
  	 */
  var Socket: typingsSlinky.socketDotIoDashClient.SocketIOClient.Socket = js.native
  /**
    * Managers cache
    */
  var managers: StringDictionary[Manager] = js.native
  /**
  	 * The socket.io protocol revision number this client works with
  	 * @default 4
  	 */
  var protocol: Double = js.native
  /**
  	 * Auto-connects to the window location and defalt namespace.
  	 * E.g. window.protocol + '//' + window.host + ':80/'
  	 * @opts Any connect options that we want to pass along
  	 * @return A Socket object
  	 */
  def apply(): Socket = js.native
  def apply(opts: ConnectOpts): Socket = js.native
  /**
  	 * Looks up an existing 'Manager' for multiplexing. If the user summons:
  	 * 	'io( 'http://localhost/a' );'
  	 * 	'io( 'http://localhost/b' );'
  	 *
  	 * We reuse the existing instance based on the same scheme/port/host, and
  	 * we initialize sockets for each namespace. If autoConnect isn't set to
  	 * false in the options, then we'll automatically connect
  	 * @param uri The uri that we'll connect to, including the namespace, where '/' is the default one (e.g. http://localhost:4000/somenamespace)
  	 * @opts Any connect options that we want to pass along
  	 * @return A Socket object
  	 */
  def apply(uri: String): Socket = js.native
  def apply(uri: String, opts: ConnectOpts): Socket = js.native
  /**
  		 * Creates a new Manager with the default URI (window host)
  		 * @param opts Any connection options that we want to use (and pass to engine.io)
  		 */
  /**
  	 * Manager constructor - exposed for the standalone build
  	 */
  def Manager(opts: ConnectOpts): typingsSlinky.socketDotIoDashClient.SocketIOClient.Manager = js.native
  /**
  		 * Creates a new Manager
  		 * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
  		 * @param opts Any connection options that we want to use (and pass to engine.io)
  		 * @return A Manager
  		 */
  /**
  	 * Manager constructor - exposed for the standalone build
  	 */
  def Manager(uri: String): typingsSlinky.socketDotIoDashClient.SocketIOClient.Manager = js.native
  def Manager(uri: String, opts: ConnectOpts): typingsSlinky.socketDotIoDashClient.SocketIOClient.Manager = js.native
  /**
  	 * @see the default constructor (io(opts))
  	 */
  def connect(): Socket = js.native
  def connect(opts: ConnectOpts): Socket = js.native
  /**
  	 * @see the default constructor (io(uri, opts))
  	 */
  def connect(uri: String): Socket = js.native
  def connect(uri: String, opts: ConnectOpts): Socket = js.native
}

