package typingsSlinky.wordpressComponents.animateMod.Animate

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.anon.ClassName
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var `type`: appear | `slide-in`
  def children(props: ClassName): TagMod[Any]
}

object BaseProps {
  @scala.inline
  def apply(children: ClassName => TagMod[Any], `type`: appear | `slide-in`): BaseProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

