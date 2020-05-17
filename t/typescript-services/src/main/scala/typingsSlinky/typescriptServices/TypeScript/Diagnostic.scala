package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diagnostic extends Location {
  var _additionalLocations: js.Any = js.native
  var _arguments: js.Any = js.native
  var _diagnosticKey: js.Any = js.native
  def additionalLocations(): js.Array[Location] = js.native
  def arguments(): js.Array[_] = js.native
  def diagnosticKey(): String = js.native
  def info(): DiagnosticInfo = js.native
  def message(): String = js.native
  def text(): String = js.native
  def toJSON(key: js.Any): js.Any = js.native
}

object Diagnostic {
  @scala.inline
  def apply(
    _additionalLocations: js.Any,
    _arguments: js.Any,
    _diagnosticKey: js.Any,
    _fileName: js.Any,
    _length: js.Any,
    _lineMap: js.Any,
    _start: js.Any,
    additionalLocations: () => js.Array[Location],
    arguments: () => js.Array[_],
    character: () => Double,
    diagnosticKey: () => String,
    fileName: () => String,
    info: () => DiagnosticInfo,
    length: () => Double,
    line: () => Double,
    lineMap: () => LineMap,
    message: () => String,
    start: () => Double,
    text: () => String,
    toJSON: js.Any => js.Any
  ): Diagnostic = {
    val __obj = js.Dynamic.literal(_additionalLocations = _additionalLocations.asInstanceOf[js.Any], _arguments = _arguments.asInstanceOf[js.Any], _diagnosticKey = _diagnosticKey.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], additionalLocations = js.Any.fromFunction0(additionalLocations), arguments = js.Any.fromFunction0(arguments), character = js.Any.fromFunction0(character), diagnosticKey = js.Any.fromFunction0(diagnosticKey), fileName = js.Any.fromFunction0(fileName), info = js.Any.fromFunction0(info), length = js.Any.fromFunction0(length), line = js.Any.fromFunction0(line), lineMap = js.Any.fromFunction0(lineMap), message = js.Any.fromFunction0(message), start = js.Any.fromFunction0(start), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[Diagnostic]
  }
  @scala.inline
  implicit class DiagnosticOps[Self <: Diagnostic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_additionalLocations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_additionalLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_arguments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_diagnosticKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_diagnosticKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalLocations(value: () => js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalLocations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withArguments(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDiagnosticKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInfo(value: () => DiagnosticInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

