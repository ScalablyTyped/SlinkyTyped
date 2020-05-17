package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.System.VirtualKey
import typingsSlinky.winrtUwp.Windows.System.VirtualKeyModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines alternate shortcut keys for app capture. */
@js.native
trait AppCaptureAlternateShortcutKeys extends js.Object {
  /** Gets or sets the save historical video shortcut key. */
  var saveHistoricalVideoKey: VirtualKey = js.native
  /** Gets or sets the save historical video shortcut key modifiers. */
  var saveHistoricalVideoKeyModifiers: VirtualKeyModifiers = js.native
  /** Gets or sets the take screenshot shortcut key. */
  var takeScreenshotKey: VirtualKey = js.native
  /** Gets or sets the take screenshot shortcut key modifiers. */
  var takeScreenshotKeyModifiers: VirtualKeyModifiers = js.native
  /** Gets or sets the toggle game bar shortcut key. */
  var toggleGameBarKey: VirtualKey = js.native
  /** Gets or sets the toggle game bar shortcut key modifiers. */
  var toggleGameBarKeyModifiers: VirtualKeyModifiers = js.native
  var toggleMicrophoneCaptureKey: js.Any = js.native
   /* unmapped type */ var toggleMicrophoneCaptureKeyModifiers: js.Any = js.native
   /* unmapped type */ /** Gets or sets the toggle recording indicator shortcut key. */
  var toggleRecordingIndicatorKey: VirtualKey = js.native
  /** Gets or sets the toggle recording indicator shortcut key modifiers. */
  var toggleRecordingIndicatorKeyModifiers: VirtualKeyModifiers = js.native
  /** Gets or sets the toggle recording shortcut key. */
  var toggleRecordingKey: VirtualKey = js.native
  /** Gets or sets the toggle recording shortcut key modifiers. */
  var toggleRecordingKeyModifiers: VirtualKeyModifiers = js.native
}

object AppCaptureAlternateShortcutKeys {
  @scala.inline
  def apply(
    saveHistoricalVideoKey: VirtualKey,
    saveHistoricalVideoKeyModifiers: VirtualKeyModifiers,
    takeScreenshotKey: VirtualKey,
    takeScreenshotKeyModifiers: VirtualKeyModifiers,
    toggleGameBarKey: VirtualKey,
    toggleGameBarKeyModifiers: VirtualKeyModifiers,
    toggleMicrophoneCaptureKey: js.Any,
    toggleMicrophoneCaptureKeyModifiers: js.Any,
    toggleRecordingIndicatorKey: VirtualKey,
    toggleRecordingIndicatorKeyModifiers: VirtualKeyModifiers,
    toggleRecordingKey: VirtualKey,
    toggleRecordingKeyModifiers: VirtualKeyModifiers
  ): AppCaptureAlternateShortcutKeys = {
    val __obj = js.Dynamic.literal(saveHistoricalVideoKey = saveHistoricalVideoKey.asInstanceOf[js.Any], saveHistoricalVideoKeyModifiers = saveHistoricalVideoKeyModifiers.asInstanceOf[js.Any], takeScreenshotKey = takeScreenshotKey.asInstanceOf[js.Any], takeScreenshotKeyModifiers = takeScreenshotKeyModifiers.asInstanceOf[js.Any], toggleGameBarKey = toggleGameBarKey.asInstanceOf[js.Any], toggleGameBarKeyModifiers = toggleGameBarKeyModifiers.asInstanceOf[js.Any], toggleMicrophoneCaptureKey = toggleMicrophoneCaptureKey.asInstanceOf[js.Any], toggleMicrophoneCaptureKeyModifiers = toggleMicrophoneCaptureKeyModifiers.asInstanceOf[js.Any], toggleRecordingIndicatorKey = toggleRecordingIndicatorKey.asInstanceOf[js.Any], toggleRecordingIndicatorKeyModifiers = toggleRecordingIndicatorKeyModifiers.asInstanceOf[js.Any], toggleRecordingKey = toggleRecordingKey.asInstanceOf[js.Any], toggleRecordingKeyModifiers = toggleRecordingKeyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCaptureAlternateShortcutKeys]
  }
  @scala.inline
  implicit class AppCaptureAlternateShortcutKeysOps[Self <: AppCaptureAlternateShortcutKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaveHistoricalVideoKey(value: VirtualKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveHistoricalVideoKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveHistoricalVideoKeyModifiers(value: VirtualKeyModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveHistoricalVideoKeyModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakeScreenshotKey(value: VirtualKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeScreenshotKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakeScreenshotKeyModifiers(value: VirtualKeyModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeScreenshotKeyModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleGameBarKey(value: VirtualKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleGameBarKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleGameBarKeyModifiers(value: VirtualKeyModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleGameBarKeyModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleMicrophoneCaptureKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMicrophoneCaptureKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleMicrophoneCaptureKeyModifiers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMicrophoneCaptureKeyModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleRecordingIndicatorKey(value: VirtualKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleRecordingIndicatorKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleRecordingIndicatorKeyModifiers(value: VirtualKeyModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleRecordingIndicatorKeyModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleRecordingKey(value: VirtualKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleRecordingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleRecordingKeyModifiers(value: VirtualKeyModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleRecordingKeyModifiers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

