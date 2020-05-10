package typingsSlinky.storybookApi.shortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shortcuts extends js.Object {
  var aboutPage: KeyCollection = js.native
  var collapseAll: KeyCollection = js.native
  var escape: KeyCollection = js.native
  var expandAll: KeyCollection = js.native
  var focusIframe: KeyCollection = js.native
  var focusNav: KeyCollection = js.native
  var focusPanel: KeyCollection = js.native
  var fullScreen: KeyCollection = js.native
  var nextComponent: KeyCollection = js.native
  var nextStory: KeyCollection = js.native
  var panelPosition: KeyCollection = js.native
  var prevComponent: KeyCollection = js.native
  var prevStory: KeyCollection = js.native
  var search: KeyCollection = js.native
  var shortcutsPage: KeyCollection = js.native
  var toggleNav: KeyCollection = js.native
  var togglePanel: KeyCollection = js.native
  var toolbar: KeyCollection = js.native
}

object Shortcuts {
  @scala.inline
  def apply(
    aboutPage: KeyCollection,
    collapseAll: KeyCollection,
    escape: KeyCollection,
    expandAll: KeyCollection,
    focusIframe: KeyCollection,
    focusNav: KeyCollection,
    focusPanel: KeyCollection,
    fullScreen: KeyCollection,
    nextComponent: KeyCollection,
    nextStory: KeyCollection,
    panelPosition: KeyCollection,
    prevComponent: KeyCollection,
    prevStory: KeyCollection,
    search: KeyCollection,
    shortcutsPage: KeyCollection,
    toggleNav: KeyCollection,
    togglePanel: KeyCollection,
    toolbar: KeyCollection
  ): Shortcuts = {
    val __obj = js.Dynamic.literal(aboutPage = aboutPage.asInstanceOf[js.Any], collapseAll = collapseAll.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], expandAll = expandAll.asInstanceOf[js.Any], focusIframe = focusIframe.asInstanceOf[js.Any], focusNav = focusNav.asInstanceOf[js.Any], focusPanel = focusPanel.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], nextComponent = nextComponent.asInstanceOf[js.Any], nextStory = nextStory.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], prevComponent = prevComponent.asInstanceOf[js.Any], prevStory = prevStory.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], shortcutsPage = shortcutsPage.asInstanceOf[js.Any], toggleNav = toggleNav.asInstanceOf[js.Any], togglePanel = togglePanel.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcuts]
  }
  @scala.inline
  implicit class ShortcutsOps[Self <: Shortcuts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboutPage(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboutPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseAll(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscape(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandAll(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusIframe(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusNav(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusPanel(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullScreen(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextComponent(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextStory(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextStory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanelPosition(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevComponent(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevStory(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevStory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcutsPage(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutsPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleNav(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTogglePanel(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: KeyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

