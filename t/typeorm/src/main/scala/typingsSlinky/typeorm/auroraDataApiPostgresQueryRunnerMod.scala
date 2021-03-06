package typingsSlinky.typeorm

import typingsSlinky.typeorm.auroraDataApiPostgresDriverMod.AuroraDataApiPostgresDriver
import typingsSlinky.typeorm.postgresQueryRunnerMod.PostgresQueryRunner
import typingsSlinky.typeorm.replicationModeMod.ReplicationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiPostgresQueryRunnerMod {
  
  @JSImport("typeorm/browser/driver/aurora-data-api-pg/AuroraDataApiPostgresQueryRunner", "AuroraDataApiPostgresQueryRunner")
  @js.native
  class AuroraDataApiPostgresQueryRunner protected () extends PostgresQueryRunnerWrapper {
    def this(driver: AuroraDataApiPostgresDriver, mode: ReplicationMode) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_AuroraDataApiPostgresQueryRunner: AuroraDataApiPostgresDriver = js.native
  }
  
  @js.native
  trait PostgresQueryRunnerWrapper extends PostgresQueryRunner
}
