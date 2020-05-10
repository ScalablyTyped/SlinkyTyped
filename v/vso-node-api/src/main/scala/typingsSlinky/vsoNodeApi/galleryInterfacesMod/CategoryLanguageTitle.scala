package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryLanguageTitle extends js.Object {
  /**
    * The language for which the title is applicable
    */
  var lang: String = js.native
  /**
    * The language culture id of the lang parameter
    */
  var lcid: Double = js.native
  /**
    * Actual title to be shown on the UI
    */
  var title: String = js.native
}

object CategoryLanguageTitle {
  @scala.inline
  def apply(lang: String, lcid: Double, title: String): CategoryLanguageTitle = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryLanguageTitle]
  }
  @scala.inline
  implicit class CategoryLanguageTitleOps[Self <: CategoryLanguageTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

