package typingsSlinky.vueResource.optionsMod

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueResource.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var http: js.UndefOr[
    Dictkey with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any)
  ] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[V](): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[V]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self[v] <: ComponentOptions[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withHttp(
      value: Dictkey with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any)
    ): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
  }
  
}

