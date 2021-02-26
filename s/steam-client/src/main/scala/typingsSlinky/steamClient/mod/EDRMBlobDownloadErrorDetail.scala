package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends StObject
@JSImport("steam-client", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail with Double] = js.native
  
  @js.native
  sealed trait AppIdMismatch extends EDRMBlobDownloadErrorDetail
  /* 14 */ val AppIdMismatch: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.AppIdMismatch with Double = js.native
  
  @js.native
  sealed trait AppIdUnexpected extends EDRMBlobDownloadErrorDetail
  /* 15 */ val AppIdUnexpected: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.AppIdUnexpected with Double = js.native
  
  @js.native
  sealed trait AppliedSignatureCorrupt extends EDRMBlobDownloadErrorDetail
  /* 16 */ val AppliedSignatureCorrupt: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.AppliedSignatureCorrupt with Double = js.native
  
  @js.native
  sealed trait ApplyMergeGuid extends EDRMBlobDownloadErrorDetail
  /* 12 */ val ApplyMergeGuid: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyMergeGuid with Double = js.native
  
  @js.native
  sealed trait ApplySignature extends EDRMBlobDownloadErrorDetail
  /* 13 */ val ApplySignature: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplySignature with Double = js.native
  
  @js.native
  sealed trait ApplyStrips extends EDRMBlobDownloadErrorDetail
  /* 11 */ val ApplyStrips: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyStrips with Double = js.native
  
  @js.native
  sealed trait ApplyValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  /* 17 */ val ApplyValveSignatureHeader: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyValveSignatureHeader with Double = js.native
  
  @js.native
  sealed trait DownloadFailed extends EDRMBlobDownloadErrorDetail
  /* 1 */ val DownloadFailed: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.DownloadFailed with Double = js.native
  
  @js.native
  sealed trait NextBase extends EDRMBlobDownloadErrorDetail
  /* 131072 */ val NextBase: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.NextBase with Double = js.native
  
  @js.native
  sealed trait None extends EDRMBlobDownloadErrorDetail
  /* 0 */ val None: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.None with Double = js.native
  
  @js.native
  sealed trait OpenZip extends EDRMBlobDownloadErrorDetail
  /* 3 */ val OpenZip: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.OpenZip with Double = js.native
  
  @js.native
  sealed trait PathManipulationError extends EDRMBlobDownloadErrorDetail
  /* 19 */ val PathManipulationError: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.PathManipulationError with Double = js.native
  
  @js.native
  sealed trait ReadZipDirectory extends EDRMBlobDownloadErrorDetail
  /* 4 */ val ReadZipDirectory: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.ReadZipDirectory with Double = js.native
  
  @js.native
  sealed trait TargetLocked extends EDRMBlobDownloadErrorDetail
  /* 2 */ val TargetLocked: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked with Double = js.native
  
  @js.native
  sealed trait TargetLocked_Base extends EDRMBlobDownloadErrorDetail
  /* 65536 */ val TargetLocked_Base: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Base with Double = js.native
  
  @js.native
  sealed trait TargetLocked_Max extends EDRMBlobDownloadErrorDetail
  /* 131071 */ val TargetLocked_Max: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Max with Double = js.native
  
  @js.native
  sealed trait UnexpectedZipEntry extends EDRMBlobDownloadErrorDetail
  /* 5 */ val UnexpectedZipEntry: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.UnexpectedZipEntry with Double = js.native
  
  @js.native
  sealed trait UnknownBlobType extends EDRMBlobDownloadErrorDetail
  /* 7 */ val UnknownBlobType: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.UnknownBlobType with Double = js.native
  
  @js.native
  sealed trait UnzipFullFile extends EDRMBlobDownloadErrorDetail
  /* 6 */ val UnzipFullFile: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipFullFile with Double = js.native
  
  @js.native
  sealed trait UnzipMergeGuid extends EDRMBlobDownloadErrorDetail
  /* 9 */ val UnzipMergeGuid: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipMergeGuid with Double = js.native
  
  @js.native
  sealed trait UnzipSignature extends EDRMBlobDownloadErrorDetail
  /* 10 */ val UnzipSignature: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipSignature with Double = js.native
  
  @js.native
  sealed trait UnzipStrips extends EDRMBlobDownloadErrorDetail
  /* 8 */ val UnzipStrips: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipStrips with Double = js.native
  
  @js.native
  sealed trait UnzipValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  /* 18 */ val UnzipValveSignatureHeader: typingsSlinky.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipValveSignatureHeader with Double = js.native
}
