package typingsSlinky.snabbdom.thunkMod

import typingsSlinky.snabbdom.attachtoMod.AttachData
import typingsSlinky.snabbdom.attributesMod.Attrs
import typingsSlinky.snabbdom.classMod.Classes
import typingsSlinky.snabbdom.datasetMod.Dataset
import typingsSlinky.snabbdom.eventlistenersMod.On
import typingsSlinky.snabbdom.heroMod.Hero
import typingsSlinky.snabbdom.hooksMod.Hooks
import typingsSlinky.snabbdom.propsMod.Props
import typingsSlinky.snabbdom.styleMod.VNodeStyle
import typingsSlinky.snabbdom.vnodeMod.Key
import typingsSlinky.snabbdom.vnodeMod.VNodeData
import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThunkData extends VNodeData {
  @JSName("args")
  var args_ThunkData: js.Array[_]
  @JSName("fn")
  def fn_MThunkData(): VNode_
}

object ThunkData {
  @scala.inline
  def apply(
    args: js.Array[_],
    fn: () => VNode_,
    attachData: AttachData = null,
    attrs: Attrs = null,
    `class`: Classes = null,
    dataset: Dataset = null,
    hero: Hero = null,
    hook: Hooks = null,
    key: Key = null,
    ns: String = null,
    on: On = null,
    props: Props = null,
    style: VNodeStyle = null
  ): ThunkData = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    if (attachData != null) __obj.updateDynamic("attachData")(attachData.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (hero != null) __obj.updateDynamic("hero")(hero.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThunkData]
  }
}

