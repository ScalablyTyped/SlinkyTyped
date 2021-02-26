package typingsSlinky.uiGrid.mod

import org.scalajs.dom.raw.FileList
import typingsSlinky.angular.JQueryEventObject
import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.anon.AfterCellEdit
import typingsSlinky.uiGrid.anon.BEGINCELLEDIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edit {
  
  @js.native
  trait IColumnDef[TEntity] extends StObject {
    
    /**
      * If specified, either a value or function evaluated before editing cell.
      * If falsy, then editing of cell is not allowed.
      */
    var cellEditableCondition: js.UndefOr[js.Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.native
    
    /** A filter that you would like to apply to the values in the options list of the dropdown */
    var editDropdownFilter: js.UndefOr[String] = js.native
    
    /** the label for the "id" field in the editDropdownOptionsArray. Defaults to 'id' */
    var editDropdownIdLabel: js.UndefOr[String] = js.native
    
    /** an array of values in the format [ {id: xxx, value: xxx} ], which is populated into the edit dropdown */
    var editDropdownOptionsArray: js.UndefOr[js.Array[IEditDropdown]] = js.native
    
    /**
      * a path to a property on row.entity containing an array of values in the format `[{id: xxx, value:
      * xxx}]`,
      * which will be used to populate the edit dropdown.  This can be used when the dropdown values are
      * dependent on the backing row entity.  If this property is set then editDropdownOptionsArray will be
      * ignored.
      */
    var editDropdownRowEntityOptionsArrayPath: js.UndefOr[String] = js.native
    
    /** the label of the 'value' field in the editDropdownOptionsArray.  Defaults to 'value' */
    var editDropdownValueLabel: js.UndefOr[String] = js.native
    
    /**
      * A function that should be called when any files have been chosen by the user.
      * You should use this to process the files appropriately for your application.
      *
      * It passes the gridCol, the gridRow (from which you can get gridRow.entity), and the files.
      * The files are in the format as returned from the file chooser, an array of files,
      * with each having useful information such as:
      *
      * * files[0].lastModifiedDate
      * * files[0].name
      * * files[0].size (appears to be in bytes)
      * * files[0].type (MIME type)
      *
      * Typically you would do something with these files.
      * Most commonly you would use the filename or read the file itself in. This example does both:
      * @example
      editFileChooserCallBack: (gridRow, gridCol, files) => {
      // ignore all but the first file, it can only choose one anyway
      // set the filename into this column
      gridRow.entity.filename = file[0].name;
      // read the file and set it into a hidden column, which we may do stuff with later
      var setFile = function(fileContent){
      gridRow.entity.file = fileContent.currentTarget.result;
      };
      var reader = new FileReader();
      reader.onload = setFile;
      reader.readAsText( files[0] );
      }
      */
    var editFileChooserCallback: js.UndefOr[
        js.Function3[
          /* gridRow */ IGridRowOf[TEntity], 
          /* gridCol */ IGridColumnOf[TEntity], 
          /* files */ FileList, 
          Unit
        ]
      ] = js.native
    
    /**
      * A bindable string value that is used when binding to edit controls instead of colDef.field
      * For example if you have a complex property on an object like:
      * ```typescript
      * state: {abbrev:'MS',name:'Mississippi'}.
      * ```
      * The grid should display `state.name` in the cell and sort/filter based on the state.name property, but
      * the editor requires the full state object. so this let's you bind to that
      * @example
      colDef.field = 'state.name';
      colDef.editModelField = 'state';
      */
    var editModelField: js.UndefOr[String] = js.native
    
    /**
      * Cell template to be used when editing this column. Can be Url or text template.
      * Defaults to gridOptions.editableCellTemplate
      */
    var editableCellTemplate: js.UndefOr[String] = js.native
    
    /** Enable editing on a column */
    var enableCellEdit: js.UndefOr[Boolean] = js.native
    
    /** If true, then editor is invoked as soon as cell receives focus. Default false.
      * _Requires both the cellNav feature and the edit feature to be enabled_
      */
    var enableCellEditOnFocus: js.UndefOr[Boolean] = js.native
  }
  object IColumnDef {
    
    @scala.inline
    def apply[TEntity](): typingsSlinky.uiGrid.mod.edit.IColumnDef[TEntity] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.uiGrid.mod.edit.IColumnDef[TEntity]]
    }
    
    @scala.inline
    implicit class IColumnDefMutableBuilder[Self <: typingsSlinky.uiGrid.mod.edit.IColumnDef[_], TEntity] (val x: Self with typingsSlinky.uiGrid.mod.edit.IColumnDef[TEntity]) extends AnyVal {
      
      @scala.inline
      def setCellEditableCondition(value: js.Any | (js.Function1[/* $scope */ IScope, Boolean])): Self = StObject.set(x, "cellEditableCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellEditableConditionFunction1(value: /* $scope */ IScope => Boolean): Self = StObject.set(x, "cellEditableCondition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditableConditionUndefined: Self = StObject.set(x, "cellEditableCondition", js.undefined)
      
      @scala.inline
      def setEditDropdownFilter(value: String): Self = StObject.set(x, "editDropdownFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditDropdownFilterUndefined: Self = StObject.set(x, "editDropdownFilter", js.undefined)
      
      @scala.inline
      def setEditDropdownIdLabel(value: String): Self = StObject.set(x, "editDropdownIdLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditDropdownIdLabelUndefined: Self = StObject.set(x, "editDropdownIdLabel", js.undefined)
      
      @scala.inline
      def setEditDropdownOptionsArray(value: js.Array[IEditDropdown]): Self = StObject.set(x, "editDropdownOptionsArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditDropdownOptionsArrayUndefined: Self = StObject.set(x, "editDropdownOptionsArray", js.undefined)
      
      @scala.inline
      def setEditDropdownOptionsArrayVarargs(value: IEditDropdown*): Self = StObject.set(x, "editDropdownOptionsArray", js.Array(value :_*))
      
      @scala.inline
      def setEditDropdownRowEntityOptionsArrayPath(value: String): Self = StObject.set(x, "editDropdownRowEntityOptionsArrayPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditDropdownRowEntityOptionsArrayPathUndefined: Self = StObject.set(x, "editDropdownRowEntityOptionsArrayPath", js.undefined)
      
      @scala.inline
      def setEditDropdownValueLabel(value: String): Self = StObject.set(x, "editDropdownValueLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditDropdownValueLabelUndefined: Self = StObject.set(x, "editDropdownValueLabel", js.undefined)
      
      @scala.inline
      def setEditFileChooserCallback(
        value: (/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* files */ FileList) => Unit
      ): Self = StObject.set(x, "editFileChooserCallback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEditFileChooserCallbackUndefined: Self = StObject.set(x, "editFileChooserCallback", js.undefined)
      
      @scala.inline
      def setEditModelField(value: String): Self = StObject.set(x, "editModelField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditModelFieldUndefined: Self = StObject.set(x, "editModelField", js.undefined)
      
      @scala.inline
      def setEditableCellTemplate(value: String): Self = StObject.set(x, "editableCellTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableCellTemplateUndefined: Self = StObject.set(x, "editableCellTemplate", js.undefined)
      
      @scala.inline
      def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellEditOnFocus(value: Boolean): Self = StObject.set(x, "enableCellEditOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellEditOnFocusUndefined: Self = StObject.set(x, "enableCellEditOnFocus", js.undefined)
      
      @scala.inline
      def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    }
  }
  
  @js.native
  trait IEditDropdown extends StObject {
    
    var id: Double | String = js.native
    
    var value: js.Any = js.native
  }
  object IEditDropdown {
    
    @scala.inline
    def apply(id: Double | String, value: js.Any): IEditDropdown = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEditDropdown]
    }
    
    @scala.inline
    implicit class IEditDropdownMutableBuilder[Self <: IEditDropdown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGridEditApi[TEntity] extends StObject {
    
    var on: AfterCellEdit[TEntity] = js.native
  }
  object IGridEditApi {
    
    @scala.inline
    def apply[TEntity](on: AfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridEditApi[TEntity]]
    }
    
    @scala.inline
    implicit class IGridEditApiMutableBuilder[Self <: IGridEditApi[_], TEntity] (val x: Self with IGridEditApi[TEntity]) extends AnyVal {
      
      @scala.inline
      def setOn(value: AfterCellEdit[TEntity]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * If specified, either a value or function to be used by all columns before editing.
      * If falsy, then editing of cell is not allowed
      */
    var cellEditableCondition: js.UndefOr[js.Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.native
    
    /**
      * If specified, cellTemplate to use as the editor for all columns.
      * defaults to 'ui-grid/cellTextEditor'
      * @default 'ui-grid/cellTextEditor'
      */
    var editableCellTemplate: js.UndefOr[String] = js.native
    
    /**
      * If defined, sets the default value for the editable flag on each individual colDefs if their individual
      * enableCellEdit configuration is not defined.
      * Defaults to undefined.
      * @default undefined
      */
    var enableCellEdit: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, then editor is invoked as soon as cell receives focus.
      * Default false.
      * _requires cellNav feature and the edit feature to be enabled_
      * @default false
      */
    var enableCellEditOnFocus: js.UndefOr[Boolean] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typingsSlinky.uiGrid.mod.edit.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.uiGrid.mod.edit.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typingsSlinky.uiGrid.mod.edit.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellEditableCondition(value: js.Any | (js.Function1[/* $scope */ IScope, Boolean])): Self = StObject.set(x, "cellEditableCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellEditableConditionFunction1(value: /* $scope */ IScope => Boolean): Self = StObject.set(x, "cellEditableCondition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditableConditionUndefined: Self = StObject.set(x, "cellEditableCondition", js.undefined)
      
      @scala.inline
      def setEditableCellTemplate(value: String): Self = StObject.set(x, "editableCellTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableCellTemplateUndefined: Self = StObject.set(x, "editableCellTemplate", js.undefined)
      
      @scala.inline
      def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellEditOnFocus(value: Boolean): Self = StObject.set(x, "enableCellEditOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellEditOnFocusUndefined: Self = StObject.set(x, "enableCellEditOnFocus", js.undefined)
      
      @scala.inline
      def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    }
  }
  
  @js.native
  trait IGridRow extends StObject {
    
    /** enable editing on row, grouping for example might disable editing on group header rows */
    var enableCellEdit: js.UndefOr[Boolean] = js.native
  }
  object IGridRow {
    
    @scala.inline
    def apply(): typingsSlinky.uiGrid.mod.edit.IGridRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.uiGrid.mod.edit.IGridRow]
    }
    
    @scala.inline
    implicit class IGridRowMutableBuilder[Self <: typingsSlinky.uiGrid.mod.edit.IGridRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    }
  }
  
  @js.native
  trait IUiGridEditConstants extends StObject {
    
    var EDITABLE_CELL_DIRECTIVE: String = js.native
    
    var EDITABLE_CELL_TEMPLATE: String = js.native
    
    var events: BEGINCELLEDIT = js.native
  }
  object IUiGridEditConstants {
    
    @scala.inline
    def apply(EDITABLE_CELL_DIRECTIVE: String, EDITABLE_CELL_TEMPLATE: String, events: BEGINCELLEDIT): IUiGridEditConstants = {
      val __obj = js.Dynamic.literal(EDITABLE_CELL_DIRECTIVE = EDITABLE_CELL_DIRECTIVE.asInstanceOf[js.Any], EDITABLE_CELL_TEMPLATE = EDITABLE_CELL_TEMPLATE.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridEditConstants]
    }
    
    @scala.inline
    implicit class IUiGridEditConstantsMutableBuilder[Self <: IUiGridEditConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEDITABLE_CELL_DIRECTIVE(value: String): Self = StObject.set(x, "EDITABLE_CELL_DIRECTIVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEDITABLE_CELL_TEMPLATE(value: String): Self = StObject.set(x, "EDITABLE_CELL_TEMPLATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: BEGINCELLEDIT): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  type afterCellEditHandler[TEntity] = js.Function4[
    /* rowEntity */ TEntity, 
    /* colDef */ IColumnDefOf[TEntity], 
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    Unit
  ]
  
  type beginCellEditHandler[TEntity] = js.Function3[
    /* rowEntity */ TEntity, 
    /* colDef */ IColumnDefOf[TEntity], 
    /* triggerEvent */ JQueryEventObject, 
    Unit
  ]
  
  type cancelCellEditHandler[TEntity] = js.Function2[/* rowEntity */ TEntity, /* colDef */ IColumnDefOf[TEntity], Unit]
}
