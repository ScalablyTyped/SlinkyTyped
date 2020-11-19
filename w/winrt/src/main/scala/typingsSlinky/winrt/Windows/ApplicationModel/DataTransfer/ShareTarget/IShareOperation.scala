package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget

import typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.DataPackageView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShareOperation extends js.Object {
  
  var data: DataPackageView = js.native
  
  var quickLinkId: String = js.native
  
  def removeThisQuickLink(): Unit = js.native
  
  def reportCompleted(): Unit = js.native
  def reportCompleted(quicklink: QuickLink): Unit = js.native
  
  def reportDataRetrieved(): Unit = js.native
  
  def reportError(value: String): Unit = js.native
  
  def reportStarted(): Unit = js.native
  
  def reportSubmittedBackgroundTask(): Unit = js.native
}
