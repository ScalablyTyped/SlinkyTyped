package typingsSlinky.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import typingsSlinky.storybookAddons.AnonBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsParameter
  extends Object
     with /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: js.UndefOr[String] = js.native
  var hierarchySeparator: js.UndefOr[js.RegExp] = js.native
  var showRoots: js.UndefOr[Boolean] = js.native
  var storySort: js.UndefOr[js.Any] = js.native
  var theme: js.UndefOr[AnonBase] = js.native
}

object OptionsParameter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): OptionsParameter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[OptionsParameter]
  }
  @scala.inline
  implicit class OptionsParameterOps[Self <: OptionsParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHierarchyRootSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyRootSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchyRootSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyRootSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchySeparator(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchySeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchySeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoots")(js.undefined)
        ret
    }
    @scala.inline
    def withStorySort(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storySort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorySort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storySort")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: AnonBase): Self = {
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
  }
  
}

