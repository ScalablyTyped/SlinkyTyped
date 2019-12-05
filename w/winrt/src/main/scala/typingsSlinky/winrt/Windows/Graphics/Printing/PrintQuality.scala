package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintQuality extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintQuality")
@js.native
object PrintQuality extends js.Object {
  @js.native
  sealed trait automatic extends PrintQuality
  
  @js.native
  sealed trait default extends PrintQuality
  
  @js.native
  sealed trait draft extends PrintQuality
  
  @js.native
  sealed trait fax extends PrintQuality
  
  @js.native
  sealed trait high extends PrintQuality
  
  @js.native
  sealed trait normal extends PrintQuality
  
  @js.native
  sealed trait notAvailable extends PrintQuality
  
  @js.native
  sealed trait photographic extends PrintQuality
  
  @js.native
  sealed trait printerCustom extends PrintQuality
  
  @js.native
  sealed trait text extends PrintQuality
  
  /* 3 */ val automatic: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.automatic with Double = js.native
  /* 0 */ val default: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.default with Double = js.native
  /* 4 */ val draft: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.draft with Double = js.native
  /* 5 */ val fax: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.fax with Double = js.native
  /* 6 */ val high: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.high with Double = js.native
  /* 7 */ val normal: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.normal with Double = js.native
  /* 1 */ val notAvailable: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.notAvailable with Double = js.native
  /* 8 */ val photographic: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.photographic with Double = js.native
  /* 2 */ val printerCustom: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.printerCustom with Double = js.native
  /* 9 */ val text: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality.text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintQuality with Double] = js.native
}

