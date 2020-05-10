package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumns extends js.Object {
  /**
    * In case of fixed width column format of the CSV data, specifies the dimensions for each column. Some csv files are formatted based
    *  on the idea of "fixed sized columns", not by the standard comma or semicolon "separator". So, the columns array holds the number
    * of characters for each column so that the parser will be able to split each line in the correct way [...]
    */
  var columns: js.UndefOr[js.Any] = js.native
  /**
    * Sets the CSV data directly embedded in the JSON, as a string. However new-line characters are not allowed in the definition of an
    * attribute in json syntax, and therefore the row separator character will likely need also be overridden with the "row-separator" a
    * ttribute if "data-string" is used in place of "url". "Apple,25,34\r\nPear,-16,10\r\nLemon,22,-5\r\nOrange,41,21" | ...
    */
  var `data-string`: js.UndefOr[String] = js.native
  /**
    * Specifies if the CSV data contains descriptive headers for each column as the first or second row (depending on title presence). t
    * rue | false | 1 | 0
    */
  var `horizontal-labels`: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the CSV data should be processed in a mirrored way (per line instead of per column). Note the different format used f
    * or the data-string. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.native
  /**
    * Sets the separator between the data rows when using a data-string instead of an external .CSV file. The default value is "\r\n". "
    * _" | "&" | "\r\n" | ...
    */
  var `row-separator`: js.UndefOr[String] = js.native
  /**
    * Specifies whether or not each column in the csv data should have its own scale on the chart. true | false | 1 | 0
    */
  var `separate-scales`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the separator between the data cells, default is ",". Any single character can be used as a separator. "*" | "/" | "," | ...
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Smart-Scales will analyze the CSV data to determine if each column of data is of a different enough type of data to deserve a sepa
    * rate scale. If it is, smart-scales will assign the unique data columns to separate scales. true | false | 1 | 0
    */
  var `smart-scales`: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the CSV data contains a descriptive title on the first line. If this attribute it not included, then the library look
    * s at the data to decide if the first line is intended to be a title or not. If it thinks it is, The first line will become the tit
    * le of the graph. If there is a title line in the CSV and "title":"true" is set, the first line will be the graph title, but if "ti
    * tle":"false" is specified, that first line will become a scale-label. true | false | 1 | 0
    */
  var title: js.UndefOr[Boolean] = js.native
  /**
    * Sets the url for the CSV data source. "http://www.domain.com/link.php" | "%FILEPATH%/fruit.csv" | "/resources/datacsv.txt" | ...
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Specifies if the CSV data contains descriptive headers for each row. true | false | 1 | 0
    */
  var `vertical-labels`: js.UndefOr[Boolean] = js.native
}

object AnonColumns {
  @scala.inline
  def apply(): AnonColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColumns]
  }
  @scala.inline
  implicit class AnonColumnsOps[Self <: AnonColumns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def `withData-string`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-string`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-string")(js.undefined)
        ret
    }
    @scala.inline
    def `withHorizontal-labels`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal-labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHorizontal-labels`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal-labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMirrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrored")(js.undefined)
        ret
    }
    @scala.inline
    def `withRow-separator`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row-separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRow-separator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row-separator")(js.undefined)
        ret
    }
    @scala.inline
    def `withSeparate-scales`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate-scales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSeparate-scales`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate-scales")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def `withSmart-scales`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart-scales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSmart-scales`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart-scales")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def `withVertical-labels`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical-labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutVertical-labels`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical-labels")(js.undefined)
        ret
    }
  }
  
}

