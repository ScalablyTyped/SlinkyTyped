package typingsSlinky.wordpressComponents.animateMod.Animate

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.anon.ClassName
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
  def AppearProps(children: ClassName => ReactElement, `type`: appear): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def SlideInProps(children: ClassName => ReactElement, `type`: `slide-in`): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

