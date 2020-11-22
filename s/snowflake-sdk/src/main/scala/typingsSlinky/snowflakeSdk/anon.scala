package typingsSlinky.snowflakeSdk

import typingsSlinky.snowflakeSdk.mod.Statement
import typingsSlinky.snowflakeSdk.snowflakeSdkStrings.Boolean
import typingsSlinky.snowflakeSdk.snowflakeSdkStrings.Date
import typingsSlinky.snowflakeSdk.snowflakeSdkStrings.JSON
import typingsSlinky.snowflakeSdk.snowflakeSdkStrings.Number
import typingsSlinky.snowflakeSdk.snowflakeSdkStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Binds extends js.Object {
    
    var binds: js.UndefOr[typingsSlinky.snowflakeSdk.mod.Binds] = js.native
    
    def complete(err: js.Error, stmt: Statement): Unit = js.native
    def complete(err: js.Error, stmt: Statement, rows: js.Array[_]): Unit = js.native
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#fetching-data-types-as-strings Fetching Data Types As Strings}
      */
    var fetchAsString: js.UndefOr[js.Array[String | Boolean | Number | Date | JSON]] = js.native
    
    var sqlText: java.lang.String = js.native
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#batch-processing-results Batch Processing Results}
      */
    var streamResult: js.UndefOr[scala.Boolean] = js.native
  }
}
