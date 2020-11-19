package typingsSlinky.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.ISPClientPeoplePickerEntity
import typingsSlinky.sharepoint.ISPClientPeoplePickerSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientPeoplePicker")
@js.native
class SPClientPeoplePicker ()
  extends typingsSlinky.sharepoint.SPClientPeoplePicker
/* static members */
@JSGlobal("SPClientPeoplePicker")
@js.native
object SPClientPeoplePicker extends js.Object {
  
  def AddAutoFillMetaData(
    pickerObj: typingsSlinky.sharepoint.SPClientPeoplePicker,
    options: js.Array[ISPClientPeoplePickerEntity],
    numOpts: Double
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  def AugmentEntity(entity: ISPClientPeoplePickerEntity): ISPClientPeoplePickerEntity = js.native
  
  def AugmentEntitySuggestions(
    pickerObj: typingsSlinky.sharepoint.SPClientPeoplePicker,
    allEntities: js.Array[ISPClientPeoplePickerEntity]
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  def AugmentEntitySuggestions(
    pickerObj: typingsSlinky.sharepoint.SPClientPeoplePicker,
    allEntities: js.Array[ISPClientPeoplePickerEntity],
    mergeLocal: Boolean
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  def BuildAutoFillMenuItems(
    pickerObj: typingsSlinky.sharepoint.SPClientPeoplePicker,
    options: js.Array[ISPClientPeoplePickerEntity]
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  def BuildUnresolvedEntity(key: String, dispText: String): ISPClientPeoplePickerEntity = js.native
  
  def CreateSPPrincipalType(acctStr: String): Double = js.native
  
   // = 'Title';
  var DescriptionName: String = js.native
  
   // = 'Key';
  var DisplayTextName: String = js.native
  
   // = 'AutoFillKey';
  var DisplayTextProperty: String = js.native
  
   // = 'AutoFillTitleText';
  var DomainProperty: String = js.native
  
  def GetTopLevelControl(elmChild: HTMLElement): HTMLElement = js.native
  
  def InitializeStandalonePeoplePicker(
    clientId: String,
    value: js.Array[ISPClientPeoplePickerEntity],
    schema: ISPClientPeoplePickerSchema
  ): Unit = js.native
  
  def IsUserEntity(entity: ISPClientPeoplePickerEntity): Boolean = js.native
  
   // = "UNVALIDATED_EMAIL_ADDRESS";
  var KeyProperty: String = js.native
  
  def ParseUserKeyPaste(userKey: String): String = js.native
  
  def PickerObjectFromSubElement(elmSubElement: HTMLElement): typingsSlinky.sharepoint.SPClientPeoplePicker = js.native
  
   // = 'Description';
  var SIPAddressName: String = js.native
  
   // = 'DomainText';
  var SPClientPeoplePickerDict: StringDictionary[typingsSlinky.sharepoint.SPClientPeoplePicker] = js.native
  
   // = 'DisplayText';
  var SubDisplayTextName: String = js.native
  
   // = 'AutoFillDisplayText';
  var SubDisplayTextProperty: String = js.native
  
   // = 'SIPAddress';
  var SuggestionsName: String = js.native
  
  def TestLocalMatch(strSearchLower: String, dataEntity: ISPClientPeoplePickerEntity): Boolean = js.native
  
   // = 'AutoFillSubDisplayText';
  var TitleTextProperty: String = js.native
  
   // = 'MultipleMatches';
  var UnvalidatedEmailAddressKey: String = js.native
  
  var ValueName: String = js.native
}
