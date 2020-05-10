package typingsSlinky.uiGrid.mod.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef extends js.Object {
  /**
    * the alignment you'd like for this specific column when exported into a pdf.
    * Can be 'left', 'right', 'center' or any other valid pdfMake alignment option.
    */
  var exporterPdfAlign: js.UndefOr[String] = js.native
  /**
    * Suppresses export for this column. Used by selection and expandable.
    */
  var exporterSuppressExport: js.UndefOr[Boolean] = js.native
}

object IColumnDef {
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExporterPdfAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterSuppressExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterSuppressExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterSuppressExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterSuppressExport")(js.undefined)
        ret
    }
  }
  
}

