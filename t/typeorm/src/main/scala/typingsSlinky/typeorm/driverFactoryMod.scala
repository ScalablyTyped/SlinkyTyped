package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.driverMod.Driver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/DriverFactory", JSImport.Namespace)
@js.native
object driverFactoryMod extends js.Object {
  
  @js.native
  class DriverFactory () extends js.Object {
    
    /**
      * Creates a new driver depend on a given connection's driver type.
      */
    def create(connection: Connection): Driver = js.native
  }
}
