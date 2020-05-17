package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app capture settings. */
@js.native
trait AppCaptureSettings extends js.Object {
  /** Gets the alternate shortcut key settings. */
  var alternateShortcutKeys: AppCaptureAlternateShortcutKeys = js.native
  /** Gets or sets the app capture destination folder. */
  var appCaptureDestinationFolder: StorageFolder = js.native
  /** Gets or sets the audio encoding bitrate. */
  var audioEncodingBitrate: Double = js.native
  /** Gets or sets the custom video encoding bitrate. */
  var customVideoEncodingBitrate: Double = js.native
  /** Gets or sets the custom video encoding height. */
  var customVideoEncodingHeight: Double = js.native
  /** Gets the custom video encoding width. */
  var customVideoEncodingWidth: Double = js.native
  /** Gets a value indicating if the device has a hardware encoder. */
  var hasHardwareEncoder: Boolean = js.native
  /** Gets or sets the historical buffer length. */
  var historicalBufferLength: Double = js.native
  /** Gets or sets the units of the historical buffer length. */
  var historicalBufferLengthUnit: AppCaptureHistoricalBufferLengthUnit = js.native
  /** Gets or sets a value indicating if app capture is enabled. */
  var isAppCaptureEnabled: Boolean = js.native
  /** Gets or sets a value indicating whether audio capture is enabled. */
  var isAudioCaptureEnabled: Boolean = js.native
  /** Gets a value indicating if app capture is CPU-constrained. */
  var isCpuConstrained: Boolean = js.native
  /** Gets a value indicating if app capture is disabled by policy. */
  var isDisabledByPolicy: Boolean = js.native
  /** Gets a value indicating if app capture is GPU-constrained. */
  var isGpuConstrained: Boolean = js.native
  /** Gets or sets a value indicating if historical capture is enabled. */
  var isHistoricalCaptureEnabled: Boolean = js.native
  /** Gets or sets a value indicating whether historical capture is allowed while the device is on battery power. */
  var isHistoricalCaptureOnBatteryAllowed: Boolean = js.native
  /** Gets or sets a value indicating whether historical capture is allowed on wireless displays. */
  var isHistoricalCaptureOnWirelessDisplayAllowed: Boolean = js.native
  /** Gets a value indicating whether the device is memory-constrained. */
  var isMemoryConstrained: Boolean = js.native
  var isMicrophoneCaptureEnabled: js.Any = js.native
   /* unmapped type */ /** Gets or sets the maximum recording length. */
  var maximumRecordLength: Double = js.native
  /** Gets or sets the screenshot destination folder. */
  var screenshotDestinationFolder: StorageFolder = js.native
  /** Gets or sets the video encoding bitrate. */
  var videoEncodingBitrateMode: AppCaptureVideoEncodingBitrateMode = js.native
  /** Gets or sets the video encoding resolution mode. */
  var videoEncodingResolutionMode: AppCaptureVideoEncodingResolutionMode = js.native
}

