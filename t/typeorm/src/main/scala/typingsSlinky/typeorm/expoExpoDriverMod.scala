package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions
import typingsSlinky.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoExpoDriverMod {
  
  @JSImport("typeorm/driver/expo/ExpoDriver", "ExpoDriver")
  @js.native
  class ExpoDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_ExpoDriver: ExpoConnectionOptions = js.native
  }
}
