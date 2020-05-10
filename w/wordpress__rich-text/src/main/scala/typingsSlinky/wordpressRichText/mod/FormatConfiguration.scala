package typingsSlinky.wordpressRichText.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatConfiguration extends js.Object {
  /**
    * Maps react prop name to html attribute name.
    *
    * { className: 'class' } => <tag class={<className attr here>}></tag>
    */
  var attributes: js.UndefOr[Record[String, String]] = js.native
  var className: String | Null = js.native
  var edit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any = js.native
  var keywords: js.UndefOr[
    js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])
  ] = js.native
  var `object`: js.UndefOr[Boolean] = js.native
  var tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String = js.native
  var title: String = js.native
}

object FormatConfiguration {
  @scala.inline
  def apply(
    edit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any,
    tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String,
    title: String
  ): FormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatConfiguration]
  }
  @scala.inline
  implicit class FormatConfigurationOps[Self <: FormatConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagName(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: Record[String, String]): Self = {
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
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(null)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
  }
  
}

