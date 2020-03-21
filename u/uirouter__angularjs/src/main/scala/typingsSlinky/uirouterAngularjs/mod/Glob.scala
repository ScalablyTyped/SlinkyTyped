package typingsSlinky.uirouterAngularjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "Glob")
@js.native
class Glob protected ()
  extends typingsSlinky.uirouterCore.mod.Glob {
  def this(text: String) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "Glob")
@js.native
object Glob extends js.Object {
  /** Returns a glob from the string, or null if the string isn't Glob-like */
  def fromString(text: String): typingsSlinky.uirouterCore.globMod.Glob = js.native
  /** Returns true if the string has glob-like characters in it */
  def is(text: String): Boolean = js.native
}

