package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.std.DOMPointInit
import typingsSlinky.std.DOMQuadInit
import typingsSlinky.std.DOMRectInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMQuad")
@js.native
class DOMQuad ()
  extends typingsSlinky.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  /* CompleteClass */
  override val p1: typingsSlinky.std.DOMPoint = js.native
  /* CompleteClass */
  override val p2: typingsSlinky.std.DOMPoint = js.native
  /* CompleteClass */
  override val p3: typingsSlinky.std.DOMPoint = js.native
  /* CompleteClass */
  override val p4: typingsSlinky.std.DOMPoint = js.native
  /* CompleteClass */
  override def getBounds(): typingsSlinky.std.DOMRect = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("DOMQuad")
@js.native
object DOMQuad
  extends Instantiable0[typingsSlinky.std.DOMQuad]
     with Instantiable1[/* p1 */ DOMPointInit, typingsSlinky.std.DOMQuad]
     with Instantiable2[/* p1 */ DOMPointInit, /* p2 */ DOMPointInit, typingsSlinky.std.DOMQuad]
     with Instantiable3[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      typingsSlinky.std.DOMQuad
    ]
     with Instantiable4[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      /* p4 */ DOMPointInit, 
      typingsSlinky.std.DOMQuad
    ] {
  def fromQuad(): typingsSlinky.std.DOMQuad = js.native
  def fromQuad(other: DOMQuadInit): typingsSlinky.std.DOMQuad = js.native
  def fromRect(): typingsSlinky.std.DOMQuad = js.native
  def fromRect(other: DOMRectInit): typingsSlinky.std.DOMQuad = js.native
}

