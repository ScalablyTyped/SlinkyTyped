package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SPClientTemplates.ChoiceFormatType
import typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode
import typingsSlinky.sharepoint.SPClientTemplates.ClientLookupValue
import typingsSlinky.sharepoint.SPClientTemplates.ClientUrlValue
import typingsSlinky.sharepoint.SPClientTemplates.ClientUserValue
import typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType
import typingsSlinky.sharepoint.SPClientTemplates.RenderContext
import typingsSlinky.sharepoint.SPClientTemplates.RenderContextForm
import typingsSlinky.sharepoint.SPClientTemplates.RichTextMode
import typingsSlinky.sharepoint.SPClientTemplates.TemplateOverridesOptions
import typingsSlinky.sharepoint.SPClientTemplates.Templates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientTemplates {
  
  @JSGlobal("SPClientTemplates.ChoiceFormatType")
  @js.native
  object ChoiceFormatType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.ChoiceFormatType with Double] = js.native
    
    /* 0 */ val Dropdown: typingsSlinky.sharepoint.SPClientTemplates.ChoiceFormatType.Dropdown with Double = js.native
    
    /* 1 */ val Radio: typingsSlinky.sharepoint.SPClientTemplates.ChoiceFormatType.Radio with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.ClientControlMode")
  @js.native
  object ClientControlMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode with Double] = js.native
    
    /* 1 */ val DisplayForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.DisplayForm with Double = js.native
    
    /* 2 */ val EditForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.EditForm with Double = js.native
    
    /* 0 */ val Invalid: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.Invalid with Double = js.native
    
    /* 3 */ val NewForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.NewForm with Double = js.native
    
    /* 4 */ val View: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.View with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.ClientFormContext")
  @js.native
  class ClientFormContext ()
    extends typingsSlinky.sharepoint.SPClientTemplates.ClientFormContext
  
  @JSGlobal("SPClientTemplates.DateTimeCalendarType")
  @js.native
  object DateTimeCalendarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType with Double] = js.native
    
    /* 13 */ val ChineseLunar: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.ChineseLunar with Double = js.native
    
    /* 1 */ val Gregorian: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.Gregorian with Double = js.native
    
    /* 9 */ val GregorianArabic: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianArabic with Double = js.native
    
    /* 8 */ val GregorianMEFrench: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianMEFrench with Double = js.native
    
    /* 10 */ val GregorianXLITEnglish: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianXLITEnglish with Double = js.native
    
    /* 11 */ val GregorianXLITFrench: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianXLITFrench with Double = js.native
    
    /* 7 */ val Hebrew: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.Hebrew with Double = js.native
    
    /* 5 */ val Hijri: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.Hijri with Double = js.native
    
    /* 2 */ val Japan: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.Japan with Double = js.native
    
    /* 4 */ val Korea: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.Korea with Double = js.native
    
    /* 12 */ val KoreaJapanLunar: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.KoreaJapanLunar with Double = js.native
    
    /* 0 */ val None: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.None with Double = js.native
    
    /* 14 */ val SakaEra: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.SakaEra with Double = js.native
    
    /* 3 */ val Taiwan: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.Taiwan with Double = js.native
    
    /* 6 */ val Thai: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.Thai with Double = js.native
    
    /* 15 */ val UmAlQura: typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType.UmAlQura with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
  @js.native
  object DateTimeDisplayFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat with Double] = js.native
    
    /* 0 */ val DateOnly: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateOnly with Double = js.native
    
    /* 1 */ val DateTime: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateTime with Double = js.native
    
    /* 2 */ val TimeOnly: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.TimeOnly with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.FileSystemObjectType")
  @js.native
  object FileSystemObjectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType with Double] = js.native
    
    /* 1 */ val File: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.File with Double = js.native
    
    /* 2 */ val Folder: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.Folder with Double = js.native
    
    /* 0 */ val Invalid: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.Invalid with Double = js.native
    
    /* 3 */ val Web: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.Web with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.RichTextMode")
  @js.native
  object RichTextMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.RichTextMode with Double] = js.native
    
    /* 0 */ val Compatible: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.Compatible with Double = js.native
    
    /* 1 */ val FullHtml: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.FullHtml with Double = js.native
    
    /* 2 */ val HtmlAsXml: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.HtmlAsXml with Double = js.native
    
    /* 3 */ val ThemeHtml: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.ThemeHtml with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.TemplateManager")
  @js.native
  class TemplateManager ()
    extends typingsSlinky.sharepoint.SPClientTemplates.TemplateManager
  object TemplateManager {
    
    /* static member */
    @JSGlobal("SPClientTemplates.TemplateManager.GetTemplates")
    @js.native
    def GetTemplates(renderCtx: RenderContext): Templates = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.TemplateManager.RegisterTemplateOverrides")
    @js.native
    def RegisterTemplateOverrides(renderCtx: TemplateOverridesOptions): Unit = js.native
  }
  
  @JSGlobal("SPClientTemplates.UrlFormatType")
  @js.native
  object UrlFormatType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.UrlFormatType with Double] = js.native
    
    /* 0 */ val Hyperlink: typingsSlinky.sharepoint.SPClientTemplates.UrlFormatType.Hyperlink with Double = js.native
    
    /* 1 */ val Image: typingsSlinky.sharepoint.SPClientTemplates.UrlFormatType.Image with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.UserSelectionMode")
  @js.native
  object UserSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.UserSelectionMode with Double] = js.native
    
    /* 1 */ val PeopleAndGroups: typingsSlinky.sharepoint.SPClientTemplates.UserSelectionMode.PeopleAndGroups with Double = js.native
    
    /* 0 */ val PeopleOnly: typingsSlinky.sharepoint.SPClientTemplates.UserSelectionMode.PeopleOnly with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.Utility")
  @js.native
  class Utility ()
    extends typingsSlinky.sharepoint.SPClientTemplates.Utility
  object Utility {
    
    @JSGlobal("SPClientTemplates.Utility")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents lookup values array in some strange format */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.BuildLookupValuesAsString")
    @js.native
    def BuildLookupValuesAsString(choiceArray: js.Array[ClientLookupValue], isMultiLookup: Boolean, setGroupDesc: Boolean): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ChoiceFormatTypeToString")
    @js.native
    def ChoiceFormatTypeToString(fileSystemObjectType: ChoiceFormatType): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ComputeRegisterTypeInfo")
    @js.native
    def ComputeRegisterTypeInfo(renderCtx: TemplateOverridesOptions): js.Any = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ControlModeToString")
    @js.native
    def ControlModeToString(mode: ClientControlMode): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.FileSystemObjectTypeToString")
    @js.native
    def FileSystemObjectTypeToString(fileSystemObjectType: FileSystemObjectType): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.GetControlOptions")
    @js.native
    def GetControlOptions(control: HTMLElement): js.Any = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.GetFormContextForCurrentField")
    @js.native
    def GetFormContextForCurrentField(context: RenderContextForm): typingsSlinky.sharepoint.SPClientTemplates.ClientFormContext = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.GetPropertiesFromPageContextInfo")
    @js.native
    def GetPropertiesFromPageContextInfo(context: RenderContext): Unit = js.native
    
    /** Creates SP.ClientContext based on the specified Web URL. If the SP.Runtime.js script is not loaded, returns null */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.InitContext")
    @js.native
    def InitContext(webUrl: String): ClientContext = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.IsValidControlMode")
    @js.native
    def IsValidControlMode(mode: Double): Boolean = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ParseLookupValue")
    @js.native
    def ParseLookupValue(valueStr: String): ClientLookupValue = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ParseMultiLookupValues")
    @js.native
    def ParseMultiLookupValues(valueStr: String): js.Array[ClientLookupValue] = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ParseURLValue")
    @js.native
    def ParseURLValue(value: String): ClientUrlValue = js.native
    
    /** Replaces tokens "~site/", "~sitecollection/", "~sitecollectionmasterpagegallery", "{lcid}", "{locale}" and "{siteclienttag}" with appropriate context values */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ReplaceUrlTokens")
    @js.native
    def ReplaceUrlTokens(tokenUrl: String): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.RichTextModeToString")
    @js.native
    def RichTextModeToString(fileSystemObjectType: RichTextMode): String = js.native
    
    /** Removes leading and trailing spaces */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.Trim")
    @js.native
    def Trim(str: String): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.TryParseInitialUserValue")
    @js.native
    def TryParseInitialUserValue(userStr: String): js.Array[ClientUserValue] = js.native
    
    /** Tries to resolve user names from string. Pushes either ClientUserValue (if resolved successfully) or original string (if not) to the resulting array. */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.TryParseUserControlValue")
    @js.native
    def TryParseUserControlValue(userStr: String, separator: String): js.Array[_] = js.native
    
    /** Returns ";#" */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.UserLookupDelimitString")
    @js.native
    def UserLookupDelimitString: String = js.native
    @scala.inline
    def UserLookupDelimitString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserLookupDelimitString")(x.asInstanceOf[js.Any])
    
    /** Returns ";#" */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.UserMultiValueDelimitString")
    @js.native
    def UserMultiValueDelimitString: String = js.native
    @scala.inline
    def UserMultiValueDelimitString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserMultiValueDelimitString")(x.asInstanceOf[js.Any])
  }
}
