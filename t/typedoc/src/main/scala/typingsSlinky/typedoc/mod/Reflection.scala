package typingsSlinky.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "Reflection")
@js.native
abstract class Reflection protected ()
  extends typingsSlinky.typedoc.reflectionsMod.Reflection {
  def this(name: String, kind: typingsSlinky.typedoc.abstractMod.ReflectionKind) = this()
  def this(
    name: String,
    kind: typingsSlinky.typedoc.abstractMod.ReflectionKind,
    parent: typingsSlinky.typedoc.abstractMod.Reflection
  ) = this()
}

