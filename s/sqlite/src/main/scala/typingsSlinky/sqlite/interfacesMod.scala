package typingsSlinky.sqlite

import typingsSlinky.sqlite.sqlTemplateStringsMod.SQLStatement
import typingsSlinky.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  object IMigrate {
    
    @js.native
    trait MigrationData extends StObject {
      
      var down: String = js.native
      
      var id: Double = js.native
      
      var name: String = js.native
      
      var up: String = js.native
    }
    object MigrationData {
      
      @scala.inline
      def apply(down: String, id: Double, name: String, up: String): MigrationData = {
        val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
        __obj.asInstanceOf[MigrationData]
      }
      
      @scala.inline
      implicit class MigrationDataMutableBuilder[Self <: MigrationData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait MigrationFile extends StObject {
      
      var filename: String = js.native
      
      var id: Double = js.native
      
      var name: String = js.native
    }
    object MigrationFile {
      
      @scala.inline
      def apply(filename: String, id: Double, name: String): MigrationFile = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[MigrationFile]
      }
      
      @scala.inline
      implicit class MigrationFileMutableBuilder[Self <: MigrationFile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait MigrationParams extends StObject {
      
      /**
        * If true, will force the migration API to rollback and re-apply the latest migration over
        * again each time when Node.js app launches.
        */
      var force: js.UndefOr[Boolean] = js.native
      
      /**
        * Migration data read from migrations folder. `migrationsPath` will be ignored if this is
        * provided.
        */
      var migrations: js.UndefOr[js.Array[MigrationData]] = js.native
      
      /**
        * Path to the migrations folder. Default is `path.join(process.cwd(), 'migrations')`
        */
      var migrationsPath: js.UndefOr[String] = js.native
      
      /**
        * Migrations table name. Default is 'migrations'
        */
      var table: js.UndefOr[String] = js.native
    }
    object MigrationParams {
      
      @scala.inline
      def apply(): MigrationParams = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MigrationParams]
      }
      
      @scala.inline
      implicit class MigrationParamsMutableBuilder[Self <: MigrationParams] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
        
        @scala.inline
        def setMigrations(value: js.Array[MigrationData]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMigrationsPath(value: String): Self = StObject.set(x, "migrationsPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMigrationsPathUndefined: Self = StObject.set(x, "migrationsPath", js.undefined)
        
        @scala.inline
        def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
        
        @scala.inline
        def setMigrationsVarargs(value: MigrationData*): Self = StObject.set(x, "migrations", js.Array(value :_*))
        
        @scala.inline
        def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      }
    }
  }
  
  object ISqlite {
    
    @js.native
    trait Config extends StObject {
      
      /**
        * The database driver. Most will install `sqlite3` and use the `Database` class from it.
        * As long as the library you are using conforms to the `sqlite3` API, you can use it as
        * the driver.
        *
        * @example
        *
        * ```
        * import sqlite from 'sqlite3'
        *
        * const driver = sqlite.Database
        * ```
        */
      var driver: js.Any = js.native
      
      /**
        * Valid values are filenames, ":memory:" for an anonymous in-memory
        * database and an empty string for an anonymous disk-based database.
        * Anonymous databases are not persisted and when closing the database
        * handle, their contents are lost.
        */
      var filename: String = js.native
      
      /**
        * One or more of sqlite3.OPEN_READONLY, sqlite3.OPEN_READWRITE and
        * sqlite3.OPEN_CREATE. The default value is OPEN_READWRITE | OPEN_CREATE.
        */
      var mode: js.UndefOr[Double] = js.native
    }
    object Config {
      
      @scala.inline
      def apply(driver: js.Any, filename: String): Config = {
        val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDriver(value: js.Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.sqlite.sqliteStrings.trace
      - typingsSlinky.sqlite.sqliteStrings.profile
      - typingsSlinky.sqlite.sqliteStrings.busyTimeout
    */
    trait ConfigureOption extends StObject
    object ConfigureOption {
      
      @scala.inline
      def busyTimeout: typingsSlinky.sqlite.sqliteStrings.busyTimeout = "busyTimeout".asInstanceOf[typingsSlinky.sqlite.sqliteStrings.busyTimeout]
      
      @scala.inline
      def profile: typingsSlinky.sqlite.sqliteStrings.profile = "profile".asInstanceOf[typingsSlinky.sqlite.sqliteStrings.profile]
      
      @scala.inline
      def trace: typingsSlinky.sqlite.sqliteStrings.trace = "trace".asInstanceOf[typingsSlinky.sqlite.sqliteStrings.trace]
    }
    
    @js.native
    trait RunResult[Stmt /* <: Statement */] extends StObject {
      
      /**
        * Number of rows changed.
        *
        * Only contains valid information when the query was a
        * successfully completed UPDATE or DELETE statement.
        */
      var changes: js.UndefOr[Double] = js.native
      
      /**
        * Row id of the inserted row.
        *
        * Only contains valid information when the query was a successfully
        * completed INSERT statement.
        */
      var lastID: js.UndefOr[Double] = js.native
      
      /**
        * Statement object.
        *
        * It is not possible to run the statement again because it is
        * automatically finalized after running for the first time.
        * Any subsequent attempts to run the statement again will fail.
        */
      var stmt: typingsSlinky.sqlite.statementMod.Statement[Stmt] = js.native
    }
    object RunResult {
      
      @scala.inline
      def apply[Stmt /* <: Statement */](stmt: typingsSlinky.sqlite.statementMod.Statement[Stmt]): RunResult[Stmt] = {
        val __obj = js.Dynamic.literal(stmt = stmt.asInstanceOf[js.Any])
        __obj.asInstanceOf[RunResult[Stmt]]
      }
      
      @scala.inline
      implicit class RunResultMutableBuilder[Self <: RunResult[_], Stmt /* <: Statement */] (val x: Self with RunResult[Stmt]) extends AnyVal {
        
        @scala.inline
        def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
        
        @scala.inline
        def setLastID(value: Double): Self = StObject.set(x, "lastID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastIDUndefined: Self = StObject.set(x, "lastID", js.undefined)
        
        @scala.inline
        def setStmt(value: typingsSlinky.sqlite.statementMod.Statement[Stmt]): Self = StObject.set(x, "stmt", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SqlObj extends StObject {
      
      var params: js.UndefOr[js.Array[_]] = js.native
      
      var sql: String = js.native
    }
    object SqlObj {
      
      @scala.inline
      def apply(sql: String): SqlObj = {
        val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
        __obj.asInstanceOf[SqlObj]
      }
      
      @scala.inline
      implicit class SqlObjMutableBuilder[Self <: SqlObj] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParams(value: js.Array[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
        
        @scala.inline
        def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Allows for input of a normal SQL string or
      * `sql-template-strings` object
      */
    type SqlType = SQLStatement | String
  }
}
