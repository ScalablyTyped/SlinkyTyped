package typingsSlinky.wordpressEditor.postTaxonomiesMod.PostTaxonomies

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressApiFetch.mod.Schema.Taxonomy
import typingsSlinky.wordpressEditor.wordpressEditorStrings.edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var taxonomyWrapper: js.UndefOr[
    js.Function2[/* content */ TagMod[Any], /* taxonomy */ Taxonomy[edit], ReactElement]
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(taxonomyWrapper: (/* content */ TagMod[Any], /* taxonomy */ Taxonomy[edit]) => ReactElement = null): Props = {
    val __obj = js.Dynamic.literal()
    if (taxonomyWrapper != null) __obj.updateDynamic("taxonomyWrapper")(js.Any.fromFunction2(taxonomyWrapper))
    __obj.asInstanceOf[Props]
  }
}

