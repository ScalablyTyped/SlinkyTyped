package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormalTypeParameterInfo extends js.Object {
  var docComment: String = js.native
  var limChar: Double = js.native
  var minChar: Double = js.native
  var name: String = js.native
}

object FormalTypeParameterInfo {
  @scala.inline
  def apply(docComment: String, limChar: Double, minChar: Double, name: String): FormalTypeParameterInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalTypeParameterInfo]
  }
  @scala.inline
  implicit class FormalTypeParameterInfoOps[Self <: FormalTypeParameterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

