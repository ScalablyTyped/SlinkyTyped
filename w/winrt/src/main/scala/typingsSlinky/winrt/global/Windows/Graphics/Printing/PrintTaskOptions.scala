package typingsSlinky.winrt.global.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Graphics.Printing.PrintPageDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskOptions")
@js.native
class PrintTaskOptions ()
  extends typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskOptions {
  /* CompleteClass */
  override var binding: typingsSlinky.winrt.Windows.Graphics.Printing.PrintBinding = js.native
  /* CompleteClass */
  override var collation: typingsSlinky.winrt.Windows.Graphics.Printing.PrintCollation = js.native
  /* CompleteClass */
  override var colorMode: typingsSlinky.winrt.Windows.Graphics.Printing.PrintColorMode = js.native
  /* CompleteClass */
  override var displayedOptions: IVector[String] = js.native
  /* CompleteClass */
  override var duplex: typingsSlinky.winrt.Windows.Graphics.Printing.PrintDuplex = js.native
  /* CompleteClass */
  override var holePunch: typingsSlinky.winrt.Windows.Graphics.Printing.PrintHolePunch = js.native
  /* CompleteClass */
  override var maxCopies: Double = js.native
  /* CompleteClass */
  override var mediaSize: typingsSlinky.winrt.Windows.Graphics.Printing.PrintMediaSize = js.native
  /* CompleteClass */
  override var mediaType: typingsSlinky.winrt.Windows.Graphics.Printing.PrintMediaType = js.native
  /* CompleteClass */
  override var minCopies: Double = js.native
  /* CompleteClass */
  override var numberOfCopies: Double = js.native
  /* CompleteClass */
  override var orientation: typingsSlinky.winrt.Windows.Graphics.Printing.PrintOrientation = js.native
  /* CompleteClass */
  override var printQuality: typingsSlinky.winrt.Windows.Graphics.Printing.PrintQuality = js.native
  /* CompleteClass */
  override var staple: typingsSlinky.winrt.Windows.Graphics.Printing.PrintStaple = js.native
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
}

