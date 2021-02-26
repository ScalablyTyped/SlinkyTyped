package typingsSlinky.winrtUwp.global.Windows.Data

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for converting a page in a Portable Document Format (PDF) document to an image file. */
object Pdf {
  
  /** Represents a Portable Document Format (PDF) document. */
  @JSGlobal("Windows.Data.Pdf.PdfDocument")
  @js.native
  abstract class PdfDocument ()
    extends typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfDocument
  object PdfDocument {
    
    /**
      * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document.
      * @param file The file, which represents a PDF document.
      * @return The asynchronous operation.
      */
    /* static member */
    @JSGlobal("Windows.Data.Pdf.PdfDocument.loadFromFileAsync")
    @js.native
    def loadFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
    /**
      * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document. Use this method if the PDF document is password-protected.
      * @param file The file, which represents a PDF document.
      * @param password The password to open the PDF document, if it requires one.
      * @return The asynchronous operation.
      */
    /* static member */
    @JSGlobal("Windows.Data.Pdf.PdfDocument.loadFromFileAsync")
    @js.native
    def loadFromFileAsync(file: IStorageFile, password: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
    
    /**
      * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system.
      * @param inputStream The stream of data, which represents a PDF document.
      * @return The asynchronous operation.
      */
    /* static member */
    @JSGlobal("Windows.Data.Pdf.PdfDocument.loadFromStreamAsync")
    @js.native
    def loadFromStreamAsync(inputStream: IRandomAccessStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
    /**
      * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system. Use this method if the PDF document is password-protected.
      * @param inputStream The stream of data, which represents a PDF document.
      * @param password The password to open the PDF document, if it requires one.
      * @return The asynchronous operation.
      */
    /* static member */
    @JSGlobal("Windows.Data.Pdf.PdfDocument.loadFromStreamAsync")
    @js.native
    def loadFromStreamAsync(inputStream: IRandomAccessStream, password: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
  }
  
  /** Represents a single page in a Portable Document Format (PDF) document. */
  @JSGlobal("Windows.Data.Pdf.PdfPage")
  @js.native
  abstract class PdfPage ()
    extends typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPage
  
  /** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
  @JSGlobal("Windows.Data.Pdf.PdfPageDimensions")
  @js.native
  abstract class PdfPageDimensions ()
    extends typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPageDimensions
  
  /** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
  @JSGlobal("Windows.Data.Pdf.PdfPageRenderOptions")
  @js.native
  /** Creates and initializes a new instance of display settings for a single page of a Portable Document Format (PDF) document. */
  class PdfPageRenderOptions ()
    extends typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPageRenderOptions
  
  /** Specifies the number of degrees that a page in a Portable Document Format (PDF) document is rotated in the rendered output. */
  @JSGlobal("Windows.Data.Pdf.PdfPageRotation")
  @js.native
  object PdfPageRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPageRotation with Double] = js.native
    
    /* 0 */ val normal: typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPageRotation.normal with Double = js.native
    
    /* 2 */ val rotate180: typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate180 with Double = js.native
    
    /* 3 */ val rotate270: typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate270 with Double = js.native
    
    /* 1 */ val rotate90: typingsSlinky.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate90 with Double = js.native
  }
}
