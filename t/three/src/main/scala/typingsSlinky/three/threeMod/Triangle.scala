package typingsSlinky.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Triangle")
@js.native
class Triangle ()
  extends typingsSlinky.three.srcMathTriangleMod.Triangle {
  def this(a: typingsSlinky.three.srcMathVector3Mod.Vector3) = this()
  def this(a: typingsSlinky.three.srcMathVector3Mod.Vector3, b: typingsSlinky.three.srcMathVector3Mod.Vector3) = this()
  def this(
    a: typingsSlinky.three.srcMathVector3Mod.Vector3,
    b: typingsSlinky.three.srcMathVector3Mod.Vector3,
    c: typingsSlinky.three.srcMathVector3Mod.Vector3
  ) = this()
}

/* static members */
@JSImport("three", "Triangle")
@js.native
object Triangle extends js.Object {
  def containsPoint(
    point: typingsSlinky.three.srcMathVector3Mod.Vector3,
    a: typingsSlinky.three.srcMathVector3Mod.Vector3,
    b: typingsSlinky.three.srcMathVector3Mod.Vector3,
    c: typingsSlinky.three.srcMathVector3Mod.Vector3
  ): Boolean = js.native
  def getBarycoord(
    point: typingsSlinky.three.srcMathVector3Mod.Vector3,
    a: typingsSlinky.three.srcMathVector3Mod.Vector3,
    b: typingsSlinky.three.srcMathVector3Mod.Vector3,
    c: typingsSlinky.three.srcMathVector3Mod.Vector3,
    target: typingsSlinky.three.srcMathVector3Mod.Vector3
  ): typingsSlinky.three.srcMathVector3Mod.Vector3 = js.native
  def getNormal(
    a: typingsSlinky.three.srcMathVector3Mod.Vector3,
    b: typingsSlinky.three.srcMathVector3Mod.Vector3,
    c: typingsSlinky.three.srcMathVector3Mod.Vector3,
    target: typingsSlinky.three.srcMathVector3Mod.Vector3
  ): typingsSlinky.three.srcMathVector3Mod.Vector3 = js.native
  def getUV(
    point: typingsSlinky.three.srcMathVector3Mod.Vector3,
    p1: typingsSlinky.three.srcMathVector3Mod.Vector3,
    p2: typingsSlinky.three.srcMathVector3Mod.Vector3,
    p3: typingsSlinky.three.srcMathVector3Mod.Vector3,
    uv1: typingsSlinky.three.srcMathVector2Mod.Vector2,
    uv2: typingsSlinky.three.srcMathVector2Mod.Vector2,
    uv3: typingsSlinky.three.srcMathVector2Mod.Vector2,
    target: typingsSlinky.three.srcMathVector2Mod.Vector2
  ): typingsSlinky.three.srcMathVector2Mod.Vector2 = js.native
  def isFrontFacing(
    a: typingsSlinky.three.srcMathVector3Mod.Vector3,
    b: typingsSlinky.three.srcMathVector3Mod.Vector3,
    c: typingsSlinky.three.srcMathVector3Mod.Vector3,
    direction: typingsSlinky.three.srcMathVector3Mod.Vector3
  ): Boolean = js.native
}

