package typingsSlinky.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Point")
@js.native
class Point ()
  extends typingsSlinky.wonderJs.pointMod.Point {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Point")
@js.native
object Point extends js.Object {
  def create(): typingsSlinky.wonderJs.pointMod.Point = js.native
  def create(x: Double): typingsSlinky.wonderJs.pointMod.Point = js.native
  def create(x: Double, y: Double): typingsSlinky.wonderJs.pointMod.Point = js.native
}

