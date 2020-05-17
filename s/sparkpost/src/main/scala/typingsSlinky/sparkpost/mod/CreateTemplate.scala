package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.anon.Emailrfc822
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplate extends js.Object {
  /** Content that will be used to construct a message  yes  For a full description, see the Content Attributes. Maximum length - 20 MBs */
  var content: CreateTemplateContent | Emailrfc822 = js.native
  /** Detailed description of the template  no  Maximum length - 1024 bytes */
  var description: js.UndefOr[String] = js.native
  /**
    * Short, unique, alphanumeric ID used to reference the template.
    * At a minimum, id or name is required upon creation.
    * It is auto generated if not provided.
    * After a template has been created, this property cannot be changed. Maximum length - 64 bytes
    *
    */
  var id: js.UndefOr[String] = js.native
  /** Editable display name  At a minimum, id or name is required upon creation.  The name does not have to be unique. Maximum length - 1024 bytes */
  var name: js.UndefOr[String] = js.native
  /** JSON object in which template options are defined  no  For a full description, see the Options Attributes. */
  var options: js.UndefOr[CreateTemplateOptions] = js.native
  /** Whether the template is published or is a draft version  no - defaults to false  A template cannot be changed from published to draft. */
  var published: js.UndefOr[Boolean] = js.native
}

object CreateTemplate {
  @scala.inline
  def apply(content: CreateTemplateContent | Emailrfc822): CreateTemplate = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplate]
  }
  @scala.inline
  implicit class CreateTemplateOps[Self <: CreateTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: CreateTemplateContent | Emailrfc822): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: CreateTemplateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.undefined)
        ret
    }
  }
  
}

