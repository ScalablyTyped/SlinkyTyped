package typingsSlinky.winrt.Windows.Security.Cryptography.DataProtection

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataProtectionProvider extends js.Object {
  def protectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
  def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
}

object IDataProtectionProvider {
  @scala.inline
  def apply(
    protectAsync: IBuffer => IAsyncOperation[IBuffer],
    protectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction,
    unprotectAsync: IBuffer => IAsyncOperation[IBuffer],
    unprotectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction
  ): IDataProtectionProvider = {
    val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
    __obj.asInstanceOf[IDataProtectionProvider]
  }
  @scala.inline
  implicit class IDataProtectionProviderOps[Self <: IDataProtectionProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProtectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectStreamAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnprotectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnprotectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectStreamAsync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

