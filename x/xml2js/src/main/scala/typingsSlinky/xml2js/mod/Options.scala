package typingsSlinky.xml2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, _]]] = js.native
  var attrValueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, _]]] = js.native
  var attrkey: js.UndefOr[String] = js.native
  var charkey: js.UndefOr[String] = js.native
  var charsAsChildren: js.UndefOr[Boolean] = js.native
  var childkey: js.UndefOr[String] = js.native
  var emptyTag: js.UndefOr[js.Any] = js.native
  var explicitArray: js.UndefOr[Boolean] = js.native
  var explicitCharkey: js.UndefOr[Boolean] = js.native
  var explicitChildren: js.UndefOr[Boolean] = js.native
  var explicitRoot: js.UndefOr[Boolean] = js.native
  var ignoreAttrs: js.UndefOr[Boolean] = js.native
  var includeWhiteChars: js.UndefOr[Boolean] = js.native
  var mergeAttrs: js.UndefOr[Boolean] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var normalizeTags: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, _]]] = js.native
  var trim: js.UndefOr[Boolean] = js.native
  var validator: js.UndefOr[js.Function] = js.native
  var valueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, _]]] = js.native
  var xmlns: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrNameProcessors(value: js.Array[js.Function1[/* name */ String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrNameProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrNameProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrNameProcessors")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrValueProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrValueProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrValueProcessors")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrkey")(js.undefined)
        ret
    }
    @scala.inline
    def withCharkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charkey")(js.undefined)
        ret
    }
    @scala.inline
    def withCharsAsChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsAsChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharsAsChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsAsChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withChildkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childkey")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTag")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitArray")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitCharkey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitCharkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitCharkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitCharkey")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAttrs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeWhiteChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWhiteChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeWhiteChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWhiteChars")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeAttrs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeTags")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTagNameProcessors(value: js.Array[js.Function1[/* name */ String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNameProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagNameProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNameProcessors")(js.undefined)
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
    @scala.inline
    def withValidator(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
    @scala.inline
    def withValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProcessors")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(js.undefined)
        ret
    }
  }
  
}

