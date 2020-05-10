package typingsSlinky.sumoLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SumoLoggerOptions extends js.Object {
  /**
    * An integer specifying total log length.
    * This can be used by itself or in addition to interval but is ignored when useIntervalOnly is true.
    * For higher volume applications, Sumo Logic recommends using between 100000 and 1000000 to optimize the tradeoff between network calls and load.
    * If both batchSize and interval are configured sending will be triggered when the pending logs' aggregate message length
    * is reached or when the specified interval is hit, and in either case the interval will be reset on send.
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * You can provide a URL, in the Node version of this SDK only,
    * which will be sent as the `url` field of the log line.
    * In the vanilla JS version, the URL is detected from the browser's
    * `window.location` value.
    */
  var clientUrl: js.UndefOr[String] = js.native
  /**
    * To send your logs, the script must know which HTTP Source to use.
    * Pass this value (which you can get from the Collectors page) in
    * the `endpoint` parameter.
    */
  var endpoint: String = js.native
  /**
    * This value enables and disables sending data as graphite metrics
    */
  var graphite: js.UndefOr[Boolean] = js.native
  /**
    * This value identifies the host from which the log is being sent.
    */
  var hostName: js.UndefOr[String] = js.native
  /**
    * A number of milliseconds. Messages will be batched and sent at the interval specified.
    * Default value is zero, meaning messages are sent each time `log()` is called.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * You can provide a function that is executed if an error
    * occurs when the logs are sent.
    */
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * You can provide a function that is executed only when logs are successfully sent.
    * The only information you can be sure of in the callback is that the call succeeded.
    * There is no other response information.
    */
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * This value enables and disables sending data as a raw string
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * Setting `sendErrors` to `true` will send all the unhandled errors to Sumo Logic
    * with the error message, URL, line number, and column number.
    * This attribute plays well with any other `window.onerror` functions that
    * have been defined.
    */
  var sendErrors: js.UndefOr[Boolean] = js.native
  /** To identify specific user sessions, set a value for this field. */
  var sessionKey: js.UndefOr[String] = js.native
  /**
    * This value sets the Source Category for the logged message.
    */
  var sourceCategory: js.UndefOr[String] = js.native
  /**
    * This value sets the Source Name for the logged message.
    */
  var sourceName: js.UndefOr[String] = js.native
  /**
    * If enabled batchSize is ignored and only interval is used to trigger when the pending logs will be sent.
    */
  var useIntervalOnly: js.UndefOr[Boolean] = js.native
}

object SumoLoggerOptions {
  @scala.inline
  def apply(endpoint: String): SumoLoggerOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumoLoggerOptions]
  }
  @scala.inline
  implicit class SumoLoggerOptionsOps[Self <: SumoLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withClientUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphite")(js.undefined)
        ret
    }
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSendErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withUseIntervalOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIntervalOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIntervalOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIntervalOnly")(js.undefined)
        ret
    }
  }
  
}

