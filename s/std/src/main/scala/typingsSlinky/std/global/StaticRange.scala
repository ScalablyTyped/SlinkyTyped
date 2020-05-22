package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.StaticRangeInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StaticRange")
@js.native
class StaticRange protected ()
  extends typingsSlinky.std.AbstractRange {
  def this(init: StaticRangeInit) = this()
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  /**
    * Returns range's end node.
    */
  /* CompleteClass */
  override val endContainer: org.scalajs.dom.raw.Node = js.native
  /**
    * Returns range's end offset.
    */
  /* CompleteClass */
  override val endOffset: Double = js.native
  /**
    * Returns range's start node.
    */
  /* CompleteClass */
  override val startContainer: org.scalajs.dom.raw.Node = js.native
  /**
    * Returns range's start offset.
    */
  /* CompleteClass */
  override val startOffset: Double = js.native
}

@JSGlobal("StaticRange")
@js.native
object StaticRange
  extends Instantiable1[/* init */ StaticRangeInit, typingsSlinky.std.StaticRange]

