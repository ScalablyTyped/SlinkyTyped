package typingsSlinky.weixinApp

import typingsSlinky.std.ThisType
import typingsSlinky.weixinApp.anon.Connected
import typingsSlinky.weixinApp.anon.DeviceId
import typingsSlinky.weixinApp.anon.Devices
import typingsSlinky.weixinApp.anon.IsConnected
import typingsSlinky.weixinApp.wx.AccelerometerChangeCallback
import typingsSlinky.weixinApp.wx.AccelerometerOptions
import typingsSlinky.weixinApp.wx.AccountInfo
import typingsSlinky.weixinApp.wx.ActionSheetOptions
import typingsSlinky.weixinApp.wx.Animation
import typingsSlinky.weixinApp.wx.App
import typingsSlinky.weixinApp.wx.AppOptions
import typingsSlinky.weixinApp.wx.AudioContext
import typingsSlinky.weixinApp.wx.AuthorizeOption
import typingsSlinky.weixinApp.wx.BackgroundAudioManager
import typingsSlinky.weixinApp.wx.BaseOptions
import typingsSlinky.weixinApp.wx.Beacon
import typingsSlinky.weixinApp.wx.Behavior
import typingsSlinky.weixinApp.wx.BluetoothAdapterState
import typingsSlinky.weixinApp.wx.CameraContext
import typingsSlinky.weixinApp.wx.CanvasContext
import typingsSlinky.weixinApp.wx.CanvasImageDataOptions
import typingsSlinky.weixinApp.wx.CanvasToTempFilePathOptions
import typingsSlinky.weixinApp.wx.CardOptions
import typingsSlinky.weixinApp.wx.CheckIsSoterEnrolledInDeviceOptions
import typingsSlinky.weixinApp.wx.CheckIsSupportSoterAuthenticationOptions
import typingsSlinky.weixinApp.wx.CheckSessionOption
import typingsSlinky.weixinApp.wx.ChooseAddressOptions
import typingsSlinky.weixinApp.wx.ChooseImageOptions
import typingsSlinky.weixinApp.wx.ChooseInvoiceTitleOptions
import typingsSlinky.weixinApp.wx.ChooseLocationOptions
import typingsSlinky.weixinApp.wx.ChooseVideoOptions
import typingsSlinky.weixinApp.wx.CloseBLEConnectionOptions
import typingsSlinky.weixinApp.wx.CloseBluetoothAdapterOptions
import typingsSlinky.weixinApp.wx.CloseSocketOptions
import typingsSlinky.weixinApp.wx.CompassChangeCallback
import typingsSlinky.weixinApp.wx.CompassOptions
import typingsSlinky.weixinApp.wx.Component
import typingsSlinky.weixinApp.wx.ConnectSocketOptions
import typingsSlinky.weixinApp.wx.ConnectWiFiOptions
import typingsSlinky.weixinApp.wx.CreateAnimationOptions
import typingsSlinky.weixinApp.wx.CreateBLEConnectionOptions
import typingsSlinky.weixinApp.wx.CreateIntersectionObserverOption
import typingsSlinky.weixinApp.wx.DataResponse
import typingsSlinky.weixinApp.wx.DownloadFileOptions
import typingsSlinky.weixinApp.wx.DownloadTask
import typingsSlinky.weixinApp.wx.DrawCanvasOptions
import typingsSlinky.weixinApp.wx.EnableDebugOptions
import typingsSlinky.weixinApp.wx.ExtConfig
import typingsSlinky.weixinApp.wx.FileSystemManager
import typingsSlinky.weixinApp.wx.GetBLEDeviceCharacteristicsOptions
import typingsSlinky.weixinApp.wx.GetBLEDeviceServicesOptions
import typingsSlinky.weixinApp.wx.GetBackgroundAudioPlayerStateOptions
import typingsSlinky.weixinApp.wx.GetBeaconsOptions
import typingsSlinky.weixinApp.wx.GetBluetoothAdapterStateOptions
import typingsSlinky.weixinApp.wx.GetBluetoothDevicesOptions
import typingsSlinky.weixinApp.wx.GetConnectedBluetoothDevicesOptions
import typingsSlinky.weixinApp.wx.GetConnectedWifiOptions
import typingsSlinky.weixinApp.wx.GetExtConfigOptions
import typingsSlinky.weixinApp.wx.GetFileInfoOptions
import typingsSlinky.weixinApp.wx.GetImageInfoOptions
import typingsSlinky.weixinApp.wx.GetLocationOptions
import typingsSlinky.weixinApp.wx.GetNetworkTypeOptions
import typingsSlinky.weixinApp.wx.GetSavedFileInfoOptions
import typingsSlinky.weixinApp.wx.GetSavedFileListOptions
import typingsSlinky.weixinApp.wx.GetScreenBrightnessOptions
import typingsSlinky.weixinApp.wx.GetShareInfoOptions
import typingsSlinky.weixinApp.wx.GetStorageInfoOptions
import typingsSlinky.weixinApp.wx.GetStorageOptions
import typingsSlinky.weixinApp.wx.GetSystemInfoOptions
import typingsSlinky.weixinApp.wx.GetUserInfoOptions
import typingsSlinky.weixinApp.wx.GetWifiListOptions
import typingsSlinky.weixinApp.wx.InnerAudioContext
import typingsSlinky.weixinApp.wx.IntersectionObserver
import typingsSlinky.weixinApp.wx.LivePlayerContext
import typingsSlinky.weixinApp.wx.LoadingOptions
import typingsSlinky.weixinApp.wx.Logger
import typingsSlinky.weixinApp.wx.LoginOptions
import typingsSlinky.weixinApp.wx.MakePhoneCallOptions
import typingsSlinky.weixinApp.wx.MapContext
import typingsSlinky.weixinApp.wx.ModalOptions
import typingsSlinky.weixinApp.wx.NavigateBackMiniProgramOptions
import typingsSlinky.weixinApp.wx.NavigateBackOptions
import typingsSlinky.weixinApp.wx.NavigateToMiniProgramOptions
import typingsSlinky.weixinApp.wx.NavigateToOptions
import typingsSlinky.weixinApp.wx.NotifyBLECharacteristicValueChanged
import typingsSlinky.weixinApp.wx.OpenBluetoothAdapterOptions
import typingsSlinky.weixinApp.wx.OpenCardOptions
import typingsSlinky.weixinApp.wx.OpenDocumentOptions
import typingsSlinky.weixinApp.wx.OpenLocationOptions
import typingsSlinky.weixinApp.wx.OpenSettingOptions
import typingsSlinky.weixinApp.wx.Page
import typingsSlinky.weixinApp.wx.PageOptions
import typingsSlinky.weixinApp.wx.PageScrollToOptions
import typingsSlinky.weixinApp.wx.PhoneContact
import typingsSlinky.weixinApp.wx.PlayBackgroundAudioOptions
import typingsSlinky.weixinApp.wx.PlayVoiceOptions
import typingsSlinky.weixinApp.wx.PreviewImageOptions
import typingsSlinky.weixinApp.wx.ReLaunchOptions
import typingsSlinky.weixinApp.wx.ReadBLECharacteristicValue
import typingsSlinky.weixinApp.wx.RecorderManager
import typingsSlinky.weixinApp.wx.RedirectToOptions
import typingsSlinky.weixinApp.wx.RemoveSavedFileOptions
import typingsSlinky.weixinApp.wx.RemoveStorageOptions
import typingsSlinky.weixinApp.wx.RequestOptions
import typingsSlinky.weixinApp.wx.RequestPaymentOptions
import typingsSlinky.weixinApp.wx.RequestTask
import typingsSlinky.weixinApp.wx.SaveFileOptions
import typingsSlinky.weixinApp.wx.SaveImageToPhotosAlbumOptions
import typingsSlinky.weixinApp.wx.SaveVideoOptions
import typingsSlinky.weixinApp.wx.ScanCodeOptions
import typingsSlinky.weixinApp.wx.SeekBackgroundAudioOptions
import typingsSlinky.weixinApp.wx.SelectorQuery
import typingsSlinky.weixinApp.wx.SendSocketMessageOptions
import typingsSlinky.weixinApp.wx.SetClipboardDataOptions
import typingsSlinky.weixinApp.wx.SetKeepScreenOnOptions
import typingsSlinky.weixinApp.wx.SetNavigationBarColorOptions
import typingsSlinky.weixinApp.wx.SetNavigationBarTitleOptions
import typingsSlinky.weixinApp.wx.SetScreenBrightnessOptions
import typingsSlinky.weixinApp.wx.SetStorageOptions
import typingsSlinky.weixinApp.wx.SetTabBarBadgeOptions
import typingsSlinky.weixinApp.wx.SetTabBarItemOptions
import typingsSlinky.weixinApp.wx.SetTabBarStyleOptions
import typingsSlinky.weixinApp.wx.SetTopBarTextOptions
import typingsSlinky.weixinApp.wx.SetWifiListOptions
import typingsSlinky.weixinApp.wx.ShareMenuOptions
import typingsSlinky.weixinApp.wx.ShowTabBarOptions
import typingsSlinky.weixinApp.wx.StartBeaconDiscoveryOptions
import typingsSlinky.weixinApp.wx.StartBluetoothDevicesDiscoveryOptions
import typingsSlinky.weixinApp.wx.StartRecordAudioOptions
import typingsSlinky.weixinApp.wx.StartSoterAuthenticationOptions
import typingsSlinky.weixinApp.wx.StopBeaconDiscoveryOptions
import typingsSlinky.weixinApp.wx.StopBluetoothDevicesDiscoveryOptions
import typingsSlinky.weixinApp.wx.StopRecordAudioOptions
import typingsSlinky.weixinApp.wx.StorageInfo
import typingsSlinky.weixinApp.wx.SwitchTabOptions
import typingsSlinky.weixinApp.wx.SystemInfo
import typingsSlinky.weixinApp.wx.TabBarBadgeOptions
import typingsSlinky.weixinApp.wx.ThisTypedComponentOptionsWithRecordProps
import typingsSlinky.weixinApp.wx.ToastOptions
import typingsSlinky.weixinApp.wx.UnboxBehaviorsData
import typingsSlinky.weixinApp.wx.UnboxBehaviorsMethods
import typingsSlinky.weixinApp.wx.UnboxBehaviorsProps
import typingsSlinky.weixinApp.wx.UpdateManager
import typingsSlinky.weixinApp.wx.UpdateShareMenuOptions
import typingsSlinky.weixinApp.wx.UploadFileOptions
import typingsSlinky.weixinApp.wx.UploadTask
import typingsSlinky.weixinApp.wx.VideoContext
import typingsSlinky.weixinApp.wx.WeRunDataOptions
import typingsSlinky.weixinApp.wx.WiFi
import typingsSlinky.weixinApp.wx.WriteBLECharacteristicValue
import typingsSlinky.weixinApp.wx.compressImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * App() 函数用来注册一个小程序。
    * 接受一个 object 参数，其指定小程序的生命周期函数等。
    */
  @JSGlobal("App")
  @js.native
  def App[T /* <: AppOptions */](app: T with (ThisType[T with typingsSlinky.weixinApp.wx.App])): Unit = js.native
  
  /**
    * behaviors 是用于组件间代码共享的特性
    * 类似于一些编程语言中的“mixins”或“traits”
    * 每个 behavior 可以包含一组属性、数据、生命周期函数和方法
    * 组件引用它时，它的属性、数据和方法会被合并到组件中，生命周期函数也会在对应时机被调用
    * 每个组件可以引用多个 behavior
    * behavior 也可以引用其他 behavior
    */
  @JSGlobal("Behavior")
  @js.native
  def Behavior[D, M, P, B /* <: js.Array[(typingsSlinky.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | String] */](): typingsSlinky.weixinApp.wx.Behavior[
    D with UnboxBehaviorsData[B], 
    P with UnboxBehaviorsProps[B], 
    M with UnboxBehaviorsMethods[B]
  ] = js.native
  @JSGlobal("Behavior")
  @js.native
  def Behavior[D, M, P, B /* <: js.Array[(typingsSlinky.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | String] */](options: ThisTypedComponentOptionsWithRecordProps[Component[D, P, B], D, M, P, B]): typingsSlinky.weixinApp.wx.Behavior[
    D with UnboxBehaviorsData[B], 
    P with UnboxBehaviorsProps[B], 
    M with UnboxBehaviorsMethods[B]
  ] = js.native
  
  // #endregion
  // #region Compontent组件
  @JSGlobal("Component")
  @js.native
  def Component[D, M, P, B /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */](): String = js.native
  @JSGlobal("Component")
  @js.native
  def Component[D, M, P, B /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */](
    options: ThisTypedComponentOptionsWithRecordProps[typingsSlinky.weixinApp.wx.Component[D, P, B], D, M, P, B]
  ): String = js.native
  
  // #endregion
  // #region Page
  /**
    * Page() 函数用来注册一个页面。
    * 接受一个 object 参数，其指定页面的初始数据、生命周期函数、事件处理函数等。
    */
  @JSGlobal("Page")
  @js.native
  def Page[T /* <: PageOptions with js.Object */](page: T with (ThisType[T with (typingsSlinky.weixinApp.wx.Page[js.Object, js.Object])])): Unit = js.native
  
  /**
    * 获取小程序实例
    */
  @JSGlobal("getApp")
  @js.native
  def getApp(): App = js.native
  
  /**
    * getCurrentPages() 函数用于获取当前页面栈的实例，
    * 以数组形式按栈的顺序给出，第一个元素为首页，最后一个元素为当前页面。
    */
  @JSGlobal("getCurrentPages")
  @js.native
  def getCurrentPages(): js.Array[Page[js.Object, js.Object]] = js.native
  
  object wx {
    
    /**
      * 批量添加卡券。
      */
    @JSGlobal("wx.addCard")
    @js.native
    def addCard(options: CardOptions): Unit = js.native
    
    /**
      * 增加 手机联系人
      * 调用后，用户可以选择将该表单以“新增联系人”或“添加到已有联系人”的方式
      * 写入手机系统通讯录
      * 完成手机通讯录联系人和联系方式的增加。
      * @version 1.2.0
      */
    @JSGlobal("wx.addPhoneContact")
    @js.native
    def addPhoneContact(options: PhoneContact): Unit = js.native
    
    // #endregion
    // #region 拓展接口
    /**
      * 将 ArrayBuffer 数据转成 Base64 字符串
      *
      */
    @JSGlobal("wx.arrayBufferToBase64")
    @js.native
    def arrayBufferToBase64(arrayBuffer: js.typedarray.ArrayBuffer): String = js.native
    
    /**
      * 提前向用户发起授权请求。
      * 调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，
      * 但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
      */
    @JSGlobal("wx.authorize")
    @js.native
    def authorize(options: AuthorizeOption): Unit = js.native
    
    /**
      * 将 Base64 字符串转成 ArrayBuffer 数据
      *
      */
    @JSGlobal("wx.base64ToArrayBuffer")
    @js.native
    def base64ToArrayBuffer(base64: String): js.typedarray.ArrayBuffer = js.native
    
    /**
      * 判断小程序的API，回调，参数，组件等是否在当前版本可用。
      * String参数说明：
      * 使用 ${API}.${method}.${param}.${options}
      * 或者 ${component}.${attribute}.${option}方式来调用
      * 例如：
      * ${API} 代表 API 名字
      * ${method} 代表调用方式，有效值为return, success, object, callback
      * ${param} 代表参数或者返回值
      * ${options} 代表参数的可选值
      * ${component} 代表组件名字
      * ${attribute} 代表组件属性
      * ${option} 代表组件属性的可选值
      */
    @JSGlobal("wx.canIUse")
    @js.native
    def canIUse(api: String): Boolean = js.native
    
    /**
      * 返回一个数组，用来描述 canvas 区域隐含的像素数据
      * @version 1.9.0
      */
    @JSGlobal("wx.canvasGetImageData")
    @js.native
    def canvasGetImageData(options: CanvasImageDataOptions): Unit = js.native
    
    /**
      * 将像素数据绘制到画布的方法
      * @version 1.9.0
      */
    @JSGlobal("wx.canvasPutImageData")
    @js.native
    def canvasPutImageData(options: CanvasImageDataOptions): Unit = js.native
    
    /**
      * 把当前画布的内容导出生成图片，并返回文件路径
      */
    @JSGlobal("wx.canvasToTempFilePath")
    @js.native
    def canvasToTempFilePath(options: CanvasToTempFilePathOptions): Unit = js.native
    
    /**
      * 获取设备内是否录入如指纹等生物信息的接口
      */
    @JSGlobal("wx.checkIsSoterEnrolledInDevice")
    @js.native
    def checkIsSoterEnrolledInDevice(options: CheckIsSoterEnrolledInDeviceOptions): Unit = js.native
    
    /**
      * 获取本机支持的 SOTER 生物认证方式
      */
    @JSGlobal("wx.checkIsSupportSoterAuthentication")
    @js.native
    def checkIsSupportSoterAuthentication(options: CheckIsSupportSoterAuthenticationOptions): Unit = js.native
    
    /**
      * 检测当前用户登录态是否有效。
      * 通过wx.login获得的用户登录态拥有一定的时效性。用户越久未使用小程序，用户登录态越有可能失效。
      * 反之如果用户一直在使用小程序，则用户登录态一直保持有效。具体时效逻辑由微信维护，对开发者透明。
      * 开发者只需要调用wx.checkSession接口检测当前用户登录态是否有效。
      * 登录态过期后开发者可以再调用wx.login获取新的用户登录态。
      */
    @JSGlobal("wx.checkSession")
    @js.native
    def checkSession(options: CheckSessionOption): Unit = js.native
    
    @JSGlobal("wx.chooseAddress")
    @js.native
    def chooseAddress(options: ChooseAddressOptions): Unit = js.native
    
    /**
      * 从本地相册选择图片或使用相机拍照。
      */
    @JSGlobal("wx.chooseImage")
    @js.native
    def chooseImage(options: ChooseImageOptions): Unit = js.native
    
    /**
      * 选择用户的发票抬头。
      */
    @JSGlobal("wx.chooseInvoiceTitle")
    @js.native
    def chooseInvoiceTitle(options: ChooseInvoiceTitleOptions): Unit = js.native
    
    /**
      * 打开地图选择位置
      */
    @JSGlobal("wx.chooseLocation")
    @js.native
    def chooseLocation(options: ChooseLocationOptions): Unit = js.native
    
    /**
      * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
      */
    @JSGlobal("wx.chooseVideo")
    @js.native
    def chooseVideo(options: ChooseVideoOptions): Unit = js.native
    
    /**
      * 清理本地数据缓存。
      */
    @JSGlobal("wx.clearStorage")
    @js.native
    def clearStorage(): Unit = js.native
    
    /**
      * 同步清理本地数据缓存
      */
    @JSGlobal("wx.clearStorageSync")
    @js.native
    def clearStorageSync(): Unit = js.native
    
    /**
      * 断开与低功耗蓝牙设备的连接
      * @version 1.1.0
      */
    @JSGlobal("wx.closeBLEConnection")
    @js.native
    def closeBLEConnection(options: CloseBLEConnectionOptions): Unit = js.native
    
    /**
      * 关闭蓝牙模块。调用该方法将断开所有已建立的链接并释放系统资源
      * @version 1.1.0
      */
    @JSGlobal("wx.closeBluetoothAdapter")
    @js.native
    def closeBluetoothAdapter(options: CloseBluetoothAdapterOptions): Unit = js.native
    
    /**
      * 关闭WebSocket连接。
      */
    @JSGlobal("wx.closeSocket")
    @js.native
    def closeSocket(options: CloseSocketOptions): Unit = js.native
    
    /**
      * 压缩图片接口，可选压缩质量
      * @version 2.4.0
      */
    @JSGlobal("wx.compressImage")
    @js.native
    def compressImage(options: compressImageOptions): Unit = js.native
    
    /**
      * 创建一个 WebSocket 连接；
      * 一个微信小程序同时只能有一个 WebSocket 连接，
      * 如果当前已存在一个 WebSocket 连接，
      * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
      */
    @JSGlobal("wx.connectSocket")
    @js.native
    def connectSocket(options: ConnectSocketOptions): Unit = js.native
    
    /**
      * 连接 Wi-Fi。
      * 若已知 Wi-Fi 信息，可以直接利用该接口连接。
      * 仅 Android 与 iOS 11 以上版本支持。
      * @version 1.6.0
      */
    @JSGlobal("wx.connectWifi")
    @js.native
    def connectWifi(): Unit = js.native
    @JSGlobal("wx.connectWifi")
    @js.native
    def connectWifi(options: ConnectWiFiOptions): Unit = js.native
    
    /**
      * 创建一个动画实例animation。调用实例的方法来描述动画。
      * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
      *
      * 注意: export 方法每次调用后会清掉之前的动画操作
      */
    @JSGlobal("wx.createAnimation")
    @js.native
    def createAnimation(): Animation = js.native
    @JSGlobal("wx.createAnimation")
    @js.native
    def createAnimation(options: CreateAnimationOptions): Animation = js.native
    
    /**
      * 创建并返回 audio 上下文 audioContext 对象
      * @param audioId audio标签id <audio  src="{{src}}" id="myAudio" ></audio>
      * @example
      * <!-- audio.wxml -->
      * <audio  src="{{src}}" id="myAudio" ></audio>
      * <button type="primary" bindtap="audioPlay">播放</button>
      * <button type="primary" bindtap="audioPause">暂停</button>
      * <button type="primary" bindtap="audio14">设置当前播放时间为14秒</button>
      * <button type="primary" bindtap="audioStart">回到开头</button>
      * // audio.js
      * Page({
      * onReady: function (e) {
      *   // 使用 wx.createAudioContext 获取 audio 上下文 context
      *   this.audioCtx = wx.createAudioContext('myAudio')
      *   this.audioCtx.setSrc('http://ws.stream.qqmusic.qq.com/
      * M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&
      * uin=346897220&vkey=6292F51E1E384E06DCBDC9AB7C49FD713D632D313AC4858BACB8DDD29067D3C601481D36E62053BF8DFEAF74C0A5CCFADD6471160CAF3E6A&
      * fromtag=46')
      *   this.audioCtx.play()
      * },
      * data: {
      *   src: ''
      * },
      * audioPlay: function () {
      *   this.audioCtx.play()
      * },
      * audioPause: function () {
      *   this.audioCtx.pause()
      * },
      * audio14: function () {
      *   this.audioCtx.seek(14)
      * },
      * audioStart: function () {
      *   this.audioCtx.seek(0)
      * }
      * })
      * @deprecated 1.6.0
      */
    @JSGlobal("wx.createAudioContext")
    @js.native
    def createAudioContext(audioId: String, instance: js.Any): AudioContext = js.native
    
    /**
      * 低功耗蓝牙接口
      * @version 1.1.0
      */
    @JSGlobal("wx.createBLEConnection")
    @js.native
    def createBLEConnection(options: CreateBLEConnectionOptions): Unit = js.native
    
    /**
      * 创建并返回 camera 上下文 cameraContext 对象
      * cameraContext 与页面的 camera 组件绑定
      * 一个页面只能有一个camera，通过它可以操作对应的 <camera/> 组件。
      * 在自定义组件下，第一个参数传入组件实例this，以操作组件内 <camera/> 组件
      * @version 1.6.0
      */
    @JSGlobal("wx.createCameraContext")
    @js.native
    def createCameraContext(): CameraContext = js.native
    @JSGlobal("wx.createCameraContext")
    @js.native
    def createCameraContext(instance: js.Any): CameraContext = js.native
    
    /**
      * 创建并返回绘图上下文context对象。
      * context只是一个记录方法调用的容器，
      * 用于生成记录绘制行为的actions数组。c
      * ontext跟<canvas/>不存在对应关系，
      * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
      */
    @JSGlobal("wx.createContext")
    @js.native
    def createContext(): CanvasContext = js.native
    
    /**
      * 创建并返回内部 audio 上下文 innerAudioContext 对象。
      * 本接口是 wx.createAudioContext 升级版。
      * @version 1.6.0
      */
    @JSGlobal("wx.createInnerAudioContext")
    @js.native
    def createInnerAudioContext(): InnerAudioContext = js.native
    
    @JSGlobal("wx.createIntersectionObserver")
    @js.native
    def createIntersectionObserver(context: Component[_, _, js.Array[js.Any]]): IntersectionObserver = js.native
    @JSGlobal("wx.createIntersectionObserver")
    @js.native
    def createIntersectionObserver(context: Component[_, _, js.Array[js.Any]], options: CreateIntersectionObserverOption): IntersectionObserver = js.native
    
    /**
      * 操作对应的 <live-player/> 组件。
      * 创建并返回 live-player 上下文 LivePlayerContext 对象。
      * 在自定义组件下，第二个参数传入组件实例this，以操作组件内 <live-player/> 组件
      * @version 1.7.0
      */
    @JSGlobal("wx.createLivePlayerContext")
    @js.native
    def createLivePlayerContext(id: String, instance: js.Any): LivePlayerContext = js.native
    
    /**
      * 创建并返回 map 上下文 mapContext 对象
      */
    @JSGlobal("wx.createMapContext")
    @js.native
    def createMapContext(mapId: String): MapContext = js.native
    
    /**
      * 返回一个SelectorQuery对象实例。
      * 可以在这个实例上使用select等方法选择节点，并使用boundingClientRect等方法选择需要查询的信息。
      * @version 1.4.0
      */
    @JSGlobal("wx.createSelectorQuery")
    @js.native
    def createSelectorQuery(): SelectorQuery = js.native
    
    /**
      * 创建并返回 video 上下文 videoContext 对象
      * @param videoId video标签id <video  src="{{src}}" id="myVideo" ></video>
      */
    @JSGlobal("wx.createVideoContext")
    @js.native
    def createVideoContext(videoId: String): VideoContext = js.native
    
    /**
      * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
      * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
      */
    @JSGlobal("wx.downloadFile")
    @js.native
    def downloadFile(options: DownloadFileOptions): DownloadTask = js.native
    
    /**
      * 绘制画布
      */
    @JSGlobal("wx.drawCanvas")
    @js.native
    def drawCanvas(options: DrawCanvasOptions): Unit = js.native
    
    /**
      * 获取当前账号信息
      * @version >= 2.2.2
      */
    @JSGlobal("wx.getAccountInfoSync")
    @js.native
    def getAccountInfoSync(): AccountInfo = js.native
    
    /**
      * 获取蓝牙设备所有 characteristic（特征值）
      */
    @JSGlobal("wx.getBLEDeviceCharacteristics")
    @js.native
    def getBLEDeviceCharacteristics(options: GetBLEDeviceCharacteristicsOptions): Unit = js.native
    
    /**
      * 获取蓝牙设备所有 service（服务）
      */
    @JSGlobal("wx.getBLEDeviceServices")
    @js.native
    def getBLEDeviceServices(options: GetBLEDeviceServicesOptions): Unit = js.native
    
    /**
      * 获取全局唯一的背景音频管理器 backgroundAudioManager。
      * @version 1.2.0
      */
    @JSGlobal("wx.getBackgroundAudioManager")
    @js.native
    def getBackgroundAudioManager(): BackgroundAudioManager = js.native
    
    /**
      * 获取音乐播放状态。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.getBackgroundAudioPlayerState")
    @js.native
    def getBackgroundAudioPlayerState(options: GetBackgroundAudioPlayerStateOptions): Unit = js.native
    
    /**
      * 获取所有已搜索到的iBeacon设备
      * @version 1.2.0
      */
    @JSGlobal("wx.getBeacons")
    @js.native
    def getBeacons(options: GetBeaconsOptions): Unit = js.native
    
    /**
      * 获取本机蓝牙适配器状态
      * @version 1.1.0
      */
    @JSGlobal("wx.getBluetoothAdapterState")
    @js.native
    def getBluetoothAdapterState(options: GetBluetoothAdapterStateOptions): Unit = js.native
    
    /**
      * 获取所有已发现的蓝牙设备，包括已经和本机处于连接状态的设备
      */
    @JSGlobal("wx.getBluetoothDevices")
    @js.native
    def getBluetoothDevices(options: GetBluetoothDevicesOptions): Unit = js.native
    
    /**
      * 获取系统剪贴板内容
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("wx.getClipboardData")
    @js.native
    def getClipboardData(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 根据 uuid 获取处于已连接状态的设备
      * @version 1.1.0
      */
    @JSGlobal("wx.getConnectedBluetoothDevices")
    @js.native
    def getConnectedBluetoothDevices(options: GetConnectedBluetoothDevicesOptions): Unit = js.native
    
    /**
      * 获取已连接中的 Wi-Fi 信息
      * @version 1.6.0
      */
    @JSGlobal("wx.getConnectedWifi")
    @js.native
    def getConnectedWifi(): Unit = js.native
    @JSGlobal("wx.getConnectedWifi")
    @js.native
    def getConnectedWifi(options: GetConnectedWifiOptions): Unit = js.native
    
    /**
      * 获取第三方平台自定义的数据字段。
      * @version 1.1.0
      */
    @JSGlobal("wx.getExtConfig")
    @js.native
    def getExtConfig(): Unit = js.native
    @JSGlobal("wx.getExtConfig")
    @js.native
    def getExtConfig(options: GetExtConfigOptions): Unit = js.native
    
    /**
      * 获取第三方平台自定义的数据字段的同步接口。
      * @version 1.1.0
      */
    @JSGlobal("wx.getExtConfigSync")
    @js.native
    def getExtConfigSync(): ExtConfig = js.native
    
    /**
      *  获取文件信息
      * @version 1.4.0
      */
    @JSGlobal("wx.getFileInfo")
    @js.native
    def getFileInfo(options: GetFileInfoOptions): Unit = js.native
    
    @JSGlobal("wx.getFileSystemManager")
    @js.native
    def getFileSystemManager(): FileSystemManager = js.native
    
    /**
      * 获取图片信息
      */
    @JSGlobal("wx.getImageInfo")
    @js.native
    def getImageInfo(options: GetImageInfoOptions): Unit = js.native
    
    /**
      * 获取当前的地理位置、速度。
      */
    @JSGlobal("wx.getLocation")
    @js.native
    def getLocation(options: GetLocationOptions): Unit = js.native
    
    // #region LogManager
    /**
      * 获取日志管理器 logManager 对象。logManager提供log、info、warn、debug四个方法写日志到文件，
      * 这四个方法接受任意个类型为Object/Array/Number/String的参数，
      * 每次调用的参数的总大小不超过100Kb。最多保存5M的日志内容，超过5M后，旧的日志内容会被删除。
      * 用户可以通过设置Button组件的open-type为feedback来上传打印的日志。
      * 用户上传的日志可以通过登录小程序管理后台后进入左侧菜单“客服反馈”页面获取到。
      */
    @JSGlobal("wx.getLogManager")
    @js.native
    def getLogManager(): Logger = js.native
    
    /**
      * 获取网络类型。
      */
    @JSGlobal("wx.getNetworkType")
    @js.native
    def getNetworkType(options: GetNetworkTypeOptions): Unit = js.native
    
    /**
      * 获取全局唯一的录音管理器 recorderManager
      * @version 1.6.0
      */
    @JSGlobal("wx.getRecorderManager")
    @js.native
    def getRecorderManager(): RecorderManager = js.native
    
    /**
      * 获取本地文件的文件信息
      */
    @JSGlobal("wx.getSavedFileInfo")
    @js.native
    def getSavedFileInfo(options: GetSavedFileInfoOptions): Unit = js.native
    
    /**
      * 获取本地已保存的文件列表
      */
    @JSGlobal("wx.getSavedFileList")
    @js.native
    def getSavedFileList(options: GetSavedFileListOptions): Unit = js.native
    
    /**
      * 获取屏幕亮度
      * @version 1.2.0
      */
    @JSGlobal("wx.getScreenBrightness")
    @js.native
    def getScreenBrightness(): Unit = js.native
    @JSGlobal("wx.getScreenBrightness")
    @js.native
    def getScreenBrightness(options: GetScreenBrightnessOptions): Unit = js.native
    
    /**
      * 获取用户的当前设置。
      * 注：返回值中只会出现小程序已经向用户请求过的权限。
      * @version 1.2.0
      */
    @JSGlobal("wx.getSetting")
    @js.native
    def getSetting(options: OpenSettingOptions): Unit = js.native
    
    /**
      * 获取转发详细信息
      * @version 1.1.0
      */
    @JSGlobal("wx.getShareInfo")
    @js.native
    def getShareInfo(): Unit = js.native
    @JSGlobal("wx.getShareInfo")
    @js.native
    def getShareInfo(options: GetShareInfoOptions): Unit = js.native
    
    /**
      * 从本地缓存中异步获取指定 key 对应的内容。
      */
    @JSGlobal("wx.getStorage")
    @js.native
    def getStorage(options: GetStorageOptions): Unit = js.native
    
    /**
      * 异步获取当前storage的相关信息
      */
    @JSGlobal("wx.getStorageInfo")
    @js.native
    def getStorageInfo(options: GetStorageInfoOptions): Unit = js.native
    
    @JSGlobal("wx.getStorageInfoSync")
    @js.native
    def getStorageInfoSync(): StorageInfo = js.native
    
    /**
      * 从本地缓存中同步获取指定 key 对应的内容。
      *
      */
    @JSGlobal("wx.getStorageSync")
    @js.native
    def getStorageSync(key: String): js.Any | String = js.native
    
    /**
      * 获取系统信息。
      */
    @JSGlobal("wx.getSystemInfo")
    @js.native
    def getSystemInfo(options: GetSystemInfoOptions): Unit = js.native
    
    @JSGlobal("wx.getSystemInfoSync")
    @js.native
    def getSystemInfoSync(): SystemInfo = js.native
    
    /**
      * 获取全局唯一的版本更新管理器，用于管理小程序更新。关于小程序的更新机制，可以查看运行机制文档。
      */
    @JSGlobal("wx.getUpdateManager")
    @js.native
    def getUpdateManager(): UpdateManager = js.native
    
    /**
      * 获取用户信息，需要先调用 wx.login 接口。
      */
    @JSGlobal("wx.getUserInfo")
    @js.native
    def getUserInfo(options: GetUserInfoOptions): Unit = js.native
    
    /**
      * 获取用户过去三十天微信运动步数
      * 需要先调用 wx.login 接口。
      * 需要用户授权 scope.werun
      */
    @JSGlobal("wx.getWeRunData")
    @js.native
    def getWeRunData(): Unit = js.native
    @JSGlobal("wx.getWeRunData")
    @js.native
    def getWeRunData(options: WeRunDataOptions): Unit = js.native
    
    /**
      * 请求获取 Wi-Fi 列表
      * 在 onGetWifiList 注册的回调中返回 wifiList 数据。
      * iOS 将跳转到系统的 Wi-Fi 界面，Android 不会跳转。
      * iOS 11.0 及 iOS 11.1 两个版本因系统问题，该方法失效。但在 iOS 11.2 中已修复。
      * @version 1.6.0
      */
    @JSGlobal("wx.getWifiList")
    @js.native
    def getWifiList(): Unit = js.native
    @JSGlobal("wx.getWifiList")
    @js.native
    def getWifiList(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 收起键盘。
      */
    @JSGlobal("wx.hideKeyboard")
    @js.native
    def hideKeyboard(): Unit = js.native
    
    /**
      * 隐藏消息提示框
      */
    @JSGlobal("wx.hideLoading")
    @js.native
    def hideLoading(): Unit = js.native
    
    /**
      * 隐藏导航条加载动画。
      * @version 1.4.3
      */
    @JSGlobal("wx.hideNavigationBarLoading")
    @js.native
    def hideNavigationBarLoading(): Unit = js.native
    
    /**
      * 隐藏分享按钮
      * @version 1.1.0
      */
    @JSGlobal("wx.hideShareMenu")
    @js.native
    def hideShareMenu(): Unit = js.native
    @JSGlobal("wx.hideShareMenu")
    @js.native
    def hideShareMenu(options: ShareMenuOptions): Unit = js.native
    
    /**
      * 隐藏 tabBar
      * @version 1.9.0
      */
    @JSGlobal("wx.hideTabBar")
    @js.native
    def hideTabBar(options: ShowTabBarOptions): Unit = js.native
    
    /**
      * 隐藏 tabBar 某一项的右上角的红点
      * @version 1.9.0
      */
    @JSGlobal("wx.hideTabBarRedDot")
    @js.native
    def hideTabBarRedDot(option: TabBarBadgeOptions): Unit = js.native
    
    @JSGlobal("wx.hideToast")
    @js.native
    def hideToast(): Unit = js.native
    
    /**
      * 调用接口获取登录凭证（code）进而换取用户登录态信息，
      * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
      * 用户数据的加解密通讯需要依赖会话密钥完成。
      */
    @JSGlobal("wx.login")
    @js.native
    def login(option: LoginOptions): Unit = js.native
    
    /**
      * 拨打电话
      */
    @JSGlobal("wx.makePhoneCall")
    @js.native
    def makePhoneCall(options: MakePhoneCallOptions): Unit = js.native
    
    /**
      * 关闭当前页面，回退前一页面。
      */
    @JSGlobal("wx.navigateBack")
    @js.native
    def navigateBack(): Unit = js.native
    @JSGlobal("wx.navigateBack")
    @js.native
    def navigateBack(options: NavigateBackOptions): Unit = js.native
    
    /**
      * 返回到上一个小程序，只有在当前小程序是被其他小程序打开时可以调用成功
      */
    @JSGlobal("wx.navigateBackMiniProgram")
    @js.native
    def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): Unit = js.native
    
    /**
      * 保留当前页面，跳转到应用内的某个页面，使用wx.navigateBack可以返回到原页面。
      *
      * 注意：为了不让用户在使用小程序时造成困扰，
      * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
      */
    @JSGlobal("wx.navigateTo")
    @js.native
    def navigateTo(options: NavigateToOptions): Unit = js.native
    
    /**
      * 打开同一公众号下关联的另一个小程序。
      */
    @JSGlobal("wx.navigateToMiniProgram")
    @js.native
    def navigateToMiniProgram(options: NavigateToMiniProgramOptions): Unit = js.native
    
    /**
      * 用于延迟一部分操作到下一个时间片再执行（类似于 setTimeout）。
      * @param func
      * @version 2.2.3
      */
    @JSGlobal("wx.nextTick")
    @js.native
    def nextTick(func: js.Function0[_]): Unit = js.native
    
    /**
      * 启用低功耗蓝牙设备特征值变化时的 notify 功能。
      * 注意：必须设备的特征值支持notify才可以成功调用，具体参照 characteristic 的 properties 属性
      * 另外，必须先启用notify才能监听到设备 characteristicValueChange 事件
      */
    @JSGlobal("wx.notifyBLECharacteristicValueChanged")
    @js.native
    def notifyBLECharacteristicValueChanged(options: NotifyBLECharacteristicValueChanged): Unit = js.native
    
    /**
      * 监听重力感应数据，频率：5次/秒
      */
    @JSGlobal("wx.onAccelerometerChange")
    @js.native
    def onAccelerometerChange(callback: AccelerometerChangeCallback): Unit = js.native
    
    /**
      * 监听低功耗蓝牙设备的特征值变化。必须先启用notify接口才能接收到设备推送的notification。
      */
    @JSGlobal("wx.onBLECharacteristicValueChange")
    @js.native
    def onBLECharacteristicValueChange(callback: js.Function1[/* res */ DeviceId, Unit]): Unit = js.native
    
    /**
      * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等等。
      */
    @JSGlobal("wx.onBLEConnectionStateChanged")
    @js.native
    def onBLEConnectionStateChanged(callback: js.Function1[/* res */ Connected, Unit]): Unit = js.native
    
    /**
      * 监听音乐暂停。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.onBackgroundAudioPause")
    @js.native
    def onBackgroundAudioPause(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听音乐播放。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.onBackgroundAudioPlay")
    @js.native
    def onBackgroundAudioPlay(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听音乐停止。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.onBackgroundAudioStop")
    @js.native
    def onBackgroundAudioStop(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听 iBeacon 服务的状态变化
      * @version 1.2.0
      */
    @JSGlobal("wx.onBeaconServiceChange")
    @js.native
    def onBeaconServiceChange(): Unit = js.native
    @JSGlobal("wx.onBeaconServiceChange")
    @js.native
    def onBeaconServiceChange(callback: js.Function2[/* available */ Boolean, /* discovering */ Boolean, Unit]): Unit = js.native
    
    /**
      * 监听 iBeacon 设备的更新事件
      * @version 1.2.0
      */
    @JSGlobal("wx.onBeaconUpdate")
    @js.native
    def onBeaconUpdate(): Unit = js.native
    @JSGlobal("wx.onBeaconUpdate")
    @js.native
    def onBeaconUpdate(callback: js.Function1[/* beacons */ js.Array[Beacon], Unit]): Unit = js.native
    
    /**
      * 监听蓝牙适配器状态变化事件
      * @version 1.1.0
      */
    @JSGlobal("wx.onBluetoothAdapterStateChange")
    @js.native
    def onBluetoothAdapterStateChange(callback: js.Function1[/* res */ BluetoothAdapterState, Unit]): Unit = js.native
    
    /**
      * 监听寻找到新设备的事件
      * @version 1.1.0
      */
    @JSGlobal("wx.onBluetoothDeviceFound")
    @js.native
    def onBluetoothDeviceFound(callback: js.Function1[/* res */ Devices, Unit]): Unit = js.native
    
    /**
      * 监听罗盘数据，频率：5次/秒，接口调用后会自动开始监听，可使用wx.stopCompass停止监听。
      */
    @JSGlobal("wx.onCompassChange")
    @js.native
    def onCompassChange(callback: CompassChangeCallback): Unit = js.native
    
    /**
      * 监听在获取到 Wi-Fi 列表数据时的事件，在回调中将返回 wifiList。
      * @version 1.6.0
      */
    @JSGlobal("wx.onGetWifiList")
    @js.native
    def onGetWifiList(): Unit = js.native
    @JSGlobal("wx.onGetWifiList")
    @js.native
    def onGetWifiList(callback: js.Function1[/* res */ GetWifiListOptions, Unit]): Unit = js.native
    
    /**
      * 监听网络状态变化。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("wx.onNetworkStatusChange")
    @js.native
    def onNetworkStatusChange(callback: js.Function1[/* res */ IsConnected, Unit]): Unit = js.native
    
    /** 监听WebSocket关闭。 */
    @JSGlobal("wx.onSocketClose")
    @js.native
    def onSocketClose(callback: js.Function0[Unit]): Unit = js.native
    
    /** 监听WebSocket错误。 */
    @JSGlobal("wx.onSocketError")
    @js.native
    def onSocketError(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    /**
      * 监听WebSocket接受到服务器的消息事件。
      */
    @JSGlobal("wx.onSocketMessage")
    @js.native
    def onSocketMessage(callback: js.Function1[/* res */ DataResponse, Unit]): Unit = js.native
    
    /** 监听WebSocket连接打开事件。 */
    @JSGlobal("wx.onSocketOpen")
    @js.native
    def onSocketOpen(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听用户主动截屏事件，用户使用系统截屏按键截屏时触发此事件
      * @version 1.4.0
      */
    @JSGlobal("wx.onUserCaptureScreen")
    @js.native
    def onUserCaptureScreen(): Unit = js.native
    @JSGlobal("wx.onUserCaptureScreen")
    @js.native
    def onUserCaptureScreen(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
    
    /**
      * 监听连接上 Wi-Fi 的事件。
      * @version 1.6.0
      */
    @JSGlobal("wx.onWifiConnected")
    @js.native
    def onWifiConnected(): Unit = js.native
    @JSGlobal("wx.onWifiConnected")
    @js.native
    def onWifiConnected(callback: js.Function1[/* wifi */ WiFi, Unit]): Unit = js.native
    
    /**
      * 初始化蓝牙适配器
      * @version 1.1.0
      */
    @JSGlobal("wx.openBluetoothAdapter")
    @js.native
    def openBluetoothAdapter(options: OpenBluetoothAdapterOptions): Unit = js.native
    
    /**
      * 查看微信卡包中的卡券。
      *
      */
    @JSGlobal("wx.openCard")
    @js.native
    def openCard(options: OpenCardOptions): Unit = js.native
    
    /**
      * 新开页面打开文档，支持格式：doc, xls, ppt, pdf, docx, xlsx, pptx
      */
    @JSGlobal("wx.openDocument")
    @js.native
    def openDocument(options: OpenDocumentOptions): Unit = js.native
    
    /**
      * 使用微信内置地图查看位置
      */
    @JSGlobal("wx.openLocation")
    @js.native
    def openLocation(options: OpenLocationOptions): Unit = js.native
    
    /**
      * 调起客户端小程序设置界面，返回用户设置的操作结果。
      * 注：设置界面只会出现小程序已经向用户请求过的权限。
      * @version 1.1.0
      */
    @JSGlobal("wx.openSetting")
    @js.native
    def openSetting(options: OpenSettingOptions): Unit = js.native
    
    @JSGlobal("wx.pageScrollTo")
    @js.native
    def pageScrollTo(options: PageScrollToOptions): Unit = js.native
    
    /**
      * 暂停播放音乐。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.pauseBackgroundAudio")
    @js.native
    def pauseBackgroundAudio(): Unit = js.native
    @JSGlobal("wx.pauseBackgroundAudio")
    @js.native
    def pauseBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = js.native
    
    /**
      * 暂停正在播放的语音。
      * 再次调用wx.playVoice播放同一个文件时，会从暂停处开始播放。
      * 如果想从头开始播放，需要先调用 wx.stopVoice。
      * @deprecated 1.6.0
      */
    @JSGlobal("wx.pauseVoice")
    @js.native
    def pauseVoice(): Unit = js.native
    
    /**
      * 播放音乐，同时只能有一首音乐正在播放。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.playBackgroundAudio")
    @js.native
    def playBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = js.native
    
    /**
      * 开始播放语音，同时只允许一个语音文件正在播放，
      * 如果前一个语音文件还没播放完，将中断前一个语音播放。
      * @deprecated 1.6.0
      */
    @JSGlobal("wx.playVoice")
    @js.native
    def playVoice(options: PlayVoiceOptions): Unit = js.native
    
    /**
      * 预览图片。
      */
    @JSGlobal("wx.previewImage")
    @js.native
    def previewImage(options: PreviewImageOptions): Unit = js.native
    
    /**
      * 关闭所有页面，打开到应用内的某个页面。
      * @version 1.1.0
      */
    @JSGlobal("wx.reLaunch")
    @js.native
    def reLaunch(): Unit = js.native
    @JSGlobal("wx.reLaunch")
    @js.native
    def reLaunch(options: ReLaunchOptions): Unit = js.native
    
    /**
      * 读取低功耗蓝牙设备的特征值的二进制数据值。
      * 注意：必须设备的特征值支持read才可以成功调用，具体参照 characteristic 的 properties 属性
      */
    @JSGlobal("wx.readBLECharacteristicValue")
    @js.native
    def readBLECharacteristicValue(options: ReadBLECharacteristicValue): Unit = js.native
    
    /**
      * 关闭当前页面，跳转到应用内的某个页面。
      */
    @JSGlobal("wx.redirectTo")
    @js.native
    def redirectTo(options: RedirectToOptions): Unit = js.native
    
    /**
      * 删除本地存储的文件
      */
    @JSGlobal("wx.removeSavedFile")
    @js.native
    def removeSavedFile(options: RemoveSavedFileOptions): Unit = js.native
    
    @JSGlobal("wx.removeStorage")
    @js.native
    def removeStorage(options: RemoveStorageOptions): Unit = js.native
    
    @JSGlobal("wx.removeStorageSync")
    @js.native
    def removeStorageSync(key: String): DataResponse = js.native
    
    /**
      * 移除 tabBar 某一项右上角的文本
      * @version 1.9.0
      */
    @JSGlobal("wx.removeTabBarBadge")
    @js.native
    def removeTabBarBadge(options: TabBarBadgeOptions): Unit = js.native
    
    /**
      * 自定义分析数据上报接口。使用前，需要在小程序管理后台自定义分析中新建事件，配置好事件名与字段。
      *
      * @param eventName 事件名
      * @param data 上报的自定义数据
      */
    @JSGlobal("wx.reportAnalytics")
    @js.native
    def reportAnalytics(eventName: String, data: js.Object): Unit = js.native
    
    /**
      * 自定义业务数据监控上报接口。使用前，需要在小程序管理后台-运维中心-性能监控-业务数据监控中新建监控事件，
      * 配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
      * @param name 监控ID，在小程序管理后台新建数据指标后获得
      * @param value 上报数值，经处理后会在小程序管理后台上展示每分钟的上报总量
      */
    @JSGlobal("wx.reportMonitor")
    @js.native
    def reportMonitor(name: String, value: Double): Unit = js.native
    
    /**
      * wx.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
      */
    @JSGlobal("wx.request")
    @js.native
    def request(options: RequestOptions): RequestTask = js.native
    
    /**
      * 发起微信支付。
      */
    @JSGlobal("wx.requestPayment")
    @js.native
    def requestPayment(options: RequestPaymentOptions): Unit = js.native
    
    /**
      * 保存文件到本地。
      * 本地文件存储的大小限制为 10M
      */
    @JSGlobal("wx.saveFile")
    @js.native
    def saveFile(options: SaveFileOptions): Unit = js.native
    
    /**
      * 保存图片到系统相册。
      * 需要用户授权 scope.writePhotosAlbum
      * @version 1.2.0
      */
    @JSGlobal("wx.saveImageToPhotosAlbum")
    @js.native
    def saveImageToPhotosAlbum(options: SaveImageToPhotosAlbumOptions): Unit = js.native
    
    /** 保存视频到系统相册。需要用户授权 scope.writePhotosAlbum */
    @JSGlobal("wx.saveVideoToPhotosAlbum")
    @js.native
    def saveVideoToPhotosAlbum(options: SaveVideoOptions): Unit = js.native
    
    /**
      * 调起客户端扫码界面，扫码成功后返回对应的结果
      */
    @JSGlobal("wx.scanCode")
    @js.native
    def scanCode(options: ScanCodeOptions): Unit = js.native
    
    /**
      * 控制音乐播放进度。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.seekBackgroundAudio")
    @js.native
    def seekBackgroundAudio(options: SeekBackgroundAudioOptions): Unit = js.native
    
    /**
      * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，
      * 并在 wx.onSocketOpen 回调之后才能发送。
      */
    @JSGlobal("wx.sendSocketMessage")
    @js.native
    def sendSocketMessage(options: SendSocketMessageOptions): Unit = js.native
    
    /**
      * 设置系统剪贴板的内容
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("wx.setClipboardData")
    @js.native
    def setClipboardData(options: SetClipboardDataOptions): Unit = js.native
    
    @JSGlobal("wx.setEnableDebug")
    @js.native
    def setEnableDebug(options: EnableDebugOptions): Unit = js.native
    
    /**
      * 设置是否保持常亮状态。
      * 仅在当前小程序生效，离开小程序后设置失效。
      * @version 1.4.0
      */
    @JSGlobal("wx.setKeepScreenOn")
    @js.native
    def setKeepScreenOn(): Unit = js.native
    @JSGlobal("wx.setKeepScreenOn")
    @js.native
    def setKeepScreenOn(options: SetKeepScreenOnOptions): Unit = js.native
    
    /**
      * 设置导航颜色
      * @version 1.4.3
      */
    @JSGlobal("wx.setNavigationBarColor")
    @js.native
    def setNavigationBarColor(options: SetNavigationBarColorOptions): Unit = js.native
    
    /**
      * 动态设置当前页面的标题。
      * @version 1.4.3
      */
    @JSGlobal("wx.setNavigationBarTitle")
    @js.native
    def setNavigationBarTitle(options: SetNavigationBarTitleOptions): Unit = js.native
    
    /**
      * 设置屏幕亮度
      * @version 1.2.0
      */
    @JSGlobal("wx.setScreenBrightness")
    @js.native
    def setScreenBrightness(options: SetScreenBrightnessOptions): Unit = js.native
    
    /**
      * 将数据存储在本地缓存中指定的 key 中，
      * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
      */
    @JSGlobal("wx.setStorage")
    @js.native
    def setStorage(options: SetStorageOptions): Unit = js.native
    
    @JSGlobal("wx.setStorageSync")
    @js.native
    def setStorageSync(key: String, data: String): Unit = js.native
    /**
      * 将 data 存储在本地缓存中指定的 key 中，
      * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
      *
      * @param key 本地缓存中的指定的 key
      * @param data 需要存储的内容
      */
    @JSGlobal("wx.setStorageSync")
    @js.native
    def setStorageSync(key: String, data: js.Any): Unit = js.native
    
    // 界面-----设置tabBar
    /**
      * 为 tabBar 某一项的右上角添加文本
      * @version 1.9.0
      */
    @JSGlobal("wx.setTabBarBadge")
    @js.native
    def setTabBarBadge(options: SetTabBarBadgeOptions): Unit = js.native
    
    /**
      * 动态设置 tabBar 某一项的内容
      * @version 1.9.0
      */
    @JSGlobal("wx.setTabBarItem")
    @js.native
    def setTabBarItem(options: SetTabBarItemOptions): Unit = js.native
    
    /**
      * 动态设置 tabBar 的整体样式
      * @version 1.9.0
      */
    @JSGlobal("wx.setTabBarStyle")
    @js.native
    def setTabBarStyle(options: SetTabBarStyleOptions): Unit = js.native
    
    /**
      * 动态设置置顶栏文字内容
      * 只有当前小程序被置顶时能生效，如果当前小程序没有被置顶，也能调用成功，但是不会立即生效
      * 只有在用户将这个小程序置顶后才换上设置的文字内容。
      * 注意：调用成功后，需间隔 5s 才能再次调用此接口，如果在 5s 内再次调用此接口，会回调
      * fail，errMsg："setTopBarText: fail invoke too frequently"
      * @version 1.4.3
      */
    @JSGlobal("wx.setTopBarText")
    @js.native
    def setTopBarText(): Unit = js.native
    @JSGlobal("wx.setTopBarText")
    @js.native
    def setTopBarText(options: SetTopBarTextOptions): Unit = js.native
    
    /**
      * iOS特有接口 在 onGetWifiList 回调后，利用接口设置 wifiList 中 AP 的相关信息。
      * 注意：
      * + 该接口只能在 onGetWifiList 回调之后才能调用。
      * + 此时客户端会挂起，等待小程序设置 Wi-Fi 信息，请务必尽快调用该接口，若无数据请传入一个空数组。
      * + 有可能随着周边 Wi-Fi 列表的刷新，单个流程内收到多次带有存在重复的 Wi-Fi 列表的回调。
      * @version 1.6.0
      */
    @JSGlobal("wx.setWifiList")
    @js.native
    def setWifiList(options: SetWifiListOptions): Unit = js.native
    
    /**
      * 显示操作菜单
      */
    @JSGlobal("wx.showActionSheet")
    @js.native
    def showActionSheet(options: ActionSheetOptions): Unit = js.native
    
    /**
      * 显示 loading 提示框, 需主动调用 wx.hideLoading 才能关闭提示框
      */
    @JSGlobal("wx.showLoading")
    @js.native
    def showLoading(options: LoadingOptions): Unit = js.native
    
    /**
      * 显示模态弹窗
      */
    @JSGlobal("wx.showModal")
    @js.native
    def showModal(options: ModalOptions): Unit = js.native
    
    /**
      * 在当前页面显示导航条加载动画。
      * @version 1.4.3
      */
    @JSGlobal("wx.showNavigationBarLoading")
    @js.native
    def showNavigationBarLoading(): Unit = js.native
    
    /**
      * 显示分享按钮
      *
      */
    @JSGlobal("wx.showShareMenu")
    @js.native
    def showShareMenu(): Unit = js.native
    @JSGlobal("wx.showShareMenu")
    @js.native
    def showShareMenu(options: ShareMenuOptions): Unit = js.native
    
    /**
      * 显示 tabBar
      * @version 1.9.0
      */
    @JSGlobal("wx.showTabBar")
    @js.native
    def showTabBar(options: ShowTabBarOptions): Unit = js.native
    
    /**
      * 显示 tabBar 某一项的右上角的红点
      * @version 1.9.0
      */
    @JSGlobal("wx.showTabBarRedDot")
    @js.native
    def showTabBarRedDot(option: TabBarBadgeOptions): Unit = js.native
    
    /**
      * 显示消息提示框
      */
    @JSGlobal("wx.showToast")
    @js.native
    def showToast(options: ToastOptions): Unit = js.native
    
    /**
      * 开始监听加速度数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("wx.startAccelerometer")
    @js.native
    def startAccelerometer(options: AccelerometerOptions): Unit = js.native
    
    /**
      * 开始搜索附近的iBeacon设备
      * @version 1.2.0
      */
    @JSGlobal("wx.startBeaconDiscovery")
    @js.native
    def startBeaconDiscovery(options: StartBeaconDiscoveryOptions): Unit = js.native
    
    /**
      * 开始搜寻附近的蓝牙外围设备。
      * 注意，该操作比较耗费系统资源，请在搜索并连接到设备后调用 stop 方法停止搜索。
      * @example
      * // 以微信硬件平台的蓝牙智能灯为例，主服务的 UUID 是 FEE7。传入这个参数，只搜索主服务 UUID 为 FEE7 的设备
      * wx.startBluetoothDevicesDiscovery({
      *   services: ['FEE7'],
      *   success: function (res) {
      *     console.log(res)
      *   }
      * });
      */
    @JSGlobal("wx.startBluetoothDevicesDiscovery")
    @js.native
    def startBluetoothDevicesDiscovery(options: StartBluetoothDevicesDiscoveryOptions): Unit = js.native
    
    /**
      * 开始监听罗盘数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("wx.startCompass")
    @js.native
    def startCompass(options: CompassOptions): Unit = js.native
    
    // 页面-----下拉刷新
    /**
      * 开始下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致
      * @version 1.5.0
      */
    @JSGlobal("wx.startPullDownRefresh")
    @js.native
    def startPullDownRefresh(): Unit = js.native
    @JSGlobal("wx.startPullDownRefresh")
    @js.native
    def startPullDownRefresh(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 开始录音。当主动调用wx.stopRecord，
      * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
      * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
      * 如需持久保存，需在主动调用wx.saveFile，在小程序下次启动时才能访问得到。
      * @deprecated 1.6.0
      */
    @JSGlobal("wx.startRecord")
    @js.native
    def startRecord(options: StartRecordAudioOptions): Unit = js.native
    
    /**
      * 开始 SOTER 生物认证
      */
    @JSGlobal("wx.startSoterAuthentication")
    @js.native
    def startSoterAuthentication(options: StartSoterAuthenticationOptions): Unit = js.native
    
    // 设备-----Wi-Fi
    /**
      * 初始化 Wi-Fi 模块。
      * @version 1.6.0
      */
    @JSGlobal("wx.startWifi")
    @js.native
    def startWifi(): Unit = js.native
    @JSGlobal("wx.startWifi")
    @js.native
    def startWifi(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 停止监听加速度数据。
      * 微信客户端 6.5.6 版本开始支持
      * @version 1.1.0
      */
    @JSGlobal("wx.stopAccelerometer")
    @js.native
    def stopAccelerometer(options: AccelerometerOptions): Unit = js.native
    
    /**
      * 停止播放音乐。
      * @deprecated 1.2.0
      */
    @JSGlobal("wx.stopBackgroundAudio")
    @js.native
    def stopBackgroundAudio(): Unit = js.native
    @JSGlobal("wx.stopBackgroundAudio")
    @js.native
    def stopBackgroundAudio(options: PlayBackgroundAudioOptions): Unit = js.native
    
    /**
      * 停止搜索附近的iBeacon设备
      * @version 1.2.0
      */
    @JSGlobal("wx.stopBeaconDiscovery")
    @js.native
    def stopBeaconDiscovery(options: StopBeaconDiscoveryOptions): Unit = js.native
    
    /**
      * 停止搜寻附近的蓝牙外围设备。请在确保找到需要连接的设备后调用该方法停止搜索。
      * @version 1.1.0
      */
    @JSGlobal("wx.stopBluetoothDevicesDiscovery")
    @js.native
    def stopBluetoothDevicesDiscovery(options: StopBluetoothDevicesDiscoveryOptions): Unit = js.native
    
    @JSGlobal("wx.stopCompass")
    @js.native
    def stopCompass(options: CompassOptions): Unit = js.native
    
    /**
      * 停止当前页面下拉刷新
      * @version 1.5.0
      */
    @JSGlobal("wx.stopPullDownRefresh")
    @js.native
    def stopPullDownRefresh(): Unit = js.native
    @JSGlobal("wx.stopPullDownRefresh")
    @js.native
    def stopPullDownRefresh(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 主动调用停止录音。
      */
    @JSGlobal("wx.stopRecord")
    @js.native
    def stopRecord(): Unit = js.native
    @JSGlobal("wx.stopRecord")
    @js.native
    def stopRecord(options: StopRecordAudioOptions): Unit = js.native
    
    /**
      * 结束播放语音。
      * @deprecated 1.6.0
      */
    @JSGlobal("wx.stopVoice")
    @js.native
    def stopVoice(): Unit = js.native
    
    /**
      * 关闭 Wi-Fi 模块。
      * @version 1.6.0
      */
    @JSGlobal("wx.stopWifi")
    @js.native
    def stopWifi(): Unit = js.native
    @JSGlobal("wx.stopWifi")
    @js.native
    def stopWifi(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
      */
    @JSGlobal("wx.switchTab")
    @js.native
    def switchTab(options: SwitchTabOptions): Unit = js.native
    
    /**
      * 更新转发属性
      * @version 1.2.0
      */
    @JSGlobal("wx.updateShareMenu")
    @js.native
    def updateShareMenu(): Unit = js.native
    @JSGlobal("wx.updateShareMenu")
    @js.native
    def updateShareMenu(options: UpdateShareMenuOptions): Unit = js.native
    
    /**
      * 将本地资源上传到开发者服务器。
      * 如页面通过 wx.chooseImage 等接口获取到一个本地资源的临时文件路径后，
      * 可通过此接口将本地资源上传到指定服务器。
      * 客户端发起一个 HTTPS POST 请求，
      * 其中 Content-Type 为 multipart/form-data 。
      */
    @JSGlobal("wx.uploadFile")
    @js.native
    def uploadFile(options: UploadFileOptions): UploadTask = js.native
    
    // 设备-----震动
    /**
      * 使手机发生较长时间的振动（400ms）
      * @version 1.2.0
      */
    @JSGlobal("wx.vibrateLong")
    @js.native
    def vibrateLong(): Unit = js.native
    @JSGlobal("wx.vibrateLong")
    @js.native
    def vibrateLong(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 使手机发生较短时间的振动（15ms）
      * @version 1.2.0
      */
    @JSGlobal("wx.vibrateShort")
    @js.native
    def vibrateShort(): Unit = js.native
    @JSGlobal("wx.vibrateShort")
    @js.native
    def vibrateShort(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 向低功耗蓝牙设备特征值中写入二进制数据。
      * 注意：必须设备的特征值支持write才可以成功调用，具体参照 characteristic 的 properties 属性
      * tips: 并行调用多次读写接口存在读写失败的可能性
      */
    @JSGlobal("wx.writeBLECharacteristicValue")
    @js.native
    def writeBLECharacteristicValue(options: WriteBLECharacteristicValue): Unit = js.native
  }
}
