package typingsSlinky.atStorybookApi.atStorybookApiMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.atStorybookApi.Anon_Filename
import typingsSlinky.atStorybookApi.Anon_Path
import typingsSlinky.atStorybookApi.distModulesAddonsMod.Collection
import typingsSlinky.atStorybookApi.distModulesAddonsMod.Types
import typingsSlinky.atStorybookApi.distModulesLayoutMod.PanelPositions
import typingsSlinky.atStorybookApi.distModulesNotificationsMod.Notification
import typingsSlinky.atStorybookApi.distModulesShortcutsMod.Action
import typingsSlinky.atStorybookApi.distModulesShortcutsMod.Event
import typingsSlinky.atStorybookApi.distModulesShortcutsMod.KeyCollection
import typingsSlinky.atStorybookApi.distModulesShortcutsMod.Shortcuts
import typingsSlinky.atStorybookApi.distModulesStoriesMod.Direction
import typingsSlinky.atStorybookApi.distModulesStoriesMod.Group
import typingsSlinky.atStorybookApi.distModulesStoriesMod.ParameterName
import typingsSlinky.atStorybookApi.distModulesStoriesMod.StoriesRaw
import typingsSlinky.atStorybookApi.distModulesStoriesMod.Story
import typingsSlinky.atStorybookApi.distModulesStoriesMod.StoryId
import typingsSlinky.atStorybookApi.distModulesUrlMod.QueryParams
import typingsSlinky.atStorybookApi.distModulesVersionsMod.Version
import typingsSlinky.atStorybookApi.distStoreMod.Options
import typingsSlinky.atStorybookChannels.atStorybookChannelsMod.Channel
import typingsSlinky.atStorybookChannels.atStorybookChannelsMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api/dist/modules/addons.SubAPI & @storybook/api.@storybook/api/dist/modules/channel.SubAPI & @storybook/api.@storybook/api/dist/init-provider-api.SubAPI & @storybook/api.@storybook/api/dist/modules/stories.SubAPI & @storybook/api.@storybook/api/dist/modules/layout.SubAPI & @storybook/api.@storybook/api/dist/modules/notifications.SubAPI & @storybook/api.@storybook/api/dist/modules/shortcuts.SubAPI & @storybook/api.@storybook/api/dist/modules/versions.SubAPI & @storybook/api.@storybook/api/dist/modules/url.SubAPI & @storybook/api.@storybook/api.OtherAPI */
@js.native
trait API
  extends /* key */ StringDictionary[js.Any] {
  var renderPreview: js.UndefOr[js.Function0[ReactElement]] = js.native
  var storyId: js.Function2[/* kind */ String, /* name */ String, String] = js.native
  def addNotification(notification: Notification): Unit = js.native
  def clearNotification(id: String): Unit = js.native
  def emit(`type`: String, args: js.Any*): Unit = js.native
  def getAddonState[S](addonId: String): S = js.native
  def getChannel(): Channel = js.native
  def getCurrentParameter[S](): S = js.native
  def getCurrentParameter[S](parameterName: ParameterName): S = js.native
  def getCurrentStoryData(): Story | Group = js.native
  def getCurrentVersion(): Version = js.native
  def getData(storyId: StoryId): Story | Group = js.native
  def getElements(`type`: Types): Collection = js.native
  def getLatestVersion(): Version = js.native
  def getPanels(): Collection = js.native
  def getParameters(storyId: StoryId): Anon_Filename | js.Any = js.native
  def getParameters(storyId: StoryId, parameterName: ParameterName): Anon_Filename | js.Any = js.native
  def getQueryParam(key: String): js.UndefOr[String] = js.native
  def getSelectedPanel(): String = js.native
  def getShortcutKeys(): Shortcuts = js.native
  def getStoryPanels(): Collection = js.native
  def getUrlState(): Anon_Path = js.native
  def handleKeydownEvent(api: API, event: Event): Unit = js.native
  def handleShortcutFeature(api: API, feature: Action): Unit = js.native
  def jumpToComponent(direction: Direction): Unit = js.native
  def jumpToStory(direction: Direction): Unit = js.native
  def off(`type`: String, cb: Listener): Unit = js.native
  def on(`type`: String, cb: Listener): js.Function0[Unit] = js.native
  def on(`type`: String, cb: Listener, peer: Boolean): js.Function0[Unit] = js.native
  def onStory(cb: Listener): Unit = js.native
  def once(`type`: String, cb: Listener): Unit = js.native
  def restoreAllDefaultShortcuts(): js.Promise[Shortcuts] = js.native
  def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection] = js.native
  def selectStory(kindOrId: String): Unit = js.native
  def selectStory(kindOrId: String, story: String): Unit = js.native
  def selectStory(kindOrId: String, story: String, obj: js.Any): Unit = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: S): js.Promise[S] = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: S, options: Options): js.Promise[S] = js.native
  def setAddonState[S](
    addonId: String,
    newStateOrMerger: typingsSlinky.atStorybookApi.distModulesAddonsMod.StateMerger[S]
  ): js.Promise[S] = js.native
  def setAddonState[S](
    addonId: String,
    newStateOrMerger: typingsSlinky.atStorybookApi.distModulesAddonsMod.StateMerger[S],
    options: Options
  ): js.Promise[S] = js.native
  def setOptions(options: js.Any): Unit = js.native
  def setQueryParams(input: QueryParams): Unit = js.native
  def setSelectedPanel(panelName: String): Unit = js.native
  def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection] = js.native
  def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts] = js.native
  def setStories(stories: StoriesRaw): Unit = js.native
  def toggleFullscreen(): Unit = js.native
  def toggleFullscreen(toggled: Boolean): Unit = js.native
  def toggleNav(): Unit = js.native
  def toggleNav(toggled: Boolean): Unit = js.native
  def togglePanel(): Unit = js.native
  def togglePanel(toggled: Boolean): Unit = js.native
  def togglePanelPosition(): Unit = js.native
  def togglePanelPosition(position: PanelPositions): Unit = js.native
  def toggleToolbar(): Unit = js.native
  def toggleToolbar(toggled: Boolean): Unit = js.native
  def versionUpdateAvailable(): Boolean = js.native
}

