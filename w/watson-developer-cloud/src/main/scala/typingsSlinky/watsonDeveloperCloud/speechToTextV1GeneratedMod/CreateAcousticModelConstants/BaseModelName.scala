package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateAcousticModelConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BaseModelName extends js.Object
/** The name of the base language model that is to be customized by the new custom acoustic model. The new custom model can be used only with the base model that it customizes. To determine whether a base model supports acoustic model customization, refer to [Language support for customization](https://cloud.ibm.com/docs/services/speech-to-text/custom.html#languageSupport). */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateAcousticModelConstants.BaseModelName")
@js.native
object BaseModelName extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BaseModelName with String] = js.native
  
  @js.native
  sealed trait AR_AR_BROADBANDMODEL extends BaseModelName
  /* "ar-AR_BroadbandModel" */ @js.native
  object AR_AR_BROADBANDMODEL extends TopLevel[AR_AR_BROADBANDMODEL with String]
  
  @js.native
  sealed trait DE_DE_BROADBANDMODEL extends BaseModelName
  /* "de-DE_BroadbandModel" */ @js.native
  object DE_DE_BROADBANDMODEL extends TopLevel[DE_DE_BROADBANDMODEL with String]
  
  @js.native
  sealed trait DE_DE_NARROWBANDMODEL extends BaseModelName
  /* "de-DE_NarrowbandModel" */ @js.native
  object DE_DE_NARROWBANDMODEL extends TopLevel[DE_DE_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait EN_GB_BROADBANDMODEL extends BaseModelName
  /* "en-GB_BroadbandModel" */ @js.native
  object EN_GB_BROADBANDMODEL extends TopLevel[EN_GB_BROADBANDMODEL with String]
  
  @js.native
  sealed trait EN_GB_NARROWBANDMODEL extends BaseModelName
  /* "en-GB_NarrowbandModel" */ @js.native
  object EN_GB_NARROWBANDMODEL extends TopLevel[EN_GB_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait EN_US_BROADBANDMODEL extends BaseModelName
  /* "en-US_BroadbandModel" */ @js.native
  object EN_US_BROADBANDMODEL extends TopLevel[EN_US_BROADBANDMODEL with String]
  
  @js.native
  sealed trait EN_US_NARROWBANDMODEL extends BaseModelName
  /* "en-US_NarrowbandModel" */ @js.native
  object EN_US_NARROWBANDMODEL extends TopLevel[EN_US_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait EN_US_SHORTFORM_NARROWBANDMODEL extends BaseModelName
  /* "en-US_ShortForm_NarrowbandModel" */ @js.native
  object EN_US_SHORTFORM_NARROWBANDMODEL extends TopLevel[EN_US_SHORTFORM_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait ES_ES_BROADBANDMODEL extends BaseModelName
  /* "es-ES_BroadbandModel" */ @js.native
  object ES_ES_BROADBANDMODEL extends TopLevel[ES_ES_BROADBANDMODEL with String]
  
  @js.native
  sealed trait ES_ES_NARROWBANDMODEL extends BaseModelName
  /* "es-ES_NarrowbandModel" */ @js.native
  object ES_ES_NARROWBANDMODEL extends TopLevel[ES_ES_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait FR_FR_BROADBANDMODEL extends BaseModelName
  /* "fr-FR_BroadbandModel" */ @js.native
  object FR_FR_BROADBANDMODEL extends TopLevel[FR_FR_BROADBANDMODEL with String]
  
  @js.native
  sealed trait FR_FR_NARROWBANDMODEL extends BaseModelName
  /* "fr-FR_NarrowbandModel" */ @js.native
  object FR_FR_NARROWBANDMODEL extends TopLevel[FR_FR_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait JA_JP_BROADBANDMODEL extends BaseModelName
  /* "ja-JP_BroadbandModel" */ @js.native
  object JA_JP_BROADBANDMODEL extends TopLevel[JA_JP_BROADBANDMODEL with String]
  
  @js.native
  sealed trait JA_JP_NARROWBANDMODEL extends BaseModelName
  /* "ja-JP_NarrowbandModel" */ @js.native
  object JA_JP_NARROWBANDMODEL extends TopLevel[JA_JP_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait KO_KR_BROADBANDMODEL extends BaseModelName
  /* "ko-KR_BroadbandModel" */ @js.native
  object KO_KR_BROADBANDMODEL extends TopLevel[KO_KR_BROADBANDMODEL with String]
  
  @js.native
  sealed trait KO_KR_NARROWBANDMODEL extends BaseModelName
  /* "ko-KR_NarrowbandModel" */ @js.native
  object KO_KR_NARROWBANDMODEL extends TopLevel[KO_KR_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait PT_BR_BROADBANDMODEL extends BaseModelName
  /* "pt-BR_BroadbandModel" */ @js.native
  object PT_BR_BROADBANDMODEL extends TopLevel[PT_BR_BROADBANDMODEL with String]
  
  @js.native
  sealed trait PT_BR_NARROWBANDMODEL extends BaseModelName
  /* "pt-BR_NarrowbandModel" */ @js.native
  object PT_BR_NARROWBANDMODEL extends TopLevel[PT_BR_NARROWBANDMODEL with String]
  
  @js.native
  sealed trait ZH_CN_BROADBANDMODEL extends BaseModelName
  /* "zh-CN_BroadbandModel" */ @js.native
  object ZH_CN_BROADBANDMODEL extends TopLevel[ZH_CN_BROADBANDMODEL with String]
  
  @js.native
  sealed trait ZH_CN_NARROWBANDMODEL extends BaseModelName
  /* "zh-CN_NarrowbandModel" */ @js.native
  object ZH_CN_NARROWBANDMODEL extends TopLevel[ZH_CN_NARROWBANDMODEL with String]
}
