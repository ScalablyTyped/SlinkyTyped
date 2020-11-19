package typingsSlinky.xmlbuilder.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WriterState_ extends js.Object
/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "WriterState")
@js.native
object WriterState_ extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriterState_ with Double] = js.native
  
  /**
    * Writer is at a closing tag, e.g. `</node>`
    */
  @js.native
  sealed trait CloseTag extends WriterState_
  /* 3 */ @js.native
  object CloseTag extends TopLevel[CloseTag with Double]
  
  /**
    * Writer is inside an element
    */
  @js.native
  sealed trait InsideTag extends WriterState_
  /* 2 */ @js.native
  object InsideTag extends TopLevel[InsideTag with Double]
  
  /**
    * Writer state is unknown
    */
  @js.native
  sealed trait None extends WriterState_
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Writer is at an opening tag, e.g. `<node>`
    */
  @js.native
  sealed trait OpenTag extends WriterState_
  /* 1 */ @js.native
  object OpenTag extends TopLevel[OpenTag with Double]
}
