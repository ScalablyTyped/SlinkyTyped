package typingsSlinky.storybookUi.anon

import typingsSlinky.propTypes.mod.ReactElementLike
import typingsSlinky.propTypes.mod.ReactNodeArray
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var childIds: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray] = js.native
  var id: Validator[String] = js.native
  var isExpanded: Requireable[Boolean] = js.native
  var isLeaf: Validator[Boolean] = js.native
  var name: Validator[String] = js.native
  var onClick: Validator[js.Function1[/* repeated */ _, _]] = js.native
  var onKeyUp: Validator[js.Function1[/* repeated */ _, _]] = js.native
  var prefix: Validator[String] = js.native
}

object Children {
  @scala.inline
  def apply(
    childIds: Requireable[js.Array[js.UndefOr[String | Null]]],
    children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    id: Validator[String],
    isExpanded: Requireable[Boolean],
    isLeaf: Validator[Boolean],
    name: Validator[String],
    onClick: Validator[js.Function1[/* repeated */ _, _]],
    onKeyUp: Validator[js.Function1[/* repeated */ _, _]],
    prefix: Validator[String]
  ): Children = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildIds(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpanded(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeaf(value: Validator[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: Validator[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnKeyUp(value: Validator[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

