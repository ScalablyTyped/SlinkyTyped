package typingsSlinky.tediousConnectionPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Provides a connection or an error
    * @param err error if any
    * @param connection issued from the pool
    */
  type ConnectionCallback = js.Function2[
    /* err */ js.Error, 
    /* connection */ typingsSlinky.tediousConnectionPool.mod.PooledConnection, 
    scala.Unit
  ]
}
