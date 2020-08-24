package typingsSlinky.winrt.global.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails")
@js.native
object OptionDetails extends js.Object {
  @js.native
  class PrintBindingOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails
  
  @js.native
  class PrintCollationOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails
  
  @js.native
  class PrintColorModeOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails
  
  @js.native
  class PrintCopiesOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails
  
  @js.native
  class PrintCustomItemDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails
  
  @js.native
  class PrintCustomItemListOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails
  
  @js.native
  class PrintCustomTextOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails
  
  @js.native
  class PrintDuplexOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails
  
  @js.native
  class PrintHolePunchOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails
  
  @js.native
  class PrintMediaSizeOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails
  
  @js.native
  class PrintMediaTypeOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails
  
  @js.native
  class PrintOrientationOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails
  
  @js.native
  class PrintQualityOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails
  
  @js.native
  class PrintStapleOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails
  
  @js.native
  class PrintTaskOptionChangedEventArgs ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs
  
  @js.native
  class PrintTaskOptionDetails ()
    extends typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails
  
  @js.native
  object PrintOptionStates extends js.Object {
    /* 2 */ val constrained: typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained with Double = js.native
    /* 1 */ val enabled: typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates with Double
      ] = js.native
  }
  
  @js.native
  object PrintOptionType extends js.Object {
    /* 3 */ val itemList: typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList with Double = js.native
    /* 1 */ val number: typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number with Double = js.native
    /* 2 */ val text: typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text with Double = js.native
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object PrintTaskOptionDetails extends js.Object {
    def getFromPrintTaskOptions(printTaskOptions: typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskOptions): typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails = js.native
  }
  
}

