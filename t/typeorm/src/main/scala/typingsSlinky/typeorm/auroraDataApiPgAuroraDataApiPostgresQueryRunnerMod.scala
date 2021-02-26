package typingsSlinky.typeorm

import typingsSlinky.typeorm.auroraDataApiPgAuroraDataApiPostgresDriverMod.AuroraDataApiPostgresDriver
import typingsSlinky.typeorm.postgresPostgresQueryRunnerMod.PostgresQueryRunner
import typingsSlinky.typeorm.typesReplicationModeMod.ReplicationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiPgAuroraDataApiPostgresQueryRunnerMod {
  
  @JSImport("typeorm/driver/aurora-data-api-pg/AuroraDataApiPostgresQueryRunner", "AuroraDataApiPostgresQueryRunner")
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
