package typingsSlinky.uiGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ICellClassGetter[TEntity] = js.Function5[
    /* grid */ js.UndefOr[typingsSlinky.uiGrid.mod.IGridInstanceOf[TEntity]], 
    /* gridRow */ js.UndefOr[typingsSlinky.uiGrid.mod.IGridRowOf[TEntity]], 
    /* gridCol */ js.UndefOr[typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity]], 
    /* rowRenderIndex */ js.UndefOr[scala.Double], 
    /* colRenderIndex */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  
  type ICellTooltipGetter[TEntity] = js.Function2[
    /* gridRow */ typingsSlinky.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridCol */ typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity], 
    java.lang.String
  ]
  
  type IColumnBuilder[TEntity] = js.Function3[
    /* colDef */ typingsSlinky.uiGrid.mod.IColumnDefOf[TEntity], 
    /* col */ typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity], 
    /* gridOptions */ typingsSlinky.uiGrid.mod.IGridOptionsOf[TEntity], 
    scala.Unit
  ]
  
  type IColumnDef = typingsSlinky.uiGrid.mod.IColumnDefOf[js.Any]
  
  type IColumnProcessor[TEntity] = js.Function2[
    /* renderedColumnsToProcess */ js.Array[typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity]], 
    /* rows */ js.Array[typingsSlinky.uiGrid.mod.IGridRowOf[TEntity]], 
    js.Array[typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity]]
  ]
  
  type IGridApi = typingsSlinky.uiGrid.mod.IGridApiOf[js.Any]
  
  type IGridColumn = typingsSlinky.uiGrid.mod.IGridColumnOf[js.Any]
  
  type IGridInstance = typingsSlinky.uiGrid.mod.IGridInstanceOf[js.Any]
  
  type IGridOptions = typingsSlinky.uiGrid.mod.IGridOptionsOf[js.Any]
  
  type IGridRow = typingsSlinky.uiGrid.mod.IGridRowOf[js.Any]
  
  type IHeaderFooterCellClassGetter[TEntity] = js.Function5[
    /* grid */ typingsSlinky.uiGrid.mod.IGridInstanceOf[TEntity], 
    /* gridRow */ typingsSlinky.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridCol */ typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity], 
    /* rowRenderIndex */ scala.Double, 
    /* colRenderIndex */ scala.Double, 
    java.lang.String
  ]
  
  type IHeaderTooltipGetter[TEntity] = js.Function1[/* gridCol */ typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity], java.lang.String]
  
  type IRowBuilder[TEntity] = js.Function2[
    /* row */ typingsSlinky.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridOptions */ typingsSlinky.uiGrid.mod.IGridOptionsOf[TEntity], 
    scala.Unit
  ]
  
  type IRowProcessor[TEntity] = js.Function2[
    /* renderedRowsToProcess */ js.Array[typingsSlinky.uiGrid.mod.IGridRowOf[TEntity]], 
    /* columns */ js.Array[typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity]], 
    js.Array[typingsSlinky.uiGrid.mod.IGridRowOf[TEntity]]
  ]
  
  type IStyleComputation = js.Function1[/* $scope */ typingsSlinky.angular.mod.IScope, java.lang.String]
  
  type canvasHeightChangedHandler = js.Function2[/* oldHeight */ scala.Double, /* newHeight */ scala.Double, scala.Unit]
  
  type columnVisibilityChangedHandler[TEntity] = js.Function1[/* column */ typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity], scala.Unit]
  
  type filterChangedHandler[TEntity] = js.Function1[/* gridApi */ typingsSlinky.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  
  type rowsRenderedHandler[TEntity] = js.Function1[/* gridApi */ typingsSlinky.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  
  type rowsVisibleChangedHandler[TEntity] = js.Function1[/* gridApi */ typingsSlinky.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  
  type scrollBeginHandler = js.Function1[/* scrollEvent */ typingsSlinky.angular.JQueryMouseEventObject, scala.Unit]
  
  type scrollEndHandler = js.Function1[/* scrollEvent */ typingsSlinky.angular.JQueryMouseEventObject, scala.Unit]
  
  type sortChangedHandler[TEntity] = js.Function2[
    /* grid */ typingsSlinky.uiGrid.mod.IGridInstanceOf[TEntity], 
    /* columns */ js.Array[typingsSlinky.uiGrid.mod.IGridColumnOf[TEntity]], 
    scala.Unit
  ]
}
