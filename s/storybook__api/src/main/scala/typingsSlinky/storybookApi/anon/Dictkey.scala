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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHierarchyRootSeparator(value: js.RegExp): Self = this.set("hierarchyRootSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchySeparator(value: js.RegExp): Self = this.set("hierarchySeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRoots(value: Boolean): Self = this.set("showRoots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoots: Self = this.set("showRoots", js.undefined)
  }
  
}

