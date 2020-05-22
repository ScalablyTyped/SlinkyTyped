package typingsSlinky.wordpressBlockEditor.anon

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: String
  var icon: Icon | ReactElement
  var title: String
}

object Align {
  @scala.inline
  def apply(align: String, icon: Icon | ReactElement, title: String): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

