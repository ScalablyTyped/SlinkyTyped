package typingsSlinky.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageStatistics extends js.Object {
  var bytes: Double = js.native
  var files: Double = js.native
  var filesPercentage: Double = js.native
  var languagePercentage: Double = js.native
  var name: String = js.native
}

object LanguageStatistics {
  @scala.inline
  def apply(bytes: Double, files: Double, filesPercentage: Double, languagePercentage: Double, name: String): LanguageStatistics = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], filesPercentage = filesPercentage.asInstanceOf[js.Any], languagePercentage = languagePercentage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageStatistics]
  }
  @scala.inline
  implicit class LanguageStatisticsOps[Self <: LanguageStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguagePercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languagePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

