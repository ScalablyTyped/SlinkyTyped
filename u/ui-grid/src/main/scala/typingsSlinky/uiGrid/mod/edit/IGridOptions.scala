package typingsSlinky.uiGrid.mod.edit

import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
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
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellEditableConditionFunction1(value: /* $scope */ IScope => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditableCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellEditableCondition(value: js.Any | (js.Function1[/* $scope */ IScope, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditableCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEditableCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditableCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableCellTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditableCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellEditOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEditOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellEditOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEditOnFocus")(js.undefined)
        ret
    }
  }
  
}

