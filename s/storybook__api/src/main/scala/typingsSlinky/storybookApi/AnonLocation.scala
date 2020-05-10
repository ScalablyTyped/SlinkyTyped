package typingsSlinky.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.WindowLocation
import typingsSlinky.storybookApi.storybookApiStrings.info
import typingsSlinky.storybookApi.storybookApiStrings.settings
import typingsSlinky.storybookApi.storybookApiStrings.story
import typingsSlinky.storybookApi.urlMod.Additions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocation extends js.Object {
  var customQueryParams: StringDictionary[js.Any] = js.native
  var layout: Additions = js.native
  var location: WindowLocation[LocationState] = js.native
  var path: String = js.native
  var selectedPanel: js.Any = js.native
  var storyId: String = js.native
  var viewMode: story | info | settings = js.native
}

object AnonLocation {
  @scala.inline
  def apply(
    customQueryParams: StringDictionary[js.Any],
    layout: Additions,
    location: WindowLocation[LocationState],
    path: String,
    selectedPanel: js.Any,
    storyId: String,
    viewMode: story | info | settings
  ): AnonLocation = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
  @scala.inline
  implicit class AnonLocationOps[Self <: AnonLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomQueryParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: Additions): Self = {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedPanel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewMode(value: story | info | settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

