package typingsSlinky.tabulatorTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Tabulator {
  type CellEditEventCallback = js.Function1[/* cell */ typingsSlinky.tabulatorTables.Tabulator.CellComponent, scala.Unit]
  type CellEventCallback = js.Function2[
    /* e */ js.Any, 
    /* cell */ typingsSlinky.tabulatorTables.Tabulator.CellComponent, 
    scala.Unit
  ]
  type Color = java.lang.String | js.Array[js.Any] | typingsSlinky.tabulatorTables.Tabulator.ValueStringCallback
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.avg
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.max
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.min
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.sum
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.concat
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.count
    - js.Function3[
  / * values * / js.Array[js.Any], 
  / * data * / js.Array[js.Any], 
  / * calcParams * / js.Object, 
  scala.Double]
  */
  type ColumnCalc = typingsSlinky.tabulatorTables.Tabulator._ColumnCalc | (js.Function3[
    /* values */ js.Array[js.Any], 
    /* data */ js.Array[js.Any], 
    /* calcParams */ js.Object, 
    scala.Double
  ])
  type ColumnCalcParams = js.Function2[/* values */ js.Any, /* data */ js.Any, js.Any]
  type ColumnEventCallback = js.Function2[
    /* e */ js.Any, 
    /* column */ typingsSlinky.tabulatorTables.Tabulator.ColumnComponent, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabulatorTables.Tabulator.ColumnComponent
    - typingsSlinky.tabulatorTables.Tabulator.ColumnDefinition
    - typingsSlinky.std.HTMLElement
    - java.lang.String
  */
  type ColumnLookup = typingsSlinky.tabulatorTables.Tabulator._ColumnLookup | org.scalajs.dom.raw.HTMLElement | java.lang.String
  type ColumnSorterParamLookupFunction = js.Function2[
    /* column */ typingsSlinky.tabulatorTables.Tabulator.ColumnComponent, 
    /* dir */ typingsSlinky.tabulatorTables.Tabulator.SortDirection, 
    js.Object
  ]
  type CustomAccessor = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsSlinky.tabulatorTables.tabulatorTablesStrings.data | typingsSlinky.tabulatorTables.tabulatorTablesStrings.download | typingsSlinky.tabulatorTables.tabulatorTablesStrings.clipboard, 
    /* AccessorParams */ js.Any, 
    /* column */ js.UndefOr[typingsSlinky.tabulatorTables.Tabulator.ColumnComponent], 
    js.Any
  ]
  type CustomAccessorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsSlinky.tabulatorTables.tabulatorTablesStrings.data | typingsSlinky.tabulatorTables.tabulatorTablesStrings.download | typingsSlinky.tabulatorTables.tabulatorTablesStrings.clipboard, 
    /* column */ js.UndefOr[typingsSlinky.tabulatorTables.Tabulator.ColumnComponent], 
    js.Any
  ])
  type CustomMutator = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsSlinky.tabulatorTables.tabulatorTablesStrings.data | typingsSlinky.tabulatorTables.tabulatorTablesStrings.edit, 
    /* mutatorParams */ js.Any, 
    /* cell */ js.UndefOr[typingsSlinky.tabulatorTables.Tabulator.CellComponent], 
    js.Any
  ]
  type CustomMutatorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsSlinky.tabulatorTables.tabulatorTablesStrings.data | typingsSlinky.tabulatorTables.tabulatorTablesStrings.edit, 
    /* cell */ js.UndefOr[typingsSlinky.tabulatorTables.Tabulator.CellComponent], 
    js.Any
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.input
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.textarea
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.number
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.range
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.tickCross
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.star
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.select
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.autocomplete
    - js.Function5[
  / * cell * / typingsSlinky.tabulatorTables.Tabulator.CellComponent, 
  / * onRendered * / typingsSlinky.tabulatorTables.Tabulator.EmptyCallback, 
  / * success * / typingsSlinky.tabulatorTables.Tabulator.ValueBooleanCallback, 
  / * cancel * / typingsSlinky.tabulatorTables.Tabulator.ValueVoidCallback, 
  / * editorParams * / js.Object, 
  typingsSlinky.std.HTMLElement | typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`]
  */
  type Editor = typingsSlinky.tabulatorTables.Tabulator._Editor | (js.Function5[
    /* cell */ typingsSlinky.tabulatorTables.Tabulator.CellComponent, 
    /* onRendered */ typingsSlinky.tabulatorTables.Tabulator.EmptyCallback, 
    /* success */ typingsSlinky.tabulatorTables.Tabulator.ValueBooleanCallback, 
    /* cancel */ typingsSlinky.tabulatorTables.Tabulator.ValueVoidCallback, 
    /* editorParams */ js.Object, 
    org.scalajs.dom.raw.HTMLElement | typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabulatorTables.Tabulator.NumberParams
    - typingsSlinky.tabulatorTables.Tabulator.CheckboxParams
    - typingsSlinky.tabulatorTables.Tabulator.SelectParams
    - typingsSlinky.tabulatorTables.Tabulator.AutoCompleteParams
    - typingsSlinky.tabulatorTables.Tabulator.InputParams
    - typingsSlinky.tabulatorTables.Tabulator.TextAreaParams
    - js.Function1[/ * cell * / typingsSlinky.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type EditorParams = typingsSlinky.tabulatorTables.Tabulator._EditorParams | (js.Function1[/* cell */ typingsSlinky.tabulatorTables.Tabulator.CellComponent, js.Object])
  type EmptyCallback = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  type FilterFunction = js.Function3[
    /* field */ java.lang.String, 
    /* type */ typingsSlinky.tabulatorTables.Tabulator.FilterType, 
    /* value */ js.Any, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.plaintext
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.textarea
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.html
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.money
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.image
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetime
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetimediff
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.link
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.tickCross
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.color
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.star
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.traffic
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.progress
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.lookup
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonTick
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonCross
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.rownum
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.handle
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowSelection
    - typingsSlinky.tabulatorTables.tabulatorTablesStrings.responsiveCollapse
    - js.Function3[
  / * cell * / typingsSlinky.tabulatorTables.Tabulator.CellComponent, 
  / * formatterParams * / js.Object, 
  / * onRendered * / typingsSlinky.tabulatorTables.Tabulator.EmptyCallback, 
  java.lang.String | typingsSlinky.std.HTMLElement]
  */
  type Formatter = typingsSlinky.tabulatorTables.Tabulator._Formatter | (js.Function3[
    /* cell */ typingsSlinky.tabulatorTables.Tabulator.CellComponent, 
    /* formatterParams */ js.Object, 
    /* onRendered */ typingsSlinky.tabulatorTables.Tabulator.EmptyCallback, 
    java.lang.String | org.scalajs.dom.raw.HTMLElement
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabulatorTables.Tabulator.MoneyParams
    - typingsSlinky.tabulatorTables.Tabulator.ImageParams
    - typingsSlinky.tabulatorTables.Tabulator.LinkParams
    - typingsSlinky.tabulatorTables.Tabulator.DateTimeParams
    - typingsSlinky.tabulatorTables.Tabulator.DateTimeDifferenceParams
    - typingsSlinky.tabulatorTables.Tabulator.TickCrossParams
    - typingsSlinky.tabulatorTables.Tabulator.TrafficParams
    - typingsSlinky.tabulatorTables.Tabulator.StarRatingParams
    - typingsSlinky.tabulatorTables.Tabulator.JSONRecord
    - js.Function1[/ * cell * / typingsSlinky.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type FormatterParams = typingsSlinky.tabulatorTables.Tabulator._FormatterParams | (js.Function1[/* cell */ typingsSlinky.tabulatorTables.Tabulator.CellComponent, js.Object]) | typingsSlinky.tabulatorTables.Tabulator.JSONRecord
  type GlobalTooltipOption = scala.Boolean | (js.Function1[/* cell */ typingsSlinky.tabulatorTables.Tabulator.CellComponent, java.lang.String])
  type GroupEventCallback = js.Function2[
    /* e */ js.Any, 
    /* group */ typingsSlinky.tabulatorTables.Tabulator.GroupComponent, 
    scala.Unit
  ]
  type JSONRecord = typingsSlinky.std.Record[java.lang.String, java.lang.String | scala.Double | scala.Boolean]
  type RowChangedCallback = js.Function1[/* row */ typingsSlinky.tabulatorTables.Tabulator.RowComponent, scala.Unit]
  type RowEventCallback = js.Function2[
    /* e */ js.Any, 
    /* row */ typingsSlinky.tabulatorTables.Tabulator.RowComponent, 
    scala.Unit
  ]
  type RowLookup = typingsSlinky.tabulatorTables.Tabulator.RowComponent | org.scalajs.dom.raw.HTMLElement | java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String])
  type StandardStringParam = java.lang.String | org.scalajs.dom.raw.HTMLElement | (js.Function0[java.lang.String | org.scalajs.dom.raw.HTMLElement])
  type ValueBooleanCallback = js.Function1[/* value */ js.Any, scala.Boolean]
  type ValueStringCallback = js.Function1[/* value */ js.Any, java.lang.String]
  type ValueVoidCallback = js.Function1[/* value */ js.Any, scala.Unit]
}
