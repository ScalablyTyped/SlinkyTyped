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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientTemplates")
@js.native
object SPClientTemplates extends js.Object {
  @js.native
  class ClientFormContext ()
    extends typingsSlinky.sharepoint.SPClientTemplates.ClientFormContext
  
  @js.native
  class TemplateManager ()
    extends typingsSlinky.sharepoint.SPClientTemplates.TemplateManager
  
  @js.native
  class Utility ()
    extends typingsSlinky.sharepoint.SPClientTemplates.Utility
  
  @js.native
  object ChoiceFormatType extends js.Object {
    /* 0 */ val Dropdown: typingsSlinky.sharepoint.SPClientTemplates.ChoiceFormatType.Dropdown with Double = js.native
    /* 1 */ val Radio: typingsSlinky.sharepoint.SPClientTemplates.ChoiceFormatType.Radio with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.ChoiceFormatType with Double] = js.native
  }
  
  @js.native
  object ClientControlMode extends js.Object {
    /* 1 */ val DisplayForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.DisplayForm with Double = js.native
    /* 2 */ val EditForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.EditForm with Double = js.native
    /* 0 */ val Invalid: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.Invalid with Double = js.native
    /* 3 */ val NewForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.NewForm with Double = js.native
    /* 4 */ val View: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.View with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode with Double] = js.native
  }
  
  @js.native
  object DateTimeCalendarType extends js.Object {
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.DateTimeCalendarType with Double] = js.native
  }
  
  @js.native
  object DateTimeDisplayFormat extends js.Object {
    /* 0 */ val DateOnly: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateOnly with Double = js.native
    /* 1 */ val DateTime: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateTime with Double = js.native
    /* 2 */ val TimeOnly: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.TimeOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat with Double] = js.native
  }
  
  @js.native
  object FileSystemObjectType extends js.Object {
    /* 1 */ val File: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.File with Double = js.native
    /* 2 */ val Folder: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.Folder with Double = js.native
    /* 0 */ val Invalid: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.Invalid with Double = js.native
    /* 3 */ val Web: typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType.Web with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.FileSystemObjectType with Double] = js.native
  }
  
  @js.native
  object RichTextMode extends js.Object {
    /* 0 */ val Compatible: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.Compatible with Double = js.native
    /* 1 */ val FullHtml: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.FullHtml with Double = js.native
    /* 2 */ val HtmlAsXml: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.HtmlAsXml with Double = js.native
    /* 3 */ val ThemeHtml: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode.ThemeHtml with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.RichTextMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object TemplateManager extends js.Object {
    def GetTemplates(renderCtx: RenderContext): Templates = js.native
    def RegisterTemplateOverrides(renderCtx: TemplateOverridesOptions): Unit = js.native
  }
  
  @js.native
  object UrlFormatType extends js.Object {
    /* 0 */ val Hyperlink: typingsSlinky.sharepoint.SPClientTemplates.UrlFormatType.Hyperlink with Double = js.native
    /* 1 */ val Image: typingsSlinky.sharepoint.SPClientTemplates.UrlFormatType.Image with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.UrlFormatType with Double] = js.native
  }
  
  @js.native
  object UserSelectionMode extends js.Object {
    /* 1 */ val PeopleAndGroups: typingsSlinky.sharepoint.SPClientTemplates.UserSelectionMode.PeopleAndGroups with Double = js.native
    /* 0 */ val PeopleOnly: typingsSlinky.sharepoint.SPClientTemplates.UserSelectionMode.PeopleOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.UserSelectionMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Utility extends js.Object {
    /** Returns ";#" */
    var UserLookupDelimitString: String = js.native
    /** Returns ";#" */
    var UserMultiValueDelimitString: String = js.native
    /** Represents lookup values array in some strange format */
    def BuildLookupValuesAsString(choiceArray: js.Array[ClientLookupValue], isMultiLookup: Boolean, setGroupDesc: Boolean): String = js.native
    def ChoiceFormatTypeToString(fileSystemObjectType: ChoiceFormatType): String = js.native
    def ComputeRegisterTypeInfo(renderCtx: TemplateOverridesOptions): js.Any = js.native
    def ControlModeToString(mode: ClientControlMode): String = js.native
    def FileSystemObjectTypeToString(fileSystemObjectType: FileSystemObjectType): String = js.native
    def GetControlOptions(control: HTMLElement): js.Any = js.native
    def GetFormContextForCurrentField(context: RenderContextForm): typingsSlinky.sharepoint.SPClientTemplates.ClientFormContext = js.native
    def GetPropertiesFromPageContextInfo(context: RenderContext): Unit = js.native
    /** Creates SP.ClientContext based on the specified Web URL. If the SP.Runtime.js script is not loaded, returns null */
    def InitContext(webUrl: String): ClientContext = js.native
    def IsValidControlMode(mode: Double): Boolean = js.native
    def ParseLookupValue(valueStr: String): ClientLookupValue = js.native
    def ParseMultiLookupValues(valueStr: String): js.Array[ClientLookupValue] = js.native
    def ParseURLValue(value: String): ClientUrlValue = js.native
    /** Replaces tokens "~site/", "~sitecollection/", "~sitecollectionmasterpagegallery", "{lcid}", "{locale}" and "{siteclienttag}" with appropriate context values */
    def ReplaceUrlTokens(tokenUrl: String): String = js.native
    def RichTextModeToString(fileSystemObjectType: RichTextMode): String = js.native
    /** Removes leading and trailing spaces */
    def Trim(str: String): String = js.native
    def TryParseInitialUserValue(userStr: String): js.Array[ClientUserValue] = js.native
    /** Tries to resolve user names from string. Pushes either ClientUserValue (if resolved successfully) or original string (if not) to the resulting array. */
    def TryParseUserControlValue(userStr: String, separator: String): js.Array[_] = js.native
  }
  
}

