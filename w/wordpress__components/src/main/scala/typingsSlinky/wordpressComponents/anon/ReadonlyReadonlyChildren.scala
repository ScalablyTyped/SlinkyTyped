package typingsSlinky.wordpressComponents.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{}> & std.Readonly<react.anon.Children> */
trait ReadonlyReadonlyChildren extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.undefined
}

object ReadonlyReadonlyChildren {
  @scala.inline
  def apply(children: TagMod[Any] = null): ReadonlyReadonlyChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyReadonlyChildren]
  }
}

