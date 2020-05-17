package typingsSlinky.stardustUiReactComponentRef.anon

import typingsSlinky.propTypes.mod.ReactElementLike
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: Validator[ReactElementLike] = js.native
  var innerRef: Validator[Ref[_]] = js.native
}

object Children {
  @scala.inline
  def apply(children: Validator[ReactElementLike], innerRef: Validator[Ref[_]]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Validator[ReactElementLike]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRef(value: Validator[Ref[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

