package typingsSlinky.storybookReadme.mod

import slinky.core.TagMod
import typingsSlinky.storybookReadme.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureReadmeConfig extends js.Object {
  var DocPreview: js.UndefOr[js.Function1[/* props */ Children, TagMod[Any]]] = js.undefined
  var FooterPreview: js.UndefOr[js.Function1[/* props */ Children, TagMod[Any]]] = js.undefined
  var HeaderPreview: js.UndefOr[js.Function1[/* props */ Children, TagMod[Any]]] = js.undefined
  var StoryPreview: js.UndefOr[js.Function1[/* props */ Children, TagMod[Any]]] = js.undefined
  var footer: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
}

object ConfigureReadmeConfig {
  @scala.inline
  def apply(
    DocPreview: /* props */ Children => TagMod[Any] = null,
    FooterPreview: /* props */ Children => TagMod[Any] = null,
    HeaderPreview: /* props */ Children => TagMod[Any] = null,
    StoryPreview: /* props */ Children => TagMod[Any] = null,
    footer: String = null,
    header: String = null
  ): ConfigureReadmeConfig = {
    val __obj = js.Dynamic.literal()
    if (DocPreview != null) __obj.updateDynamic("DocPreview")(js.Any.fromFunction1(DocPreview))
    if (FooterPreview != null) __obj.updateDynamic("FooterPreview")(js.Any.fromFunction1(FooterPreview))
    if (HeaderPreview != null) __obj.updateDynamic("HeaderPreview")(js.Any.fromFunction1(HeaderPreview))
    if (StoryPreview != null) __obj.updateDynamic("StoryPreview")(js.Any.fromFunction1(StoryPreview))
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureReadmeConfig]
  }
}

