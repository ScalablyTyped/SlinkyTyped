package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Media.Capture.MediaStreamType
import typingsSlinky.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import typingsSlinky.winrtUwp.Windows.Media.Devices.Core.VariablePhotoSequenceController
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typingsSlinky.winrtUwp.anon.ReturnValueBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls device settings on the camera. */
@js.native
trait VideoDeviceController extends js.Object {
  /** Gets the advanced photo capture control for this video device. */
  var advancedPhotoControl: AdvancedPhotoControl = js.native
  /** Specifies whether back-light compensation is enabled on the camera. */
  var backlightCompensation: MediaDeviceControl = js.native
  /** Gets or sets the brightness level on the camera. */
  var brightness: MediaDeviceControl = js.native
  /** Gets or sets the contrast level on the camera. */
  var contrast: MediaDeviceControl = js.native
  /** Gets or sets a value that indicates the optimizations the capture device should use to prioritize high quality picture, low latency, or low power consumption during video capture. */
  var desiredOptimization: MediaCaptureOptimization = js.native
  /** Gets or sets the camera's exposure time. */
  var exposure: MediaDeviceControl = js.native
  /** Gets the exposure compensation control for this video device. */
  var exposureCompensationControl: ExposureCompensationControl = js.native
  /** Gets the exposure control for this video device. */
  var exposureControl: ExposureControl = js.native
  /** Gets the ExposurePriorityVideoControl associated with the VideoDeviceController . */
  var exposurePriorityVideoControl: ExposurePriorityVideoControl = js.native
  /** Gets the flash control for this video device. */
  var flashControl: FlashControl = js.native
  /** Gets or sets the camera's focus setting. */
  var focus: MediaDeviceControl = js.native
  /** Gets the focus control for this video device. */
  var focusControl: FocusControl = js.native
  /** Gets the HdrVideoControl associated with the VideoDeviceController . */
  var hdrVideoControl: HdrVideoControl = js.native
  /** Gets or sets the camera's hue setting. */
  var hue: MediaDeviceControl = js.native
  /** Gets the ISO film speed control for this video device. */
  var isoSpeedControl: IsoSpeedControl = js.native
  /** Gets the low shutter lag photo control for this video device. */
  var lowLagPhoto: LowLagPhotoControl = js.native
  /** Gets the low shutter lag photo sequence control for this video device. */
  var lowLagPhotoSequence: LowLagPhotoSequenceControl = js.native
  /** Gets the OpticalImageStabilizationControl associated with the VideoDeviceController . */
  var opticalImageStabilizationControl: OpticalImageStabilizationControl = js.native
  /** Gets or sets the camera's pan setting. */
  var pan: MediaDeviceControl = js.native
  /** Gets the photo confirmation control for this video device. */
  var photoConfirmationControl: PhotoConfirmationControl = js.native
  /** Gets or sets the primary use for the device. */
  var primaryUse: CaptureUse = js.native
  /** Gets the regions of interest control for this video device. */
  var regionsOfInterestControl: RegionsOfInterestControl = js.native
  /** Gets or sets the camera's roll setting. */
  var roll: MediaDeviceControl = js.native
  /** Gets the scene mode control for this video device. */
  var sceneModeControl: SceneModeControl = js.native
  /** Gets or sets the camera's tilt setting. */
  var tilt: MediaDeviceControl = js.native
  /** Gets the torch control for this video device. */
  var torchControl: TorchControl = js.native
  /** Gets the VariablePhotoSequenceController associated with the VideoDeviceController . */
  var variablePhotoSequenceController: VariablePhotoSequenceController = js.native
  /** Gets or sets the white balance on the camera. */
  var whiteBalance: MediaDeviceControl = js.native
  /** Gets the white balance control for this video device. */
  var whiteBalanceControl: WhiteBalanceControl = js.native
  /** Gets and sets the camera's zoom setting. */
  var zoom: MediaDeviceControl = js.native
  /** Gets the ZoomControl associated with the VideoDeviceController . */
  var zoomControl: ZoomControl = js.native
  /**
    * Gets a list of the supported encoding properties for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  /**
    * Gets a property on the camera. You can use this method to query properties that are specific to a particular camera.
    * @param propertyId The property identifier.
    * @return The property value.
    */
  def getDeviceProperty(propertyId: String): js.Any = js.native
  /**
    * Gets the encoding properties for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  /**
    * Sets a property on the device. You can use this method to set properties that are specific to a particular device.
    * @param propertyId The property identifier.
    * @param propertyValue The new value of the property.
    */
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit = js.native
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the local power line frequency.
    */
  def tryGetPowerlineFrequency(): ReturnValueBoolean = js.native
  /**
    * Sets the local power line frequency.
    * @param value The power line frequency.
    * @return Returns true if the method succeeded, or false otherwise.
    */
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
}

