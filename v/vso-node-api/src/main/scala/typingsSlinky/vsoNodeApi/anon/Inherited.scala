package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inherited extends js.Object {
  var custom: scala.Double = js.native
  var inherited: scala.Double = js.native
  var system: scala.Double = js.native
}

object Inherited {
  @scala.inline
  def apply(custom: scala.Double, inherited: scala.Double, system: scala.Double): Inherited = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherited]
  }
  @scala.inline
  implicit class InheritedOps[Self <: Inherited] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherited(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

