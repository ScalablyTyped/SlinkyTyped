package typingsSlinky.underscore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionary[T]
  extends Collection[T]
     with /* index */ StringDictionary[T]

object Dictionary {
  @scala.inline
  def apply[T](): Dictionary[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictionary[T]]
  }
}

