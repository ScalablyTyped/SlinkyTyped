package typingsSlinky.typeorm

import typingsSlinky.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/nativescript/NativescriptDriver", JSImport.Namespace)
@js.native
object nativescriptDriverMod extends js.Object {
  
  @js.native
  class NativescriptDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    /**
      * Nativescript driver module
      * this is most likely `nativescript-sqlite`
      * but user can pass his own
      */
    var driver: js.Any = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_NativescriptDriver: NativescriptConnectionOptions = js.native
  }
}
