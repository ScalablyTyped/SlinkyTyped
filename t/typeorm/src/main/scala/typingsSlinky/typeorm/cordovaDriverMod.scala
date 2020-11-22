package typingsSlinky.typeorm

import typingsSlinky.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/cordova/CordovaDriver", JSImport.Namespace)
@js.native
object cordovaDriverMod extends js.Object {
  
  @js.native
  class CordovaDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_CordovaDriver: CordovaConnectionOptions = js.native
  }
}
