package typingsSlinky.uuid

import typingsSlinky.uuid.interfacesMod.InputBuffer
import typingsSlinky.uuid.interfacesMod.V4Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rng extends V4Options {
  def rng(): InputBuffer
}

object Anon_Rng {
  @scala.inline
  def apply(rng: () => InputBuffer): Anon_Rng = {
    val __obj = js.Dynamic.literal(rng = js.Any.fromFunction0(rng))
  
    __obj.asInstanceOf[Anon_Rng]
  }
}

