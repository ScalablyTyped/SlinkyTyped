package typingsSlinky.wouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wouter.anon.To
  - typingsSlinky.wouter.anon.Href
*/
trait NavigationalProps extends js.Object

object NavigationalProps {
  @scala.inline
  def To(to: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationalProps]
  }
  @scala.inline
  def Href(href: Path): NavigationalProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationalProps]
  }
}