object VideoDeviceController {
  @scala.inline
  def apply(
    advancedPhotoControl: AdvancedPhotoControl,
    backlightCompensation: MediaDeviceControl,
    brightness: MediaDeviceControl,
    contrast: MediaDeviceControl,
    desiredOptimization: MediaCaptureOptimization,
    exposure: MediaDeviceControl,
    exposureCompensationControl: ExposureCompensationControl,
    exposureControl: ExposureControl,
    exposurePriorityVideoControl: ExposurePriorityVideoControl,
    flashControl: FlashControl,
    focus: MediaDeviceControl,
    focusControl: FocusControl,
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getDeviceProperty: String => js.Any,
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    hdrVideoControl: HdrVideoControl,
    hue: MediaDeviceControl,
    isoSpeedControl: IsoSpeedControl,
    lowLagPhoto: LowLagPhotoControl,
    lowLagPhotoSequence: LowLagPhotoSequenceControl,
    opticalImageStabilizationControl: OpticalImageStabilizationControl,
    pan: MediaDeviceControl,
    photoConfirmationControl: PhotoConfirmationControl,
    primaryUse: CaptureUse,
    regionsOfInterestControl: RegionsOfInterestControl,
    roll: MediaDeviceControl,
    sceneModeControl: SceneModeControl,
    setDeviceProperty: (String, js.Any) => Unit,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IPromiseWithIAsyncAction,
    tilt: MediaDeviceControl,
    torchControl: TorchControl,
    tryGetPowerlineFrequency: () => ReturnValueBoolean,
    trySetPowerlineFrequency: PowerlineFrequency => Boolean,
    variablePhotoSequenceController: VariablePhotoSequenceController,
    whiteBalance: MediaDeviceControl,
    whiteBalanceControl: WhiteBalanceControl,
    zoom: MediaDeviceControl,
    zoomControl: ZoomControl
  ): VideoDeviceController = {
    val __obj = js.Dynamic.literal(advancedPhotoControl = advancedPhotoControl.asInstanceOf[js.Any], backlightCompensation = backlightCompensation.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], desiredOptimization = desiredOptimization.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], exposureCompensationControl = exposureCompensationControl.asInstanceOf[js.Any], exposureControl = exposureControl.asInstanceOf[js.Any], exposurePriorityVideoControl = exposurePriorityVideoControl.asInstanceOf[js.Any], flashControl = flashControl.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusControl = focusControl.asInstanceOf[js.Any], getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), hdrVideoControl = hdrVideoControl.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isoSpeedControl = isoSpeedControl.asInstanceOf[js.Any], lowLagPhoto = lowLagPhoto.asInstanceOf[js.Any], lowLagPhotoSequence = lowLagPhotoSequence.asInstanceOf[js.Any], opticalImageStabilizationControl = opticalImageStabilizationControl.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], photoConfirmationControl = photoConfirmationControl.asInstanceOf[js.Any], primaryUse = primaryUse.asInstanceOf[js.Any], regionsOfInterestControl = regionsOfInterestControl.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], sceneModeControl = sceneModeControl.asInstanceOf[js.Any], setDeviceProperty = js.Any.fromFunction2(setDeviceProperty), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), tilt = tilt.asInstanceOf[js.Any], torchControl = torchControl.asInstanceOf[js.Any], tryGetPowerlineFrequency = js.Any.fromFunction0(tryGetPowerlineFrequency), trySetPowerlineFrequency = js.Any.fromFunction1(trySetPowerlineFrequency), variablePhotoSequenceController = variablePhotoSequenceController.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], whiteBalanceControl = whiteBalanceControl.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomControl = zoomControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDeviceController]
  }
  @scala.inline
  implicit class VideoDeviceControllerOps[Self <: VideoDeviceController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvancedPhotoControl(value: AdvancedPhotoControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedPhotoControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBacklightCompensation(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlightCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredOptimization(value: MediaCaptureOptimization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredOptimization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposure(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureCompensationControl(value: ExposureCompensationControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureControl(value: ExposureControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposurePriorityVideoControl(value: ExposurePriorityVideoControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposurePriorityVideoControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlashControl(value: FlashControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusControl(value: FocusControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAvailableMediaStreamProperties(value: MediaStreamType => IVectorView[IMediaEncodingProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableMediaStreamProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDeviceProperty(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMediaStreamProperties(value: MediaStreamType => IMediaEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMediaStreamProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHdrVideoControl(value: HdrVideoControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdrVideoControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHue(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoSpeedControl(value: IsoSpeedControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoSpeedControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowLagPhoto(value: LowLagPhotoControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowLagPhoto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowLagPhotoSequence(value: LowLagPhotoSequenceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowLagPhotoSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpticalImageStabilizationControl(value: OpticalImageStabilizationControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opticalImageStabilizationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPan(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoConfirmationControl(value: PhotoConfirmationControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoConfirmationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryUse(value: CaptureUse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionsOfInterestControl(value: RegionsOfInterestControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionsOfInterestControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoll(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSceneModeControl(value: SceneModeControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneModeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDeviceProperty(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDeviceProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMediaStreamPropertiesAsync(value: (MediaStreamType, IMediaEncodingProperties) => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMediaStreamPropertiesAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTilt(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorchControl(value: TorchControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torchControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetPowerlineFrequency(value: () => ReturnValueBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetPowerlineFrequency")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrySetPowerlineFrequency(value: PowerlineFrequency => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetPowerlineFrequency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVariablePhotoSequenceController(value: VariablePhotoSequenceController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variablePhotoSequenceController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBalance(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBalanceControl(value: WhiteBalanceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalanceControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomControl(value: ZoomControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

