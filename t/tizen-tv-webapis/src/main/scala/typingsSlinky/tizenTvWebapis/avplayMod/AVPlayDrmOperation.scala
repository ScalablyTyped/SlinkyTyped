package typingsSlinky.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDrmOperation extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayDrmOperation")
@js.native
object AVPlayDrmOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDrmOperation with String] = js.native
  
  @js.native
  sealed trait Finalize extends AVPlayDrmOperation
  /* "Finalize" */ val Finalize: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.Finalize with String = js.native
  
  @js.native
  sealed trait GetUID extends AVPlayDrmOperation
  /* "GetUID" */ val GetUID: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.GetUID with String = js.native
  
  @js.native
  sealed trait Initialize extends AVPlayDrmOperation
  /* "Initialize" */ val Initialize: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.Initialize with String = js.native
  
  @js.native
  sealed trait InstallLicense extends AVPlayDrmOperation
  /* "InstallLicense" */ val InstallLicense: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.InstallLicense with String = js.native
  
  @js.native
  sealed trait ProcessInitiator extends AVPlayDrmOperation
  /* "ProcessInitiator" */ val ProcessInitiator: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.ProcessInitiator with String = js.native
  
  @js.native
  sealed trait SetProperties extends AVPlayDrmOperation
  /* "SetProperties" */ val SetProperties: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.SetProperties with String = js.native
  
  @js.native
  sealed trait widevine_app_session extends AVPlayDrmOperation
  /* "widevine_app_session" */ val widevine_app_session: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_app_session with String = js.native
  
  @js.native
  sealed trait widevine_data_type extends AVPlayDrmOperation
  /* "widevine_data_type" */ val widevine_data_type: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_data_type with String = js.native
  
  @js.native
  sealed trait widevine_license_data extends AVPlayDrmOperation
  /* "widevine_license_data" */ val widevine_license_data: typingsSlinky.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_license_data with String = js.native
}
