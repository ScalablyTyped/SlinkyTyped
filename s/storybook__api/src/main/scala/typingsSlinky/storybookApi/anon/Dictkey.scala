package typingsSlinky.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: js.RegExp = js.native
  var hierarchySeparator: js.RegExp = js.native
  var showRoots: js.UndefOr[Boolean] = js.native
}

object Dictkey {
  @scala.inline
  def apply(hierarchyRootSeparator: js.RegExp, hierarchySeparator: js.RegExp): Dictkey = {
    val __obj = js.Dynamic.literal(hierarchyRootSeparator = hierarchyRootSeparator.asInstanceOf[js.Any], hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHierarchyRootSeparator(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyRootSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchySeparator(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchySeparator")(value.asInstanceOf[js.Any])
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
  }
  
}

