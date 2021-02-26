package typingsSlinky.sentryBrowser

import typingsSlinky.sentryBrowser.backendMod.BrowserOptions
import typingsSlinky.sentryBrowser.helpersMod.ReportDialogOptions
import typingsSlinky.sentryBrowser.integrationsMod.Breadcrumbs
import typingsSlinky.sentryBrowser.integrationsMod.GlobalHandlers
import typingsSlinky.sentryBrowser.integrationsMod.LinkedErrors
import typingsSlinky.sentryBrowser.integrationsMod.TryCatch
import typingsSlinky.sentryBrowser.integrationsMod.UserAgent
import typingsSlinky.sentryCore.mod.Integrations.FunctionToString
import typingsSlinky.sentryCore.mod.Integrations.InboundFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkMod {
  
  @JSImport("@sentry/browser/dist/sdk", "close")
  @js.native
  def close(): js.Thenable[Boolean] = js.native
  @JSImport("@sentry/browser/dist/sdk", "close")
  @js.native
  def close(timeout: Double): js.Thenable[Boolean] = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
  ] = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "flush")
  @js.native
  def flush(): js.Thenable[Boolean] = js.native
  @JSImport("@sentry/browser/dist/sdk", "flush")
  @js.native
  def flush(timeout: Double): js.Thenable[Boolean] = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "forceLoad")
  @js.native
  def forceLoad(): Unit = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "init")
  @js.native
  def init(): Unit = js.native
  @JSImport("@sentry/browser/dist/sdk", "init")
  @js.native
  def init(options: BrowserOptions): Unit = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "lastEventId")
  @js.native
  def lastEventId(): js.UndefOr[String] = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "onLoad")
  @js.native
  def onLoad(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "showReportDialog")
  @js.native
  def showReportDialog(): Unit = js.native
  @JSImport("@sentry/browser/dist/sdk", "showReportDialog")
  @js.native
  def showReportDialog(options: ReportDialogOptions): Unit = js.native
  
  @JSImport("@sentry/browser/dist/sdk", "wrap")
  @js.native
  def wrap(fn: js.Function1[/* args */ js.Any, _]): js.Any = js.native
}
