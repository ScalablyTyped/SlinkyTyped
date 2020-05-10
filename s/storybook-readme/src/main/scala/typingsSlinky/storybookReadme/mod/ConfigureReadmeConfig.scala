package typingsSlinky.storybookReadme.mod

import slinky.core.TagMod
import typingsSlinky.storybookReadme.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureReadmeConfig extends js.Object {
  var DocPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, TagMod[Any]]] = js.native
  var FooterPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, TagMod[Any]]] = js.native
  var HeaderPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, TagMod[Any]]] = js.native
  var StoryPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, TagMod[Any]]] = js.native
  var footer: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
}

object ConfigureReadmeConfig {
  @scala.inline
  def apply(): ConfigureReadmeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureReadmeConfig]
  }
  @scala.inline
  implicit class ConfigureReadmeConfigOps[Self <: ConfigureReadmeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocPreview(value: /* props */ AnonChildren => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDocPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterPreview(value: /* props */ AnonChildren => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFooterPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderPreview(value: /* props */ AnonChildren => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withStoryPreview(value: /* props */ AnonChildren => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoryPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStoryPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoryPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
  }
  
}

