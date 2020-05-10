package typingsSlinky.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JS2XML
  extends ChangingKeyNames
     with IgnoreOptions {
  var attributeNameFn: js.UndefOr[
    js.Function4[
      /* attributeName */ String, 
      /* attributeValue */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var attributeValueFn: js.UndefOr[
    js.Function4[
      /* attributeValue */ String, 
      /* attributeName */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var attributesFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var cdataFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var commentFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var doctypeFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var elementNameFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var fullTagEmptyElement: js.UndefOr[Boolean] = js.native
  var fullTagEmptyElementFn: js.UndefOr[
    js.Function2[/* currentElementName */ String, /* currentElementObj */ js.Object, Unit]
  ] = js.native
  var indentAttributes: js.UndefOr[Boolean] = js.native
  var indentCdata: js.UndefOr[Boolean] = js.native
  var indentInstruction: js.UndefOr[Boolean] = js.native
  var indentText: js.UndefOr[Boolean] = js.native
  var instructionFn: js.UndefOr[
    js.Function4[
      /* instructionValue */ String, 
      /* instructionName */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var instructionNameFn: js.UndefOr[
    js.Function4[
      /* instructionName */ String, 
      /* instructionValue */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
  var noQuotesForNativeAttributes: js.UndefOr[Boolean] = js.native
  var spaces: js.UndefOr[Double | String] = js.native
  var textFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.native
}

object JS2XML {
  @scala.inline
  def apply(): JS2XML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JS2XML]
  }
  @scala.inline
  implicit class JS2XMLOps[Self <: JS2XML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNameFn(
      value: (/* attributeName */ String, /* attributeValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNameFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAttributeNameFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNameFn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeValueFn(
      value: (/* attributeValue */ String, /* attributeName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValueFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAttributeValueFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValueFn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAttributesFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCdataFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCommentFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctypeFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDoctypeFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeFn")(js.undefined)
        ret
    }
    @scala.inline
    def withElementNameFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementNameFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutElementNameFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementNameFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFullTagEmptyElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTagEmptyElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTagEmptyElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTagEmptyElement")(js.undefined)
        ret
    }
    @scala.inline
    def withFullTagEmptyElementFn(value: (/* currentElementName */ String, /* currentElementObj */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTagEmptyElementFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFullTagEmptyElementFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTagEmptyElementFn")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentCdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentCdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentCdata")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentInstruction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentText")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionFn(
      value: (/* instructionValue */ String, /* instructionName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutInstructionFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionFn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionNameFn(
      value: (/* instructionName */ String, /* instructionValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionNameFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutInstructionNameFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionNameFn")(js.undefined)
        ret
    }
    @scala.inline
    def withNoQuotesForNativeAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noQuotesForNativeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoQuotesForNativeAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noQuotesForNativeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaces(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFn(
      value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTextFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFn")(js.undefined)
        ret
    }
  }
  
}

