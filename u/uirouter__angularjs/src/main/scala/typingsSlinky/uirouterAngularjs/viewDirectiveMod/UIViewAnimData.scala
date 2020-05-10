package typingsSlinky.uirouterAngularjs.viewDirectiveMod

import typingsSlinky.uirouterAngularjs.AnonResolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIViewAnimData extends js.Object {
  @JSName("$animEnter")
  var $animEnter: js.Promise[_] = js.native
  @JSName("$animLeave")
  var $animLeave: js.Promise[_] = js.native
  @JSName("$$animLeave")
  var DollarDollaranimLeave: AnonResolve = js.native
}

object UIViewAnimData {
  @scala.inline
  def apply($animEnter: js.Promise[_], $animLeave: js.Promise[_], DollarDollaranimLeave: AnonResolve): UIViewAnimData = {
    val __obj = js.Dynamic.literal($animEnter = $animEnter.asInstanceOf[js.Any], $animLeave = $animLeave.asInstanceOf[js.Any])
    __obj.updateDynamic("$$animLeave")(DollarDollaranimLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewAnimData]
  }
  @scala.inline
  implicit class UIViewAnimDataOps[Self <: UIViewAnimData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$animEnter(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$animEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$animLeave(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$animLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDollarDollaranimLeave(value: AnonResolve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$animLeave")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

