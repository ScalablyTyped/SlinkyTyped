package typingsSlinky.storybookApi

import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import typingsSlinky.storybookApi.layoutMod.Layout
import typingsSlinky.storybookApi.layoutMod.UI
import typingsSlinky.storybookApi.notificationsMod.Notification
import typingsSlinky.storybookApi.shortcutsMod.Shortcuts
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookApi.urlMod.QueryParams
import typingsSlinky.storybookApi.versionsMod.UnknownEntries
import typingsSlinky.storybookApi.versionsMod.Versions
import typingsSlinky.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomQueryParams extends js.Object {
  var customQueryParams: QueryParams = js.native
  var default: js.UndefOr[Boolean] = js.native
  var dismissedVersionNotification: String = js.native
  var lastVersionCheck: Double = js.native
  var layout: Layout = js.native
  var location: WindowLocation[LocationState] = js.native
  var navigate: js.UndefOr[NavigateFn] = js.native
  var notifications: js.Array[Notification] = js.native
  var path: String = js.native
  var selectedPanel: String = js.native
  var shortcuts: Shortcuts = js.native
  var storiesConfigured: Boolean = js.native
  var storiesHash: StoriesHash = js.native
  var storyId: String = js.native
  var theme: ThemeVars = js.native
  var ui: UI = js.native
  var uri: js.UndefOr[String] = js.native
  var versions: Versions with UnknownEntries = js.native
  var viewMode: String = js.native
}

object AnonCustomQueryParams {
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    dismissedVersionNotification: String,
    lastVersionCheck: Double,
    layout: Layout,
    location: WindowLocation[LocationState],
    notifications: js.Array[Notification],
    path: String,
    selectedPanel: String,
    shortcuts: Shortcuts,
    storiesConfigured: Boolean,
    storiesHash: StoriesHash,
    storyId: String,
    theme: ThemeVars,
    ui: UI,
    versions: Versions with UnknownEntries,
    viewMode: String
  ): AnonCustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomQueryParams]
  }
  @scala.inline
  implicit class AnonCustomQueryParamsOps[Self <: AnonCustomQueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomQueryParams(value: QueryParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissedVersionNotification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedVersionNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastVersionCheck(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVersionCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: WindowLocation[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: js.Array[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcuts(value: Shortcuts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoriesConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesConfigured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoriesHash(value: StoriesHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: ThemeVars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi(value: UI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: Versions with UnknownEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigate(value: NavigateFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

