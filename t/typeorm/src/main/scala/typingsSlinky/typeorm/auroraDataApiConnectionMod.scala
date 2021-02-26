package typingsSlinky.typeorm

import typingsSlinky.typeorm.auroraDataApiQueryRunnerMod.AuroraDataApiQueryRunner
import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.connectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiConnectionMod {
  
  @JSImport("typeorm/browser/driver/aurora-data-api/AuroraDataApiConnection", "AuroraDataApiConnection")
  @js.native
  class AuroraDataApiConnection protected () extends Connection {
    def this(options: ConnectionOptions, queryRunner: AuroraDataApiQueryRunner) = this()
    
    var queryRunnter: AuroraDataApiQueryRunner = js.native
  }
}
