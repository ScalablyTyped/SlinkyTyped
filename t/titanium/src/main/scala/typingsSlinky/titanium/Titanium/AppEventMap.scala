package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEventMap extends ProxyEventMap {
  var accessibilitychanged: AppAccessibilitychangedEvent = js.native
  var close: AppCloseEvent = js.native
  var keyboardframechanged: AppKeyboardframechangedEvent = js.native
  var memorywarning: AppMemorywarningEvent = js.native
  var pause: AppPauseEvent = js.native
  var paused: AppPausedEvent = js.native
  var proximity: AppProximityEvent = js.native
  var resume: AppResumeEvent = js.native
  var resumed: AppResumedEvent = js.native
  var shortcutitemclick: AppShortcutitemclickEvent = js.native
  var significanttimechange: AppSignificanttimechangeEvent = js.native
  var started: AppStartedEvent = js.native
  var uncaughtException: AppUncaughtExceptionEvent = js.native
  var userinteraction: AppUserinteractionEvent = js.native
}

object AppEventMap {
  @scala.inline
  def apply(
    accessibilitychanged: AppAccessibilitychangedEvent,
    close: AppCloseEvent,
    keyboardframechanged: AppKeyboardframechangedEvent,
    memorywarning: AppMemorywarningEvent,
    pause: AppPauseEvent,
    paused: AppPausedEvent,
    proximity: AppProximityEvent,
    resume: AppResumeEvent,
    resumed: AppResumedEvent,
    shortcutitemclick: AppShortcutitemclickEvent,
    significanttimechange: AppSignificanttimechangeEvent,
    started: AppStartedEvent,
    uncaughtException: AppUncaughtExceptionEvent,
    userinteraction: AppUserinteractionEvent
  ): AppEventMap = {
    val __obj = js.Dynamic.literal(accessibilitychanged = accessibilitychanged.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], keyboardframechanged = keyboardframechanged.asInstanceOf[js.Any], memorywarning = memorywarning.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], resumed = resumed.asInstanceOf[js.Any], shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any], significanttimechange = significanttimechange.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], uncaughtException = uncaughtException.asInstanceOf[js.Any], userinteraction = userinteraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEventMap]
  }
  @scala.inline
  implicit class AppEventMapOps[Self <: AppEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilitychanged(value: AppAccessibilitychangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilitychanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: AppCloseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardframechanged(value: AppKeyboardframechangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardframechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemorywarning(value: AppMemorywarningEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memorywarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: AppPauseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: AppPausedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProximity(value: AppProximityEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: AppResumeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumed(value: AppResumedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcutitemclick(value: AppShortcutitemclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutitemclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignificanttimechange(value: AppSignificanttimechangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("significanttimechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted(value: AppStartedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncaughtException(value: AppUncaughtExceptionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserinteraction(value: AppUserinteractionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userinteraction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

