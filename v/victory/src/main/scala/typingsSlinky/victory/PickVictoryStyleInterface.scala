package typingsSlinky.victory

import typingsSlinky.victory.mod.VictoryStyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<victory.victory.VictoryStyleInterface, 'parent'> */
@js.native
trait PickVictoryStyleInterface extends js.Object {
  var parent: js.UndefOr[VictoryStyleObject] = js.native
}

object PickVictoryStyleInterface {
  @scala.inline
  def apply(): PickVictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickVictoryStyleInterface]
  }
  @scala.inline
  implicit class PickVictoryStyleInterfaceOps[Self <: PickVictoryStyleInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

