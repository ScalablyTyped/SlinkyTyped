package typingsSlinky.umzug

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.mongodb.mod.Collection
import typingsSlinky.mongodb.mod.Db
import typingsSlinky.mongodb.mod.DefaultSchema
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.sequelize.mod.DataTypeAbstract
import typingsSlinky.sequelize.mod.Model
import typingsSlinky.sequelize.mod.Sequelize
import typingsSlinky.umzug.anon.Down
import typingsSlinky.umzug.umzugNumbers.`0`
import typingsSlinky.umzug.umzugStrings.json
import typingsSlinky.umzug.umzugStrings.migrated
import typingsSlinky.umzug.umzugStrings.migrating
import typingsSlinky.umzug.umzugStrings.mongodb
import typingsSlinky.umzug.umzugStrings.reverted
import typingsSlinky.umzug.umzugStrings.reverting
import typingsSlinky.umzug.umzugStrings.sequelize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("umzug", JSImport.Namespace)
  @js.native
  class ^ () extends Umzug {
    def this(options: UmzugOptions) = this()
  }
  @JSImport("umzug", JSImport.Namespace)
  @js.native
  val ^ : UmzugStatic = js.native
  
  @js.native
  trait DownToOptions extends StObject {
    
    /**
      * It is also possible to pass the name of a migration in order to
      * just run the migrations from the current state to the passed
      * migration name. down allows to pass 0 to revert everything.
      */
    var to: String | `0` = js.native
  }
  object DownToOptions {
    
    @scala.inline
    def apply(to: String | `0`): DownToOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownToOptions]
    }
    
    @scala.inline
    implicit class DownToOptionsMutableBuilder[Self <: DownToOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTo(value: String | `0`): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecuteOptions extends StObject {
    
    var method: js.UndefOr[String] = js.native
    
    var migrations: js.UndefOr[js.Array[String]] = js.native
  }
  object ExecuteOptions {
    
    @scala.inline
    def apply(): ExecuteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteOptions]
    }
    
    @scala.inline
    implicit class ExecuteOptionsMutableBuilder[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMigrations(value: js.Array[String]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      @scala.inline
      def setMigrationsVarargs(value: String*): Self = StObject.set(x, "migrations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait JSONStorageOptions extends Storage {
    
    /**
      * The path to the json storage.
      * Defaults to process.cwd() + '/umzug.json';
      */
    var path: js.UndefOr[String] = js.native
  }
  object JSONStorageOptions {
    
    @scala.inline
    def apply(
      executed: () => js.Promise[js.Array[String]],
      logMigration: String => js.Promise[Unit],
      unlogMigration: String => js.Promise[Unit]
    ): JSONStorageOptions = {
      val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
      __obj.asInstanceOf[JSONStorageOptions]
    }
    
    @scala.inline
    implicit class JSONStorageOptionsMutableBuilder[Self <: JSONStorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait Migration extends StObject {
    
    def down(): js.Promise[_] = js.native
    
    var file: String = js.native
    
    def migration(): js.Promise[_] = js.native
    
    def testFileName(needle: String): Boolean = js.native
    
    def up(): js.Promise[_] = js.native
  }
  object Migration {
    
    @scala.inline
    def apply(
      down: () => js.Promise[_],
      file: String,
      migration: () => js.Promise[_],
      testFileName: String => Boolean,
      up: () => js.Promise[_]
    ): Migration = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), file = file.asInstanceOf[js.Any], migration = js.Any.fromFunction0(migration), testFileName = js.Any.fromFunction1(testFileName), up = js.Any.fromFunction0(up))
      __obj.asInstanceOf[Migration]
    }
    
    @scala.inline
    implicit class MigrationMutableBuilder[Self <: Migration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: () => js.Promise[_]): Self = StObject.set(x, "down", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigration(value: () => js.Promise[_]): Self = StObject.set(x, "migration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTestFileName(value: String => Boolean): Self = StObject.set(x, "testFileName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUp(value: () => js.Promise[_]): Self = StObject.set(x, "up", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MigrationDefinitionWithName extends Migration {
    
    var name: String = js.native
  }
  object MigrationDefinitionWithName {
    
    @scala.inline
    def apply(
      down: () => js.Promise[_],
      file: String,
      migration: () => js.Promise[_],
      name: String,
      testFileName: String => Boolean,
      up: () => js.Promise[_]
    ): MigrationDefinitionWithName = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), file = file.asInstanceOf[js.Any], migration = js.Any.fromFunction0(migration), name = name.asInstanceOf[js.Any], testFileName = js.Any.fromFunction1(testFileName), up = js.Any.fromFunction0(up))
      __obj.asInstanceOf[MigrationDefinitionWithName]
    }
    
    @scala.inline
    implicit class MigrationDefinitionWithNameMutableBuilder[Self <: MigrationDefinitionWithName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MigrationOptions extends StObject {
    
    /**
      * A function that maps a file path to a migration object in the form
      * { up: Function, down: Function }. The default for this is to require(...)
      * the file as javascript, but you can use this to transpile TypeScript,
      * read raw sql etc.
      * See https://github.com/sequelize/umzug/tree/master/test/fixtures
      * for examples.
      */
    var customResolver: js.UndefOr[js.Function1[/* path */ String, Down]] = js.native
    
    /*
      * The params that gets passed to the migrations.
      * Might be an array or a synchronous function which returns an array.
      */
    var params: js.UndefOr[js.Array[_]] = js.native
    
    /** The path to the migrations directory. */
    var path: js.UndefOr[String] = js.native
    
    /** The pattern that determines whether or not a file is a migration. */
    var pattern: js.UndefOr[js.RegExp] = js.native
    
    /**
      * A function that receives and returns the to be executed function.
      * This can be used to modify the function.
      */
    var wrap: js.UndefOr[js.Function1[/* fn */ js.Any, _]] = js.native
  }
  object MigrationOptions {
    
    @scala.inline
    def apply(): MigrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MigrationOptions]
    }
    
    @scala.inline
    implicit class MigrationOptionsMutableBuilder[Self <: MigrationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomResolver(value: /* path */ String => Down): Self = StObject.set(x, "customResolver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomResolverUndefined: Self = StObject.set(x, "customResolver", js.undefined)
      
      @scala.inline
      def setParams(value: js.Array[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setWrap(value: /* fn */ js.Any => _): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait MongoDBStorageOptions extends Storage {
    
    /**
      * The to be used Mongo collection cursor.
      * Defaults to collection created from collectionName attribute.
      */
    var collection: js.UndefOr[Collection[DefaultSchema]] = js.native
    
    /**
      * The name of the collection used by the connection.
      * Defaults to 'migrations'
      */
    var collectionName: js.UndefOr[String] = js.native
    
    /**
      * The MongoDB database connection instance.
      */
    var connection: js.UndefOr[Db] = js.native
  }
  object MongoDBStorageOptions {
    
    @scala.inline
    def apply(
      executed: () => js.Promise[js.Array[String]],
      logMigration: String => js.Promise[Unit],
      unlogMigration: String => js.Promise[Unit]
    ): MongoDBStorageOptions = {
      val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
      __obj.asInstanceOf[MongoDBStorageOptions]
    }
    
    @scala.inline
    implicit class MongoDBStorageOptionsMutableBuilder[Self <: MongoDBStorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Collection[DefaultSchema]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
      
      @scala.inline
      def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      @scala.inline
      def setConnection(value: Db): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    }
  }
  
  @js.native
  trait SequelizeStorageOptions extends Storage {
    
    /**
      * The name of table column holding migration name.
      * Defaults to 'name'.
      */
    var columnName: String = js.native
    
    /**
      * The type of the column holding migration name.
      * Defaults to `Sequelize.STRING`
      */
    var columnType: DataTypeAbstract = js.native
    
    /**
      * The to be used Sequelize model.
      * Must have column name matching `columnName` option
      * Optional of `sequelize` is passed.
      */
    var model: js.UndefOr[Model[_, _, _]] = js.native
    
    /**
      * The name of the to be used model.
      * Defaults to 'SequelizeMeta'
      */
    var modelName: js.UndefOr[String] = js.native
    
    /**
      * The configured instance of Sequelize.
      * Optional if `model` is passed.
      */
    var sequelize: js.UndefOr[Sequelize] = js.native
    
    /**
      * The name of table to create if `model` option is not supplied
      * Defaults to `modelName`
      */
    var tableName: js.UndefOr[String] = js.native
  }
  object SequelizeStorageOptions {
    
    @scala.inline
    def apply(
      columnName: String,
      columnType: DataTypeAbstract,
      executed: () => js.Promise[js.Array[String]],
      logMigration: String => js.Promise[Unit],
      unlogMigration: String => js.Promise[Unit]
    ): SequelizeStorageOptions = {
      val __obj = js.Dynamic.literal(columnName = columnName.asInstanceOf[js.Any], columnType = columnType.asInstanceOf[js.Any], executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
      __obj.asInstanceOf[SequelizeStorageOptions]
    }
    
    @scala.inline
    implicit class SequelizeStorageOptionsMutableBuilder[Self <: SequelizeStorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnType(value: DataTypeAbstract): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: Model[_, _, _]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSequelize(value: Sequelize): Self = StObject.set(x, "sequelize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequelizeUndefined: Self = StObject.set(x, "sequelize", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  /**
    * In order to keep track of already executed tasks, umzug logs successfully executed migrations.
    * This is done in order to allow rollbacks of tasks. This is the interface these `Storages` must
    * follow.
    */
  @js.native
  trait Storage extends StObject {
    
    /** Gets list of executed migrations. */
    def executed(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Logs migration to be considered as executed.
      *
      * @param migrationName - Name of the migration to be logged.
      */
    def logMigration(migrationName: String): js.Promise[Unit] = js.native
    
    /**
      * Unlogs migration to be considered as pending.
      *
      * @param migrationName - Name of the migration to be unlogged.
      */
    def unlogMigration(migrationName: String): js.Promise[Unit] = js.native
  }
  object Storage {
    
    @scala.inline
    def apply(
      executed: () => js.Promise[js.Array[String]],
      logMigration: String => js.Promise[Unit],
      unlogMigration: String => js.Promise[Unit]
    ): Storage = {
      val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
      __obj.asInstanceOf[Storage]
    }
    
    @scala.inline
    implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecuted(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "executed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLogMigration(value: String => js.Promise[Unit]): Self = StObject.set(x, "logMigration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnlogMigration(value: String => js.Promise[Unit]): Self = StObject.set(x, "unlogMigration", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Umzug extends EventEmitter {
    
    @JSName("addListener")
    def addListener_migrated(eventName: migrated): this.type = js.native
    @JSName("addListener")
    def addListener_migrated(eventName: migrated, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_migrating(eventName: migrating): this.type = js.native
    @JSName("addListener")
    def addListener_migrating(eventName: migrating, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_reverted(eventName: reverted): this.type = js.native
    @JSName("addListener")
    def addListener_reverted(eventName: reverted, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_reverting(eventName: reverting): this.type = js.native
    @JSName("addListener")
    def addListener_reverting(eventName: reverting, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    
    /**
      * The down method can be used to revert the last executed migration.
      */
    def down(): js.Promise[js.Array[Migration]] = js.native
    def down(migration: String): js.Promise[js.Array[Migration]] = js.native
    def down(migrations: js.Array[String]): js.Promise[js.Array[Migration]] = js.native
    def down(options: DownToOptions): js.Promise[js.Array[Migration]] = js.native
    def down(options: UpDownMigrationsOptions): js.Promise[js.Array[Migration]] = js.native
    
    /**
      * The execute method is a general purpose function that runs for
      * every specified migrations the respective function.
      */
    def execute(): js.Promise[js.Array[Migration]] = js.native
    def execute(options: ExecuteOptions): js.Promise[js.Array[Migration]] = js.native
    
    /**
      * You can get a list of already executed migrations like this:
      */
    def executed(): js.Promise[js.Array[Migration]] = js.native
    
    @JSName("on")
    def on_migrated(eventName: migrated): this.type = js.native
    @JSName("on")
    def on_migrated(eventName: migrated, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("on")
    def on_migrating(eventName: migrating): this.type = js.native
    @JSName("on")
    def on_migrating(eventName: migrating, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("on")
    def on_reverted(eventName: reverted): this.type = js.native
    @JSName("on")
    def on_reverted(eventName: reverted, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("on")
    def on_reverting(eventName: reverting): this.type = js.native
    @JSName("on")
    def on_reverting(eventName: reverting, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    
    /**
      * You can get a list of pending/not yet executed migrations like this:
      */
    def pending(): js.Promise[js.Array[Migration]] = js.native
    
    @JSName("removeListener")
    def removeListener_migrated(eventName: migrated): this.type = js.native
    @JSName("removeListener")
    def removeListener_migrated(eventName: migrated, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_migrating(eventName: migrating): this.type = js.native
    @JSName("removeListener")
    def removeListener_migrating(eventName: migrating, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_reverted(eventName: reverted): this.type = js.native
    @JSName("removeListener")
    def removeListener_reverted(eventName: reverted, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_reverting(eventName: reverting): this.type = js.native
    @JSName("removeListener")
    def removeListener_reverting(eventName: reverting, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
    
    /**
      * The up method can be used to execute all pending migrations.
      */
    def up(): js.Promise[js.Array[Migration]] = js.native
    def up(migration: String): js.Promise[js.Array[Migration]] = js.native
    def up(migrations: js.Array[String]): js.Promise[js.Array[Migration]] = js.native
    def up(options: UpDownMigrationsOptions): js.Promise[js.Array[Migration]] = js.native
    def up(options: UpToOptions): js.Promise[js.Array[Migration]] = js.native
  }
  
  @js.native
  trait UmzugOptions extends StObject {
    
    /**
      * The name of the negative method in migrations.
      */
    var downName: js.UndefOr[String] = js.native
    
    /**
      * The logging function.
      * A function that gets executed everytime migrations start and have ended.
      */
    var logging: js.UndefOr[Boolean | js.Function] = js.native
    
    /**
      * Options for defined migration
      */
    var migrations: js.UndefOr[MigrationOptions | js.Array[Migration]] = js.native
    
    /**
      * The storage.
      */
    var storage: js.UndefOr[json | sequelize | mongodb | Storage] = js.native
    
    /**
      * The options for the storage.
      */
    var storageOptions: js.UndefOr[JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object] = js.native
    
    /**
      * The name of the positive method in migrations.
      */
    var upName: js.UndefOr[String] = js.native
  }
  object UmzugOptions {
    
    @scala.inline
    def apply(): UmzugOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UmzugOptions]
    }
    
    @scala.inline
    implicit class UmzugOptionsMutableBuilder[Self <: UmzugOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownName(value: String): Self = StObject.set(x, "downName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownNameUndefined: Self = StObject.set(x, "downName", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMigrations(value: MigrationOptions | js.Array[Migration]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      @scala.inline
      def setMigrationsVarargs(value: Migration*): Self = StObject.set(x, "migrations", js.Array(value :_*))
      
      @scala.inline
      def setStorage(value: json | sequelize | mongodb | Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageOptions(value: JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object): Self = StObject.set(x, "storageOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageOptionsUndefined: Self = StObject.set(x, "storageOptions", js.undefined)
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      @scala.inline
      def setUpName(value: String): Self = StObject.set(x, "upName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpNameUndefined: Self = StObject.set(x, "upName", js.undefined)
    }
  }
  
  @js.native
  trait UmzugStatic
    extends Instantiable0[Umzug]
       with Instantiable1[/* options */ UmzugOptions, Umzug] {
    
    def migrationsList(migrations: js.Array[MigrationDefinitionWithName]): js.Array[Migration] = js.native
    def migrationsList(migrations: js.Array[MigrationDefinitionWithName], parameters: js.Array[_]): js.Array[Migration] = js.native
  }
  
  @js.native
  trait UpDownMigrationsOptions extends StObject {
    
    /**
      * Running specific migrations while ignoring the right order, can be
      * done like this:
      */
    var migrations: js.Array[String] = js.native
  }
  object UpDownMigrationsOptions {
    
    @scala.inline
    def apply(migrations: js.Array[String]): UpDownMigrationsOptions = {
      val __obj = js.Dynamic.literal(migrations = migrations.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpDownMigrationsOptions]
    }
    
    @scala.inline
    implicit class UpDownMigrationsOptionsMutableBuilder[Self <: UpDownMigrationsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMigrations(value: js.Array[String]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsVarargs(value: String*): Self = StObject.set(x, "migrations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpToOptions extends StObject {
    
    /**
      * It is also possible to pass the name of a migration in order to
      * just run the migrations from the current state to the passed
      * migration name.
      */
    var to: String = js.native
  }
  object UpToOptions {
    
    @scala.inline
    def apply(to: String): UpToOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpToOptions]
    }
    
    @scala.inline
    implicit class UpToOptionsMutableBuilder[Self <: UpToOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = UmzugStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UmzugStatic = ^
}
