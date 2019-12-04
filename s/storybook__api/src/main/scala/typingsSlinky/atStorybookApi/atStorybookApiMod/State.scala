package typingsSlinky.atStorybookApi.atStorybookApiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atReachRouter.atReachRouterMod.NavigateFn
import typingsSlinky.atStorybookApi.VersionsUnknownEntries
import typingsSlinky.atStorybookApi.WindowLocation
import typingsSlinky.atStorybookApi.distModulesLayoutMod.Layout
import typingsSlinky.atStorybookApi.distModulesLayoutMod.UI
import typingsSlinky.atStorybookApi.distModulesNotificationsMod.Notification
import typingsSlinky.atStorybookApi.distModulesShortcutsMod.Shortcuts
import typingsSlinky.atStorybookApi.distModulesStoriesMod.StoriesHash
import typingsSlinky.atStorybookApi.distModulesStoriesMod.StoryId
import typingsSlinky.atStorybookApi.distModulesStoriesMod.ViewMode
import typingsSlinky.atStorybookApi.distModulesUrlMod.QueryParams
import typingsSlinky.atStorybookTheming.distTypesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api.Other & @storybook/api.@storybook/api/dist/modules/layout.SubState & @storybook/api.@storybook/api/dist/modules/stories.SubState & @storybook/api.@storybook/api/dist/modules/notifications.SubState & @storybook/api.@storybook/api/dist/modules/versions.SubState & @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api/dist/modules/shortcuts.SubState */
trait State
  extends /* key */ StringDictionary[js.Any] {
  var customQueryParams: QueryParams
  var default: js.UndefOr[Boolean] = js.undefined
  var dismissedVersionNotification: js.UndefOr[String] = js.undefined
  var lastVersionCheck: Double
  var layout: Layout
  var location: js.UndefOr[WindowLocation] = js.undefined
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var notifications: js.Array[Notification]
  var path: js.UndefOr[String] = js.undefined
  var selectedPanel: js.UndefOr[String] = js.undefined
  var shortcuts: Shortcuts
  var storiesConfigured: Boolean
  var storiesHash: StoriesHash
  var storyId: js.UndefOr[StoryId with String] = js.undefined
  var theme: ThemeVars
  var ui: UI
  var uri: js.UndefOr[String] = js.undefined
  var versions: VersionsUnknownEntries
  var viewMode: js.UndefOr[ViewMode with String] = js.undefined
}

object State {
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    lastVersionCheck: Double,
    layout: Layout,
    notifications: js.Array[Notification],
    shortcuts: Shortcuts,
    storiesConfigured: Boolean,
    storiesHash: StoriesHash,
    theme: ThemeVars,
    ui: UI,
    versions: VersionsUnknownEntries,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    default: js.UndefOr[Boolean] = js.undefined,
    dismissedVersionNotification: String = null,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    path: String = null,
    selectedPanel: String = null,
    storyId: StoryId with String = null,
    uri: String = null,
    viewMode: ViewMode with String = null
  ): State = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dismissedVersionNotification != null) __obj.updateDynamic("dismissedVersionNotification")(dismissedVersionNotification.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (selectedPanel != null) __obj.updateDynamic("selectedPanel")(selectedPanel.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

