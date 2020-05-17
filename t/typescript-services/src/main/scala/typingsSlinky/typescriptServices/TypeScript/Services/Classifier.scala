package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classifier extends js.Object {
  var characterWindow: js.Any = js.native
  var diagnostics: js.Any = js.native
  var host: IClassifierHost = js.native
  var scanner: js.Any = js.native
  /* private */ def addResult(text: js.Any, offset: js.Any, result: js.Any, length: js.Any, kind: js.Any): js.Any = js.native
  /* private */ def classFromKind(kind: js.Any): js.Any = js.native
  def getClassificationsForLine(text: String, lexState: EndOfLineState): ClassificationResult = js.native
  /* private */ def processToken(text: js.Any, offset: js.Any, token: js.Any, result: js.Any): js.Any = js.native
  /* private */ def processTriviaList(text: js.Any, offset: js.Any, triviaList: js.Any, result: js.Any): js.Any = js.native
}

object Classifier {
  @scala.inline
  def apply(
    addResult: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    characterWindow: js.Any,
    classFromKind: js.Any => js.Any,
    diagnostics: js.Any,
    getClassificationsForLine: (String, EndOfLineState) => ClassificationResult,
    host: IClassifierHost,
    processToken: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    processTriviaList: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    scanner: js.Any
  ): Classifier = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction5(addResult), characterWindow = characterWindow.asInstanceOf[js.Any], classFromKind = js.Any.fromFunction1(classFromKind), diagnostics = diagnostics.asInstanceOf[js.Any], getClassificationsForLine = js.Any.fromFunction2(getClassificationsForLine), host = host.asInstanceOf[js.Any], processToken = js.Any.fromFunction4(processToken), processTriviaList = js.Any.fromFunction4(processTriviaList), scanner = scanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
  @scala.inline
  implicit class ClassifierOps[Self <: Classifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResult(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResult")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCharacterWindow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassFromKind(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classFromKind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiagnostics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClassificationsForLine(value: (String, EndOfLineState) => ClassificationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassificationsForLine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHost(value: IClassifierHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessToken(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processToken")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withProcessTriviaList(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processTriviaList")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withScanner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

