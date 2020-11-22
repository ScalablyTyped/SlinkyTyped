package typingsSlinky.typeorm

import typingsSlinky.typeorm.auroraDataApiAuroraDataApiQueryRunnerMod.AuroraDataApiQueryRunner
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/aurora-data-api/AuroraDataApiConnection", JSImport.Namespace)
@js.native
object auroraDataApiAuroraDataApiConnectionMod extends js.Object {
  
  @js.native
  class AuroraDataApiConnection protected () extends Connection {
    def this(options: ConnectionOptions, queryRunner: AuroraDataApiQueryRunner) = this()
    
    var queryRunnter: AuroraDataApiQueryRunner = js.native
  }
}
