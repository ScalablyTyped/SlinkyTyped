package typingsSlinky.winrt.global.Windows.System

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.System.Launcher")
@js.native
class Launcher ()
  extends typingsSlinky.winrt.Windows.System.Launcher
/* static members */
@JSGlobal("Windows.System.Launcher")
@js.native
object Launcher extends js.Object {
  
  def launchFileAsync(file: IStorageFile): IAsyncOperation[Boolean] = js.native
  def launchFileAsync(file: IStorageFile, options: typingsSlinky.winrt.Windows.System.LauncherOptions): IAsyncOperation[Boolean] = js.native
  
  def launchUriAsync(uri: Uri): IAsyncOperation[Boolean] = js.native
  def launchUriAsync(uri: Uri, options: typingsSlinky.winrt.Windows.System.LauncherOptions): IAsyncOperation[Boolean] = js.native
}
