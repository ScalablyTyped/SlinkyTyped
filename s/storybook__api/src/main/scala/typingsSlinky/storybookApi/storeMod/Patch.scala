package typingsSlinky.storybookApi.storeMod

import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import typingsSlinky.storybookApi.layoutMod.Layout
import typingsSlinky.storybookApi.layoutMod.UI
import typingsSlinky.storybookApi.notificationsMod.Notification
import typingsSlinky.storybookApi.shortcutsMod.Shortcuts
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookApi.storiesMod.StoryId
import typingsSlinky.storybookApi.storiesMod.ViewMode
import typingsSlinky.storybookApi.urlMod.QueryParams
import typingsSlinky.storybookApi.versionsMod.UnknownEntries
import typingsSlinky.storybookApi.versionsMod.Versions
import typingsSlinky.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/api.@storybook/api.State> */
@js.native
trait Patch extends js.Object {
  var customQueryParams: js.UndefOr[QueryParams] = js.native
  var default: js.UndefOr[Boolean] = js.native
  var dismissedVersionNotification: js.UndefOr[String] = js.native
  var lastVersionCheck: js.UndefOr[Double] = js.native
  var layout: js.UndefOr[Layout] = js.native
  var location: js.UndefOr[WindowLocation[LocationState]] = js.native
  var navigate: js.UndefOr[NavigateFn] = js.native
  var notifications: js.UndefOr[js.Array[Notification]] = js.native
  var path: js.UndefOr[String] = js.native
  var selectedPanel: js.UndefOr[String] = js.native
  var shortcuts: js.UndefOr[Shortcuts] = js.native
  var storiesConfigured: js.UndefOr[Boolean] = js.native
  var storiesHash: js.UndefOr[StoriesHash] = js.native
  var storyId: js.UndefOr[StoryId] = js.native
  var theme: js.UndefOr[ThemeVars] = js.native
  var ui: js.UndefOr[UI] = js.native
  var uri: js.UndefOr[String] = js.native
  var versions: js.UndefOr[Versions with UnknownEntries] = js.native
  var viewMode: js.UndefOr[ViewMode] = js.native
}

object Patch {
  @scala.inline
  def apply(): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patch]
  }
  @scala.inline
  implicit class PatchOps[Self <: Patch] (val x: Self) extends AnyVal {
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
    def withoutCustomQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(js.undefined)
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
    def withDismissedVersionNotification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedVersionNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissedVersionNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedVersionNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withLastVersionCheck(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVersionCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastVersionCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVersionCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: WindowLocation[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
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
    def withNotifications(value: js.Array[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: Shortcuts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withStoriesConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesConfigured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoriesConfigured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesConfigured")(js.undefined)
        ret
    }
    @scala.inline
    def withStoriesHash(value: StoriesHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoriesHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesHash")(js.undefined)
        ret
    }
    @scala.inline
    def withStoryId(value: StoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyId")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ThemeVars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUi(value: UI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
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
    @scala.inline
    def withVersions(value: Versions with UnknownEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: ViewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
  }
  
}

