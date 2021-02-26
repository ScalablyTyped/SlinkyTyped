package typingsSlinky.sentryBrowser

import typingsSlinky.sentryBrowser.backendMod.BrowserBackend
import typingsSlinky.sentryBrowser.backendMod.BrowserOptions
import typingsSlinky.sentryBrowser.helpersMod.ReportDialogOptions
import typingsSlinky.sentryCore.mod.BaseClient
import typingsSlinky.sentryCore.mod.Scope
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.eventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("@sentry/browser/dist/client", "BrowserClient")
  @js.native
  /**
    * Creates a new Browser SDK instance.
    *
    * @param options Configuration options for this SDK.
    */
  class BrowserClient () extends BaseClient[BrowserBackend, BrowserOptions] {
    def this(options: BrowserOptions) = this()
    
    /* protected */ def _prepareEvent(event: Event, scope: Scope): js.Thenable[Event | Null] = js.native
    /* protected */ def _prepareEvent(event: Event, scope: Scope, hint: EventHint): js.Thenable[Event | Null] = js.native
    
    /**
      * Show a report dialog to the user to send feedback to a specific event.
      *
      * @param options Set individual options for the dialog
      */
    def showReportDialog(): Unit = js.native
    def showReportDialog(options: ReportDialogOptions): Unit = js.native
  }
}
