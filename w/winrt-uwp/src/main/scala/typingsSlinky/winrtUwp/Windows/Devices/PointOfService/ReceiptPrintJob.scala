package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of printing instructions that you want to run on the receipt printer. */
@js.native
trait ReceiptPrintJob extends StObject {
  
  /** Adds an instruction to the printer job to cut the receipt paper completely. */
  def cutPaper(): Unit = js.native
  /**
    * Adds an instruction to the printer job to cut the specified percentage of the receipt paper.
    * @param percentage Decimal representation of the percentage of the receipt that the receipt printer should cut.
    */
  def cutPaper(percentage: Double): Unit = js.native
  
  /**
    * Adds an instruction to the print job to print a drawn, ruled line on the paper of the receipt printer station.
    * @param positionList The position parameters for the ruled line. The character string for positionList differs depending on whether lineDirection specifies a horizontal ruled line or a vertical ruled line.
    * @param lineDirection The direction in which to print the ruled line.
    * @param lineWidth The width of the ruled line that the print should print. The unit of width is dot. If an unsupported value is specified, the best fit value for the printer is used.
    * @param lineStyle The appearance of the ruled line, such as whether it is solid or broken, or single or double.
    * @param lineColor The color of the ruled line, as an integer value that is equal to the value of the cartridge constant used in the ClaimedReceiptPrinter.ColorCartridge property. If an unsupported value is specified, the printing results may be unpredictable.
    */
  def drawRuledLine(
    positionList: String,
    lineDirection: PosPrinterLineDirection,
    lineWidth: Double,
    lineStyle: PosPrinterLineStyle,
    lineColor: Double
  ): Unit = js.native
  
  /**
    * Runs the print job on the receipt printer station asynchronously.
    * @return The operation to run the print job. This operation returns true if the print job succeeds; otherwise, the operation returns false.
    */
  def executeAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Adds an instruction to the printer job to use the mark sensor of the receipt printer station to position the receipt paper.
    * @param kind An enumeration value that specifies how to position the receipt paper.
    */
  def markFeed(kind: PosPrinterMarkFeedKind): Unit = js.native
  
  /**
    * Adds an instruction to the print job to print the specified text on the receipt printer station.
    * @param data The text to print on the receipt printer station.
    */
  def print(data: String): Unit = js.native
  
  /**
    * Adds an instruction to the print job to print a barcode with the specified data and symbology on the receipt printer station.
    * @param data The data to be represented as a barcode.
    * @param symbology The symbology (encoding) of the barcode. This can be determined based on the BarcodeSymbologies class static methods.
    * @param height The height of the barcode, in pixels.
    * @param width The width of the barcode, in pixels.
    * @param textPosition The vertical position of the barcode text relative to the barcode.
    * @param alignment The horizontal alignment of the barcode on the page.
    */
  def printBarcode(
    data: String,
    symbology: Double,
    height: Double,
    width: Double,
    textPosition: PosPrinterBarcodeTextPosition,
    alignment: PosPrinterAlignment
  ): Unit = js.native
  
  /**
    * Adds an instruction to the print job to print a barcode with the specified data, symbology, and custom alignment on the receipt printer station.
    * @param data The data to be represented as a barcode.
    * @param symbology The symbology (encoding) of the barcode.
    * @param height The height of the barcode, in pixels.
    * @param width The width of the barcode, in pixels.
    * @param textPosition The vertical position of the barcode text relative to the barcode.
    * @param alignmentDistance The distance from the leftmost print column to the start of the barcode, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    */
  def printBarcodeCustomAlign(
    data: String,
    symbology: Double,
    height: Double,
    width: Double,
    textPosition: PosPrinterBarcodeTextPosition,
    alignmentDistance: Double
  ): Unit = js.native
  
  /**
    * Adds an instruction to the print job to print the specified bitmap with the specified standard horizontal placement on the receipt printer station.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignment An enumeration value that specifies a standard horizontal placement on the page for the bitmap, such as left-aligned, centered, or right-aligned.
    */
  def printBitmap(bitmap: BitmapFrame, alignment: PosPrinterAlignment): Unit = js.native
  /**
    * Adds an instruction to the print job to print the specified bitmap with the specified width and a standard horizontal placement on the receipt printer station.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignment An enumeration value that specifies a standard horizontal placement on the page for the bitmap, such as left-aligned, centered, or right-aligned.
    * @param width The width to use for printing the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    */
  def printBitmap(bitmap: BitmapFrame, alignment: PosPrinterAlignment, width: Double): Unit = js.native
  
