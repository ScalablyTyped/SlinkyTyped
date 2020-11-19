package typingsSlinky.tizenCommonWeb.systeminfoMod

import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.MOBILE
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.MOBILE_FULL
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.MOBILE_WEB
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.TV
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.WEARABLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoDeviceCapability extends js.Object {
  
  /**
    * Indicates whether the device supports accelerometer.
    */
  val accelerometer: Boolean = js.native
  
  /**
    * Indicates whether the device supports accelerometer wake-up feature.
    *
    * @since 2.1
    */
  val accelerometerWakeup: Boolean = js.native
  
  /**
    * Indicates whether the device supports auto rotation.
    *
    * @since 2.1
    */
  val autoRotation: Boolean = js.native
  
  /**
    * Indicates whether the device supports barometer.
    */
  val barometer: Boolean = js.native
  
  /**
    * Indicates whether the device supports barometer wake-up feature.
    *
    * @since 2.1
    */
  val barometerWakeup: Boolean = js.native
  
  /**
    * Indicates whether the device supports Bluetooth.
    */
  val bluetooth: Boolean = js.native
  
  /**
    * Indicates whether the device supports camera.
    *
    * @since 2.1
    */
  val camera: Boolean = js.native
  
  /**
    * Indicates whether the device supports back-side camera.
    */
  val cameraBack: Boolean = js.native
  
  /**
    * Indicates whether the device supports flash on the back-side camera.
    */
  val cameraBackFlash: Boolean = js.native
  
  /**
    * Indicates whether the device supports front camera.
    */
  val cameraFront: Boolean = js.native
  
  /**
    * Indicates whether the device supports flash on the front camera.
    */
  val cameraFrontFlash: Boolean = js.native
  
  /**
    * Indicates whether the device supports data encryption.
    *
    * @since 2.1
    */
  val dataEncryption: Boolean = js.native
  
  /**
    * Indicates the Tizen ID, not device's unique ID since Tizen 2.3.
    *
    *
    * @remark Tizen ID is a randomly generated value based on the model name.
    *
    *         It is recommended to use tizen.systeminfo.getCapability("http://tizen.org/system/tizenid") since Tizen 2.3 instead.
    */
  val duid: String = js.native
  
  /**
    * Indicates whether the device supports FM radio.
    */
  val fmRadio: Boolean = js.native
  
  /**
    * Indicates whether the device supports hardware acceleration for 2D/3D graphics.
    *
    * @since 2.1
    */
  val graphicsAcceleration: Boolean = js.native
  
  /**
    * Indicates whether the device supports gyroscope.
    */
  val gyroscope: Boolean = js.native
  
  /**
    * Indicates whether the device supports gyroscope wake-up feature.
    *
    * @since 2.1
    */
  val gyroscopeWakeup: Boolean = js.native
  
  /**
    * Indicates whether the device supports the built-in keyboard.
    */
  val inputKeyboard: Boolean = js.native
  
  /**
    * Indicates whether the device supports the built-in keyboard layout.
    *
    * @since 2.1
    */
  val inputKeyboardLayout: Boolean = js.native
  
  /**
    * Indicates whether the device supports GPS or not.
    */
  val location: Boolean = js.native
  
  /**
    * Indicates whether the device supports GPS based location feature.
    */
  val locationGps: Boolean = js.native
  
  /**
    * Indicates whether the device supports WPS based location feature.
    */
  val locationWps: Boolean = js.native
  
  /**
    * Indicates whether the device supports magnetometer.
    */
  val magnetometer: Boolean = js.native
  
  /**
    * Indicates whether the device supports magnetometer wake-up feature.
    *
    * @since 2.1
    */
  val magnetometerWakeup: Boolean = js.native
  
  /**
    * Indicates whether the device supports microphone.
    */
  val microphone: Boolean = js.native
  
  /**
    * The number of point in Multi-point touch.
    */
  val multiTouchCount: Double = js.native
  
  /**
    * The version of the Native API in the `[Major].[Minor].[Patch Version]` format.
    *
    * For example, ***1.0.0*** represents a Native API version where the major version is ***1*** and the minor and build versions are ***0***.
    * `[Patch Version]` is optional. The Tizen platform strictly follows this versioning system and this format must be preserved.
    * Manufacturers may add more parts (dot followed by number or text) after the preserved format.
    * If a version is not versioned as [Major].[Minor].[Patch Version], the unused digits must be taken as ***0***.
    * So for example, version ***2.3*** is ***2.3.0*** and manufacturers must add parts after ***2.3.0*** such as ***2.3.0.1***.
    *
    * @since 2.1
    *
    * @privilegelevel public
    * @privilege http://tizen.org/privilege/system
    *
    * @throw WebAPIException `SecurityError`.
    */
  val nativeApiVersion: String = js.native
  
  /**
    * Indicates whether the device supports native OSP API.
    *
    * @since 2.1
    */
  val nativeOspCompatible: Boolean = js.native
  
  /**
    * Indicates whether the device supports NFC.
    */
  val nfc: Boolean = js.native
  
  /**
    * Indicates whether the device supports NFC reserved push.
    *
    * @since 2.1
    */
  val nfcReservedPush: Boolean = js.native
  
  /**
    * Indicates whether the device supports OpenGL-ES.
    *
    * @since 2.1
    */
  val opengles: Boolean = js.native
  
  /**
    * Indicates whether the device supports OpenGL-ES version 1.1.
    */
  val openglesVersion1_1: Boolean = js.native
  
  /**
    * Indicates whether the device supports OpenGL-ES version 2.0.
    */
  val openglesVersion2_0: Boolean = js.native
  
  /**
    * The device 3DC texture format for OpenGL-ES.
    *
    * One example of possible output is as follows: "3dc/atc/etc/ptc/pvrtc/utc"
    *
    * @since 2.1
    */
  val openglestextureFormat: String = js.native
  
  /**
    * Indicates whether the device supports photometer.
    *
    * @since 2.1
    */
  val photometer: Boolean = js.native
  
  /**
    * Indicates whether the device supports photometer wake-up feature.
    *
    * @since 2.1
    */
  val photometerWakeup: Boolean = js.native
  
  /**
    * The device CPU architecture.
    *
    * The possible values for this attribute are: ***armv6***, ***armv7***, ***x86***.
    */
  val platformCoreCpuArch: String = js.native
  
  /**
    * The device FPU architecture.
    *
    * The possible values for this attribute are: ***vfpv3***, ***sse2***, ***sse3*** and ***ssse3***.
    */
  val platformCoreFpuArch: String = js.native
  
  /**
    * The name of the platform.
    */
  val platformName: String = js.native
  
  /**
    * The version of the platform in the `[Major].[Minor].[Patch Version]` format.
    *
    * For example, ***1.0.0*** represents a platform version where the major version is ***1*** and the minor and build versions are ***0***.
    * `[Patch Version]` is optional. The Tizen platform strictly follows this versioning system and this format must be preserved.
    * Manufacturers may add more parts (dot followed by number or text) after the preserved format.
    * If a version is not versioned as [Major].[Minor].[Patch Version], the unused digits must be taken as ***0***.
    * So for example, version ***2.3*** is ***2.3.0*** and manufacturers must add parts after ***2.3.0*** such as ***2.3.0.1***.
    *
    *
    * @privilegelevel public
    * @privilege http://tizen.org/privilege/system
    *
    * @throw WebAPIException `SecurityError`.
    */
  val platformVersion: String = js.native
  
  /**
    * Represents the profile of the current device.
    *
    * @since 2.2
    */
  val profile: SystemInfoProfile | MOBILE_FULL | MOBILE_WEB | MOBILE | WEARABLE | TV = js.native
  
  /**
    * Indicates whether the device supports proximity.
    */
  val proximity: Boolean = js.native
  
  /**
    * Indicates whether the device supports proximity wake-up feature.
    *
    * @since 2.1
    */
  val proximityWakeup: Boolean = js.native
  
  /**
    * Indicates whether the device supports push service.
    *
    * @since 2.1
    */
  val push: Boolean = js.native
  
  /**
    * Indicates whether the device supports HDMI output.
    */
  val screenOutputHdmi: Boolean = js.native
  
  /**
    * Indicates whether the device supports RCA output.
    */
  val screenOutputRca: Boolean = js.native
  
  /**
    * Indicates whether the device supports the 480 * 800 screen size.
    *
    * @since 2.1
    */
  val screenSize480_800: Boolean = js.native
  
  /**
    * Indicates whether the device supports the 720 * 1280 screen size.
    *
    * @since 2.1
    */
  val screenSize720_1280: Boolean = js.native
  
  /**
    * Indicates whether the device supports the screen normal size.
    *
    * @since 2.1
    */
  val screenSizeNormal: Boolean = js.native
  
  /**
    * Indicates whether the device supports secure element.
    *
    * @since 2.1
    */
  val secureElement: Boolean = js.native
  
  /**
    * Indicates whether the device supports shell app widget (dynamic box).
    *
    * @since 2.1
    */
  val shellAppWidget: Boolean = js.native
  
  /**
    * Indicates whether the device supports VOIP.
    */
  val sipVoip: Boolean = js.native
  
  /**
    * Indicates whether the device supports speech recognition.
    */
  val speechRecognition: Boolean = js.native
  
  /**
    * Indicates whether the device supports speech synthesis.
    *
    * @since 2.1
    */
  val speechSynthesis: Boolean = js.native
  
  /**
    * Indicates whether the device supports the telephony feature.
    *
    * @since 2.1
    */
  val telephony: Boolean = js.native
  
  /**
    * Indicates whether the device supports the MMS feature.
    *
    * @since 2.1
    */
  val telephonyMms: Boolean = js.native
  
  /**
    * Indicates whether the device supports the SMS feature.
    *
    * @since 2.1
    */
  val telephonySms: Boolean = js.native
  
  /**
    * Indicates whether the device supports tiltmeter.
    *
    * @since 2.1
    */
  val tiltmeter: Boolean = js.native
  
  /**
    * Indicates whether the device supports tiltmeter wake-up feature.
    *
    * @since 2.1
    */
  val tiltmeterWakeup: Boolean = js.native
  
  /**
    * Indicates whether the device supports USB accessory.
    */
  val usbAccessory: Boolean = js.native
  
  /**
    * Indicates whether the device supports USB host.
    */
  val usbHost: Boolean = js.native
  
  /**
    * Indicates whether the device supports vision face recognition.
    *
    * @since 2.1
    */
  val visionFaceRecognition: Boolean = js.native
  
  /**
    * Indicates whether the device supports vision image recognition.
    *
    * @since 2.1
    */
  val visionImageRecognition: Boolean = js.native
  
  /**
    * Indicates whether the device supports vision QR code generation.
    *
    * @since 2.1
    */
  val visionQrcodeGeneration: Boolean = js.native
  
  /**
    * Indicates whether the device supports vision QR code recognition.
    *
    * @since 2.1
    */
  val visionQrcodeRecognition: Boolean = js.native
  
  /**
    * The version of the Web API in the `[Major].[Minor].[Patch Version]` format.
    *
    * For example, ***1.0.0*** represents a Web API version where the major version is ***1*** and the minor and build versions are ***0***.
    * `[Patch Version]` is optional. The Tizen platform strictly follows this versioning system and this format must be preserved.
    * Manufacturers may add more parts (dot followed by number or text) after the preserved format.
    * If a version is not versioned as [Major].[Minor].[Patch Version], the unused digits must be taken as ***0***.
    * So for example, version ***2.3*** is ***2.3.0*** and manufacturers must add parts after ***2.3.0*** such as ***2.3.0.1***.
    *
    * @since 2.1
    *
    * @privilegelevel public
    * @privilege http://tizen.org/privilege/system
    *
    * @throw WebAPIException `SecurityError`.
    */
  val webApiVersion: String = js.native
  
  /**
    * Indicates whether the device supports Wi-Fi.
    */
  val wifi: Boolean = js.native
  
  /**
    * Indicates whether the device supports Wi-Fi Direct.
    */
  val wifiDirect: Boolean = js.native
}
object SystemInfoDeviceCapability {
  
