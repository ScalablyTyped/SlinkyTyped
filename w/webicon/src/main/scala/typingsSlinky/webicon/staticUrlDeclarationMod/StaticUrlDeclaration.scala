package typingsSlinky.webicon.staticUrlDeclarationMod

import typingsSlinky.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticUrlDeclaration extends UrlDeclarationBase {
  @JSName("url")
  var url_StaticUrlDeclaration: js.UndefOr[String] = js.native
}

object StaticUrlDeclaration {
  @scala.inline
  def apply(): StaticUrlDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticUrlDeclaration]
  }
  @scala.inline
  implicit class StaticUrlDeclarationOps[Self <: StaticUrlDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

