package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.copy
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.html
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.insert
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.paste
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.plain
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.replace
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsClipboard extends js.Object {
  /** You can enable clipboard functionality using the clipboard config option. It can take one of four possible values:
    true - enable clipboard copy and paste
    "copy" - enable only copy functionality
    "paste" - enable only paste functionality
    false - disable all clipboard functionality (default) */
  var clipboard: js.UndefOr[Boolean | copy | paste] = js.native
  /** The clipboardCopied event is triggered whenever data is copied to the clipboard. */
  var clipboardCopied: js.UndefOr[js.Function0[Unit]] = js.native
  /** By default Tabulator includes column headers, row groups and column calculations in the clipboard output.
    You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the clipboardCopyConfig option in the table definition: */
  var clipboardCopyConfig: js.UndefOr[AddditionalExportOptions | Boolean] = js.native
  /**You can alter the finished output to the clipboard using the clipboardCopyFormatter callback. The callback function receives two arguments, the first is a string representing the type of content to be formatted (either "plain" or "html" depending on the type of data entering the clipboard). The second argument is the string that is about to be insered into the clipboard. The function and should return a string that will be inserted into the clipboard */
  var clipboardCopyFormatter: js.UndefOr[table | (js.Function2[/* type */ plain | html, /* output */ String, String])] = js.native
  /** By default Tabulator will include the column header titles in any clipboard data, this can be turned off by passing a value of false to the clipboardCopyHeader property: */
  var clipboardCopyHeader: js.UndefOr[Boolean] = js.native
  /**The clipboardCopyRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the clipboard output: */
  var clipboardCopyRowRange: js.UndefOr[RowRangeLookup] = js.native
  /** By default Tabulator will copy some of the tables styling along with the data to give a better visual appearance when pasted into other documents.
    If you want to only copy the unstyled data then you should set the clipboardCopyStyled option to false in the table options object:  */
  var clipboardCopyStyled: js.UndefOr[Boolean] = js.native
  /** Once the data has been parsed into row data, it will be passed to a paste action to be added to the table. There are three inbuilt paste actions:
    insert - Inserts data into the table using the addRows function (default)
    update - Updates data in the table using the updateOrAddData function
    replace - replaces all data in the table using the setData function */
  var clipboardPasteAction: js.UndefOr[insert | update | replace] = js.native
  /** The clipboardPasteError event is triggered whenever an atempt to paste data into the table has failed because it was rejected by the paste parser. */
  var clipboardPasteError: js.UndefOr[js.Function0[Unit]] = js.native
  /**  Tabulator has one built in paste parser, that is designed to take a table formatted text string from the clipboard and turn it into row data. it breaks the tada into rows on a newline character \n and breaks the rows down to columns on a tab character \t.
    It will then attempt to work out which columns in the data correspond to columns in the table. It tries three different ways to achieve this. First it checks the values of all columns in the first row of data to see if they match the titles of columns in the table. If any of the columns don't match it then tries the same approach but with the column fields. If either of those options match, Tabulator will map those columns to the incoming data and import it into rows. If there is no match then Tabulator will assume the columns in the data are in the same order as the visible columns in the table and import them that way.
    The inbuilt parser will reject any clipboard data that does not contain at least one row and two columns, in that case the clipboardPasteError will be triggered.
    If you extend the clipboard module to add your own parser, you can set it to be used as default with the clipboardPasteParser property.*/
  var clipboardPasteParser: js.UndefOr[String | (js.Function1[/* clipboard */ js.Any, js.Array[_]])] = js.native
  /** The clipboardPasted event is triggered whenever data is successfuly pasted into the table. */
  var clipboardPasted: js.UndefOr[js.Function0[Unit]] = js.native
}

object OptionsClipboard {
  @scala.inline
  def apply(): OptionsClipboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsClipboard]
  }
  @scala.inline
  implicit class OptionsClipboardOps[Self <: OptionsClipboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipboard(value: Boolean | copy | paste): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardCopied(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopied")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClipboardCopied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopied")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardCopyConfig(value: AddditionalExportOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardCopyConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardCopyFormatterFunction2(value: (/* type */ plain | html, /* output */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClipboardCopyFormatter(value: table | (js.Function2[/* type */ plain | html, /* output */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardCopyFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardCopyHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardCopyHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardCopyRowRange(value: RowRangeLookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyRowRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardCopyRowRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyRowRange")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardCopyStyled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyStyled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardCopyStyled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardCopyStyled")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardPasteAction(value: insert | update | replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasteAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardPasteAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasteAction")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardPasteError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasteError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClipboardPasteError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasteError")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardPasteParserFunction1(value: /* clipboard */ js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasteParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClipboardPasteParser(value: String | (js.Function1[/* clipboard */ js.Any, js.Array[_]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasteParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardPasteParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasteParser")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardPasted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClipboardPasted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardPasted")(js.undefined)
        ret
    }
  }
  
}

