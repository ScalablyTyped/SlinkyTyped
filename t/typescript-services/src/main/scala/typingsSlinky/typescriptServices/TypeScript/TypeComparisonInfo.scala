package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeComparisonInfo extends js.Object {
  var flags: TypeRelationshipFlags = js.native
  var indent: js.Any = js.native
  var message: String = js.native
  var onlyCaptureFirstError: Boolean = js.native
  var stringConstantVal: AST = js.native
  def addMessage(message: String): Unit = js.native
  /* private */ def indentString(): js.Any = js.native
}

object TypeComparisonInfo {
  @scala.inline
  def apply(
    addMessage: String => Unit,
    flags: TypeRelationshipFlags,
    indent: js.Any,
    indentString: () => js.Any,
    message: String,
    onlyCaptureFirstError: Boolean,
    stringConstantVal: AST
  ): TypeComparisonInfo = {
    val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1(addMessage), flags = flags.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], indentString = js.Any.fromFunction0(indentString), message = message.asInstanceOf[js.Any], onlyCaptureFirstError = onlyCaptureFirstError.asInstanceOf[js.Any], stringConstantVal = stringConstantVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeComparisonInfo]
  }
  @scala.inline
  implicit class TypeComparisonInfoOps[Self <: TypeComparisonInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMessage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlags(value: TypeRelationshipFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentString(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyCaptureFirstError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyCaptureFirstError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringConstantVal(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringConstantVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

