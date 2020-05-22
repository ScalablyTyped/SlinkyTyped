package typingsSlinky.winrtUwp.global.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo
import typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a diagnostic facility for tracing and profiling web traffic for applications build on HTTP protocols. */
@JSGlobal("Windows.Web.Http.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  /** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
  @js.native
  abstract class HttpDiagnosticProvider ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProvider
  
  /** Provides data for the RequestResponseCompleted event. */
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseCompletedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseCompletedEventArgs {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    /* CompleteClass */
    override var activityId: String = js.native
    /** Gets the type of operation initiating this request. */
    /* CompleteClass */
    override var initiator: HttpDiagnosticRequestInitiator = js.native
    /* CompleteClass */
    override var processId: js.Any = js.native
     /* unmapped type */ /** Gets the URI of the requested response. */
    /* CompleteClass */
    override var requestedUri: Uri = js.native
    /* CompleteClass */
    override var sourceLocations: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var threadId: js.Any = js.native
     /* unmapped type */ /** Gets the timestamp for connection events. */
    /* CompleteClass */
    override var timestamps: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps = js.native
  }
  
  /** Provides all the timestamps for connection events. */
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseTimestamps ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps {
    /** Gets the last time local cache was checked. */
    /* CompleteClass */
    override var cacheCheckedTimestamp: js.Date = js.native
    /** Gets the timestamp for the end of the TCP connection phase. */
    /* CompleteClass */
    override var connectionCompletedTimestamp: js.Date = js.native
    /** Gets the timestamp for the start of the TCP connection phase. */
    /* CompleteClass */
    override var connectionInitiatedTimestamp: js.Date = js.native
    /** Gets the time of the DNS name resolution. */
    /* CompleteClass */
    override var nameResolvedTimestamp: js.Date = js.native
    /** Gets the timestamp for the last byte sent. */
    /* CompleteClass */
    override var requestCompletedTimestamp: js.Date = js.native
    /** Gets the timestamp for the first byte sent. */
    /* CompleteClass */
    override var requestSentTimestamp: js.Date = js.native
    /** Gets the timestamp for the last byte received. */
    /* CompleteClass */
    override var responseCompletedTimestamp: js.Date = js.native
    /** Gets the timestamp for the fir byte received. */
    /* CompleteClass */
    override var responseReceivedTimestamp: js.Date = js.native
    /** Gets the time of the SSL handshake negotiation. */
    /* CompleteClass */
    override var sslNegotiatedTimestamp: js.Date = js.native
  }
  
  /** Provides data for the RequestSent event. */
  @js.native
  abstract class HttpDiagnosticProviderRequestSentEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    /* CompleteClass */
    override var activityId: String = js.native
    /** Gets the type of operation initiating this request. */
    /* CompleteClass */
    override var initiator: HttpDiagnosticRequestInitiator = js.native
    /** Gets the HttpRequestMessage including headers. */
    /* CompleteClass */
    override var message: typingsSlinky.winrtUwp.Windows.Web.Http.HttpRequestMessage = js.native
    /** Gets the process ID. */
    /* CompleteClass */
    override var processId: Double = js.native
    /** Gets the source location call stack. */
    /* CompleteClass */
    override var sourceLocations: IVectorView[typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation] = js.native
    /** Gets the thread ID. */
    /* CompleteClass */
    override var threadId: Double = js.native
    /** Gets the timestamp of when the HttpRequestMessage was sent. */
    /* CompleteClass */
    override var timestamp: js.Date = js.native
  }
  
  /** Provides data for the ResponseReceived event. */
  @js.native
  abstract class HttpDiagnosticProviderResponseReceivedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderResponseReceivedEventArgs {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    /* CompleteClass */
    override var activityId: String = js.native
    /** Gets the HttpResponseMessage including headers, the status code, and data. */
    /* CompleteClass */
    override var message: typingsSlinky.winrtUwp.Windows.Web.Http.HttpResponseMessage = js.native
    /** Gets the timestamp of when the HttpResponseMessage was received. */
    /* CompleteClass */
    override var timestamp: js.Date = js.native
  }
  
  /** Contains the source location of the HTTP activity. */
  @js.native
  abstract class HttpDiagnosticSourceLocation ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation {
    /** Gets the column number. */
    /* CompleteClass */
    override var columnNumber: Double = js.native
    /** Gets the line number. */
    /* CompleteClass */
    override var lineNumber: Double = js.native
    /** Gets the source URI. */
    /* CompleteClass */
    override var sourceUri: Uri = js.native
  }
  
  /* static members */
  @js.native
  object HttpDiagnosticProvider extends js.Object {
    /**
      * Creates a new HttpDiagnosticProvider based on the specified ProcessDiagnosticInfo object.
      * @param processDiagnosticInfo The ProcessDiagnosticInfo that identifies the process to watch.
      * @return The newly created HttpDiagnosticProvider .
      */
    def createFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo): typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProvider = js.native
  }
  
  /** Provides the source of the request. */
  @js.native
  object HttpDiagnosticRequestInitiator extends js.Object {
    /* 7 */ val htmlDownload: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.htmlDownload with Double = js.native
    /* 2 */ val image: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.image with Double = js.native
    /* 3 */ val link: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.link with Double = js.native
    /* 6 */ val media: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.media with Double = js.native
    /* 9 */ val other: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.other with Double = js.native
    /* 0 */ val parsedElement: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.parsedElement with Double = js.native
    /* 8 */ val prefetch: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.prefetch with Double = js.native
    /* 1 */ val script: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.script with Double = js.native
    /* 4 */ val style: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.style with Double = js.native
    /* 5 */ val xmlHttpRequest: typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.xmlHttpRequest with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator with Double
      ] = js.native
  }
  
}

