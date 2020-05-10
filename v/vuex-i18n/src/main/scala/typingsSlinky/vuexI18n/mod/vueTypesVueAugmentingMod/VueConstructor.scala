package typingsSlinky.vuexI18n.mod.vueTypesVueAugmentingMod

import typingsSlinky.vuexI18n.mod.Ii18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueConstructor[V /* <: Vue */] extends js.Object {
  var i18n: Ii18n = js.native
}

object VueConstructor {
  @scala.inline
  def apply[V](i18n: Ii18n): VueConstructor[V] = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueConstructor[V]]
  }
  @scala.inline
  implicit class VueConstructorOps[Self[v] <: VueConstructor[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withI18n(value: Ii18n): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

