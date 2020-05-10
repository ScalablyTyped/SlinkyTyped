package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerReflectionContainer[TChildren] extends js.Object {
  var children: js.Array[TChildren] = js.native
}

object ContainerReflectionContainer {
  @scala.inline
  def apply[TChildren](children: js.Array[TChildren]): ContainerReflectionContainer[TChildren] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerReflectionContainer[TChildren]]
  }
  @scala.inline
  implicit class ContainerReflectionContainerOps[Self[tchildren] <: ContainerReflectionContainer[tchildren], TChildren] (val x: Self[TChildren]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TChildren] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TChildren]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TChildren] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TChildren] with Other]
    @scala.inline
    def withChildren(value: js.Array[TChildren]): Self[TChildren] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

