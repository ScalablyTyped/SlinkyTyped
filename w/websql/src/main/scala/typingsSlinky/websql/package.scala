package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object websql {
  
  // util interfaces
  type DOMString = java.lang.String
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type DatabaseCallback = js.Function1[/* database */ typingsSlinky.websql.Database, scala.Unit]
  
  type ObjectArray = js.Array[js.Any]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementCallback = js.Function2[
    /* transaction */ typingsSlinky.websql.SQLTransaction, 
    /* resultSet */ typingsSlinky.websql.SQLResultSet, 
    scala.Unit
  ]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementErrorCallback = js.Function2[
    /* transaction */ typingsSlinky.websql.SQLTransaction, 
    /* error */ typingsSlinky.websql.SQLError, 
    scala.Boolean
  ]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionCallback = js.Function1[/* transaction */ typingsSlinky.websql.SQLTransaction, scala.Unit]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionErrorCallback = js.Function1[/* error */ typingsSlinky.websql.SQLError, scala.Unit]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionSyncCallback = js.Function1[/* transaction */ typingsSlinky.websql.SQLTransactionSync, scala.Unit]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLVoidCallback = js.Function0[scala.Unit]
  
  type WorkerUtils = typingsSlinky.websql.WorkerUtilsDatabase
}
