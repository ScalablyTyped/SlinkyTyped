package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenInfo extends js.Object {
  var leadingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.native
  var text: js.UndefOr[String] = js.native
  var trailingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.native
}

object ITokenInfo {
  @scala.inline
  def apply(): ITokenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenInfo]
  }
  @scala.inline
  implicit class ITokenInfoOps[Self <: ITokenInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeadingTrivia(value: js.Array[ISyntaxTrivia]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingTrivia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingTrivia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingTrivia")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingTrivia(value: js.Array[ISyntaxTrivia]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingTrivia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingTrivia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingTrivia")(js.undefined)
        ret
    }
  }
  
}

