package typingsSlinky.storybookAddonKnobs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var boolean: FunctionComponentBooleanT = js.native
  var button: FunctionComponentButtonTy = js.native
  var files: FunctionComponentFilesTyp = js.native
  var options: FunctionComponentOptionsT = js.native
  var select: FunctionComponentSelectTy = js.native
}

object Array {
  @scala.inline
  def apply(
    boolean: FunctionComponentBooleanT,
    button: FunctionComponentButtonTy,
    files: FunctionComponentFilesTyp,
    options: FunctionComponentOptionsT,
    select: FunctionComponentSelectTy
  ): Array = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: FunctionComponentBooleanT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: FunctionComponentButtonTy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: FunctionComponentFilesTyp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: FunctionComponentOptionsT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: FunctionComponentSelectTy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

