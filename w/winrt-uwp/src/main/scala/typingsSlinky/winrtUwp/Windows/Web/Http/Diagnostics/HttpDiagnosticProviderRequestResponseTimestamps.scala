package typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides all the timestamps for connection events. */
trait HttpDiagnosticProviderRequestResponseTimestamps extends js.Object {
  /** Gets the last time local cache was checked. */
  var cacheCheckedTimestamp: js.Date
  /** Gets the timestamp for the end of the TCP connection phase. */
  var connectionCompletedTimestamp: js.Date
  /** Gets the timestamp for the start of the TCP connection phase. */
  var connectionInitiatedTimestamp: js.Date
  /** Gets the time of the DNS name resolution. */
  var nameResolvedTimestamp: js.Date
  /** Gets the timestamp for the last byte sent. */
  var requestCompletedTimestamp: js.Date
  /** Gets the timestamp for the first byte sent. */
  var requestSentTimestamp: js.Date
  /** Gets the timestamp for the last byte received. */
  var responseCompletedTimestamp: js.Date
  /** Gets the timestamp for the fir byte received. */
  var responseReceivedTimestamp: js.Date
  /** Gets the time of the SSL handshake negotiation. */
  var sslNegotiatedTimestamp: js.Date
}

object HttpDiagnosticProviderRequestResponseTimestamps {
  @scala.inline
  def apply(
    cacheCheckedTimestamp: js.Date,
    connectionCompletedTimestamp: js.Date,
    connectionInitiatedTimestamp: js.Date,
    nameResolvedTimestamp: js.Date,
    requestCompletedTimestamp: js.Date,
    requestSentTimestamp: js.Date,
    responseCompletedTimestamp: js.Date,
    responseReceivedTimestamp: js.Date,
    sslNegotiatedTimestamp: js.Date
  ): HttpDiagnosticProviderRequestResponseTimestamps = {
    val __obj = js.Dynamic.literal(cacheCheckedTimestamp = cacheCheckedTimestamp.asInstanceOf[js.Any], connectionCompletedTimestamp = connectionCompletedTimestamp.asInstanceOf[js.Any], connectionInitiatedTimestamp = connectionInitiatedTimestamp.asInstanceOf[js.Any], nameResolvedTimestamp = nameResolvedTimestamp.asInstanceOf[js.Any], requestCompletedTimestamp = requestCompletedTimestamp.asInstanceOf[js.Any], requestSentTimestamp = requestSentTimestamp.asInstanceOf[js.Any], responseCompletedTimestamp = responseCompletedTimestamp.asInstanceOf[js.Any], responseReceivedTimestamp = responseReceivedTimestamp.asInstanceOf[js.Any], sslNegotiatedTimestamp = sslNegotiatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseTimestamps]
  }
}

