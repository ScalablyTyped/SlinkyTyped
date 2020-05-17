package typingsSlinky.winrtUwp.Windows.Data.Pdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Portable Document Format (PDF) document. */
@js.native
trait PdfDocument extends js.Object {
  /** Gets whether the Portable Document Format (PDF) document is password-protected. */
  var isPasswordProtected: Boolean = js.native
  /** Gets the number of pages in the Portable Document Format (PDF) document. */
  var pageCount: Double = js.native
  /**
    * Gets a page from a Portable Document Format (PDF) document.
    * @param pageIndex The location of the PDF page relative to its parent document.
    * @return The PDF page.
    */
  def getPage(pageIndex: Double): PdfPage = js.native
}

object PdfDocument {
  @scala.inline
  def apply(getPage: Double => PdfPage, isPasswordProtected: Boolean, pageCount: Double): PdfDocument = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction1(getPage), isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfDocument]
  }
  @scala.inline
  implicit class PdfDocumentOps[Self <: PdfDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPage(value: Double => PdfPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPasswordProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPasswordProtected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

