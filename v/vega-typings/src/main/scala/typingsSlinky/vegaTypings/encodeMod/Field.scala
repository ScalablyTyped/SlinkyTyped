package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.encodeMod.DatumFieldRef
  - typingsSlinky.vegaTypings.encodeMod.GroupFieldRef
  - typingsSlinky.vegaTypings.encodeMod.ParentFieldRef
*/
trait Field extends js.Object

object Field {
  @scala.inline
  implicit def apply(value: DatumFieldRef): Field = value.asInstanceOf[Field]
  @scala.inline
  implicit def apply(value: GroupFieldRef): Field = value.asInstanceOf[Field]
  @scala.inline
  implicit def apply(value: ParentFieldRef): Field = value.asInstanceOf[Field]
  @scala.inline
  implicit def apply(value: SignalRef): Field = value.asInstanceOf[Field]
  @scala.inline
  implicit def apply(value: String): Field = value.asInstanceOf[Field]
}

