package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions
import typingsSlinky.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaCordovaDriverMod {
  
  @JSImport("typeorm/driver/cordova/CordovaDriver", "CordovaDriver")
  @js.native
  class CordovaDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_CordovaDriver: CordovaConnectionOptions = js.native
  }
}
