package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarType extends js.Object

@JSGlobal("SP.CalendarType")
@js.native
object CalendarType extends js.Object {
  @js.native
  sealed trait chineseLunar extends CalendarType
  
  @js.native
  sealed trait gregorian extends CalendarType
  
  @js.native
  sealed trait gregorianArabic extends CalendarType
  
  @js.native
  sealed trait gregorianMEFrench extends CalendarType
  
  @js.native
  sealed trait gregorianXLITEnglish extends CalendarType
  
  @js.native
  sealed trait gregorianXLITFrench extends CalendarType
  
  @js.native
  sealed trait hebrew extends CalendarType
  
  @js.native
  sealed trait hijri extends CalendarType
  
  @js.native
  sealed trait japan extends CalendarType
  
  @js.native
  sealed trait korea extends CalendarType
  
  @js.native
  sealed trait koreaJapanLunar extends CalendarType
  
  @js.native
  sealed trait none extends CalendarType
  
  @js.native
  sealed trait sakaEra extends CalendarType
  
  @js.native
  sealed trait taiwan extends CalendarType
  
  @js.native
  sealed trait thai extends CalendarType
  
  @js.native
  sealed trait umAlQura extends CalendarType
  
  /* 13 */ val chineseLunar: typingsSlinky.sharepoint.SP.CalendarType.chineseLunar with Double = js.native
  /* 1 */ val gregorian: typingsSlinky.sharepoint.SP.CalendarType.gregorian with Double = js.native
  /* 9 */ val gregorianArabic: typingsSlinky.sharepoint.SP.CalendarType.gregorianArabic with Double = js.native
  /* 8 */ val gregorianMEFrench: typingsSlinky.sharepoint.SP.CalendarType.gregorianMEFrench with Double = js.native
  /* 10 */ val gregorianXLITEnglish: typingsSlinky.sharepoint.SP.CalendarType.gregorianXLITEnglish with Double = js.native
  /* 11 */ val gregorianXLITFrench: typingsSlinky.sharepoint.SP.CalendarType.gregorianXLITFrench with Double = js.native
  /* 7 */ val hebrew: typingsSlinky.sharepoint.SP.CalendarType.hebrew with Double = js.native
  /* 5 */ val hijri: typingsSlinky.sharepoint.SP.CalendarType.hijri with Double = js.native
  /* 2 */ val japan: typingsSlinky.sharepoint.SP.CalendarType.japan with Double = js.native
  /* 4 */ val korea: typingsSlinky.sharepoint.SP.CalendarType.korea with Double = js.native
  /* 12 */ val koreaJapanLunar: typingsSlinky.sharepoint.SP.CalendarType.koreaJapanLunar with Double = js.native
  /* 0 */ val none: typingsSlinky.sharepoint.SP.CalendarType.none with Double = js.native
  /* 14 */ val sakaEra: typingsSlinky.sharepoint.SP.CalendarType.sakaEra with Double = js.native
  /* 3 */ val taiwan: typingsSlinky.sharepoint.SP.CalendarType.taiwan with Double = js.native
  /* 6 */ val thai: typingsSlinky.sharepoint.SP.CalendarType.thai with Double = js.native
  /* 15 */ val umAlQura: typingsSlinky.sharepoint.SP.CalendarType.umAlQura with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarType with Double] = js.native
}