object AppCaptureSettings {
  @scala.inline
  def apply(
    alternateShortcutKeys: AppCaptureAlternateShortcutKeys,
    appCaptureDestinationFolder: StorageFolder,
    audioEncodingBitrate: Double,
    customVideoEncodingBitrate: Double,
    customVideoEncodingHeight: Double,
    customVideoEncodingWidth: Double,
    hasHardwareEncoder: Boolean,
    historicalBufferLength: Double,
    historicalBufferLengthUnit: AppCaptureHistoricalBufferLengthUnit,
    isAppCaptureEnabled: Boolean,
    isAudioCaptureEnabled: Boolean,
    isCpuConstrained: Boolean,
    isDisabledByPolicy: Boolean,
    isGpuConstrained: Boolean,
    isHistoricalCaptureEnabled: Boolean,
    isHistoricalCaptureOnBatteryAllowed: Boolean,
    isHistoricalCaptureOnWirelessDisplayAllowed: Boolean,
    isMemoryConstrained: Boolean,
    isMicrophoneCaptureEnabled: js.Any,
    maximumRecordLength: Double,
    screenshotDestinationFolder: StorageFolder,
    videoEncodingBitrateMode: AppCaptureVideoEncodingBitrateMode,
    videoEncodingResolutionMode: AppCaptureVideoEncodingResolutionMode
  ): AppCaptureSettings = {
    val __obj = js.Dynamic.literal(alternateShortcutKeys = alternateShortcutKeys.asInstanceOf[js.Any], appCaptureDestinationFolder = appCaptureDestinationFolder.asInstanceOf[js.Any], audioEncodingBitrate = audioEncodingBitrate.asInstanceOf[js.Any], customVideoEncodingBitrate = customVideoEncodingBitrate.asInstanceOf[js.Any], customVideoEncodingHeight = customVideoEncodingHeight.asInstanceOf[js.Any], customVideoEncodingWidth = customVideoEncodingWidth.asInstanceOf[js.Any], hasHardwareEncoder = hasHardwareEncoder.asInstanceOf[js.Any], historicalBufferLength = historicalBufferLength.asInstanceOf[js.Any], historicalBufferLengthUnit = historicalBufferLengthUnit.asInstanceOf[js.Any], isAppCaptureEnabled = isAppCaptureEnabled.asInstanceOf[js.Any], isAudioCaptureEnabled = isAudioCaptureEnabled.asInstanceOf[js.Any], isCpuConstrained = isCpuConstrained.asInstanceOf[js.Any], isDisabledByPolicy = isDisabledByPolicy.asInstanceOf[js.Any], isGpuConstrained = isGpuConstrained.asInstanceOf[js.Any], isHistoricalCaptureEnabled = isHistoricalCaptureEnabled.asInstanceOf[js.Any], isHistoricalCaptureOnBatteryAllowed = isHistoricalCaptureOnBatteryAllowed.asInstanceOf[js.Any], isHistoricalCaptureOnWirelessDisplayAllowed = isHistoricalCaptureOnWirelessDisplayAllowed.asInstanceOf[js.Any], isMemoryConstrained = isMemoryConstrained.asInstanceOf[js.Any], isMicrophoneCaptureEnabled = isMicrophoneCaptureEnabled.asInstanceOf[js.Any], maximumRecordLength = maximumRecordLength.asInstanceOf[js.Any], screenshotDestinationFolder = screenshotDestinationFolder.asInstanceOf[js.Any], videoEncodingBitrateMode = videoEncodingBitrateMode.asInstanceOf[js.Any], videoEncodingResolutionMode = videoEncodingResolutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCaptureSettings]
  }
  @scala.inline
  implicit class AppCaptureSettingsOps[Self <: AppCaptureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateShortcutKeys(value: AppCaptureAlternateShortcutKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateShortcutKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppCaptureDestinationFolder(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCaptureDestinationFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioEncodingBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncodingBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomVideoEncodingBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customVideoEncodingBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomVideoEncodingHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customVideoEncodingHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomVideoEncodingWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customVideoEncodingWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasHardwareEncoder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHardwareEncoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistoricalBufferLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historicalBufferLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistoricalBufferLengthUnit(value: AppCaptureHistoricalBufferLengthUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historicalBufferLengthUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAppCaptureEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppCaptureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAudioCaptureEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAudioCaptureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCpuConstrained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCpuConstrained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisabledByPolicy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabledByPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGpuConstrained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGpuConstrained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHistoricalCaptureEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHistoricalCaptureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHistoricalCaptureOnBatteryAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHistoricalCaptureOnBatteryAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHistoricalCaptureOnWirelessDisplayAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHistoricalCaptureOnWirelessDisplayAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemoryConstrained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMemoryConstrained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMicrophoneCaptureEnabled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMicrophoneCaptureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumRecordLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRecordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenshotDestinationFolder(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotDestinationFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoEncodingBitrateMode(value: AppCaptureVideoEncodingBitrateMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoEncodingBitrateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoEncodingResolutionMode(value: AppCaptureVideoEncodingResolutionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoEncodingResolutionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

