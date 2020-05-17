package typingsSlinky.victory.mod

import typingsSlinky.victory.anon.XArray
import typingsSlinky.victory.anon.XArrayYArray
import typingsSlinky.victory.anon.YArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Category prop type
  */
/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String]
  - typingsSlinky.victory.anon.XArray
  - typingsSlinky.victory.anon.YArray
  - typingsSlinky.victory.anon.XArrayYArray
*/
trait CategoryPropType extends js.Object

object CategoryPropType {
  @scala.inline
  implicit def apply(value: js.Array[String]): CategoryPropType = value.asInstanceOf[CategoryPropType]
  @scala.inline
  implicit def apply(value: XArray): CategoryPropType = value.asInstanceOf[CategoryPropType]
  @scala.inline
  implicit def apply(value: XArrayYArray): CategoryPropType = value.asInstanceOf[CategoryPropType]
  @scala.inline
  implicit def apply(value: YArray): CategoryPropType = value.asInstanceOf[CategoryPropType]
}

