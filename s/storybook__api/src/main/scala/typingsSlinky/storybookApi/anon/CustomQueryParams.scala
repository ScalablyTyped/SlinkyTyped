package typingsSlinky.storybookApi.anon

import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import typingsSlinky.std.Record
import typingsSlinky.storybookApi.layoutMod.Layout
import typingsSlinky.storybookApi.layoutMod.UI
import typingsSlinky.storybookApi.mod.Args
import typingsSlinky.storybookApi.notificationsMod.Notification
import typingsSlinky.storybookApi.refsMod.ComposedRef
import typingsSlinky.storybookApi.settingsMod.Settings
import typingsSlinky.storybookApi.shortcutsMod.Shortcuts
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookApi.urlMod.QueryParams
import typingsSlinky.storybookApi.versionsMod.UnknownEntries
import typingsSlinky.storybookApi.versionsMod.Versions
import typingsSlinky.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomQueryParams extends js.Object {
  
  var customQueryParams: QueryParams = js.native
  
  var dismissedVersionNotification: String = js.native
  
  var globals: Args = js.native
  
  var lastVersionCheck: Double = js.native
  
  var layout: Layout = js.native
  
  var location: WindowLocation[js.Object] = js.native
  
  var navigate: js.UndefOr[NavigateFn] = js.native
  
  var notifications: js.Array[Notification] = js.native
  
  var path: String = js.native
  
  var refId: String = js.native
  
  var refs: Record[String, ComposedRef] = js.native
  
  var releaseNotesViewed: js.Array[String] = js.native
  
  var selectedPanel: String = js.native
  
  var settings: Settings = js.native
  
  var shortcuts: Shortcuts = js.native
  
  var storiesConfigured: Boolean = js.native
  
  var storiesFailed: js.UndefOr[js.Error] = js.native
  
  var storiesHash: StoriesHash = js.native
  
  var storyId: String = js.native
  
  var theme: ThemeVars = js.native
  
  var ui: UI = js.native
  
  var versions: Versions with UnknownEntries = js.native
  
  var viewMode: String = js.native
}
object CustomQueryParams {
  
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    dismissedVersionNotification: String,
    globals: Args,
    lastVersionCheck: Double,
    layout: Layout,
    location: WindowLocation[js.Object],
    notifications: js.Array[Notification],
    path: String,
    refId: String,
    refs: Record[String, ComposedRef],
    releaseNotesViewed: js.Array[String],
    selectedPanel: String,
    settings: Settings,
    shortcuts: Shortcuts,
    storiesConfigured: Boolean,
    storiesHash: StoriesHash,
    storyId: String,
    theme: ThemeVars,
    ui: UI,
    versions: Versions with UnknownEntries,
    viewMode: String
  ): CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomQueryParams]
  }
  
  @scala.inline
  implicit class CustomQueryParamsOps[Self <: CustomQueryParams] (val x: Self) extends AnyVal {
    
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
    def setCustomQueryParams(value: QueryParams): Self = this.set("customQueryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissedVersionNotification(value: String): Self = this.set("dismissedVersionNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: Args): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVersionCheck(value: Double): Self = this.set("lastVersionCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WindowLocation[js.Object]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(value: Record[String, ComposedRef]): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseNotesViewedVarargs(value: String*): Self = this.set("releaseNotesViewed", js.Array(value :_*))
    
    @scala.inline
    def setReleaseNotesViewed(value: js.Array[String]): Self = this.set("releaseNotesViewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcuts(value: Shortcuts): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesConfigured(value: Boolean): Self = this.set("storiesConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesHash(value: StoriesHash): Self = this.set("storiesHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: ThemeVars): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: UI): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: Versions with UnknownEntries): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setStoriesFailed(value: js.Error): Self = this.set("storiesFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoriesFailed: Self = this.set("storiesFailed", js.undefined)
  }
}
