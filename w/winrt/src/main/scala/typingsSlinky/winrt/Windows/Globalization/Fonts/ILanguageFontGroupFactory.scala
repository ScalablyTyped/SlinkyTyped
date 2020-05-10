package typingsSlinky.winrt.Windows.Globalization.Fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageFontGroupFactory extends js.Object {
  def createLanguageFontGroup(languageTag: String): LanguageFontGroup = js.native
}

object ILanguageFontGroupFactory {
  @scala.inline
  def apply(createLanguageFontGroup: String => LanguageFontGroup): ILanguageFontGroupFactory = {
    val __obj = js.Dynamic.literal(createLanguageFontGroup = js.Any.fromFunction1(createLanguageFontGroup))
    __obj.asInstanceOf[ILanguageFontGroupFactory]
  }
  @scala.inline
  implicit class ILanguageFontGroupFactoryOps[Self <: ILanguageFontGroupFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateLanguageFontGroup(value: String => LanguageFontGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLanguageFontGroup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

