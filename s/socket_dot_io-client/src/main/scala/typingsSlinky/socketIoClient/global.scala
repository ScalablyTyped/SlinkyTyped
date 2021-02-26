package typingsSlinky.socketIoClient

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.socketIoClient.SocketIOClient.ConnectOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object io extends Shortcut {
    
    @JSGlobal("io")
    @js.native
    val ^ : SocketIOClientStatic = js.native
    
    /**
      * Manager constructor - exposed for the standalone build
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("io.Manager")
    @js.native
    class Manager protected ()
      extends typingsSlinky.socketIoClient.SocketIOClient.Manager {
      /**
        * @see default constructor
        */
      def this(opts: ConnectOpts) = this()
      /**
        * @see default constructor
        */
      def this(uri: String) = this()
      def this(uri: String, opts: ConnectOpts) = this()
    }
    
    type _To = SocketIOClientStatic
    
    /* This means you don't have to write `^`, but can instead just say `io.foo` */
    override def _to: SocketIOClientStatic = ^
  }
}
