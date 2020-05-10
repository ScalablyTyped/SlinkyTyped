package typingsSlinky.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangingKeyNames extends js.Object {
  var attributesKey: js.UndefOr[String] = js.native
  var cdataKey: js.UndefOr[String] = js.native
  var commentKey: js.UndefOr[String] = js.native
  var declarationKey: js.UndefOr[String] = js.native
  var doctypeKey: js.UndefOr[String] = js.native
  var elementsKey: js.UndefOr[String] = js.native
  var instructionKey: js.UndefOr[String] = js.native
  var nameKey: js.UndefOr[String] = js.native
  var parentKey: js.UndefOr[String] = js.native
  var textKey: js.UndefOr[String] = js.native
  var typeKey: js.UndefOr[String] = js.native
}

object ChangingKeyNames {
  @scala.inline
  def apply(): ChangingKeyNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangingKeyNames]
  }
  @scala.inline
  implicit class ChangingKeyNamesOps[Self <: ChangingKeyNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributesKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclarationKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctypeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctypeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withElementsKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNameKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameKey")(js.undefined)
        ret
    }
    @scala.inline
    def withParentKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTextKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeKey")(js.undefined)
        ret
    }
  }
  
}

