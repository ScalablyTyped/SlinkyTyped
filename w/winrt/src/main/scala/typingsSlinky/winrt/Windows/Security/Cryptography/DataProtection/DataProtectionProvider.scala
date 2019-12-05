package typingsSlinky.winrt.Windows.Security.Cryptography.DataProtection

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.DataProtection.DataProtectionProvider")
@js.native
class DataProtectionProvider () extends IDataProtectionProvider {
  def this(protectionDescriptor: String) = this()
  /* CompleteClass */
  override def protectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  /* CompleteClass */
  override def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
  /* CompleteClass */
  override def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  /* CompleteClass */
  override def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
}

