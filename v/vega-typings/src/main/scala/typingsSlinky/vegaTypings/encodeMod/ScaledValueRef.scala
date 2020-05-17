package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.anon.Band
import typingsSlinky.vegaTypings.anon.FieldScale
import typingsSlinky.vegaTypings.anon.Range
import typingsSlinky.vegaTypings.anon.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.encodeMod.BaseValueRef[T]
  - typingsSlinky.vegaTypings.anon.Scale
  - typingsSlinky.vegaTypings.anon.FieldScale
  - typingsSlinky.vegaTypings.anon.Band
  - typingsSlinky.vegaTypings.anon.Range
*/
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.vegaTypings.encodeMod.ArbitraryValueRef because Already inherited */ trait ScaledValueRef[T] extends ColorValueRef

object ScaledValueRef {
  @scala.inline
  implicit def apply[T](value: Band): ScaledValueRef[T] = value.asInstanceOf[ScaledValueRef[T]]
  @scala.inline
  implicit def apply[T](value: BaseValueRef[T]): ScaledValueRef[T] = value.asInstanceOf[ScaledValueRef[T]]
  @scala.inline
  implicit def apply[T](value: FieldScale): ScaledValueRef[T] = value.asInstanceOf[ScaledValueRef[T]]
  @scala.inline
  implicit def apply[T](value: Range): ScaledValueRef[T] = value.asInstanceOf[ScaledValueRef[T]]
  @scala.inline
  implicit def apply[T](value: Scale): ScaledValueRef[T] = value.asInstanceOf[ScaledValueRef[T]]
}

