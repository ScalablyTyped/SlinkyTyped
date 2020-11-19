package typingsSlinky.wepy.wxEnhancedMod

import typingsSlinky.wepy.anon.Accuracy
import typingsSlinky.wepy.anon.Address
import typingsSlinky.wepy.anon.Alpha
import typingsSlinky.wepy.anon.Altitude
import typingsSlinky.wepy.anon.AuthSetting
import typingsSlinky.wepy.anon.BankAccount
import typingsSlinky.wepy.anon.Brand
import typingsSlinky.wepy.anon.Cancel
import typingsSlinky.wepy.anon.CancelColor
import typingsSlinky.wepy.anon.CanvasId
import typingsSlinky.wepy.anon.CharSet
import typingsSlinky.wepy.anon.CheckAuthMode
import typingsSlinky.wepy.anon.Color
import typingsSlinky.wepy.anon.Compressed
import typingsSlinky.wepy.anon.CreateTime
import typingsSlinky.wepy.anon.Data
import typingsSlinky.wepy.anon.DataKey
import typingsSlinky.wepy.anon.Delay
import typingsSlinky.wepy.anon.DestHeight
import typingsSlinky.wepy.anon.Duration
import typingsSlinky.wepy.anon.EncryptedData
import typingsSlinky.wepy.anon.ErrMsg
import typingsSlinky.wepy.anon.FileList
import typingsSlinky.wepy.anon.Height
import typingsSlinky.wepy.anon.Icon
import typingsSlinky.wepy.anon.ItemColor
import typingsSlinky.wepy.anon.Iv
import typingsSlinky.wepy.anon.Key
import typingsSlinky.wepy.anon.Lang
import typingsSlinky.wepy.anon.Latitude
import typingsSlinky.wepy.anon.NetworkType
import typingsSlinky.wepy.anon.NonceStr
import typingsSlinky.wepy.anon.OnlyFromCamera
import typingsSlinky.wepy.anon.PhoneNumber
import typingsSlinky.wepy.anon.Scope
import typingsSlinky.wepy.anon.ScrollTop
import typingsSlinky.wepy.anon.ShareTicket
import typingsSlinky.wepy.anon.SupportMode
import typingsSlinky.wepy.anon.TempFilePath
import typingsSlinky.wepy.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxEnhances extends js.Object {
  
  def addPhoneContact(param: WechatProfileDetails): js.Promise[Unit] = js.native
  
  def authorize(param: Scope): js.Promise[_] = js.native
  
  def canIUse(name: String): js.Promise[Boolean] = js.native
  
  def canvasGetImageData(params: CanvasId, context: js.Any): js.Promise[Data] = js.native
  
  def canvasPutImageData(params: Height, context: js.Any): js.Promise[Unit] = js.native
  
  def canvasToTempFilePath(params: DestHeight, context: js.Any): js.Promise[TempFilePath] = js.native
  
  def checkIsSoterEnrolledInDevice(params: CheckAuthMode): js.Promise[ErrMsg] = js.native
  
  def checkIsSupportSoterAuthentication(): js.Promise[SupportMode] = js.native
  
  def checkSession(): js.Promise[Unit] = js.native
  
  def chooseInvoiceTitle(): js.Promise[BankAccount] = js.native
  
  def chooseLocation(): js.Promise[Address] = js.native
  
  def chooseVideo(params: Compressed): js.Promise[Duration] = js.native
  
  def clearStorage(): js.Promise[Unit] = js.native
  
  def createAnimation(params: Delay): js.Promise[Animation] = js.native
  
  def createCanvasContext(canvasId: String, context: js.Any): js.Promise[Unit] = js.native
  
  def createMapContext(mapId: String, context: js.Any): MapContext = js.native
  
  def createSelectorQuery(): js.Promise[js.Object] = js.native
  
  def getLocation(params: Altitude): js.Promise[Accuracy] = js.native
  
  def getNetworkType(): js.Promise[NetworkType] = js.native
  
  def getSavedFileInfo(params: FilePathParam): js.Promise[CreateTime] = js.native
  
  def getSavedFileList(): js.Promise[FileList] = js.native
  
  def getSetting(): js.Promise[AuthSetting] = js.native
  
  def getShareInfo(params: ShareTicket): js.Promise[EncryptedData] = js.native
  
  def getSystemInfo(): js.Promise[Brand] = js.native
  
  def getUserInfo(params: Lang): js.Promise[Iv] = js.native
  
  def hideLoading(): js.Promise[Unit] = js.native
  
  def hideNavigationBarLoading(): js.Promise[Unit] = js.native
  
  def makePhoneCall(params: PhoneNumber): js.Promise[Unit] = js.native
  
  def navigateTo(params: UrlParam): js.Promise[Unit] = js.native
  
  def onUserCaptureScreen(): js.Promise[Unit] = js.native
  
  def openLocation(params: Latitude): js.Promise[Unit] = js.native
  
  def pageScrollTo(params: ScrollTop): js.Promise[Unit] = js.native
  
  def redirectTo(params: UrlParam): js.Promise[Unit] = js.native
  
  def removeSavedFile(params: FilePathParam): js.Promise[Unit] = js.native
  
  def removeStorage(params: Key): js.Promise[Unit] = js.native
  
  def request(params: String): js.Promise[_] = js.native
  def request(params: RequestParam): js.Promise[_] = js.native
  
  def requestPayment(params: NonceStr): js.Promise[Unit] = js.native
  
  def scanCode(params: OnlyFromCamera): js.Promise[CharSet] = js.native
  
  def setNavigationBarAlpha(params: Alpha): js.Promise[Unit] = js.native
  
  def setNavigationBarColor(params: Color): js.Promise[Unit] = js.native
  
  def setNavigationBarTitle(params: Title): js.Promise[Unit] = js.native
  
  def setStorage(params: DataKey): js.Promise[Unit] = js.native
  
  def showActionSheet(params: ItemColor): js.Promise[Unit] = js.native
  
  def showLoading(params: Title): js.Promise[Unit] = js.native
  
  def showModal(params: CancelColor): js.Promise[Cancel] = js.native
  
  def showNavigationBarLoading(): js.Promise[Unit] = js.native
  
  def showToast(params: Icon): js.Promise[Unit] = js.native
  
  def switchTab(params: UrlParam): js.Promise[Unit] = js.native
}
