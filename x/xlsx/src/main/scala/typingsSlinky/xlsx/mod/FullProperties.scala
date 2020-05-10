package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullProperties extends Properties {
  var AppVersion: js.UndefOr[String] = js.native
  var Application: js.UndefOr[String] = js.native
  var ContentStatus: js.UndefOr[String] = js.native
  var DocSecurity: js.UndefOr[String] = js.native
  var HyperlinksChanged: js.UndefOr[Boolean] = js.native
  var Identifier: js.UndefOr[String] = js.native
  var Language: js.UndefOr[String] = js.native
  var LastPrinted: js.UndefOr[String] = js.native
  var LinksUpToDate: js.UndefOr[Boolean] = js.native
  var ModifiedDate: js.UndefOr[js.Date] = js.native
  var Revision: js.UndefOr[String | Double] = js.native
  var ScaleCrop: js.UndefOr[Boolean] = js.native
  var SharedDoc: js.UndefOr[Boolean] = js.native
  var SheetNames: js.UndefOr[js.Array[String]] = js.native
  var Version: js.UndefOr[String] = js.native
  var Worksheets: js.UndefOr[Double] = js.native
}

object FullProperties {
  @scala.inline
  def apply(): FullProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullProperties]
  }
  @scala.inline
  implicit class FullPropertiesOps[Self <: FullProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDocSecurity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocSecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinksChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperlinksChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlinksChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperlinksChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPrinted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastPrinted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPrinted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastPrinted")(js.undefined)
        ret
    }
    @scala.inline
    def withLinksUpToDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinksUpToDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinksUpToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinksUpToDate")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revision")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleCrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleCrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleCrop")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedDoc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDoc")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SheetNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SheetNames")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Worksheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Worksheets")(js.undefined)
        ret
    }
  }
  
}

