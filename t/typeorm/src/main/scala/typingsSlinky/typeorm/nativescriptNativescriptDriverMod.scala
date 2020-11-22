package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions
import typingsSlinky.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/nativescript/NativescriptDriver", JSImport.Namespace)
@js.native
object nativescriptNativescriptDriverMod extends js.Object {
  
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
