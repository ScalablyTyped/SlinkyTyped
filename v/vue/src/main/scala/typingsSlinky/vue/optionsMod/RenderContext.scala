package typingsSlinky.vue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.vnodeMod.NormalizedScopedSlot
import typingsSlinky.vue.vnodeMod.VNode
import typingsSlinky.vue.vnodeMod.VNodeData
import typingsSlinky.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContext[Props] extends js.Object {
  var children: js.Array[VNode] = js.native
  var data: VNodeData = js.native
  var injections: js.Any = js.native
  var listeners: StringDictionary[js.Function | js.Array[js.Function]] = js.native
  var parent: Vue = js.native
  var props: Props = js.native
  var scopedSlots: StringDictionary[NormalizedScopedSlot] = js.native
  def slots(): js.Any = js.native
}

object RenderContext {
  @scala.inline
  def apply[Props](
    children: js.Array[VNode],
    data: VNodeData,
    injections: js.Any,
    listeners: StringDictionary[js.Function | js.Array[js.Function]],
    parent: Vue,
    props: Props,
    scopedSlots: StringDictionary[NormalizedScopedSlot],
    slots: () => js.Any
  ): RenderContext[Props] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], injections = injections.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scopedSlots = scopedSlots.asInstanceOf[js.Any], slots = js.Any.fromFunction0(slots))
    __obj.asInstanceOf[RenderContext[Props]]
  }
  @scala.inline
  implicit class RenderContextOps[Self[props] <: RenderContext[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withChildren(value: js.Array[VNode]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: VNodeData): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInjections(value: js.Any): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListeners(value: StringDictionary[js.Function | js.Array[js.Function]]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Vue): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: Props): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopedSlots(value: StringDictionary[NormalizedScopedSlot]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlots(value: () => js.Any): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

