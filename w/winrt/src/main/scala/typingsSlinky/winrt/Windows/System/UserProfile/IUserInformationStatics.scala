package typingsSlinky.winrt.Windows.System.UserProfile

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserInformationStatics extends js.Object {
  var accountPictureChangeEnabled: Boolean = js.native
  var nameAccessAllowed: Boolean = js.native
  var onaccountpicturechanged: js.Any = js.native
  def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
  def getDisplayNameAsync(): IAsyncOperation[String] = js.native
  def getDomainNameAsync(): IAsyncOperation[String] = js.native
  def getFirstNameAsync(): IAsyncOperation[String] = js.native
  def getLastNameAsync(): IAsyncOperation[String] = js.native
  def getPrincipalNameAsync(): IAsyncOperation[String] = js.native
  def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri] = js.native
  def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
}

object IUserInformationStatics {
  @scala.inline
  def apply(
    accountPictureChangeEnabled: Boolean,
    getAccountPicture: AccountPictureKind => IStorageFile,
    getDisplayNameAsync: () => IAsyncOperation[String],
    getDomainNameAsync: () => IAsyncOperation[String],
    getFirstNameAsync: () => IAsyncOperation[String],
    getLastNameAsync: () => IAsyncOperation[String],
    getPrincipalNameAsync: () => IAsyncOperation[String],
    getSessionInitiationProtocolUriAsync: () => IAsyncOperation[Uri],
    nameAccessAllowed: Boolean,
    onaccountpicturechanged: js.Any,
    setAccountPictureAsync: IStorageFile => IAsyncOperation[SetAccountPictureResult],
    setAccountPictureFromStreamAsync: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesAsync: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesFromStreamsAsync: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
  ): IUserInformationStatics = {
    val __obj = js.Dynamic.literal(accountPictureChangeEnabled = accountPictureChangeEnabled.asInstanceOf[js.Any], getAccountPicture = js.Any.fromFunction1(getAccountPicture), getDisplayNameAsync = js.Any.fromFunction0(getDisplayNameAsync), getDomainNameAsync = js.Any.fromFunction0(getDomainNameAsync), getFirstNameAsync = js.Any.fromFunction0(getFirstNameAsync), getLastNameAsync = js.Any.fromFunction0(getLastNameAsync), getPrincipalNameAsync = js.Any.fromFunction0(getPrincipalNameAsync), getSessionInitiationProtocolUriAsync = js.Any.fromFunction0(getSessionInitiationProtocolUriAsync), nameAccessAllowed = nameAccessAllowed.asInstanceOf[js.Any], onaccountpicturechanged = onaccountpicturechanged.asInstanceOf[js.Any], setAccountPictureAsync = js.Any.fromFunction1(setAccountPictureAsync), setAccountPictureFromStreamAsync = js.Any.fromFunction1(setAccountPictureFromStreamAsync), setAccountPicturesAsync = js.Any.fromFunction3(setAccountPicturesAsync), setAccountPicturesFromStreamsAsync = js.Any.fromFunction3(setAccountPicturesFromStreamsAsync))
    __obj.asInstanceOf[IUserInformationStatics]
  }
  @scala.inline
  implicit class IUserInformationStaticsOps[Self <: IUserInformationStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountPictureChangeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPictureChangeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAccountPicture(value: AccountPictureKind => IStorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountPicture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisplayNameAsync(value: () => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayNameAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDomainNameAsync(value: () => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDomainNameAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirstNameAsync(value: () => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstNameAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastNameAsync(value: () => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastNameAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrincipalNameAsync(value: () => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrincipalNameAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSessionInitiationProtocolUriAsync(value: () => IAsyncOperation[Uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSessionInitiationProtocolUriAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNameAccessAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameAccessAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnaccountpicturechanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaccountpicturechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAccountPictureAsync(value: IStorageFile => IAsyncOperation[SetAccountPictureResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountPictureAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAccountPictureFromStreamAsync(value: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountPictureFromStreamAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAccountPicturesAsync(value: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountPicturesAsync")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetAccountPicturesFromStreamsAsync(
      value: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountPicturesFromStreamsAsync")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

