package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sync Options
  *
  * @see Sequelize.sync
  */
@js.native
trait SyncOptions extends StObject {
  
  /**
    * Alters tables to fit models. Not recommended for production use. Deletes data in columns
    * that were removed or had their type changed in the model.
    */
  var alter: js.UndefOr[Boolean] = js.native
  
  /**
    * If force is true, each DAO will do DROP TABLE IF EXISTS ..., before it tries to create its own table
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * If hooks is true then beforeSync, afterSync, beforBulkSync, afterBulkSync hooks will be called
    */
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that logs sql queries, or false for no logging
    */
  var logging: js.UndefOr[js.Function | Boolean] = js.native
  
  /**
    * Match a regex against the database name before syncing, a safety check for cases where force: true is
    * used in tests but not live code
    */
  var `match`: js.UndefOr[js.RegExp] = js.native
  
  /**
    * The schema that the tables should be created in. This can be overriden for each table in sequelize.define
    */
  var schema: js.UndefOr[String] = js.native
  
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[String] = js.native
}
object SyncOptions {
  
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  
  @scala.inline
  implicit class SyncOptionsMutableBuilder[Self <: SyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlter(value: Boolean): Self = StObject.set(x, "alter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlterUndefined: Self = StObject.set(x, "alter", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setLogging(value: js.Function | Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSearchPath(value: String): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
  }
}
