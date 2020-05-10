package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsDownload extends js.Object {
  /** The downloadComplete callback is triggered when the user has been prompted to download the file. */
  var downloadComplete: js.UndefOr[js.Function0[Unit]] = js.native
  /** By default Tabulator includes column headers, row groups and column calculations in the download output.
    You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the downloadConfig option in the table definition: */
  var downloadConfig: js.UndefOr[AddditionalExportOptions] = js.native
  /** If you want to make any bulk changes to the table data before it is parsed into the download file you can pass a mutator function to the downloadDataFormatter option in the table definition */
  var downloadDataFormatter: js.UndefOr[js.Function1[/* data */ js.Array[_], _]] = js.native
  /** The downloadReady callback allows you to intercept the download file data before the users is prompted to save the file.
    In order for the download to proceed the downloadReady callback is expected to return a blob of file to be downloaded.
    If you would prefer to abort the download you can return false from this callback. This could be useful for example if you want to send the created file to a server via ajax rather than allowing the user to download the file. */
  var downloadReady: js.UndefOr[js.Function2[/* fileContents */ js.Any, /* blob */ js.Any, _]] = js.native
}

object OptionsDownload {
  @scala.inline
  def apply(): OptionsDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsDownload]
  }
  @scala.inline
  implicit class OptionsDownloadOps[Self <: OptionsDownload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDownloadComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadConfig(value: AddditionalExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadDataFormatter(value: /* data */ js.Array[_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDataFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownloadDataFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDataFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadReady(value: (/* fileContents */ js.Any, /* blob */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadReady")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDownloadReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadReady")(js.undefined)
        ret
    }
  }
  
}