  @scala.inline
  def apply(
    accelerometer: Boolean,
    accelerometerWakeup: Boolean,
    autoRotation: Boolean,
    barometer: Boolean,
    barometerWakeup: Boolean,
    bluetooth: Boolean,
    camera: Boolean,
    cameraBack: Boolean,
    cameraBackFlash: Boolean,
    cameraFront: Boolean,
    cameraFrontFlash: Boolean,
    dataEncryption: Boolean,
    duid: String,
    fmRadio: Boolean,
    graphicsAcceleration: Boolean,
    gyroscope: Boolean,
    gyroscopeWakeup: Boolean,
    inputKeyboard: Boolean,
    inputKeyboardLayout: Boolean,
    location: Boolean,
    locationGps: Boolean,
    locationWps: Boolean,
    magnetometer: Boolean,
    magnetometerWakeup: Boolean,
    microphone: Boolean,
    multiTouchCount: Double,
    nativeApiVersion: String,
    nativeOspCompatible: Boolean,
    nfc: Boolean,
    nfcReservedPush: Boolean,
    opengles: Boolean,
    openglesVersion1_1: Boolean,
    openglesVersion2_0: Boolean,
    openglestextureFormat: String,
    photometer: Boolean,
    photometerWakeup: Boolean,
    platformCoreCpuArch: String,
    platformCoreFpuArch: String,
    platformName: String,
    platformVersion: String,
    profile: SystemInfoProfile | MOBILE_FULL | MOBILE_WEB | MOBILE | WEARABLE | TV,
    proximity: Boolean,
    proximityWakeup: Boolean,
    push: Boolean,
    screenOutputHdmi: Boolean,
    screenOutputRca: Boolean,
    screenSize480_800: Boolean,
    screenSize720_1280: Boolean,
    screenSizeNormal: Boolean,
    secureElement: Boolean,
    shellAppWidget: Boolean,
    sipVoip: Boolean,
    speechRecognition: Boolean,
    speechSynthesis: Boolean,
    telephony: Boolean,
    telephonyMms: Boolean,
    telephonySms: Boolean,
    tiltmeter: Boolean,
    tiltmeterWakeup: Boolean,
    usbAccessory: Boolean,
    usbHost: Boolean,
    visionFaceRecognition: Boolean,
    visionImageRecognition: Boolean,
    visionQrcodeGeneration: Boolean,
    visionQrcodeRecognition: Boolean,
    webApiVersion: String,
    wifi: Boolean,
    wifiDirect: Boolean
  ): SystemInfoDeviceCapability = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any], accelerometerWakeup = accelerometerWakeup.asInstanceOf[js.Any], autoRotation = autoRotation.asInstanceOf[js.Any], barometer = barometer.asInstanceOf[js.Any], barometerWakeup = barometerWakeup.asInstanceOf[js.Any], bluetooth = bluetooth.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cameraBack = cameraBack.asInstanceOf[js.Any], cameraBackFlash = cameraBackFlash.asInstanceOf[js.Any], cameraFront = cameraFront.asInstanceOf[js.Any], cameraFrontFlash = cameraFrontFlash.asInstanceOf[js.Any], dataEncryption = dataEncryption.asInstanceOf[js.Any], duid = duid.asInstanceOf[js.Any], fmRadio = fmRadio.asInstanceOf[js.Any], graphicsAcceleration = graphicsAcceleration.asInstanceOf[js.Any], gyroscope = gyroscope.asInstanceOf[js.Any], gyroscopeWakeup = gyroscopeWakeup.asInstanceOf[js.Any], inputKeyboard = inputKeyboard.asInstanceOf[js.Any], inputKeyboardLayout = inputKeyboardLayout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationGps = locationGps.asInstanceOf[js.Any], locationWps = locationWps.asInstanceOf[js.Any], magnetometer = magnetometer.asInstanceOf[js.Any], magnetometerWakeup = magnetometerWakeup.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any], multiTouchCount = multiTouchCount.asInstanceOf[js.Any], nativeApiVersion = nativeApiVersion.asInstanceOf[js.Any], nativeOspCompatible = nativeOspCompatible.asInstanceOf[js.Any], nfc = nfc.asInstanceOf[js.Any], nfcReservedPush = nfcReservedPush.asInstanceOf[js.Any], opengles = opengles.asInstanceOf[js.Any], openglesVersion1_1 = openglesVersion1_1.asInstanceOf[js.Any], openglesVersion2_0 = openglesVersion2_0.asInstanceOf[js.Any], openglestextureFormat = openglestextureFormat.asInstanceOf[js.Any], photometer = photometer.asInstanceOf[js.Any], photometerWakeup = photometerWakeup.asInstanceOf[js.Any], platformCoreCpuArch = platformCoreCpuArch.asInstanceOf[js.Any], platformCoreFpuArch = platformCoreFpuArch.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], proximityWakeup = proximityWakeup.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], screenOutputHdmi = screenOutputHdmi.asInstanceOf[js.Any], screenOutputRca = screenOutputRca.asInstanceOf[js.Any], screenSize480_800 = screenSize480_800.asInstanceOf[js.Any], screenSize720_1280 = screenSize720_1280.asInstanceOf[js.Any], screenSizeNormal = screenSizeNormal.asInstanceOf[js.Any], secureElement = secureElement.asInstanceOf[js.Any], shellAppWidget = shellAppWidget.asInstanceOf[js.Any], sipVoip = sipVoip.asInstanceOf[js.Any], speechRecognition = speechRecognition.asInstanceOf[js.Any], speechSynthesis = speechSynthesis.asInstanceOf[js.Any], telephony = telephony.asInstanceOf[js.Any], telephonyMms = telephonyMms.asInstanceOf[js.Any], telephonySms = telephonySms.asInstanceOf[js.Any], tiltmeter = tiltmeter.asInstanceOf[js.Any], tiltmeterWakeup = tiltmeterWakeup.asInstanceOf[js.Any], usbAccessory = usbAccessory.asInstanceOf[js.Any], usbHost = usbHost.asInstanceOf[js.Any], visionFaceRecognition = visionFaceRecognition.asInstanceOf[js.Any], visionImageRecognition = visionImageRecognition.asInstanceOf[js.Any], visionQrcodeGeneration = visionQrcodeGeneration.asInstanceOf[js.Any], visionQrcodeRecognition = visionQrcodeRecognition.asInstanceOf[js.Any], webApiVersion = webApiVersion.asInstanceOf[js.Any], wifi = wifi.asInstanceOf[js.Any], wifiDirect = wifiDirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoDeviceCapability]
  }
  
  @scala.inline
  implicit class SystemInfoDeviceCapabilityOps[Self <: SystemInfoDeviceCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccelerometer(value: Boolean): Self = this.set("accelerometer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerometerWakeup(value: Boolean): Self = this.set("accelerometerWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotation(value: Boolean): Self = this.set("autoRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarometer(value: Boolean): Self = this.set("barometer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarometerWakeup(value: Boolean): Self = this.set("barometerWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetooth(value: Boolean): Self = this.set("bluetooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Boolean): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraBack(value: Boolean): Self = this.set("cameraBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraBackFlash(value: Boolean): Self = this.set("cameraBackFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraFront(value: Boolean): Self = this.set("cameraFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraFrontFlash(value: Boolean): Self = this.set("cameraFrontFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncryption(value: Boolean): Self = this.set("dataEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuid(value: String): Self = this.set("duid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmRadio(value: Boolean): Self = this.set("fmRadio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsAcceleration(value: Boolean): Self = this.set("graphicsAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGyroscope(value: Boolean): Self = this.set("gyroscope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGyroscopeWakeup(value: Boolean): Self = this.set("gyroscopeWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputKeyboard(value: Boolean): Self = this.set("inputKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputKeyboardLayout(value: Boolean): Self = this.set("inputKeyboardLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Boolean): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationGps(value: Boolean): Self = this.set("locationGps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationWps(value: Boolean): Self = this.set("locationWps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnetometer(value: Boolean): Self = this.set("magnetometer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnetometerWakeup(value: Boolean): Self = this.set("magnetometerWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophone(value: Boolean): Self = this.set("microphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiTouchCount(value: Double): Self = this.set("multiTouchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeApiVersion(value: String): Self = this.set("nativeApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeOspCompatible(value: Boolean): Self = this.set("nativeOspCompatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfc(value: Boolean): Self = this.set("nfc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfcReservedPush(value: Boolean): Self = this.set("nfcReservedPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpengles(value: Boolean): Self = this.set("opengles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenglesVersion1_1(value: Boolean): Self = this.set("openglesVersion1_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenglesVersion2_0(value: Boolean): Self = this.set("openglesVersion2_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenglestextureFormat(value: String): Self = this.set("openglestextureFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotometer(value: Boolean): Self = this.set("photometer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotometerWakeup(value: Boolean): Self = this.set("photometerWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformCoreCpuArch(value: String): Self = this.set("platformCoreCpuArch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformCoreFpuArch(value: String): Self = this.set("platformCoreFpuArch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformName(value: String): Self = this.set("platformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: SystemInfoProfile | MOBILE_FULL | MOBILE_WEB | MOBILE | WEARABLE | TV): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximity(value: Boolean): Self = this.set("proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximityWakeup(value: Boolean): Self = this.set("proximityWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOutputHdmi(value: Boolean): Self = this.set("screenOutputHdmi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOutputRca(value: Boolean): Self = this.set("screenOutputRca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSize480_800(value: Boolean): Self = this.set("screenSize480_800", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSize720_1280(value: Boolean): Self = this.set("screenSize720_1280", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSizeNormal(value: Boolean): Self = this.set("screenSizeNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureElement(value: Boolean): Self = this.set("secureElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellAppWidget(value: Boolean): Self = this.set("shellAppWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipVoip(value: Boolean): Self = this.set("sipVoip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechRecognition(value: Boolean): Self = this.set("speechRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechSynthesis(value: Boolean): Self = this.set("speechSynthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephony(value: Boolean): Self = this.set("telephony", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonyMms(value: Boolean): Self = this.set("telephonyMms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonySms(value: Boolean): Self = this.set("telephonySms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltmeter(value: Boolean): Self = this.set("tiltmeter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltmeterWakeup(value: Boolean): Self = this.set("tiltmeterWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbAccessory(value: Boolean): Self = this.set("usbAccessory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbHost(value: Boolean): Self = this.set("usbHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisionFaceRecognition(value: Boolean): Self = this.set("visionFaceRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisionImageRecognition(value: Boolean): Self = this.set("visionImageRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisionQrcodeGeneration(value: Boolean): Self = this.set("visionQrcodeGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisionQrcodeRecognition(value: Boolean): Self = this.set("visionQrcodeRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebApiVersion(value: String): Self = this.set("webApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifi(value: Boolean): Self = this.set("wifi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiDirect(value: Boolean): Self = this.set("wifiDirect", value.asInstanceOf[js.Any])
  }
}
