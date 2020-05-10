package typingsSlinky.slonik.mod

import typingsSlinky.slonik.slonikStrings.DISABLE_TIMEOUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConfigurationType extends js.Object {
  /** Dictates whether to capture stack trace before executing query. Middlewares access stack trace through query execution context. (Default: true) */
  var captureStackTrace: js.UndefOr[Boolean] = js.native
  /** Number of times to retry establishing a new connection. (Default: 3) */
  var connectionRetryLimit: js.UndefOr[Double] = js.native
  /** connectionTimeout Timeout (in milliseconds) after which an error is raised if connection cannot cannot be established. (Default: 5000) */
  var connectionTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.native
  /** idleInTransactionSessionTimeout Timeout (in milliseconds) after which idle clients are closed. Use 'DISABLE_TIMEOUT' constant to disable the timeout. (Default: 60000) */
  var idleInTransactionSessionTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.native
  /** Timeout (in milliseconds) after which idle clients are closed. (Default: 5000) */
  var idleTimeout: js.UndefOr[Double] = js.native
  /**
    * An array of [Slonik interceptors](https://github.com/gajus/slonik#slonik-interceptors)
    */
  var interceptors: js.UndefOr[js.Array[InterceptorType]] = js.native
  /** Do not allow more than this many connections. (Default: 10) */
  var maximumPoolSize: js.UndefOr[Double] = js.native
  /** Uses libpq bindings when `pg-native` module is installed. (Default: true) */
  var preferNativeBindings: js.UndefOr[Boolean] = js.native
  /** Timeout (in milliseconds) after which database is instructed to abort the query. Use 'DISABLE_TIMEOUT' constant to disable the timeout. (Default: 60000) */
  var statementTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.native
  /**
    * An array of [Slonik type parsers](https://github.com/gajus/slonik#slonik-type-parsers)
    */
  var typeParsers: js.UndefOr[js.Array[TypeParserType[_]]] = js.native
}

object ClientConfigurationType {
  @scala.inline
  def apply(): ClientConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfigurationType]
  }
  @scala.inline
  implicit class ClientConfigurationTypeOps[Self <: ClientConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureStackTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRetryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double | DISABLE_TIMEOUT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleInTransactionSessionTimeout(value: Double | DISABLE_TIMEOUT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleInTransactionSessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleInTransactionSessionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleInTransactionSessionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptors(value: js.Array[InterceptorType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPoolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPoolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferNativeBindings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferNativeBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferNativeBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferNativeBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementTimeout(value: Double | DISABLE_TIMEOUT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParsers(value: js.Array[TypeParserType[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParsers")(js.undefined)
        ret
    }
  }
  
}

