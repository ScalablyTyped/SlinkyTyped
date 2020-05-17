package typingsSlinky.storybookUi.keyCodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookUi.keyCodesMod.SimpleKeybinding
  - typingsSlinky.storybookUi.keyCodesMod.ChordKeybinding
*/
trait Keybinding extends js.Object

object Keybinding {
  @scala.inline
  implicit def apply(value: ChordKeybinding): Keybinding = value.asInstanceOf[Keybinding]
  @scala.inline
  implicit def apply(value: SimpleKeybinding): Keybinding = value.asInstanceOf[Keybinding]
}

