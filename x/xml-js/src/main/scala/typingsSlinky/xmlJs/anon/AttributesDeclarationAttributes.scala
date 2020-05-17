package typingsSlinky.xmlJs.anon

import typingsSlinky.xmlJs.mod.DeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributesDeclarationAttributes extends js.Object {
  var attributes: js.UndefOr[DeclarationAttributes] = js.native
}

object AttributesDeclarationAttributes {
  @scala.inline
  def apply(): AttributesDeclarationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributesDeclarationAttributes]
  }
  @scala.inline
  implicit class AttributesDeclarationAttributesOps[Self <: AttributesDeclarationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: DeclarationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

