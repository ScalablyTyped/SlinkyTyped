package typingsSlinky.typeorm

import typingsSlinky.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/react-native/ReactNativeDriver", JSImport.Namespace)
@js.native
object reactNativeDriverMod extends js.Object {
  
  @js.native
  class ReactNativeDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_ReactNativeDriver: ReactNativeConnectionOptions = js.native
  }
}
