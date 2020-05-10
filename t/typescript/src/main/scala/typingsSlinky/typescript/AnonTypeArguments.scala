package typingsSlinky.typescript

import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeArguments extends js.Object {
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

object AnonTypeArguments {
  @scala.inline
  def apply(): AnonTypeArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTypeArguments]
  }
  @scala.inline
  implicit class AnonTypeArgumentsOps[Self <: AnonTypeArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeArguments(value: NodeArray[TypeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(js.undefined)
        ret
    }
  }
  
}

