package typingsSlinky.sharepoint.global.SP.UI

import typingsSlinky.sharepoint.SP.UI.DialogReturnValueCallback
import typingsSlinky.sharepoint.SP.UI.IDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a modal dialog */
@JSGlobal("SP.UI.ModalDialog")
@js.native
class ModalDialog ()
  extends typingsSlinky.sharepoint.SP.UI.ModalDialog
/* static members */
@JSGlobal("SP.UI.ModalDialog")
@js.native
object ModalDialog extends js.Object {
  
  /** Show modal dialog specified by url, callback, height and width. */
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback): Unit = js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double): Unit = js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double, height: Double): Unit = js.native
  
  /** Refresh the page if specified dialogResult equals to SP.UI.DialogResult.OK */
  def RefreshPage(dialogResult: typingsSlinky.sharepoint.SP.UI.DialogResult): Unit = js.native
  
  /** Show page specified by the url in a modal dialog. If the dialog returns SP.UI.DialogResult.OK, the page is refreshed. */
  def ShowPopupDialog(url: String): Unit = js.native
  
  /** Should be called from an existing dialog. */
  def commonModalDialogClose(dialogResult: typingsSlinky.sharepoint.SP.UI.DialogResult, returnValue: js.Any): Unit = js.native
  
  /** Shows a modal dialog, specified by url, callback, args, and options. Internally, uses SP.UI.ModalDialog.showModalDialog.
    @param url overrides options.url
    @param callback overrides options.dialogResultValueCallback
    @param args overrides options.args */
  def commonModalDialogOpen(url: String, options: IDialogOptions): Unit = js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: js.UndefOr[scala.Nothing], args: js.Any): Unit = js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback): Unit = js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback, args: js.Any): Unit = js.native
  
  def get_childDialog(): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  
  /** Displays a modal dialog defined by the specified options. */
  def showModalDialog(options: IDialogOptions): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  
  def showPlatformFirstRunDialog(url: String, callbackFunc: DialogReturnValueCallback): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  def showWaitScreenSize(title: String): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: js.UndefOr[scala.Nothing],
    height: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: js.UndefOr[scala.Nothing],
    height: Double,
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: js.UndefOr[scala.Nothing], callbackFunc: DialogReturnValueCallback): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: DialogReturnValueCallback,
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: DialogReturnValueCallback,
    height: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: DialogReturnValueCallback,
    height: Double,
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: String): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: js.UndefOr[scala.Nothing], height: Double): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: js.UndefOr[scala.Nothing],
    height: Double,
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: DialogReturnValueCallback,
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback, height: Double): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: DialogReturnValueCallback,
    height: Double,
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  def showWaitScreenWithNoClose(title: String): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(
    title: String,
    message: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: js.UndefOr[scala.Nothing], height: Double): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: js.UndefOr[scala.Nothing], height: Double, width: Double): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: String): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: js.UndefOr[scala.Nothing], width: Double): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: Double): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: Double, width: Double): typingsSlinky.sharepoint.SP.UI.ModalDialog = js.native
}
