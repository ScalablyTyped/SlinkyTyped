package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the constructor of Sequelize main class
  */
@js.native
trait Options extends js.Object {
  /**
    * Print query execution time in milliseconds when logging SQL.
    *
    * Defaults to false
    */
  var benchmark: js.UndefOr[Boolean] = js.native
  /**
    * The name of the database
    */
  var database: js.UndefOr[String] = js.native
  /**
    * The version of the database. Most times, this is automatically detected and is not needed.
    *
    * Defaults to 0
    */
  var databaseVersion: js.UndefOr[Double] = js.native
  /**
    * Default options for model definitions. See sequelize.define for options
    */
  var define: js.UndefOr[DefineOptions[_]] = js.native
  /**
    * The dialect of the database you are connecting to. One of mysql, postgres, sqlite, mariadb and mssql.
    *
    * Defaults to 'mysql'
    */
  var dialect: js.UndefOr[String] = js.native
  /**
    * If specified, load the dialect library from this path. For example, if you want to use pg.js instead of
    * pg when connecting to a pg database, you should specify 'pg.js' here
    */
  var dialectModulePath: js.UndefOr[String] = js.native
  /**
    * An object of additional options, which are passed directly to the connection library
    */
  var dialectOptions: js.UndefOr[js.Object] = js.native
  /**
    * The host of the relational database.
    *
    * Defaults to 'localhost'
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Set the default transaction isolation level. See `Sequelize.Transaction.ISOLATION_LEVELS` for possible
    * options.
    *
    * Defaults to 'REPEATABLE_READ'
    */
  var isolationLevel: js.UndefOr[TransactionIsolationLevel] = js.native
  /**
    * A function that gets executed everytime Sequelize would log something.
    *
    * Defaults to console.log
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  /**
    * A flag that defines if native library shall be used or not. Currently only has an effect for postgres
    *
    * Defaults to false
    */
  var native: js.UndefOr[Boolean] = js.native
  /**
    * A flag that defines if null values should be passed to SQL queries or not.
    *
    * Defaults to false
    */
  var omitNull: js.UndefOr[Boolean] = js.native
  /**
    * String based operator alias, default value is true which will enable all operators alias.
    * Pass object to limit set of aliased operators or false to disable completely.
    */
  var operatorsAliases: js.UndefOr[Boolean | OperatorsAliases] = js.native
  /**
    * The password which is used to authenticate against the database.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Connection pool options
    */
  var pool: js.UndefOr[PoolOptions] = js.native
  /**
    * The port of the relational database.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The protocol of the relational database.
    *
    * Defaults to 'tcp'
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * Default options for sequelize.query
    */
  var query: js.UndefOr[QueryOptions] = js.native
  /**
    * Set to `false` to make table names and attributes case-insensitive on Postgres and skip double quoting of
    * them.
    *
    * Defaults to true
    */
  var quoteIdentifiers: js.UndefOr[Boolean] = js.native
  /**
    * Use read / write replication. To enable replication, pass an object, with two properties, read and write.
    * Write should be an object (a single server for handling writes), and read an array of object (several
    * servers to handle reads). Each read/write server can have the following properties: `host`, `port`,
    * `username`, `password`, `database`
    *
    * Defaults to false
    */
  var replication: js.UndefOr[ReplicationOptions] = js.native
  /**
    * Set of flags that control when a query is automatically retried.
    */
  var retry: js.UndefOr[RetryOptions] = js.native
  /**
    * Default options for sequelize.set
    */
  var set: js.UndefOr[SetOptions] = js.native
  /**
    * Set to `true` to enable connecting over SSL.
    *
    * Defaults to undefined
    */
  var ssl: js.UndefOr[Boolean] = js.native
  /**
    * Only used by sqlite.
    *
    * Defaults to ':memory:'
    */
  var storage: js.UndefOr[String] = js.native
  /**
    * Default options for sequelize.sync
    */
  var sync: js.UndefOr[SyncOptions] = js.native
  /**
    * The timezone used when converting a date from the database into a JavaScript date. The timezone is also
    * used to SET TIMEZONE when connecting to the server, to ensure that the result of NOW, CURRENT_TIMESTAMP
    * and other time related functions have in the right timezone. For best cross platform performance use the
    * format
    * +/-HH:MM. Will also accept string versions of timezones used by moment.js (e.g. 'America/Los_Angeles');
    * this is useful to capture daylight savings time changes.
    *
    * Defaults to '+00:00'
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * Set the default transaction type. See `Sequelize.Transaction.TYPES` for possible
    * options.
    *
    * Defaults to 'DEFERRED'
    */
  var transactionType: js.UndefOr[TransactionType] = js.native
  /**
    * Run built in type validators on insert and update,
    * e.g. validate that arguments passed to integer fields are integer-like.
    *
    * Defaults to false
    */
  var typeValidation: js.UndefOr[Boolean] = js.native
  /**
    * The username which is used to authenticate against the database.
    */
  var username: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBenchmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benchmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenchmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benchmark")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDefine(value: DefineOptions[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(js.undefined)
        ret
    }
    @scala.inline
    def withDialect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(js.undefined)
        ret
    }
    @scala.inline
    def withDialectModulePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialectModulePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialectModulePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialectModulePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDialectOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolationLevel(value: TransactionIsolationLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolationLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitNull")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatorsAliases(value: Boolean | OperatorsAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorsAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorsAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorsAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: PoolOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: QueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteIdentifiers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withReplication(value: ReplicationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replication")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: SetOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: SyncOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionType(value: TransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionType")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

