package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintHolePunch extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintHolePunch")
@js.native
object PrintHolePunch extends js.Object {
  @js.native
  sealed trait bottomEdge extends PrintHolePunch
  
  @js.native
  sealed trait default extends PrintHolePunch
  
  @js.native
  sealed trait leftEdge extends PrintHolePunch
  
  @js.native
  sealed trait none extends PrintHolePunch
  
  @js.native
  sealed trait notAvailable extends PrintHolePunch
  
  @js.native
  sealed trait printerCustom extends PrintHolePunch
  
  @js.native
  sealed trait rightEdge extends PrintHolePunch
  
  @js.native
  sealed trait topEdge extends PrintHolePunch
  
  /* 7 */ val bottomEdge: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.bottomEdge with Double = js.native
  /* 0 */ val default: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.default with Double = js.native
  /* 4 */ val leftEdge: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.leftEdge with Double = js.native
  /* 3 */ val none: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.none with Double = js.native
  /* 1 */ val notAvailable: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.printerCustom with Double = js.native
  /* 5 */ val rightEdge: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.rightEdge with Double = js.native
  /* 6 */ val topEdge: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch.topEdge with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintHolePunch with Double] = js.native
}

