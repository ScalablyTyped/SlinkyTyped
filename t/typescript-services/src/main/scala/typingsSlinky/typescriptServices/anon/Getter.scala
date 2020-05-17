package typingsSlinky.typescriptServices.anon

import typingsSlinky.typescriptServices.TypeScript.GetAccessor
import typingsSlinky.typescriptServices.TypeScript.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Getter extends js.Object {
  var getter: GetAccessor = js.native
  var setter: SetAccessor = js.native
}

object Getter {
  @scala.inline
  def apply(getter: GetAccessor, setter: SetAccessor): Getter = {
    val __obj = js.Dynamic.literal(getter = getter.asInstanceOf[js.Any], setter = setter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Getter]
  }
  @scala.inline
  implicit class GetterOps[Self <: Getter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetter(value: GetAccessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetter(value: SetAccessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

