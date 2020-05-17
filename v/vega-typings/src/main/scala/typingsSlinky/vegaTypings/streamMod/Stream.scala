package typingsSlinky.vegaTypings.streamMod

import typingsSlinky.vegaTypings.onEventsMod.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.streamMod.EventStream
  - typingsSlinky.vegaTypings.streamMod.DerivedStream
  - typingsSlinky.vegaTypings.streamMod.MergedStream
*/
trait Stream extends EventListener

object Stream {
  @scala.inline
  implicit def apply(value: DerivedStream): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: EventStream): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: MergedStream): Stream = value.asInstanceOf[Stream]
}

