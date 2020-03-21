package typingsSlinky.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "writerState")
@js.native
object writerState extends js.Object {
  /* 3 */ val CloseTag: typingsSlinky.xmlbuilder.mod.WriterState_.CloseTag with Double = js.native
  /* 2 */ val InsideTag: typingsSlinky.xmlbuilder.mod.WriterState_.InsideTag with Double = js.native
  /* 0 */ val None: typingsSlinky.xmlbuilder.mod.WriterState_.None with Double = js.native
  /* 1 */ val OpenTag: typingsSlinky.xmlbuilder.mod.WriterState_.OpenTag with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriterState_ with Double] = js.native
}

