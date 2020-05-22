package typingsSlinky.wordpressBlocks.categoriesMod

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var icon: js.UndefOr[ReactElement | Icon | Null] = js.undefined
  var slug: String
  var title: String
}

object Category {
  @scala.inline
  def apply(slug: String, title: String, icon: js.UndefOr[Null | ReactElement | Icon] = js.undefined): Category = {
    val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

