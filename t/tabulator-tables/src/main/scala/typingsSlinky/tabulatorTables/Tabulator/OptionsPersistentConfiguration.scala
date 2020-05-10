package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.columns
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.cookie
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.filter
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.group
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.local
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.page
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPersistentConfiguration extends js.Object {
  /**By setting the persistence property to true the table will persist the sort, filter, group (groupBy, groupStartOpen, groupHeader), pagination (paginationSize), and column (title, width, visibility, order) configuration of the table */
  var persistence: js.UndefOr[`true` | PersistenceOptions] = js.native
  /** ID tag used to identify persistent storage information	 */
  var persistenceID: js.UndefOr[String] = js.native
  /**  Persistence information can either be stored in a cookie or in the localSotrage object, you can use the persistenceMode to choose which. It can take three possible values:
    local - (string) Store the persistence information in the localStorage object
    cookie - (string) Store the persistence information in a cookie
    true - (boolean) check if localStorage is available and store persistence information, otherwise store in cookie (Default option)	*/
  var persistenceMode: js.UndefOr[local | cookie | `true`] = js.native
  /**The persistenceReaderFunc function will receive two arguments, the persistance id of the table, and the type of data to be written. This function must synchronously return the data in the format in which it was passed to the persistenceWriterFunc function. It should return a value of false if no data was present */
  var persistenceReaderFunc: js.UndefOr[
    js.Function2[/* id */ String, /* type */ sort | filter | group | page | columns, _]
  ] = js.native
  /**The persistenceWriterFunc function will receive three arguments, the persistance id of the table, the type of data to be written and an object or array representing the data */
  var persistenceWriterFunc: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* type */ sort | filter | group | page | columns, 
      /* data */ js.Any, 
      _
    ]
  ] = js.native
  /**  You can ensure the data filtering is stored for the next page load by setting the persistentFilter option to true*/
  var persistentFilter: js.UndefOr[Boolean] = js.native
  /** Enable persistsnt storage of column layout information	 */
  var persistentLayout: js.UndefOr[Boolean] = js.native
  /** You can ensure the data sorting is stored for the next page load by setting the persistentSort option to true */
  var persistentSort: js.UndefOr[Boolean] = js.native
}

object OptionsPersistentConfiguration {
  @scala.inline
  def apply(): OptionsPersistentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPersistentConfiguration]
  }
  @scala.inline
  implicit class OptionsPersistentConfigurationOps[Self <: OptionsPersistentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersistence(value: `true` | PersistenceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistenceID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceID")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceMode(value: local | cookie | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistenceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceReaderFunc(value: (/* id */ String, /* type */ sort | filter | group | page | columns) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceReaderFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPersistenceReaderFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceReaderFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceWriterFunc(
      value: (/* id */ String, /* type */ sort | filter | group | page | columns, /* data */ js.Any) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceWriterFunc")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPersistenceWriterFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceWriterFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentSort")(js.undefined)
        ret
    }
  }
  
}

