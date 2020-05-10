package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for options used in Xrm.Utility.lookupObjects
  */
@js.native
trait LookupOptions extends js.Object {
  /**
    * Indicates whether the lookup allows more than one item to be selected.
    */
  var allowMultiSelect: js.UndefOr[Boolean] = js.native
  /**
    * The default entity type to use.
    */
  var defaultEntityType: js.UndefOr[String] = js.native
  /**
    * The default view to use.
    */
  var defaultViewId: js.UndefOr[String] = js.native
  /**
    * The entity types to display.
    */
  var entityTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether the lookup control should show the barcode scanner in mobile clients.
    */
  var showBarcodeScanner: js.UndefOr[Boolean] = js.native
  /**
    * The views to be available in the view picker.Only system views are supported.
    */
  var viewIds: js.UndefOr[js.Array[String]] = js.native
}

object LookupOptions {
  @scala.inline
  def apply(): LookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptions]
  }
  @scala.inline
  implicit class LookupOptionsOps[Self <: LookupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEntityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEntityType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultViewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultViewId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewId")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBarcodeScanner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBarcodeScanner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBarcodeScanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBarcodeScanner")(js.undefined)
        ret
    }
    @scala.inline
    def withViewIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewIds")(js.undefined)
        ret
    }
  }
  
}

