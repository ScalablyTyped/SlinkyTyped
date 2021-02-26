package typingsSlinky.uiGrid.mod

import typingsSlinky.uiGrid.anon.AVG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeView {
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * Enable row tree view for entire grid.
      * Defaults to true
      * @default true
      */
    var enableTreeView: js.UndefOr[Boolean] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typingsSlinky.uiGrid.mod.treeView.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.uiGrid.mod.treeView.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typingsSlinky.uiGrid.mod.treeView.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableTreeView(value: Boolean): Self = StObject.set(x, "enableTreeView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTreeViewUndefined: Self = StObject.set(x, "enableTreeView", js.undefined)
    }
  }
  
  @js.native
  trait IUiGridTreeViewConstants extends ISharedTreeConstants {
    
    var featureName: String = js.native
  }
  object IUiGridTreeViewConstants {
    
    @scala.inline
    def apply(
      COLLAPSED: String,
      EXPANDED: String,
      aggregation: AVG_,
      featureName: String,
      rowHeaderColName: String
    ): IUiGridTreeViewConstants = {
      val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridTreeViewConstants]
    }
    
    @scala.inline
    implicit class IUiGridTreeViewConstantsMutableBuilder[Self <: IUiGridTreeViewConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    }
  }
}
