package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolContextType extends js.Object {
  
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  def log(args: String*): scala.Nothing = js.native
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  @JSName("log")
  var log_Original: LoggerType = js.native
  
  /**
    * Unique connection pool ID
    */
  var poolId: String = js.native
  
  /**
    * The query that is initiating the connection
    */
  var query: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]] | Null = js.native
}
