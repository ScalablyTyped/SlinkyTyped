package typingsSlinky.testingLibraryVue.mod

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueRouter.routerMod.RouteConfig
import typingsSlinky.vuex.mod.StoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any, 'store' | 'props'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any[P]} */ @js.native
trait RenderOptions[V /* <: Vue */, S] extends js.Object {
  var props: js.UndefOr[js.Object] = js.native
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.native
  var store: js.UndefOr[StoreOptions[S]] = js.native
}

object RenderOptions {
  @scala.inline
  def apply[V, S](): RenderOptions[V, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions[V, S]]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self[v, s] <: RenderOptions[v, s], V, S] (val x: Self[V, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, S]) with Other]
    @scala.inline
    def withProps(value: js.Object): Self[V, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[V, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[RouteConfig]): Self[V, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self[V, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: StoreOptions[S]): Self[V, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self[V, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

