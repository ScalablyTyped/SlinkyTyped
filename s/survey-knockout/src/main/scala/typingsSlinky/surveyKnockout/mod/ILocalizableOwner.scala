package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalizableOwner extends js.Object {
  def getLocale(): String = js.native
  def getMarkdownHtml(text: String): String = js.native
  def getProcessedText(text: String): String = js.native
}

object ILocalizableOwner {
  @scala.inline
  def apply(getLocale: () => String, getMarkdownHtml: String => String, getProcessedText: String => String): ILocalizableOwner = {
    val __obj = js.Dynamic.literal(getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText))
    __obj.asInstanceOf[ILocalizableOwner]
  }
  @scala.inline
  implicit class ILocalizableOwnerOps[Self <: ILocalizableOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLocale(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarkdownHtml(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkdownHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProcessedText(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProcessedText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

