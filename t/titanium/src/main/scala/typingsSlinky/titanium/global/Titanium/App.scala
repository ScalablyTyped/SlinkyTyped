package typingsSlinky.titanium.global.Titanium

import typingsSlinky.titanium.Dictionary
import typingsSlinky.titanium.GetUserNotificationSettings
import typingsSlinky.titanium.NotificationParams
import typingsSlinky.titanium.Titanium.Android.Intent
import typingsSlinky.titanium.Titanium.App.AndroidShortcutitemclickEvent
import typingsSlinky.titanium.Titanium.App.PropertiesChangeEvent
import typingsSlinky.titanium.Titanium.App.iOS.BackgroundService
import typingsSlinky.titanium.Titanium.App.iOS.UserDefaults
import typingsSlinky.titanium.Titanium.App.iOSBackgroundfetchEvent
import typingsSlinky.titanium.Titanium.App.iOSBackgroundtransferEvent
import typingsSlinky.titanium.Titanium.App.iOSContinueactivityEvent
import typingsSlinky.titanium.Titanium.App.iOSDownloadcompletedEvent
import typingsSlinky.titanium.Titanium.App.iOSDownloadprogressEvent
import typingsSlinky.titanium.Titanium.App.iOSHandleurlEvent
import typingsSlinky.titanium.Titanium.App.iOSLocalnotificationactionEvent
import typingsSlinky.titanium.Titanium.App.iOSNotificationEvent
import typingsSlinky.titanium.Titanium.App.iOSRemotenotificationactionEvent
import typingsSlinky.titanium.Titanium.App.iOSScreenshotcapturedEvent
import typingsSlinky.titanium.Titanium.App.iOSSessioncompletedEvent
import typingsSlinky.titanium.Titanium.App.iOSSessioneventscompletedEvent
import typingsSlinky.titanium.Titanium.App.iOSShortcutitemclickEvent
import typingsSlinky.titanium.Titanium.App.iOSSilentpushEvent
import typingsSlinky.titanium.Titanium.App.iOSTraitcollectionchangeEvent
import typingsSlinky.titanium.Titanium.App.iOSUploadprogressEvent
import typingsSlinky.titanium.Titanium.App.iOSUsernotificationsettingsEvent
import typingsSlinky.titanium.Titanium.App.iOSWatchkitextensionrequestEvent
import typingsSlinky.titanium.Titanium.AppAccessibilitychangedEvent
import typingsSlinky.titanium.Titanium.AppCloseEvent
import typingsSlinky.titanium.Titanium.AppKeyboardframechangedEvent
import typingsSlinky.titanium.Titanium.AppMemorywarningEvent
import typingsSlinky.titanium.Titanium.AppPauseEvent
import typingsSlinky.titanium.Titanium.AppPausedEvent
import typingsSlinky.titanium.Titanium.AppProximityEvent
import typingsSlinky.titanium.Titanium.AppResumeEvent
import typingsSlinky.titanium.Titanium.AppResumedEvent
import typingsSlinky.titanium.Titanium.AppShortcutitemclickEvent
import typingsSlinky.titanium.Titanium.AppSignificanttimechangeEvent
import typingsSlinky.titanium.Titanium.AppStartedEvent
import typingsSlinky.titanium.Titanium.AppUncaughtExceptionEvent
import typingsSlinky.titanium.Titanium.AppUserinteractionEvent
import typingsSlinky.titanium.Titanium.Event
import typingsSlinky.titanium.Titanium.UI.TabGroup
import typingsSlinky.titanium.Titanium.UI.Window
import typingsSlinky.titanium.UserNotificationCallbackResponse
import typingsSlinky.titanium.UserNotificationDictionary
import typingsSlinky.titanium.UserNotificationSettings
import typingsSlinky.titanium.launchOptions
import typingsSlinky.titanium.titaniumStrings.accessibilitychanged
import typingsSlinky.titanium.titaniumStrings.backgroundfetch
import typingsSlinky.titanium.titaniumStrings.backgroundtransfer
import typingsSlinky.titanium.titaniumStrings.change
import typingsSlinky.titanium.titaniumStrings.close
import typingsSlinky.titanium.titaniumStrings.continueactivity
import typingsSlinky.titanium.titaniumStrings.downloadcompleted
import typingsSlinky.titanium.titaniumStrings.downloadprogress
import typingsSlinky.titanium.titaniumStrings.handleurl
import typingsSlinky.titanium.titaniumStrings.keyboardframechanged
import typingsSlinky.titanium.titaniumStrings.localnotificationaction
import typingsSlinky.titanium.titaniumStrings.memorywarning
import typingsSlinky.titanium.titaniumStrings.notification
import typingsSlinky.titanium.titaniumStrings.pause
import typingsSlinky.titanium.titaniumStrings.paused
import typingsSlinky.titanium.titaniumStrings.proximity
import typingsSlinky.titanium.titaniumStrings.remotenotificationaction
import typingsSlinky.titanium.titaniumStrings.resume
import typingsSlinky.titanium.titaniumStrings.resumed
import typingsSlinky.titanium.titaniumStrings.screenshotcaptured
import typingsSlinky.titanium.titaniumStrings.sessioncompleted
import typingsSlinky.titanium.titaniumStrings.sessioneventscompleted
import typingsSlinky.titanium.titaniumStrings.shortcutitemclick
import typingsSlinky.titanium.titaniumStrings.significanttimechange
import typingsSlinky.titanium.titaniumStrings.silentpush
import typingsSlinky.titanium.titaniumStrings.started
import typingsSlinky.titanium.titaniumStrings.traitcollectionchange
import typingsSlinky.titanium.titaniumStrings.uncaughtException
import typingsSlinky.titanium.titaniumStrings.uploadprogress
import typingsSlinky.titanium.titaniumStrings.userinteraction
import typingsSlinky.titanium.titaniumStrings.usernotificationsettings
import typingsSlinky.titanium.titaniumStrings.watchkitextensionrequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level App module is mainly used for accessing information about the
  * application at runtime, and for sending or listening for system events.
  */
