package typingsSlinky.socketIoUsers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Application_
import typingsSlinky.expressSession.mod.SessionOptions
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socket.io.users", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var CONNECTION_EVENTS: js.Array[String] = js.native
  
  var Middleware: js.Function0[js.Function2[/* socket */ Socket, /* next */ js.Function0[js.Any], Unit]] = js.native
  
  var Session: js.Function2[/* app */ Application_, /* options */ js.UndefOr[SessionOptions], Unit] = js.native
  
  @js.native
  class Namespaces () extends js.Object
  /* static members */
  @js.native
  object Namespaces extends js.Object {
    
    def attach(namespace: String, socketUsersObj: Users): Unit = js.native
    
    def get(namespace: String): Users = js.native
    
    var socketUsersList: js.Any = js.native
  }
  
  @js.native
  class User () extends js.Object {
    
    def attach(socket: Socket): Unit = js.native
    
    /** same as in, checks if this user is inside a room */
    def belong(room: String): Boolean = js.native
    
    def detach(): Unit = js.native
    
    def detachSocket(socket: Socket): Unit = js.native
    
    def emit(args: js.Any*): Unit = js.native
    
    def get(key: String): js.Any = js.native
    
    var id: String | Double = js.native
    
    /** same as belong, checks if this user is inside a room  */
    def in(room: String): Boolean = js.native
    
    var ip: String = js.native
    
    def join(room: String): Boolean = js.native
    
    def leave(room: String): Unit = js.native
    
    def leaveAll(): Unit = js.native
    
    var remoteAddresses: js.Array[String] = js.native
    
    var rooms: js.Array[String] = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: String, value: js.Any, callback: js.Function0[Unit]): Unit = js.native
    
    var socket: Socket = js.native
    
    var sockets: js.Array[Socket] = js.native
    
    var store: js.Any = js.native
    
    def to(room: String): Socket = js.native
  }
  
  @js.native
  class Users () extends EventEmitter {
    def this(namespace: String) = this()
    
    def add(socket: Socket): User = js.native
    
    def create(socket: Socket): User = js.native
    
    def emitAll(args: js.Any*): Unit = js.native
    
    def from(room: String): js.Array[User] = js.native
    
    def get(socket: Socket): User = js.native
    
    def getById(id: String): User = js.native
    def getById(id: Double): User = js.native
    
    def in(room: String): js.Array[User] = js.native
    
    def indexOf(user: User): Double = js.native
    
    def list(): js.Array[User] = js.native
    
    var namespace: String = js.native
    
    def push(_user: User): Unit = js.native
    
    def registerSocketEvents(currentUser: User): Unit = js.native
    
    def remove(user: User): Unit = js.native
    
    def room(room: String): js.Array[User] = js.native
    
    def size(): Double = js.native
    
    def takeId(request: js.Any): String | Double = js.native
    
    def update(user: User): Unit = js.native
    
    var users: js.Array[User] = js.native
  }
  /* static members */
  @js.native
  object Users extends js.Object {
    
    def of(): Users = js.native
    def of(namespace: String): Users = js.native
  }
  
  type SocketUserList = StringDictionary[Users]
}
