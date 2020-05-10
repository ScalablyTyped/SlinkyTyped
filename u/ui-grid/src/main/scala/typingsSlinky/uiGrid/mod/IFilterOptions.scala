package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterOptions extends js.Object {
  /**
    * String that will be set to the <input>.ariaLabel attribute. This is what is read as a label to screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * condition defines how rows are chosen as matching the filter term.
    * This can be set to one of the constants in uiGridConstants.filter,
    * or you can supply a custom filter function that gets passed the
    * following arguments: [searchTerm, cellValue, row, column].
    */
  var condition: js.UndefOr[
    Double | (js.Function4[
      /* searchTerm */ String, 
      /* cellValue */ js.Any, 
      /* row */ IGridRow, 
      /* column */ IGridColumn, 
      Boolean
    ])
  ] = js.native
  /**
    * If set to true then the 'x' button that cancels/clears the filter will not be shown.
    * @default false
    */
  var disableCancelFilterButton: js.UndefOr[Boolean] = js.native
  /**
    * only flag currently available is caseSensitive, set to false if you don't want case sensitive matching
    */
  var flags: js.UndefOr[IFilterFlags] = js.native
  /**
    * set this to true if you have defined a custom function in condition,
    * and your custom function doesn't require a term
    * (so it can run even when the term is null)
    */
  var noTerm: js.UndefOr[Boolean] = js.native
  /** String that will be set to the <input>.placeholder attribute */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * options in the format [{ value: 1, label: 'male' }]. No i18n filter is provided, you need to perform the i18n
    * on the values before you provide them
    */
  var selectOptions: js.UndefOr[js.Array[ISelectOption]] = js.native
  /**
    * If set, the filter field will be pre-populated with this value
    */
  var term: js.UndefOr[String] = js.native
  /**
    * defaults to uiGridConstants.filter.INPUT, which gives a text box. If set to uiGridConstants.filter.SELECT
    * then a select box will be shown with options selectOptions
    */
  var `type`: js.UndefOr[Double | String] = js.native
}

object IFilterOptions {
  @scala.inline
  def apply(): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterOptions]
  }
  @scala.inline
  implicit class IFilterOptionsOps[Self <: IFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionFunction4(
      value: (/* searchTerm */ String, /* cellValue */ js.Any, /* row */ IGridRow, /* column */ IGridColumn) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCondition(
      value: Double | (js.Function4[
          /* searchTerm */ String, 
          /* cellValue */ js.Any, 
          /* row */ IGridRow, 
          /* column */ IGridColumn, 
          Boolean
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCancelFilterButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCancelFilterButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCancelFilterButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCancelFilterButton")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: IFilterFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTerm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTerm")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOptions(value: js.Array[ISelectOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

