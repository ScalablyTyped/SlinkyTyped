package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends js.Object

@JSImport("steam-client", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends js.Object {
  @js.native
  sealed trait AppIdMismatch extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait AppIdUnexpected extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait AppliedSignatureCorrupt extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyMergeGuid extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplySignature extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyStrips extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ApplyValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait DownloadFailed extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait NextBase extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait None extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait OpenZip extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait PathManipulationError extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait ReadZipDirectory extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked_Base extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait TargetLocked_Max extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnexpectedZipEntry extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnknownBlobType extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipFullFile extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipMergeGuid extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipSignature extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipStrips extends EDRMBlobDownloadErrorDetail
  
  @js.native
  sealed trait UnzipValveSignatureHeader extends EDRMBlobDownloadErrorDetail
  
  /* 14 */ val AppIdMismatch: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.AppIdMismatch with Double = js.native
  /* 15 */ val AppIdUnexpected: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.AppIdUnexpected with Double = js.native
  /* 16 */ val AppliedSignatureCorrupt: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.AppliedSignatureCorrupt with Double = js.native
  /* 12 */ val ApplyMergeGuid: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplyMergeGuid with Double = js.native
  /* 13 */ val ApplySignature: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplySignature with Double = js.native
  /* 11 */ val ApplyStrips: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplyStrips with Double = js.native
  /* 17 */ val ApplyValveSignatureHeader: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ApplyValveSignatureHeader with Double = js.native
  /* 1 */ val DownloadFailed: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.DownloadFailed with Double = js.native
  /* 131072 */ val NextBase: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.NextBase with Double = js.native
  /* 0 */ val None: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.None with Double = js.native
  /* 3 */ val OpenZip: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.OpenZip with Double = js.native
  /* 19 */ val PathManipulationError: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.PathManipulationError with Double = js.native
  /* 4 */ val ReadZipDirectory: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.ReadZipDirectory with Double = js.native
  /* 2 */ val TargetLocked: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.TargetLocked with Double = js.native
  /* 65536 */ val TargetLocked_Base: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.TargetLocked_Base with Double = js.native
  /* 131071 */ val TargetLocked_Max: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.TargetLocked_Max with Double = js.native
  /* 5 */ val UnexpectedZipEntry: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnexpectedZipEntry with Double = js.native
  /* 7 */ val UnknownBlobType: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnknownBlobType with Double = js.native
  /* 6 */ val UnzipFullFile: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipFullFile with Double = js.native
  /* 9 */ val UnzipMergeGuid: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipMergeGuid with Double = js.native
  /* 10 */ val UnzipSignature: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipSignature with Double = js.native
  /* 8 */ val UnzipStrips: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipStrips with Double = js.native
  /* 18 */ val UnzipValveSignatureHeader: typingsSlinky.steamDashClient.steamDashClientMod.EDRMBlobDownloadErrorDetail.UnzipValveSignatureHeader with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail with Double] = js.native
}

