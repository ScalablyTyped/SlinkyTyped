package typingsSlinky.typeorm

import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.reactNativeReactNativeDriverMod.ReactNativeDriver
import typingsSlinky.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/react-native/ReactNativeQueryRunner", JSImport.Namespace)
@js.native
object reactNativeReactNativeQueryRunnerMod extends js.Object {
  
  @js.native
  class ReactNativeQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: ReactNativeDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_ReactNativeQueryRunner: ReactNativeDriver = js.native
    
    /**
      * Parametrizes given object of values. Used to create column=value queries.
      */
    /* protected */ def parametrize(objectLiteral: ObjectLiteral): js.Array[String] = js.native
    /* protected */ def parametrize(objectLiteral: ObjectLiteral, startIndex: Double): js.Array[String] = js.native
  }
}
