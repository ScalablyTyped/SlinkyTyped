package typingsSlinky.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /** 4.6 Errors and exceptions - asynchronous database API error
    */
  @js.native
  class SQLError ()
    extends typingsSlinky.websql.SQLError
  /* static members */
  @js.native
  object SQLError extends js.Object {
    
     // = 5;
    var CONSTRAINT_ERR: Double = js.native
    
     // = 0;
    var DATABASE_ERR: Double = js.native
    
     // = 3;
    var QUOTA_ERR: Double = js.native
    
     // = 4;
    var SYNTAX_ERR: Double = js.native
    
     // = 6;
    var TIMEOUT_ERR: Double = js.native
    
     // = 2;
    var TOO_LARGE_ERR: Double = js.native
    
    var UNKNOWN_ERR: Double = js.native
    
     // = 1;
    var VERSION_ERR: Double = js.native
  }
  
  // synchronous database API error
  @js.native
  class SQLException ()
    extends typingsSlinky.websql.SQLException
  /* static members */
  @js.native
  object SQLException extends js.Object {
    
     // = 5;
    /** Code 6 - An INSERT, UPDATE, or REPLACE statement failed due to a constraint failure.
      * For example, because a row was being inserted and the value given for the primary
      * key column duplicated the value of an existing row. */
    var CONSTRAINT_ERR: Double = js.native
    
     // = 0;
    /** Code 1 - The statement failed for database reasons not covered by any other error code. */
    var DATABASE_ERR: Double = js.native
    
     // = 3;
    /** Code 4 - The statement failed because there was not enough remaining storage space,
      * or the storage quota was reached and the user declined to give more space to the database.
      */
    var QUOTA_ERR: Double = js.native
    
     // = 4;
    /** Code 5 - The statement failed because of a syntax error, or the number of arguments did
      * not match the number of ? placeholders in the statement, or the statement tried to use a
      * statement that is not allowed, such as BEGIN, COMMIT, or ROLLBACK, or the statement tried
      * to use a verb that could modify the database but the transaction was read-only. */
    var SYNTAX_ERR: Double = js.native
    
     // = 6;
    /** Code 7 - A lock for the transaction could not be obtained in a reasonable time. */
    var TIMEOUT_ERR: Double = js.native
    
     // = 2;
    /** Code 3 - The statement failed because the data returned from the database was too large.
      * The SQL "LIMIT" modifier might be useful to reduce the size of the result set.
      */
    var TOO_LARGE_ERR: Double = js.native
    
    /** Code 0 - The transaction failed for reasons unrelated to the database itself
      * and not covered by any other error code.
      */
    var UNKNOWN_ERR: Double = js.native
    
     // = 1;
    /** Code 2 - The operation failed because the actual database version was not what it should be.
      * For example, a statement found that the actual database version no longer matched the
      * expected version of the Database or DatabaseSync object, or the Database.changeVersion()
      * or DatabaseSync.changeVersion() methods were passed a version that doesn't match the actual database version.
      */
    var VERSION_ERR: Double = js.native
  }
}
