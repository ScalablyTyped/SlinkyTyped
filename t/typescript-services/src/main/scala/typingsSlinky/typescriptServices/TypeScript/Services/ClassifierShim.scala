package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierShim extends ShimBase {
  var classifier: Classifier = js.native
  var host: IClassifierHost = js.native
  def getClassificationsForLine(text: String, lexState: EndOfLineState): String = js.native
}

object ClassifierShim {
  @scala.inline
  def apply(
    classifier: Classifier,
    dispose: js.Any => Unit,
    factory: js.Any,
    getClassificationsForLine: (String, EndOfLineState) => String,
    host: IClassifierHost
  ): ClassifierShim = {
    val __obj = js.Dynamic.literal(classifier = classifier.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), factory = factory.asInstanceOf[js.Any], getClassificationsForLine = js.Any.fromFunction2(getClassificationsForLine), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierShim]
  }
  @scala.inline
  implicit class ClassifierShimOps[Self <: ClassifierShim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifier(value: Classifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClassificationsForLine(value: (String, EndOfLineState) => String): Self = {
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
  }
  
}

