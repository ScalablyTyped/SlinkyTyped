package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextProcessor extends js.Object {
  def processText(text: String, returnDisplayValue: Boolean): String = js.native
  def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): js.Any = js.native
}

object ITextProcessor {
  @scala.inline
  def apply(processText: (String, Boolean) => String, processTextEx: (String, Boolean, Boolean) => js.Any): ITextProcessor = {
    val __obj = js.Dynamic.literal(processText = js.Any.fromFunction2(processText), processTextEx = js.Any.fromFunction3(processTextEx))
    __obj.asInstanceOf[ITextProcessor]
  }
  @scala.inline
  implicit class ITextProcessorOps[Self <: ITextProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessText(value: (String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProcessTextEx(value: (String, Boolean, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processTextEx")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

