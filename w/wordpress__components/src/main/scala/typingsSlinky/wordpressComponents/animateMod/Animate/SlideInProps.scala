package typingsSlinky.wordpressComponents.animateMod.Animate

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.anon.ClassName
import typingsSlinky.wordpressComponents.anon.`0`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`slide-in`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInProps
  extends BaseProps
     with Props {
  var options: js.UndefOr[`0`] = js.undefined
  @JSName("type")
  var type_SlideInProps: `slide-in`
}

object SlideInProps {
  @scala.inline
  def apply(children: ClassName => TagMod[Any], `type`: `slide-in`, options: `0` = null): SlideInProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInProps]
  }
}