@JSGlobal("Titanium.App")
@js.native
class App ()
  extends typingsSlinky.titanium.Titanium.Proxy
/**
  * The top-level App module is mainly used for accessing information about the
  * application at runtime, and for sending or listening for system events.
  */
/* static members */
@JSGlobal("Titanium.App")
@js.native
object App extends js.Object {
  
  /**
    * Convenience constant for system event "accessibilityannouncement".
    */
  val EVENT_ACCESSIBILITY_ANNOUNCEMENT: String = js.native
  
  /**
    * Convenience constant for system event "accessibilitychanged".
    */
  val EVENT_ACCESSIBILITY_CHANGED: String = js.native
  
  /**
    * Indicates whether Accessibility is enabled by the system.
    */
  val accessibilityEnabled: Boolean = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_accessibilitychanged(
    name: accessibilitychanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppAccessibilitychangedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(name: close, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppCloseEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyboardframechanged(
    name: keyboardframechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppKeyboardframechangedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_memorywarning(
    name: memorywarning,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppMemorywarningEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(name: pause, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPauseEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paused(name: paused, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPausedEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_proximity(
    name: proximity,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppProximityEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(name: resume, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumeEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resumed(name: resumed, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumedEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppShortcutitemclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_significanttimechange(
    name: significanttimechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppSignificanttimechangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_started(name: started, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppStartedEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_uncaughtException(
    name: uncaughtException,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUncaughtExceptionEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUserinteractionEvent, Unit]
  ): Unit = js.native
  
  /**
    * Indicates whether Analytics is enabled, determined by `tiapp.xml`.
    */
  val analytics: Boolean = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Application copyright statement, determined by `tiapp.xml`.
    */
  val copyright: String = js.native
  
  /**
    * A reference to the currnet background service running when the application is placed in the background.
    */
  val currentService: BackgroundService = js.native
  
  /**
    * Build type that reflects how the application was packaged.
    * Returns one of the following values:
    * * `development` (Simulator)
    * * `test` (Device)
    * * `production` (App Store / Adhoc)
    */
  val deployType: String = js.native
  
  /**
    * Application description, determined by `tiapp.xml`.
    */
  val description: String = js.native
  
  /**
    * Prevents network activity indicator from being displayed.
    */
  var disableNetworkActivityIndicator: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_accessibilitychanged(name: accessibilitychanged): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_accessibilitychanged(name: accessibilitychanged, event: AppAccessibilitychangedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: AppCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keyboardframechanged(name: keyboardframechanged): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keyboardframechanged(name: keyboardframechanged, event: AppKeyboardframechangedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_memorywarning(name: memorywarning): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_memorywarning(name: memorywarning, event: AppMemorywarningEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause, event: AppPauseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_paused(name: paused): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_paused(name: paused, event: AppPausedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_proximity(name: proximity): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_proximity(name: proximity, event: AppProximityEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume, event: AppResumeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resumed(name: resumed): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resumed(name: resumed, event: AppResumedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick, event: AppShortcutitemclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_significanttimechange(name: significanttimechange): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_significanttimechange(name: significanttimechange, event: AppSignificanttimechangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_started(name: started): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_started(name: started, event: AppStartedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_uncaughtException(name: uncaughtException): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_uncaughtException(name: uncaughtException, event: AppUncaughtExceptionEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userinteraction(name: userinteraction): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userinteraction(name: userinteraction, event: AppUserinteractionEvent): Unit = js.native
  
  /**
    * Fire a system-level event such as <Titanium.App.EVENT_ACCESSIBILITY_ANNOUNCEMENT>.
    */
  def fireSystemEvent(eventName: String): Unit = js.native
  def fireSystemEvent(eventName: String, param: js.Any): Unit = js.native
  
  /**
    * Shows the application's splash screen on app resume.
    */
  var forceSplashAsSnapshot: Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.accessibilityEnabled> property.
    * @deprecated Access <Titanium.App.accessibilityEnabled> instead.
    */
  def getAccessibilityEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.analytics> property.
    * @deprecated Access <Titanium.App.analytics> instead.
    */
  def getAnalytics(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.apiName> property.
    * @deprecated Access <Titanium.App.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Returns the arguments passed to the application on startup.
    */
  def getArguments(): launchOptions = js.native
  
  /**
    * Gets the value of the <Titanium.App.bubbleParent> property.
    * @deprecated Access <Titanium.App.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.copyright> property.
    * @deprecated Access <Titanium.App.copyright> instead.
    */
  def getCopyright(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.currentService> property.
    * @deprecated Access <Titanium.App.currentService> instead.
    */
  def getCurrentService(): BackgroundService = js.native
  
  /**
    * Gets the value of the <Titanium.App.deployType> property.
    * @deprecated Access <Titanium.App.deployType> instead.
    */
  def getDeployType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.description> property.
    * @deprecated Access <Titanium.App.description> instead.
    */
  def getDescription(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
    * @deprecated Access <Titanium.App.disableNetworkActivityIndicator> instead.
    */
  def getDisableNetworkActivityIndicator(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.forceSplashAsSnapshot> property.
    * @deprecated Access <Titanium.App.forceSplashAsSnapshot> instead.
    */
  def getForceSplashAsSnapshot(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.guid> property.
    * @deprecated Access <Titanium.App.guid> instead.
    */
  def getGuid(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.id> property.
    * @deprecated Access <Titanium.App.id> instead.
    */
  def getId(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.idleTimerDisabled> property.
    * @deprecated Access <Titanium.App.idleTimerDisabled> instead.
    */
  def getIdleTimerDisabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.installId> property.
    * @deprecated Access <Titanium.App.installId> instead.
    */
  def getInstallId(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.keyboardVisible> property.
    * @deprecated Access <Titanium.App.keyboardVisible> instead.
    */
  def getKeyboardVisible(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.lifecycleContainer> property.
    * @deprecated Access <Titanium.App.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.App.name> property.
    * @deprecated Access <Titanium.App.name> instead.
    */
  def getName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.proximityDetection> property.
    * @deprecated Access <Titanium.App.proximityDetection> instead.
    */
  def getProximityDetection(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.proximityState> property.
    * @deprecated Access <Titanium.App.proximityState> instead.
    */
  def getProximityState(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.publisher> property.
    * @deprecated Access <Titanium.App.publisher> instead.
    */
  def getPublisher(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.sessionId> property.
    * @deprecated Access <Titanium.App.sessionId> instead.
    */
  def getSessionId(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.url> property.
    * @deprecated Access <Titanium.App.url> instead.
    */
  def getUrl(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.version> property.
    * @deprecated Access <Titanium.App.version> instead.
    */
  def getVersion(): String = js.native
  
  /**
    * Application globally-unique ID, determined by `tiapp.xml`.
    */
  val guid: String = js.native
  
  /**
    * Application ID, from `tiapp.xml`.
    */
  val id: String = js.native
  
  /**
    * Determines whether the screen is locked when the device is idle.
    */
  var idleTimerDisabled: Boolean = js.native
  
  /**
    * The install ID for this application.
    */
  val installId: String = js.native
  
  /**
    * Indicates whether or not the soft keyboard is visible.
    */
  val keyboardVisible: Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Application name, determined by `tiapp.xml`.
    */
  val name: String = js.native
  
  /**
    * Determines whether proximity detection is enabled.
    */
  var proximityDetection: Boolean = js.native
  
  /**
    * Indicates the state of the device's proximity sensor, according to the
    * <Titanium.App.proximity> event.
    */
  val proximityState: Boolean = js.native
  
  /**
    * Application publisher, from `tiapp.xml`.
    */
  val publisher: String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_accessibilitychanged(
    name: accessibilitychanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppAccessibilitychangedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(name: close, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppCloseEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyboardframechanged(
    name: keyboardframechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppKeyboardframechangedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_memorywarning(
    name: memorywarning,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppMemorywarningEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(name: pause, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPauseEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paused(name: paused, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPausedEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_proximity(
    name: proximity,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppProximityEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(name: resume, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumeEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resumed(name: resumed, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumedEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppShortcutitemclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_significanttimechange(
    name: significanttimechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppSignificanttimechangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_started(name: started, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppStartedEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_uncaughtException(
    name: uncaughtException,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUncaughtExceptionEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUserinteractionEvent, Unit]
  ): Unit = js.native
  
  /**
    * Unique session identifier for the current continuous run of the application.
    */
  val sessionId: String = js.native
  
  /**
    * Sets the value of the <Titanium.App.bubbleParent> property.
    * @deprecated Set the value using <Titanium.App.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
    * @deprecated Set the value using <Titanium.App.disableNetworkActivityIndicator> instead.
    */
  def setDisableNetworkActivityIndicator(disableNetworkActivityIndicator: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.forceSplashAsSnapshot> property.
    * @deprecated Set the value using <Titanium.App.forceSplashAsSnapshot> instead.
    */
  def setForceSplashAsSnapshot(forceSplashAsSnapshot: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.idleTimerDisabled> property.
    * @deprecated Set the value using <Titanium.App.idleTimerDisabled> instead.
    */
  def setIdleTimerDisabled(idleTimerDisabled: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.App.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.proximityDetection> property.
    * @deprecated Set the value using <Titanium.App.proximityDetection> instead.
    */
  def setProximityDetection(proximityDetection: Boolean): Unit = js.native
  
  /**
    * Indicates whether or not the user interaction shoud be tracked.
    */
  var trackUserInteraction: Boolean = js.native
  
  /**
    * Application URL, from `tiapp.xml`.
    */
  val url: String = js.native
  
  /**
    * Application version, from `tiapp.xml`.
    */
  val version: String = js.native
  
  /**
    * A module used to access Android application resources.
    */
  @js.native
  class Android ()
    extends typingsSlinky.titanium.Titanium.Proxy
  /* static members */
  @js.native
  object Android extends js.Object {
    
    /**
      * The `R` namespace for application resources.
      */
    val R: typingsSlinky.titanium.Titanium.Android.R = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ AndroidShortcutitemclickEvent, Unit]
    ): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    val apiName: String = js.native
    
    /**
      * The version number of the application.
      */
    val appVersionCode: Double = js.native
    
    /**
      * The version name of the application.
      */
    val appVersionName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    var bubbleParent: Boolean = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    def fireEvent(name: String): Unit = js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_shortcutitemclick(name: shortcutitemclick, event: AndroidShortcutitemclickEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.apiName> property.
      * @deprecated Access <Titanium.App.Android.apiName> instead.
      */
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.appVersionCode> property.
      * @deprecated Access <Titanium.App.Android.appVersionCode> instead.
      */
    def getAppVersionCode(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.appVersionName> property.
      * @deprecated Access <Titanium.App.Android.appVersionName> instead.
      */
    def getAppVersionName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.bubbleParent> property.
      * @deprecated Access <Titanium.App.Android.bubbleParent> instead.
      */
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.launchIntent> property.
      * @deprecated Access <Titanium.App.Android.launchIntent> instead.
      */
    def getLaunchIntent(): Intent = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.App.Android.lifecycleContainer> instead.
      */
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * Return the intent that was used to launch the application.
      */
    val launchIntent: Intent = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    var lifecycleContainer: Window | TabGroup = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ AndroidShortcutitemclickEvent, Unit]
    ): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.App.Android.bubbleParent> instead.
      */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.App.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.App.Android.lifecycleContainer> instead.
      */
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  }
  
  /**
    * The App Properties module is used for storing application-related data in property/value pairs
    * that persist beyond application sessions and device power cycles.
    */
  @js.native
  class Properties ()
    extends typingsSlinky.titanium.Titanium.Proxy
  /* static members */
  @js.native
  object Properties extends js.Object {
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_change(
      name: change,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ PropertiesChangeEvent, Unit]
    ): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    var bubbleParent: Boolean = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    def fireEvent(name: String): Unit = js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_change(name: change): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_change(name: change, event: PropertiesChangeEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.Properties.apiName> property.
      * @deprecated Access <Titanium.App.Properties.apiName> instead.
      */
    def getApiName(): String = js.native
    
    /**
      * Returns the value of a property as a boolean data type.
      */
    def getBool(property: String): Boolean = js.native
    def getBool(property: String, defaultValue: Boolean): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.Properties.bubbleParent> property.
      * @deprecated Access <Titanium.App.Properties.bubbleParent> instead.
      */
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Returns the value of a property as a double (double-precision, floating point) data type.
      */
    def getDouble(property: String): Double = js.native
    def getDouble(property: String, defaultValue: Double): Double = js.native
    
    /**
      * Returns the value of a property as an integer data type.
      */
    def getInt(property: String): Double = js.native
    def getInt(property: String, defaultValue: Double): Double = js.native
    
    /**
      * Gets the value of the <Titanium.App.Properties.lifecycleContainer> property.
      * @deprecated Access <Titanium.App.Properties.lifecycleContainer> instead.
      */
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * Returns the value of a property as an array data type.
      */
    def getList(property: String): js.Array[_] = js.native
    def getList(property: String, defaultValue: js.Array[_]): js.Array[_] = js.native
    
    /**
      * Returns the value of a property as an object.
      */
    def getObject(property: String): js.Any = js.native
    def getObject(property: String, defaultValue: js.Any): js.Any = js.native
    
    /**
      * Returns the value of a property as a string data type.
      */
    def getString(property: String): String = js.native
    def getString(property: String, defaultValue: String): String = js.native
    
    /**
      * Indicates whether a property exists.
      */
    def hasProperty(property: String): Boolean = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    var lifecycleContainer: Window | TabGroup = js.native
    
    /**
      * Returns an array of property names.
      */
    def listProperties(): js.Array[_] = js.native
    
    /**
      * Removes all properties that have been set by the user on runtime, or does nothing otherwise.
      */
    def removeAllProperties(): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_change(
      name: change,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ PropertiesChangeEvent, Unit]
    ): Unit = js.native
    
    /**
      * Removes a property if it exists, or does nothing otherwise.
      */
    def removeProperty(property: String): Unit = js.native
    
    /**
      * Sets the value of a property as a boolean data type. The property will be created if it
      * does not exist.
      */
    def setBool(property: String, value: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.Properties.bubbleParent> property.
      * @deprecated Set the value using <Titanium.App.Properties.bubbleParent> instead.
      */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    /**
      * Sets the value of a property as a double (double-precision, floating point) data type. The
      * property will be created if it does not exist.
      */
    def setDouble(property: String, value: Double): Unit = js.native
    
    /**
      * Sets the value of a property as an integer data type. The property will be created if it
      * does not exist.
      */
    def setInt(property: String, value: Double): Unit = js.native
    
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.App.Properties.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.App.Properties.lifecycleContainer> instead.
      */
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
    
    /**
      * Sets the value of a property as an array data type. The property will be created if it
      * does not exist.
      */
    def setList(property: String, value: js.Array[_]): Unit = js.native
    
    /**
      * Sets the value of a property as an object data type. The property will be created if it
      * does not exist.
      */
    def setObject(property: String, value: js.Any): Unit = js.native
    
    /**
      * Sets the value of a property as a string data type. The property will be created if it
      * does not exist.
      */
    def setString(property: String, value: String): Unit = js.native
  }
  
  /**
    * The top-level App iOS module, available only to iOS devices, that includes the facilities to
    * create and manage local notifications and background services.
    */
  @js.native
  class iOS ()
    extends typingsSlinky.titanium.Titanium.Proxy
  /**
    * The top-level App iOS module, available only to iOS devices, that includes the facilities to
    * create and manage local notifications and background services.
    */
  /* static members */
  @js.native
  object iOS extends js.Object {
    
    /**
      * Use with [setMinimumBackgroundFetchInterval](Titanium.App.iOS.setMinimumBackgroundFetchInterval) method.
      * Specifies the smallest fetch interval supported by the system.
      */
    val BACKGROUNDFETCHINTERVAL_MIN: Double = js.native
    
    /**
      * Use with [setMinimumBackgroundFetchInterval](Titanium.App.iOS.setMinimumBackgroundFetchInterval) method.
      * Used to specify a fetch interval large enough to prevent fetch operations from occurring.
      */
    val BACKGROUNDFETCHINTERVAL_NEVER: Double = js.native
    
    /**
      * Convenience constant for system event "accessibilitylayoutchanged".
      */
    val EVENT_ACCESSIBILITY_LAYOUT_CHANGED: String = js.native
    
    /**
      * Convenience constant for system event "accessibilityscreenchanged".
      */
    val EVENT_ACCESSIBILITY_SCREEN_CHANGED: String = js.native
    
    /**
      * A dark interface style.
      * @deprecated Use <Titanium.UI.USER_INTERFACE_STYLE_DARK> instead, which is supported cross-platform.
      */
    val USER_INTERFACE_STYLE_DARK: Double = js.native
    
    /**
      * A light interface style.
      * @deprecated Use <Titanium.UI.USER_INTERFACE_STYLE_LIGHT> instead, which is supported cross-platform.
      */
    val USER_INTERFACE_STYLE_LIGHT: Double = js.native
    
    /**
      * An unspecified interface style.
      * @deprecated Use <Titanium.UI.USER_INTERFACE_STYLE_UNSPECIFIED> instead, which is supported cross-platform.
      */
    val USER_INTERFACE_STYLE_UNSPECIFIED: Double = js.native
    
    /**
      * The action will execute in background. Use with the
      * [activationMode](Titanium.App.iOS.UserNotificationAction.activationMode) property.
      */
    val USER_NOTIFICATION_ACTIVATION_MODE_BACKGROUND: Double = js.native
    
    /**
      * The action will launch the application and execute in the foreground.
      * Use with the [activationMode](Titanium.App.iOS.UserNotificationAction.activationMode) property.
      */
    val USER_NOTIFICATION_ACTIVATION_MODE_FOREGROUND: Double = js.native
    
    /**
      * A alert dialog is presented when the notification is received.
      */
    val USER_NOTIFICATION_ALERT_STYLE_ALERT: Double = js.native
    
    /**
      * A banner is presented when the notification is received.
      */
    val USER_NOTIFICATION_ALERT_STYLE_BANNER: Double = js.native
    
    /**
      * No banner or alert dialog is presented when the notification is received.
      */
    val USER_NOTIFICATION_ALERT_STYLE_NONE: Double = js.native
    
    /**
      * The application is authorized to post user notifications.
      */
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_AUTHORIZED: Double = js.native
    
    /**
      * The application is not authorized to post user notifications.
      */
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_DENIED: Double = js.native
    
    /**
      * The user has not yet made a choice regarding whether the application may post
      * user notifications.
      */
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_NOT_DETERMINED: Double = js.native
    
    /**
      * The application is provisionally authorized to post non-interruptive user notifications.
      */
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_PROVISIONAL: Double = js.native
    
    /**
      * Default action behavior with no additional action support.
      */
    val USER_NOTIFICATION_BEHAVIOR_DEFAULT: Double = js.native
    
    /**
      * Provides a textfield with the notification for the user to enter a text response.
      */
    val USER_NOTIFICATION_BEHAVIOR_TEXTINPUT: Double = js.native
    
    /**
      * Allow CarPlay to display notifications of this type.
      */
    val USER_NOTIFICATION_CATEGORY_OPTION_ALLOW_IN_CARPLAY: Double = js.native
    
    /**
      * Send dismiss actions to the UNUserNotificationCenter object's delegate for handling.
      */
    val USER_NOTIFICATION_CATEGORY_OPTION_CUSTOM_DISMISS_ACTION: Double = js.native
    
    /**
      * Show the notification's subtitle, even if the user has disabled notification previews for the app.
      */
    val USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_SUBTITLE: Double = js.native
    
    /**
      * Show the notification's title, even if the user has disabled notification previews for the app.
      */
    val USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_TITLE: Double = js.native
    
    /**
      * No options.
      */
    val USER_NOTIFICATION_CATEGORY_OPTION_NONE: Double = js.native
    
    /**
      * The notification setting is turned off.
      */
    val USER_NOTIFICATION_SETTING_DISABLED: Double = js.native
    
    /**
      * The notification setting is turned on.
      */
    val USER_NOTIFICATION_SETTING_ENABLED: Double = js.native
    
    /**
      * The application does not support this notification type.
      */
    val USER_NOTIFICATION_SETTING_NOT_SUPPORTED: Double = js.native
    
    /**
      * The application may display an alert upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    val USER_NOTIFICATION_TYPE_ALERT: Double = js.native
    
    /**
      * The application may badge its icon upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    val USER_NOTIFICATION_TYPE_BADGE: Double = js.native
    
    /**
      * The ability to play sounds for critical alerts.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    val USER_NOTIFICATION_TYPE_CRITICAL_ALERT: Double = js.native
    
    /**
      * The application may not present any UI upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    val USER_NOTIFICATION_TYPE_NONE: Double = js.native
    
    /**
      * An option indicating the system should display a button for in-app notification settings.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    val USER_NOTIFICATION_TYPE_PROVIDES_APP_NOTIFICATION_SETTINGS: Double = js.native
    
    /**
      * The ability to post non-interrupting notifications provisionally to the Notification Center.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    val USER_NOTIFICATION_TYPE_PROVISIONAL: Double = js.native
    
    /**
      * The application may play a sound upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    val USER_NOTIFICATION_TYPE_SOUND: Double = js.native
    
    /**
      * Uniform type identifier for Mac OS icon images.
      */
    val UTTYPE_APPLE_ICNS: String = js.native
    
    /**
      * Uniform type identifier for protected MPEG-4 audio (iTunes music store format).
      */
    val UTTYPE_APPLE_PROTECTED_MPEG4_AUDIO: String = js.native
    
    /**
      * Uniform type identifier for all audio content.
      */
    val UTTYPE_AUDIO: String = js.native
    
    /**
      * Uniform type identifier for Windows bitmap images.
      */
    val UTTYPE_BMP: String = js.native
    
    /**
      * Uniform type identifier for Rich Text with content embedding, pasteboard format.
      */
    val UTTYPE_FLAT_RTFD: String = js.native
    
    /**
      * Uniform type identifier for GIF images.
      */
    val UTTYPE_GIF: String = js.native
    
    /**
      * Uniform type identifier for HTML.
      */
    val UTTYPE_HTML: String = js.native
    
    /**
      * Uniform type identifier for Windows icon images.
      */
    val UTTYPE_ICO: String = js.native
    
    /**
      * Uniform type identifier for all image types.
      */
    val UTTYPE_IMAGE: String = js.native
    
    /**
      * Uniform type identifier for JPEG images.
      */
    val UTTYPE_JPEG: String = js.native
    
    /**
      * Uniform type identifier for JPEG 2000 images.
      */
    val UTTYPE_JPEG2000: String = js.native
    
    /**
      * Uniform type identifier for all audiovisual content.
      */
    val UTTYPE_MOVIE: String = js.native
    
    /**
      * Uniform type identifier for MP3 audio.
      */
    val UTTYPE_MP3: String = js.native
    
    /**
      * Uniform type identifier for MPEG-1 and MPEG-2 content.
      */
    val UTTYPE_MPEG: String = js.native
    
    /**
      * Uniform type identifier for MPEG-4 content.
      */
    val UTTYPE_MPEG4: String = js.native
    
    /**
      * Uniform type identifier for MPEG-4 audio.
      */
    val UTTYPE_MPEG4_AUDIO: String = js.native
    
    /**
      * Uniform type identifier for PDF data.
      */
    val UTTYPE_PDF: String = js.native
    
    /**
      * Uniform type identifier for PICT images.
      */
    val UTTYPE_PICT: String = js.native
    
    /**
      * Uniform type identifier for a plain text type, equivalent to MIME type text/plain.
      */
    val UTTYPE_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for PNG images.
      */
    val UTTYPE_PNG: String = js.native
    
    /**
      * Uniform type identifier for QuickTime images.
      */
    val UTTYPE_QUICKTIME_IMAGE: String = js.native
    
    /**
      * Uniform type identifier for QuickTime movies.
      */
    val UTTYPE_QUICKTIME_MOVIE: String = js.native
    
    /**
      * Uniform type identifier for Rich Text.
      */
    val UTTYPE_RTF: String = js.native
    
    /**
      * Uniform type identifier for Rich Text Format Directory, that is, Rich Text with content embedding, on-disk format.
      */
    val UTTYPE_RTFD: String = js.native
    
    /**
      * Uniform type identifier for all text types.
      */
    val UTTYPE_TEXT: String = js.native
    
    /**
      * Uniform type identifier for TIFF images.
      */
    val UTTYPE_TIFF: String = js.native
    
    /**
      * Uniform type identifier for MLTE (Textension) format for mixed text and multimedia data.
      */
    val UTTYPE_TXN_TEXT_AND_MULTIMEDIA_DATA: String = js.native
    
    /**
      * Uniform type identifier for Unicode-16 with byte-order mark (BOM), or if BOM is not present,
      * an external representation byte order (big-endian).
      */
    val UTTYPE_UTF16_EXTERNAL_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for Unicode-16, native byte order, with an optional byte-order mark (BOM).
      */
    val UTTYPE_UTF16_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for Unicode-8 plain text type.
      */
    val UTTYPE_UTF8_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for all video content without audio.
      */
    val UTTYPE_VIDEO: String = js.native
    
    /**
      * Uniform type identifier for WebKit webarchive format.
      */
    val UTTYPE_WEB_ARCHIVE: String = js.native
    
    /**
      * Uniform type identifier for XML.
      */
    val UTTYPE_XML: String = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_backgroundfetch(
      name: backgroundfetch,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundfetchEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_backgroundtransfer(
      name: backgroundtransfer,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundtransferEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_continueactivity(
      name: continueactivity,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSContinueactivityEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_downloadcompleted(
      name: downloadcompleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadcompletedEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_downloadprogress(
      name: downloadprogress,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadprogressEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_handleurl(
      name: handleurl,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSHandleurlEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_localnotificationaction(
      name: localnotificationaction,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSLocalnotificationactionEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_notification(
      name: notification,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSNotificationEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_remotenotificationaction(
      name: remotenotificationaction,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSRemotenotificationactionEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_screenshotcaptured(
      name: screenshotcaptured,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSScreenshotcapturedEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_sessioncompleted(
      name: sessioncompleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioncompletedEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_sessioneventscompleted(
      name: sessioneventscompleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioneventscompletedEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSShortcutitemclickEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_silentpush(
      name: silentpush,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSilentpushEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_traitcollectionchange(
      name: traitcollectionchange,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSTraitcollectionchangeEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_uploadprogress(
      name: uploadprogress,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUploadprogressEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_usernotificationsettings(
      name: usernotificationsettings,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUsernotificationsettingsEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_watchkitextensionrequest(
      name: watchkitextensionrequest,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSWatchkitextensionrequestEvent, Unit]
    ): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    val apiName: String = js.native
    
    /**
      * Returns a URL to open the app's settings.
      */
    val applicationOpenSettingsURL: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    var bubbleParent: Boolean = js.native
    
    /**
      * Cancels all scheduled local notifications.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
      */
    def cancelAllLocalNotifications(): Unit = js.native
    
    def cancelLocalNotification(id: String): Unit = js.native
    /**
      * Cancels a local notification.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
      */
    def cancelLocalNotification(id: Double): Unit = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchQuery>.
      */
    def createSearchQuery(): typingsSlinky.titanium.Titanium.App.iOS.SearchQuery = js.native
    def createSearchQuery(parameters: Dictionary[typingsSlinky.titanium.Titanium.App.iOS.SearchQuery]): typingsSlinky.titanium.Titanium.App.iOS.SearchQuery = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchableIndex>.
      */
    def createSearchableIndex(): typingsSlinky.titanium.Titanium.App.iOS.SearchableIndex = js.native
    def createSearchableIndex(parameters: Dictionary[typingsSlinky.titanium.Titanium.App.iOS.SearchableIndex]): typingsSlinky.titanium.Titanium.App.iOS.SearchableIndex = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchableItem>.
      */
    def createSearchableItem(): typingsSlinky.titanium.Titanium.App.iOS.SearchableItem = js.native
    def createSearchableItem(parameters: Dictionary[typingsSlinky.titanium.Titanium.App.iOS.SearchableItem]): typingsSlinky.titanium.Titanium.App.iOS.SearchableItem = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchableItemAttributeSet>.
      */
    def createSearchableItemAttributeSet(): typingsSlinky.titanium.Titanium.App.iOS.SearchableItemAttributeSet = js.native
    def createSearchableItemAttributeSet(parameters: Dictionary[typingsSlinky.titanium.Titanium.App.iOS.SearchableItemAttributeSet]): typingsSlinky.titanium.Titanium.App.iOS.SearchableItemAttributeSet = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.UserActivity>.
      */
    def createUserActivity(): typingsSlinky.titanium.Titanium.App.iOS.UserActivity = js.native
    def createUserActivity(parameters: Dictionary[typingsSlinky.titanium.Titanium.App.iOS.UserActivity]): typingsSlinky.titanium.Titanium.App.iOS.UserActivity = js.native
    
    /**
      * Creates and returns an instance of Titanium.App.iOS.UserDefaults.
      */
    def createUserDefaults(parameters: Dictionary[UserDefaults]): UserDefaults = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.UserNotificationAction>.
      */
    def createUserNotificationAction(): typingsSlinky.titanium.Titanium.App.iOS.UserNotificationAction = js.native
    def createUserNotificationAction(parameters: Dictionary[typingsSlinky.titanium.Titanium.App.iOS.UserNotificationAction]): typingsSlinky.titanium.Titanium.App.iOS.UserNotificationAction = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.UserNotificationCategory>.
      */
    def createUserNotificationCategory(): typingsSlinky.titanium.Titanium.App.iOS.UserNotificationCategory = js.native
    def createUserNotificationCategory(parameters: Dictionary[typingsSlinky.titanium.Titanium.App.iOS.UserNotificationCategory]): typingsSlinky.titanium.Titanium.App.iOS.UserNotificationCategory = js.native
    
    /**
      * Notification types and user notification categories the application is registered to use.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings](Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings) instead.
      */
    val currentUserNotificationSettings: UserNotificationSettings = js.native
    
    /**
      * Marks the end of the app execution after initiating the download operation. Available only on iOS 7 and later.
      */
    def endBackgroundHandler(handlerID: String): Unit = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    def fireEvent(name: String): Unit = js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_backgroundfetch(name: backgroundfetch): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_backgroundfetch(name: backgroundfetch, event: iOSBackgroundfetchEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_backgroundtransfer(name: backgroundtransfer): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_backgroundtransfer(name: backgroundtransfer, event: iOSBackgroundtransferEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_continueactivity(name: continueactivity): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_continueactivity(name: continueactivity, event: iOSContinueactivityEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_downloadcompleted(name: downloadcompleted): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_downloadcompleted(name: downloadcompleted, event: iOSDownloadcompletedEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_downloadprogress(name: downloadprogress): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_downloadprogress(name: downloadprogress, event: iOSDownloadprogressEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_handleurl(name: handleurl): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_handleurl(name: handleurl, event: iOSHandleurlEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_localnotificationaction(name: localnotificationaction): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_localnotificationaction(name: localnotificationaction, event: iOSLocalnotificationactionEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_notification(name: notification): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_notification(name: notification, event: iOSNotificationEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_remotenotificationaction(name: remotenotificationaction): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_remotenotificationaction(name: remotenotificationaction, event: iOSRemotenotificationactionEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_screenshotcaptured(name: screenshotcaptured): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_screenshotcaptured(name: screenshotcaptured, event: iOSScreenshotcapturedEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_sessioncompleted(name: sessioncompleted): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_sessioncompleted(name: sessioncompleted, event: iOSSessioncompletedEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_sessioneventscompleted(name: sessioneventscompleted): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_sessioneventscompleted(name: sessioneventscompleted, event: iOSSessioneventscompletedEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_shortcutitemclick(name: shortcutitemclick, event: iOSShortcutitemclickEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_silentpush(name: silentpush): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_silentpush(name: silentpush, event: iOSSilentpushEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_traitcollectionchange(name: traitcollectionchange): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_traitcollectionchange(name: traitcollectionchange, event: iOSTraitcollectionchangeEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_uploadprogress(name: uploadprogress): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_uploadprogress(name: uploadprogress, event: iOSUploadprogressEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_usernotificationsettings(name: usernotificationsettings): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_usernotificationsettings(name: usernotificationsettings, event: iOSUsernotificationsettingsEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_watchkitextensionrequest(name: watchkitextensionrequest): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_watchkitextensionrequest(name: watchkitextensionrequest, event: iOSWatchkitextensionrequestEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.apiName> property.
      * @deprecated Access <Titanium.App.iOS.apiName> instead.
      */
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.applicationOpenSettingsURL> property.
      * @deprecated Access <Titanium.App.iOS.applicationOpenSettingsURL> instead.
      */
    def getApplicationOpenSettingsURL(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.bubbleParent> property.
      * @deprecated Access <Titanium.App.iOS.bubbleParent> instead.
      */
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.currentUserNotificationSettings> property.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings](Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings) instead.
      */
    def getCurrentUserNotificationSettings(): UserNotificationSettings = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.supportedUserActivityTypes> property.
      * @deprecated Access <Titanium.App.iOS.supportedUserActivityTypes> instead.
      */
    def getSupportedUserActivityTypes(): js.Array[String] = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.userInterfaceStyle> property.
      * @deprecated Use <Titanium.UI.userInterfaceStyle> instead, which is supported cross-platform.
      */
    def getUserInterfaceStyle(): Double = js.native
    
    /**
      * Registers a service to run when the application is placed in the background.
      */
    def registerBackgroundService(params: js.Any): typingsSlinky.titanium.Titanium.App.iOS.BackgroundService = js.native
    
    /**
      * Registers the application to use the requested notification types and categories.
      */
    def registerUserNotificationSettings(params: UserNotificationSettings): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_backgroundfetch(
      name: backgroundfetch,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundfetchEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_backgroundtransfer(
      name: backgroundtransfer,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundtransferEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_continueactivity(
      name: continueactivity,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSContinueactivityEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_downloadcompleted(
      name: downloadcompleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadcompletedEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_downloadprogress(
      name: downloadprogress,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadprogressEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_handleurl(
      name: handleurl,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSHandleurlEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_localnotificationaction(
      name: localnotificationaction,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSLocalnotificationactionEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_notification(
      name: notification,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSNotificationEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_remotenotificationaction(
      name: remotenotificationaction,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSRemotenotificationactionEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_screenshotcaptured(
      name: screenshotcaptured,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSScreenshotcapturedEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_sessioncompleted(
      name: sessioncompleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioncompletedEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_sessioneventscompleted(
      name: sessioneventscompleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioneventscompletedEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSShortcutitemclickEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_silentpush(
      name: silentpush,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSilentpushEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_traitcollectionchange(
      name: traitcollectionchange,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSTraitcollectionchangeEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_uploadprogress(
      name: uploadprogress,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUploadprogressEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_usernotificationsettings(
      name: usernotificationsettings,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUsernotificationsettingsEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_watchkitextensionrequest(
      name: watchkitextensionrequest,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSWatchkitextensionrequestEvent, Unit]
    ): Unit = js.native
    
    /**
      * Schedule a local notification.
      */
    def scheduleLocalNotification(params: NotificationParams): typingsSlinky.titanium.Titanium.App.iOS.LocalNotification = js.native
    
    /**
      * Marks the end of an `openParentApplication:reply` execution by a WatchKit extension.
      * @deprecated Use [Titanium.WatchSession](Titanium.WatchSession) instead, which is supported on iOS 9 and later.
      *
      */
    def sendWatchExtensionReply(handlerId: String, userInfo: js.Any): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.bubbleParent> property.
      * @deprecated Set the value using <Titanium.App.iOS.bubbleParent> instead.
      */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    /**
      * Specifies the minimum amount of time that must elapse between background fetch operations.
      * Available only on iOS 7 and later.
      */
    def setMinimumBackgroundFetchInterval(fetchInterval: Double): Unit = js.native
    
    /**
      * Provides an Array of the NSUserActivityTypes keys defined within your Titanium project.
      */
    val supportedUserActivityTypes: js.Array[String] = js.native
    
    /**
      * The style associated with the user interface.
      * @deprecated Use <Titanium.UI.userInterfaceStyle> instead, which is supported cross-platform.
      */
    val userInterfaceStyle: Double = js.native
    
    /**
      * A service that runs when the application is placed in the background.
      */
    @js.native
    class BackgroundService ()
      extends typingsSlinky.titanium.Titanium.App.iOS.BackgroundService
    
    /**
      * A local notification to alert the user of new or pending application information.
      */
    @js.native
    class LocalNotification ()
      extends typingsSlinky.titanium.Titanium.App.iOS.LocalNotification
    
    /**
      * A search query object manages the criteria to apply when searching app content that you have previously
      * indexed by using the Core Spotlight APIs.
      */
    @js.native
    class SearchQuery ()
      extends typingsSlinky.titanium.Titanium.App.iOS.SearchQuery
    
    /**
      * The SearchableIndex module is used to add or remove Ti.App.iOS.SearchableItem objects from the device search index.
      */
    @js.native
    class SearchableIndex ()
      extends typingsSlinky.titanium.Titanium.App.iOS.SearchableIndex
    
    /**
      * Used to create a unique object containing all of the search information that will appear in the device search index.
      */
    @js.native
    class SearchableItem ()
      extends typingsSlinky.titanium.Titanium.App.iOS.SearchableItem
    
    /**
      * The SearchableItemAttributeSet module defines metadata properties for SearchItem and UserActivity objects.
      */
    @js.native
    class SearchableItemAttributeSet ()
      extends typingsSlinky.titanium.Titanium.App.iOS.SearchableItemAttributeSet
    
    /**
      * The UserActivity module is used to enable device Handoff and to create User Activities.
      */
    @js.native
    class UserActivity ()
      extends typingsSlinky.titanium.Titanium.App.iOS.UserActivity
    
    /**
      * An action the user selects in response to an interactive notification.
      */
    @js.native
    class UserNotificationAction ()
      extends typingsSlinky.titanium.Titanium.App.iOS.UserNotificationAction
    
    /**
      * A set of notification actions to associate with a notification.
      */
    @js.native
    class UserNotificationCategory ()
      extends typingsSlinky.titanium.Titanium.App.iOS.UserNotificationCategory
    
    /**
      * The top-level App iOS Notification Center module. It is used to control scheduled notifications
      * and receive details about the system-wide notification settings.
      */
    @js.native
    class UserNotificationCenter ()
      extends typingsSlinky.titanium.Titanium.Proxy
    /* static members */
    @js.native
    object UserNotificationCenter extends js.Object {
      
      /**
        * The name of the API that this proxy corresponds to.
        */
      val apiName: String = js.native
      
      /**
        * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.apiName> property.
        * @deprecated Access <Titanium.App.iOS.UserNotificationCenter.apiName> instead.
        */
      def getApiName(): String = js.native
      
      /**
        * Fetches the delivered notifications asynchronously.
        */
      def getDeliveredNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, Unit]): Unit = js.native
      
      /**
        * Fetches the pending notifications asynchronously.
        */
      def getPendingNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, Unit]): Unit = js.native
      
      /**
        * Removes the specified delivered notifications from the notification-center.
        * If no notifications are specified, all delivered notifications will be removed.
        */
      def removeDeliveredNotifications(notifications: js.Array[UserNotificationDictionary]): Unit = js.native
      
      /**
        * Removes the specified pending notifications to prevent them from being triggered.
        * If no notifications are specified, all pending notifications will be removed.
        */
      def removePendingNotifications(notifications: js.Array[UserNotificationDictionary]): Unit = js.native
      
      /**
        * Notification types and user notification categories the application is registered to use.
        */
      def requestUserNotificationSettings(callback: js.Function1[/* param0 */ GetUserNotificationSettings, Unit]): Unit = js.native
    }
  }
}
