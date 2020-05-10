package typingsSlinky.tablesorter.widgetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget[TElement] extends js.Object {
  /**
    * The identification of the widget.
    */
  var id: String = js.native
  /**
    * The default options of the widget.
    */
  var options: StringDictionary[js.Any] = js.native
  /**
    * The priority of the widget.
    */
  var priority: Double = js.native
  /**
    * Pre-processes the table after applying a sort.
    *
    * @param table
    * The table which is being processed.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    *
    * @param initializing
    * A value indicating whether the widget is being initialized.
    */
  def format(
    table: TElement,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any],
    initializing: Boolean
  ): Unit = js.native
  /**
    * Initializes the widget.
    *
    * @param table
    * The table which is being processed.
    *
    * @param thisWidget
    * This instance of the widget.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    */
  def init(
    table: TElement,
    thisWidget: this.type,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any]
  ): Unit = js.native
  /**
    * Removes the widget from the table.
    *
    * @param table
    * The table which is being processed.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    *
    * @param refreshing
    * A value indicating whether the widgets are being refreshed.
    */
  def remove(
    table: TElement,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any],
    refreshing: Boolean
  ): Unit = js.native
}

object Widget {
  @scala.inline
  def apply[TElement](
    format: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit,
    id: String,
    init: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[js.Any]) => Unit,
    options: StringDictionary[js.Any],
    priority: Double,
    remove: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
  ): Widget[TElement] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction4(format), id = id.asInstanceOf[js.Any], init = js.Any.fromFunction4(init), options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], remove = js.Any.fromFunction4(remove))
    __obj.asInstanceOf[Widget[TElement]]
  }
  @scala.inline
  implicit class WidgetOps[Self[telement] <: Widget[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withFormat(
      value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(
      value: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[js.Any]) => Unit
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[js.Any]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(
      value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

