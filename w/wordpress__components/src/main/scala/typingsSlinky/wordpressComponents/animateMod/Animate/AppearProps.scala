package typingsSlinky.wordpressComponents.animateMod.Animate

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.anon.ClassName
import typingsSlinky.wordpressComponents.anon.Origin
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearProps
  extends BaseProps
     with Props {
  var options: js.UndefOr[Origin] = js.undefined
  @JSName("type")
  var type_AppearProps: appear
}

object AppearProps {
  @scala.inline
  def apply(children: ClassName => TagMod[Any], `type`: appear, options: Origin = null): AppearProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearProps]
  }
}

