package typingsSlinky.vueRx.mod.vueTypesOptionsAugmentingMod

import typingsSlinky.std.Record
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueRx.mod.Observables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var domStreams: js.UndefOr[js.Array[String]] = js.native
  var observableMethods: js.UndefOr[js.Array[String] | (Record[String, String])] = js.native
  var subscriptions: js.UndefOr[Observables | (js.ThisFunction0[/* this */ V, Observables])] = js.native
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
    def withDomStreams(value: js.Array[String]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomStreams: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withObservableMethods(value: js.Array[String] | (Record[String, String])): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observableMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservableMethods: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observableMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: Observables | (js.ThisFunction0[/* this */ V, Observables])): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(js.undefined)
        ret
    }
  }
  
}

