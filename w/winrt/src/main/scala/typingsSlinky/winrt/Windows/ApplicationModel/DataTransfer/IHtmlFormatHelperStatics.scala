package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHtmlFormatHelperStatics extends js.Object {
  def createHtmlFormat(htmlFragment: String): String = js.native
  def getStaticFragment(htmlFormat: String): String = js.native
}

object IHtmlFormatHelperStatics {
  @scala.inline
  def apply(createHtmlFormat: String => String, getStaticFragment: String => String): IHtmlFormatHelperStatics = {
    val __obj = js.Dynamic.literal(createHtmlFormat = js.Any.fromFunction1(createHtmlFormat), getStaticFragment = js.Any.fromFunction1(getStaticFragment))
    __obj.asInstanceOf[IHtmlFormatHelperStatics]
  }
  @scala.inline
  implicit class IHtmlFormatHelperStaticsOps[Self <: IHtmlFormatHelperStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateHtmlFormat(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHtmlFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStaticFragment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStaticFragment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

