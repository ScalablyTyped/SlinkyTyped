package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of HTML conversion settings. */
@js.native
trait HtmlSettings extends js.Object {
  var exclude_content: js.UndefOr[XPathPatterns] = js.native
  /** Array of HTML tag attributes to exclude. */
  var exclude_tag_attributes: js.UndefOr[js.Array[String]] = js.native
  /** Array of HTML tags that are excluded completely. */
  var exclude_tags_completely: js.UndefOr[js.Array[String]] = js.native
  /** Array of HTML tags which are excluded but still retain content. */
  var exclude_tags_keep_content: js.UndefOr[js.Array[String]] = js.native
  var keep_content: js.UndefOr[XPathPatterns] = js.native
  /** An array of HTML tag attributes to keep in the converted document. */
  var keep_tag_attributes: js.UndefOr[js.Array[String]] = js.native
}

object HtmlSettings {
  @scala.inline
  def apply(): HtmlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlSettings]
  }
  @scala.inline
  implicit class HtmlSettingsOps[Self <: HtmlSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude_content(value: XPathPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_content")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_tag_attributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_tag_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_tag_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_tag_attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_tags_completely(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_tags_completely")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_tags_completely: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_tags_completely")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_tags_keep_content(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_tags_keep_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_tags_keep_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_tags_keep_content")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_content(value: XPathPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_content")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_tag_attributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_tag_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_tag_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_tag_attributes")(js.undefined)
        ret
    }
  }
  
}

