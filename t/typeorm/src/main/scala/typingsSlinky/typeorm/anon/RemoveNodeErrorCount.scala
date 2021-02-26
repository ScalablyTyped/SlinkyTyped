package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.mysqlMysqlConnectionCredentialsOptionsMod.MysqlConnectionCredentialsOptions
import typingsSlinky.typeorm.typeormStrings.ORDER
import typingsSlinky.typeorm.typeormStrings.RANDOM
import typingsSlinky.typeorm.typeormStrings.RR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveNodeErrorCount extends StObject {
  
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  val canRetry: js.UndefOr[Boolean] = js.native
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: MysqlConnectionCredentialsOptions = js.native
  
  /**
    * If connection fails, node's errorCount increases.
    * When errorCount is greater than removeNodeErrorCount, remove a node in the PoolCluster. (Default: 5)
    */
  val removeNodeErrorCount: js.UndefOr[Double] = js.native
  
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  val restoreNodeTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Determines how slaves are selected:
    * RR: Select one alternately (Round-Robin).
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  val selector: js.UndefOr[RR | RANDOM | ORDER] = js.native
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[MysqlConnectionCredentialsOptions] = js.native
}
object RemoveNodeErrorCount {
  
  @scala.inline
  def apply(master: MysqlConnectionCredentialsOptions, slaves: js.Array[MysqlConnectionCredentialsOptions]): RemoveNodeErrorCount = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNodeErrorCount]
  }
  
  @scala.inline
  implicit class RemoveNodeErrorCountMutableBuilder[Self <: RemoveNodeErrorCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanRetry(value: Boolean): Self = StObject.set(x, "canRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRetryUndefined: Self = StObject.set(x, "canRetry", js.undefined)
    
    @scala.inline
    def setMaster(value: MysqlConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveNodeErrorCount(value: Double): Self = StObject.set(x, "removeNodeErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveNodeErrorCountUndefined: Self = StObject.set(x, "removeNodeErrorCount", js.undefined)
    
    @scala.inline
    def setRestoreNodeTimeout(value: Double): Self = StObject.set(x, "restoreNodeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreNodeTimeoutUndefined: Self = StObject.set(x, "restoreNodeTimeout", js.undefined)
    
    @scala.inline
    def setSelector(value: RR | RANDOM | ORDER): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSlaves(value: js.Array[MysqlConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: MysqlConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
