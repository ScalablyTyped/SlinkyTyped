package typingsSlinky.settings.mod

import typingsSlinky.settings.anon.DictenvName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.settings.anon.DictenvName
*/
trait PathOrModule extends js.Object

object PathOrModule {
  @scala.inline
  implicit def apply(value: DictenvName): PathOrModule = value.asInstanceOf[PathOrModule]
  @scala.inline
  implicit def apply(value: String): PathOrModule = value.asInstanceOf[PathOrModule]
}

