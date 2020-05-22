package typingsSlinky.wordpressComponents.animateMod.Animate

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.anon.ClassName
import typingsSlinky.wordpressComponents.anon.Origin
import typingsSlinky.wordpressComponents.anon.`0`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressComponents.animateMod.Animate.AppearProps
  - typingsSlinky.wordpressComponents.animateMod.Animate.SlideInProps
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def AppearProps(children: ClassName => TagMod[Any], `type`: appear, options: Origin = null): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def SlideInProps(children: ClassName => TagMod[Any], `type`: `slide-in`, options: `0` = null): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