  /**
    * Adds an instruction to the print job to print the specified bitmap at the specified distance from the leftmost print column on the receipt printer station.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignmentDistance The distance from the leftmost print column to the start of the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    */
  def printCustomAlignedBitmap(bitmap: BitmapFrame, alignmentDistance: Double): Unit = js.native
  /**
    * Adds an instruction to the print job to print the specified bitmap with the specified width and at the specified distance from the leftmost print column on the receipt printer station.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignmentDistance The distance from the leftmost print column to the start of the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    * @param width The width to use for printing the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPriinter.MapMode property.
    */
  def printCustomAlignedBitmap(bitmap: BitmapFrame, alignmentDistance: Double, width: Double): Unit = js.native
  
  /** Adds an instruction to the print job to print a newline character on the receipt printer station. */
  def printLine(): Unit = js.native
  /**
    * Adds an instruction to the print job to print a line of text on the receipt printer station.
    * @param data The line of text to print.
    */
  def printLine(data: String): Unit = js.native
  
  /**
    * Adds an instruction to the print job to print a bitmap on the receipt printer station by using the bitmap and information saved to the printer via SetBitmap or SetCustomAlignedBitmap .
    * @param bitmapNumber The number that you assigned to the bitmap that you want to print when you called SetBitmap or SetCustomAlignedBitmap .
    */
  def printSavedBitmap(bitmapNumber: Double): Unit = js.native
  
  /**
    * Sets the rotation of the barcode on the page on the receipt printer station.
    * @param value The rotation of the barcode on the page.
    */
  def setBarcodeRotation(value: PosPrinterRotation): Unit = js.native
  
  /**
    * Saves information about a bitmap and a standard horizontal placement that you want to use to print that bitmap on the receipt printer station, so that you can use the PrintSavedBitmap method to add that information to the print job later.
    * @param bitmapNumber The number that you want to assign to this bitmap. You can set two bitmaps, numbered 1 and 2. Use this number with the PrintSavedBitmap method later to add the print instructions to the print job.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignment An enumeration value that specifies a standard horizontal placement on the page for the bitmap, such as left-aligned, centered, or right-aligned.
    */
  def setBitmap(bitmapNumber: Double, bitmap: BitmapFrame, alignment: PosPrinterAlignment): Unit = js.native
  /**
    * Saves information about a bitmap, along with the width and a standard horizontal placement that you want to use to print that bitmap on the receipt printer station, so that you can use the PrintSavedBitmap method to add that information to the print job later.
    * @param bitmapNumber The number that you want to assign to this bitmap. You can set two bitmaps, numbered 1 and 2. Use this number with the PrintSavedBitmap method later to add the print instructions to the print job.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignment An enumeration value that specifies a standard horizontal placement on the page for the bitmap, such as left-aligned, centered, or right-aligned.
    * @param width The width to use for printing the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    */
  def setBitmap(bitmapNumber: Double, bitmap: BitmapFrame, alignment: PosPrinterAlignment, width: Double): Unit = js.native
  
  /**
    * Saves information about a bitmap and the distance from the leftmost print column at which you want to print that bitmap on the receipt printer station, so that you can use the PrintSavedBitmap method to add that information to the print job later.
    * @param bitmapNumber The number that you want to assign to this bitmap. You can set two bitmaps, numbered 1 and 2. Use this number with the PrintSavedBitmap method later to add the print instructions to the print job.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignmentDistance The distance from the leftmost print column to the start of the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    */
  def setCustomAlignedBitmap(bitmapNumber: Double, bitmap: BitmapFrame, alignmentDistance: Double): Unit = js.native
  /**
    * Saves information about a bitmap, along with the width and the distance from the leftmost print column that you want to use to print that bitmap on the receipt printer station, so that you can use the PrintSavedBitmap method to add that information to the print job later.
    * @param bitmapNumber The number that you want to assign to this bitmap. You can set two bitmaps, numbered 1 and 2. Use this number with the PrintSavedBitmap method later to add the print instructions to the print job.
    * @param bitmap Information about the bitmap that you want to print.
    * @param alignmentDistance The distance from the leftmost print column to the start of the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    * @param width The width to use for printing the bitmap, expressed in the unit of measurement indicated by the ClaimedPosPrinter.MapMode property.
    */
  def setCustomAlignedBitmap(bitmapNumber: Double, bitmap: BitmapFrame, alignmentDistance: Double, width: Double): Unit = js.native
  
  /**
    * Sets the area of the page on which the receipt printer station can print the job.
    * @param value The area of the page on which the receipt printer can print the job.
    */
  def setPrintArea(value: Rect): Unit = js.native
  
  /**
    * Sets the rotation of the text or image on the page for the receipt printer station.
    * @param value The rotation of the text or image on the page for the receipt printer station.
    * @param includeBitmaps Whether bitmaps should also be rotated. This setting takes effect only for subsequent calls to PrintBitmap , and may not apply to saved bitmaps that you print using PrintSavedBitmap .
    */
  def setPrintRotation(value: PosPrinterRotation, includeBitmaps: Boolean): Unit = js.native
}
