package typingsSlinky.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildIds extends js.Object {
  var childIds: js.Any = js.native
  var children: js.Any = js.native
  var id: js.Any = js.native
  var isComponent: js.Any = js.native
  var isExpanded: js.Any = js.native
  var isLeaf: js.Any = js.native
  var name: js.Any = js.native
  var onClick: js.Any = js.native
  var onKeyUp: js.Any = js.native
  var prefix: js.Any = js.native
}

object ChildIds {
  @scala.inline
  def apply(
    childIds: js.Any,
    children: js.Any,
    id: js.Any,
    isComponent: js.Any,
    isExpanded: js.Any,
    isLeaf: js.Any,
    name: js.Any,
    onClick: js.Any,
    onKeyUp: js.Any,
    prefix: js.Any
  ): ChildIds = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildIds]
  }
  @scala.inline
  implicit class ChildIdsOps[Self <: ChildIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpanded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeaf(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnKeyUp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

