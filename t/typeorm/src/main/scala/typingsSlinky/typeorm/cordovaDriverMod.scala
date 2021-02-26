package typingsSlinky.typeorm

import typingsSlinky.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaDriverMod {
  
  @JSImport("typeorm/browser/driver/cordova/CordovaDriver", "CordovaDriver")
  @js.native
  class CordovaDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_CordovaDriver: CordovaConnectionOptions = js.native
  }
}
