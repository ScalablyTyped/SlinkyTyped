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
  type ColumnCalcParams = js.Function2[/* values */ js.Any, /* data */ js.Any, js.Any]
  type ColumnEventCallback = js.Function2[
    /* e */ js.Any, 
    /* column */ typingsSlinky.tabulatorTables.Tabulator.ColumnComponent, 
    scala.Unit
  ]
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
  type CustomMutator = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsSlinky.tabulatorTables.tabulatorTablesStrings.data | typingsSlinky.tabulatorTables.tabulatorTablesStrings.edit, 
    /* mutatorParams */ js.Any, 
    /* cell */ js.UndefOr[typingsSlinky.tabulatorTables.Tabulator.CellComponent], 
    js.Any
  ]
  type EmptyCallback = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  type FilterFunction = js.Function3[
    /* field */ java.lang.String, 
    /* type */ typingsSlinky.tabulatorTables.Tabulator.FilterType, 
    /* value */ js.Any, 
    scala.Unit
  ]
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
  type ValueBooleanCallback = js.Function1[/* value */ js.Any, scala.Boolean]
  type ValueStringCallback = js.Function1[/* value */ js.Any, java.lang.String]
  type ValueVoidCallback = js.Function1[/* value */ js.Any, scala.Unit]
}
