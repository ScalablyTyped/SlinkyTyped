package typingsSlinky.wordpressViewport.anon

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedActions extends js.Object {
  def setIsMatching(values: Record[String, Boolean]): Unit = js.native
}

object TypeofimportedActions {
  @scala.inline
  def apply(setIsMatching: Record[String, Boolean] => Unit): TypeofimportedActions = {
    val __obj = js.Dynamic.literal(setIsMatching = js.Any.fromFunction1(setIsMatching))
    __obj.asInstanceOf[TypeofimportedActions]
  }
  @scala.inline
  implicit class TypeofimportedActionsOps[Self <: TypeofimportedActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetIsMatching(value: Record[String, Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsMatching")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

