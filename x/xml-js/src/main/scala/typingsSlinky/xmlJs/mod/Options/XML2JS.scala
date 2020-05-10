package typingsSlinky.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XML2JS
  extends ChangingKeyNames
     with IgnoreOptions {
  var addParent: js.UndefOr[Boolean] = js.native
  var alwaysArray: js.UndefOr[Boolean | js.Array[String]] = js.native
  var alwaysChildren: js.UndefOr[Boolean] = js.native
  var attributeNameFn: js.UndefOr[
    js.Function3[
      /* attributeName */ String, 
      /* attributeValue */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var attributeValueFn: js.UndefOr[
    js.Function3[
      /* attributeValue */ String, 
      /* attributeName */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var attributesFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ String, Unit]] = js.native
  var captureSpacesBetweenElements: js.UndefOr[Boolean] = js.native
  var cdataFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var commentFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var doctypeFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var elementNameFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var instructionFn: js.UndefOr[
    js.Function3[
      /* instructionValue */ String, 
      /* instructionName */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var instructionHasAttributes: js.UndefOr[Boolean] = js.native
  var instructionNameFn: js.UndefOr[
    js.Function3[
      /* instructionName */ String, 
      /* instructionValue */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.native
  var nativeType: js.UndefOr[Boolean] = js.native
  var sanitize: js.UndefOr[Boolean] = js.native
  var textFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object XML2JS {
  @scala.inline
  def apply(): XML2JS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XML2JS]
  }
  @scala.inline
  implicit class XML2JSOps[Self <: XML2JS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addParent")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysArray(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysArray")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeNameFn(
      value: (/* attributeName */ String, /* attributeValue */ String, /* parentElement */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNameFn")(js.Any.fromFunction3(value))
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
      value: (/* attributeValue */ String, /* attributeName */ String, /* parentElement */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValueFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAttributeValueFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValueFn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesFn(value: (/* value */ String, /* parentElement */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAttributesFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureSpacesBetweenElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureSpacesBetweenElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureSpacesBetweenElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureSpacesBetweenElements")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCdataFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentFn")(js.Any.fromFunction2(value))
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
    def withDoctypeFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoctypeFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeFn")(js.undefined)
        ret
    }
    @scala.inline
    def withElementNameFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementNameFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutElementNameFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementNameFn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionFn(
      value: (/* instructionValue */ String, /* instructionName */ String, /* parentElement */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInstructionFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionFn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionHasAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionHasAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructionHasAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionHasAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionNameFn(
      value: (/* instructionName */ String, /* instructionValue */ String, /* parentElement */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionNameFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInstructionNameFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionNameFn")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeType")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTextFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

