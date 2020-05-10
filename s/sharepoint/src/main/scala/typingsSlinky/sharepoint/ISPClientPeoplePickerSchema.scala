package typingsSlinky.sharepoint

import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.UrlZone
import typingsSlinky.sharepoint.SP.Utilities.PrincipalSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ISPClientPeoplePickerSchema extends js.Object {
  var AllUrlZones: js.UndefOr[Boolean] = js.native
  var AllowEmailAddresses: js.UndefOr[Boolean] = js.native
  var AllowMultipleValues: js.UndefOr[Boolean] = js.native
  var AutoFillElementId: js.UndefOr[String] = js.native
  var AutoFillEnabled: js.UndefOr[Boolean] = js.native
  var EditorElementId: js.UndefOr[String] = js.native
  var EnabledClaimProvider: js.UndefOr[String] = js.native
  var ErrorMessage: js.UndefOr[String] = js.native
  var ForceClaims: js.UndefOr[Boolean] = js.native
  var HiddenInputId: js.UndefOr[String] = js.native
  var InitialHelpText: js.UndefOr[String] = js.native
  var InitialHelpTextElementId: js.UndefOr[String] = js.native
  var InitialSuggestions: js.UndefOr[js.Array[ISPClientPeoplePickerEntity]] = js.native
  var MaximumEntitySuggestions: js.UndefOr[Double] = js.native
  var OnUserResolvedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      Unit
    ]
  ] = js.native
  var OnValueChangedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      Unit
    ]
  ] = js.native
  /** Specify User, DL, SecGroup or SPGroup*/
  var PrincipalAccountType: js.UndefOr[String] = js.native
  var Required: js.UndefOr[Boolean] = js.native
  var ResolvePrincipalSource: js.UndefOr[PrincipalSource] = js.native
  var ResolvedListElementId: js.UndefOr[String] = js.native
  var Rows: js.UndefOr[Double] = js.native
  var SearchPrincipalSource: js.UndefOr[PrincipalSource] = js.native
  var SharePointGroupID: js.UndefOr[Double] = js.native
  var TopLevelElementId: js.UndefOr[String] = js.native
  var UrlZone: js.UndefOr[typingsSlinky.sharepoint.SP.UrlZone] = js.native
  var UseLocalSuggestionCache: js.UndefOr[Boolean] = js.native
  var UserNoQueryPermission: js.UndefOr[Boolean] = js.native
  var VisibleSuggestions: js.UndefOr[Double] = js.native
  var WaitImageId: js.UndefOr[String] = js.native
  var WebApplicationID: js.UndefOr[Guid] = js.native
  /** Number or '100%'*/
  var Width: js.UndefOr[js.Any] = js.native
}

object ISPClientPeoplePickerSchema {
  @scala.inline
  def apply(): ISPClientPeoplePickerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISPClientPeoplePickerSchema]
  }
  @scala.inline
  implicit class ISPClientPeoplePickerSchemaOps[Self <: ISPClientPeoplePickerSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllUrlZones(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllUrlZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllUrlZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllUrlZones")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEmailAddresses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowEmailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowEmailAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultipleValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMultipleValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMultipleValues")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditorElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditorElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledClaimProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledClaimProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledClaimProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledClaimProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withForceClaims(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceClaims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceClaims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceClaims")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenInputId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiddenInputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenInputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiddenInputId")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialHelpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialHelpText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialHelpText")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialHelpTextElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialHelpTextElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialHelpTextElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialHelpTextElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSuggestions(value: js.Array[ISPClientPeoplePickerEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumEntitySuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumEntitySuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumEntitySuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumEntitySuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserResolvedClientScript(value: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUserResolvedClientScript")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUserResolvedClientScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUserResolvedClientScript")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChangedClientScript(value: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnValueChangedClientScript")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnValueChangedClientScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnValueChangedClientScript")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalAccountType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalAccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalAccountType")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvePrincipalSource(value: PrincipalSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvePrincipalSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvePrincipalSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvePrincipalSource")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedListElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedListElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedListElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedListElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPrincipalSource(value: PrincipalSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchPrincipalSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPrincipalSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchPrincipalSource")(js.undefined)
        ret
    }
    @scala.inline
    def withSharePointGroupID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointGroupID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharePointGroupID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointGroupID")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLevelElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopLevelElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLevelElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopLevelElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlZone(value: UrlZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UrlZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UrlZone")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLocalSuggestionCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLocalSuggestionCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLocalSuggestionCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLocalSuggestionCache")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNoQueryPermission(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserNoQueryPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNoQueryPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserNoQueryPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleSuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WaitImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WaitImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withWebApplicationID(value: Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebApplicationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApplicationID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebApplicationID")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(js.undefined)
        ret
    }
  }
  
}

