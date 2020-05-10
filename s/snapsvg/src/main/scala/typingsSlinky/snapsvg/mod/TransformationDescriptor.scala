package typingsSlinky.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformationDescriptor extends js.Object {
  var diffMatrix: Matrix_ = js.native
  var global: String = js.native
  var globalMatrix: Matrix_ = js.native
  var local: String = js.native
  var localMatrix: Matrix_ = js.native
  var string: String = js.native
}

object TransformationDescriptor {
  @scala.inline
  def apply(
    diffMatrix: Matrix_,
    global: String,
    globalMatrix: Matrix_,
    local: String,
    localMatrix: Matrix_,
    string: String
  ): TransformationDescriptor = {
    val __obj = js.Dynamic.literal(diffMatrix = diffMatrix.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], globalMatrix = globalMatrix.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], localMatrix = localMatrix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationDescriptor]
  }
  @scala.inline
  implicit class TransformationDescriptorOps[Self <: TransformationDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiffMatrix(value: Matrix_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalMatrix(value: Matrix_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalMatrix(value: Matrix_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

