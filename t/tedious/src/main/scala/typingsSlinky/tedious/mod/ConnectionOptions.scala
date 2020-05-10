package typingsSlinky.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends js.Object {
  /**
    * A boolean determining whether to rollback a transaction automatically if any error is encountered
    * during the given transaction's execution. This sets the value for SET XACT_ABORT during the initial
    * SQL phase of a connection (documentation).
    */
  var abortTransactionOnError: js.UndefOr[Boolean] = js.native
  /**
    * Application name used for identifying a specific application in profiling, logging or tracing tools of SQL Server. (default: Tedious)
    */
  var appName: js.UndefOr[String] = js.native
  /**
    * A boolean, controlling whether the column names returned will have the first letter converted
    * to lower case (true) or not. This value is ignored if you provide a columnNameReplacer. (default: false).
    */
  var camelCaseColumns: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds before the cancel (abort) of a request is considered failed (default: 5000).
    */
  var cancelTimeout: js.UndefOr[Double] = js.native
  /**
    * A function with parameters (columnName, index, columnMetaData) and returning a string. If provided,
    * this will be called once per column per result-set. The returned value will be used instead of the
    * SQL-provided column name on row and meta data objects. This allows you to dynamically convert between
    * naming conventions. (default: null).
    */
  var columnNameReplacer: js.UndefOr[
    js.Function3[
      /* columnName */ String, 
      /* index */ Double, 
      /* columnMetaData */ ColumnMetaData, 
      String
    ]
  ] = js.native
  /**
    * The number of milliseconds before the attempt to connect is considered failed (default: 15000).
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  /**
    * The default isolation level for new connections. All out-of-transaction queries are executed with this setting. (default: READ_COMMITED)
    */
  var connectionIsolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.native
  /**
    * Number of milliseconds before retrying to establish connection, in case of transient failure. (default: 500)
    */
  var connectionRetryInterval: js.UndefOr[Double] = js.native
  /**
    * When encryption is used, an object may be supplied that will be used for the first argument when calling tls.createSecurePair (default: {}).
    */
  var cryptoCredentialsDetails: js.UndefOr[js.Object] = js.native
  /**
    * Database to connect to (default: dependent on server configuration).
    */
  var database: js.UndefOr[String] = js.native
  /**
    * A string representing position of month, day and year in temporal datatypes. (default: mdy)
    */
  var dateFormat: js.UndefOr[String] = js.native
  /**
    * Number that sets to the first day of the week, it can be a number from 1 through 7.(default: 7, i.e, first day of the week is Sunday)
    */
  var datefirst: js.UndefOr[Double] = js.native
  /**
    * Debug options
    */
  var debug: js.UndefOr[DebugOptions] = js.native
  /**
    * A boolean, controls the way null values should be used during comparison operation. (default: true)
    */
  var enableAnsiNull: js.UndefOr[Boolean] = js.native
  /**
    * If true, SET ANSI_NULL_DFLT_ON ON will be set in the initial sql. This means new columns will be nullable by default. See the T-SQL documentation for more details. (Default: true).
    */
  var enableAnsiNullDefault: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controls if padding should be applied for values shorter than the size of defined column. (default: true)
    */
  var enableAnsiPadding: js.UndefOr[Boolean] = js.native
  /**
    * If true, SQL Server will follow ISO standard behavior during various error conditions. For details, see documentation. (default: true)
    */
  var enableAnsiWarnings: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, determines if query execution should be terminated during overflow or divide-by-zero error. (default: false)
    */
  var enableArithAbort: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, determines if concatenation with NULL should result in NULL or empty string value, more details in documentation. (default: true)
    */
  var enableConcatNullYieldsNull: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controls whether cursor should be closed, if the transaction opening it gets committed or rolled back. (default: false)
    */
  var enableCursorCloseOnCommit: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, sets the connection to either implicit or autocommit transaction mode. (default: false)
    */
  var enableImplicitTransactions: js.UndefOr[Boolean] = js.native
  /**
    * If false, error is not generated during loss of precession. (default: false)
    */
  var enableNumericRoundabort: js.UndefOr[Boolean] = js.native
  /**
    * If true, characters enclosed in single quotes are treated as literals and those enclosed double quotes are treated as identifiers. (default: true)
    */
  var enableQuotedIdentifier: js.UndefOr[Boolean] = js.native
  /**
    * A boolean determining whether or not the connection will be encrypted. Set to true if you're on Windows Azure. (default: false).
    */
  var encrypt: js.UndefOr[Boolean] = js.native
  /**
    * By default, if the database requested by options.database cannot be accessed,
    * the connection will fail with an error. However, if options.fallbackToDefaultDb is set to true,
    * then the user's default database will be  * used instead (Default: false).
    */
  var fallbackToDefaultDb: js.UndefOr[Boolean] = js.native
  /**
    * The instance name to connect to. The SQL Server Browser service must be running on the database server,
    * and UDP port 1444 on the database server must be reachable. (no default) Mutually exclusive with options.port.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * The default isolation level that transactions will be run with. (default: READ_COMMITTED).
    */
  var isolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.native
  /**
    * A string, sets the language of the session (default: us_english)
    */
  var language: js.UndefOr[String] = js.native
  /**
    * A string indicating which network interface (ip address) to use when connecting to SQL Server.
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * Number of retries on transient error (default: 3)
    */
  var maxRetriesOnTransientErrors: js.UndefOr[Double] = js.native
  /**
    * The size of TDS packets (subject to negotiation with the server). Should be a power of 2. (default: 4096).
    */
  var packetSize: js.UndefOr[Double] = js.native
  /**
    * Port to connect to (default: 1433). Mutually exclusive with options.instanceName.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * A boolean, determining whether the connection will request read only access from a SQL Server Availability Group. For more information, see here. (default: false).
    */
  var readOnlyIntent: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds before a request is considered failed, or 0 for no timeout (default: 15000).
    */
  var requestTimeout: js.UndefOr[Double] = js.native
  /**
    * A boolean, that when true will expose received rows in Requests' done* events. See done, doneInProc and doneProc. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnDone: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, that when true will expose received rows in Requests' completion callback. See new Request. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.native
  /**
    * The version of TDS to use. If server doesn't support specified version, negotiated version is used instead. (default: 7_4).
    * Take this from tedious.TDS_VERSION.7_4 .
    */
  var tdsVersion: js.UndefOr[Double] = js.native
  /**
    * Size of data to be returned by SELECT statement for varchar(max), nvarchar(max), varbinary(max), text, ntext, and image type. (default: 2147483647)
    */
  var textsize: js.UndefOr[Double] = js.native
  /**
    * A boolean, that verifies whether server's identity matches it's certificate's names (default: true)
    */
  var trustServerCertificate: js.UndefOr[Boolean] = js.native
  /**
    * A boolean determining whether to return rows as arrays or key-value collections. (default: false).
    */
  var useColumnNames: js.UndefOr[Boolean] = js.native
  /**
    * A boolean determining whether to pass time values in UTC or local time. (default: true).
    */
  var useUTC: js.UndefOr[Boolean] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortTransactionOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortTransactionOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortTransactionOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortTransactionOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withCamelCaseColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelCaseColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamelCaseColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelCaseColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnNameReplacer(
      value: (/* columnName */ String, /* index */ Double, /* columnMetaData */ ColumnMetaData) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNameReplacer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutColumnNameReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNameReplacer")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionIsolationLevel(value: ISOLATION_LEVEL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionIsolationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionIsolationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionIsolationLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRetryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoCredentialsDetails(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoCredentialsDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoCredentialsDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoCredentialsDetails")(js.undefined)
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
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDatefirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datefirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatefirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datefirst")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: DebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnsiNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnsiNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiNull")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnsiNullDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiNullDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnsiNullDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiNullDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnsiPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnsiPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnsiWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnsiWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnsiWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableArithAbort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableArithAbort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableArithAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableArithAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableConcatNullYieldsNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableConcatNullYieldsNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableConcatNullYieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableConcatNullYieldsNull")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCursorCloseOnCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCursorCloseOnCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCursorCloseOnCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCursorCloseOnCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableImplicitTransactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableImplicitTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableImplicitTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableImplicitTransactions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNumericRoundabort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNumericRoundabort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNumericRoundabort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNumericRoundabort")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableQuotedIdentifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableQuotedIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableQuotedIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableQuotedIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackToDefaultDb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackToDefaultDb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackToDefaultDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackToDefaultDb")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolationLevel(value: ISOLATION_LEVEL): Self = {
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
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetriesOnTransientErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetriesOnTransientErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetriesOnTransientErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetriesOnTransientErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetSize")(js.undefined)
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
    def withReadOnlyIntent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyIntent")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCollectionOnDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollectionOnDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCollectionOnDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollectionOnDone")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCollectionOnRequestCompletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollectionOnRequestCompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCollectionOnRequestCompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollectionOnRequestCompletion")(js.undefined)
        ret
    }
    @scala.inline
    def withTdsVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTextsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textsize")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustServerCertificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustServerCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustServerCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustServerCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseColumnNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColumnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColumnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(js.undefined)
        ret
    }
  }
  
}

