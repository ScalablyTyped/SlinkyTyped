package typingsSlinky.typeFest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - FirstType
  - SecondType
  - (typingsSlinky.typeFest.mod.Without[FirstType, SecondType]) with SecondType
  - (typingsSlinky.typeFest.mod.Without[SecondType, FirstType]) with FirstType
*/
trait MergeExclusive[FirstType, SecondType] extends js.Object

object MergeExclusive {
  @scala.inline
  implicit def apply[FirstType, SecondType](
    value: (Without[FirstType, SecondType]) with SecondType with (Without[SecondType, FirstType]) with FirstType
  ): MergeExclusive[FirstType, SecondType] = value.asInstanceOf[MergeExclusive[FirstType, SecondType]]
  @scala.inline
  implicit def apply[FirstType, SecondType](value: FirstType | SecondType): MergeExclusive[FirstType, SecondType] = value.asInstanceOf[MergeExclusive[FirstType, SecondType]]
}

