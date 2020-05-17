package typingsSlinky.typesafeActions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootAction extends js.Object {
  var RootAction: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = js.native
}

object RootAction {
  @scala.inline
  def apply(RootAction: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): RootAction = {
    val __obj = js.Dynamic.literal(RootAction = RootAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootAction]
  }
  @scala.inline
  implicit class RootActionOps[Self <: RootAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootAction(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

