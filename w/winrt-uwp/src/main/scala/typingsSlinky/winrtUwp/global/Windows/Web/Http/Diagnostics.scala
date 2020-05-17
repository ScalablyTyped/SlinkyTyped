package typingsSlinky.winrtUwp.global.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo
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
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseCompletedEventArgs
  
  /** Provides all the timestamps for connection events. */
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseTimestamps ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps
  
  /** Provides data for the RequestSent event. */
  @js.native
  abstract class HttpDiagnosticProviderRequestSentEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs
  
  /** Provides data for the ResponseReceived event. */
  @js.native
  abstract class HttpDiagnosticProviderResponseReceivedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderResponseReceivedEventArgs
  
  /** Contains the source location of the HTTP activity. */
  @js.native
  abstract class HttpDiagnosticSourceLocation ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation
  
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

