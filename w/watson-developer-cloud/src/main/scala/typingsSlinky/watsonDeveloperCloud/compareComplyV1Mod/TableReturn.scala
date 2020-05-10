package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The analysis of the document's tables. */
@js.native
trait TableReturn extends js.Object {
  /** Information about the parsed input document. */
  var document: js.UndefOr[DocInfo] = js.native
  /** The ID of the model used to extract the table contents. The value for table extraction is `tables`. */
  var model_id: js.UndefOr[String] = js.native
  /** The version of the `tables` model ID. */
  var model_version: js.UndefOr[String] = js.native
  /** Definitions of the tables identified in the input document. */
  var tables: js.UndefOr[js.Array[Tables]] = js.native
}

object TableReturn {
  @scala.inline
  def apply(): TableReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableReturn]
  }
  @scala.inline
  implicit class TableReturnOps[Self <: TableReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: DocInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[Tables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
  }
  
}

