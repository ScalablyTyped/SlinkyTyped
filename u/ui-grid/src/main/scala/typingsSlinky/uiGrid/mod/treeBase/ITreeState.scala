package typingsSlinky.uiGrid.mod.treeBase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeState extends js.Object {
  var expandedState: StringDictionary[String] = js.native
}

object ITreeState {
  @scala.inline
  def apply(expandedState: StringDictionary[String]): ITreeState = {
    val __obj = js.Dynamic.literal(expandedState = expandedState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeState]
  }
  @scala.inline
  implicit class ITreeStateOps[Self <: ITreeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandedState(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

