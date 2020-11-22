package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.removeOptionsMod.RemoveOptions
import typingsSlinky.typeorm.saveOptionsMod.SaveOptions
import typingsSlinky.typeorm.typeormStrings.`soft-remove`
import typingsSlinky.typeorm.typeormStrings.recover
import typingsSlinky.typeorm.typeormStrings.remove
import typingsSlinky.typeorm.typeormStrings.save
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/persistence/EntityPersistExecutor", JSImport.Namespace)
@js.native
object entityPersistExecutorMod extends js.Object {
  
  @js.native
  class EntityPersistExecutor protected () extends js.Object {
    def this(
      connection: Connection,
      queryRunner: js.UndefOr[QueryRunner],
      mode: save | remove | `soft-remove` | recover,
      target: js.UndefOr[js.Function | String],
      entity: ObjectLiteral | js.Array[ObjectLiteral],
      options: js.UndefOr[SaveOptions with RemoveOptions]
    ) = this()
    
    var connection: Connection = js.native
    
    var entity: ObjectLiteral | js.Array[ObjectLiteral] = js.native
    
    /**
      * Executes persistence operation ob given entity or entities.
      */
    def execute(): js.Promise[Unit] = js.native
    
    var mode: save | remove | `soft-remove` | recover = js.native
    
    var options: js.UndefOr[SaveOptions with RemoveOptions] = js.native
    
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    var target: js.UndefOr[js.Function | String] = js.native
  }
}
