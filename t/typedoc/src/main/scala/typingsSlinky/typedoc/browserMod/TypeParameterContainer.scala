package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterContainer extends js.Object {
  var typeParameters: js.Array[TypeContainer] = js.native
}

object TypeParameterContainer {
  @scala.inline
  def apply(typeParameters: js.Array[TypeContainer]): TypeParameterContainer = {
    val __obj = js.Dynamic.literal(typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterContainer]
  }
  @scala.inline
  implicit class TypeParameterContainerOps[Self <: TypeParameterContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeParameters(value: js.Array[TypeContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

