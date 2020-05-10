package typingsSlinky.uiGrid.mod.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUiGridExporterConstants extends js.Object {
  /** export all data, including data not visible.  Can be set for either rowTypes or colTypes */
  var ALL: String = js.native
  var BUTTON_LABEL: String = js.native
  var CSV_CONTENT: String = js.native
  var FILE_NAME: String = js.native
  /**
    * Export all data, including data not visible.
    * Can be set only for rowTypes, selection of only some columns is not supported
    */
  var SELECTED: String = js.native
  /** export only visible data, including data not visible.  Can be set for either rowTypes or colTypes */
  var VISIBLE: String = js.native
  var featureName: String = js.native
}

object IUiGridExporterConstants {
  @scala.inline
  def apply(
    ALL: String,
    BUTTON_LABEL: String,
    CSV_CONTENT: String,
    FILE_NAME: String,
    SELECTED: String,
    VISIBLE: String,
    featureName: String
  ): IUiGridExporterConstants = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], BUTTON_LABEL = BUTTON_LABEL.asInstanceOf[js.Any], CSV_CONTENT = CSV_CONTENT.asInstanceOf[js.Any], FILE_NAME = FILE_NAME.asInstanceOf[js.Any], SELECTED = SELECTED.asInstanceOf[js.Any], VISIBLE = VISIBLE.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridExporterConstants]
  }
  @scala.inline
  implicit class IUiGridExporterConstantsOps[Self <: IUiGridExporterConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUTTON_LABEL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_LABEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCSV_CONTENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSV_CONTENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFILE_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FILE_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECTED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVISIBLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VISIBLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

